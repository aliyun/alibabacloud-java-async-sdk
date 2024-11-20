// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateStackGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateStackGroupRequest</p>
 */
public class CreateStackGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdministrationRoleName")
    private String administrationRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoDeployment")
    private AutoDeployment autoDeployment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capabilities")
    private java.util.List < String > capabilities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionRoleName")
    private String executionRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionModel")
    private String permissionModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackArn")
    private String stackArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    private CreateStackGroupRequest(Builder builder) {
        super(builder);
        this.administrationRoleName = builder.administrationRoleName;
        this.autoDeployment = builder.autoDeployment;
        this.capabilities = builder.capabilities;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.executionRoleName = builder.executionRoleName;
        this.parameters = builder.parameters;
        this.permissionModel = builder.permissionModel;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.stackArn = builder.stackArn;
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
     * @return capabilities
     */
    public java.util.List < String > getCapabilities() {
        return this.capabilities;
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
     * @return stackArn
     */
    public String getStackArn() {
        return this.stackArn;
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
        private java.util.List < String > capabilities; 
        private String clientToken; 
        private String description; 
        private String executionRoleName; 
        private java.util.List < Parameters> parameters; 
        private String permissionModel; 
        private String regionId; 
        private String resourceGroupId; 
        private String stackArn; 
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
            this.capabilities = request.capabilities;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.executionRoleName = request.executionRoleName;
            this.parameters = request.parameters;
            this.permissionModel = request.permissionModel;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.stackArn = request.stackArn;
            this.stackGroupName = request.stackGroupName;
            this.tags = request.tags;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * <p>The name of the RAM role that you specify for the administrator account when you create a self-managed stack group. ROS assumes the administrator role to perform operations. If you do not specify this parameter, AliyunROSStackGroupAdministrationRole is used as the default value. ROS uses the administrator role to assume the execution role AliyunROSStackGroupExecutionRole to perform operations on the stacks in the stack group.</p>
         * <p>The name must be 1 to 64 characters in length and can contain letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunROSStackGroupAdministrationRole</p>
         */
        public Builder administrationRoleName(String administrationRoleName) {
            this.putQueryParameter("AdministrationRoleName", administrationRoleName);
            this.administrationRoleName = administrationRoleName;
            return this;
        }

        /**
         * <p>The information about automatic deployment settings.</p>
         * <blockquote>
         * <p>You must specify this parameter if PermissionModel is set to SERVICE_MANAGED.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Enabled&quot;: true, &quot;RetainStacksOnAccountRemoval&quot;: true}</p>
         */
        public Builder autoDeployment(AutoDeployment autoDeployment) {
            String autoDeploymentShrink = shrink(autoDeployment, "AutoDeployment", "json");
            this.putQueryParameter("AutoDeployment", autoDeploymentShrink);
            this.autoDeployment = autoDeployment;
            return this;
        }

        /**
         * <p>The options for the stack group. You can specify up to one option.</p>
         */
        public Builder capabilities(java.util.List < String > capabilities) {
            this.putQueryParameter("Capabilities", capabilities);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.<br>The token can contain letters, digits, underscores (_), and hyphens (-) and cannot exceed 64 characters in length.<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the stack group.<br>The description must be 1 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>StackGroup Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the RAM role that you specify for the execution account when you create a self-managed stack group. The administrator role AliyunROSStackGroupAdministrationRole assumes the execution role to perform operations. If you do not specify this parameter, AliyunROSStackGroupExecutionRole is used as the default value. ROS assumes the execution role to perform operations on the stacks in the stack group.</p>
         * <p>The name must be 1 to 64 characters in length and can contain letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunROSStackGroupExecutionRole</p>
         */
        public Builder executionRoleName(String executionRoleName) {
            this.putQueryParameter("ExecutionRoleName", executionRoleName);
            this.executionRoleName = executionRoleName;
            return this;
        }

        /**
         * <p>The parameters of the stack group.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The permission model of the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SELF_MANAGED (default): the self-managed permission model. If you create a self-managed stack group, you must create RAM roles within the administrator and execution accounts and establish a trust relationship between the accounts. Then, you can deploy stacks within the execution account.</li>
         * <li>SERVICE_MANAGED: the service-managed permission model. If you create a service-managed stack group, ROS creates service-linked roles for the administrator and execution accounts, and the administrator account uses its role to deploy stacks within the execution account.</li>
         * </ul>
         * <blockquote>
         * <p>If you want to use the service-managed permission model to deploy stacks, your account must be the management account or a delegated administrator account of your resource directory and the trusted access feature is enabled for the account. For more information, see <a href="https://help.aliyun.com/document_detail/308253.html">Manage a delegated administrator account</a> and <a href="https://help.aliyun.com/document_detail/298229.html">Enable trusted access</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELF_MANAGED</p>
         */
        public Builder permissionModel(String permissionModel) {
            this.putQueryParameter("PermissionModel", permissionModel);
            this.permissionModel = permissionModel;
            return this;
        }

        /**
         * <p>The region ID of the stack group. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the resource group. If you do not specify this parameter, the stack group is added to the default resource group.<br>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * StackArn.
         */
        public Builder stackArn(String stackArn) {
            this.putQueryParameter("StackArn", stackArn);
            this.stackArn = stackArn;
            return this;
        }

        /**
         * <p>The name of the stack group. The name must be unique within a region.<br>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * <p>The tags of the stack group.</p>
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
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The ID of the template. This parameter applies to shared and private templates.</p>
         * <blockquote>
         * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
         * <blockquote>
         * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://ros-template/demo</p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
         * <blockquote>
         * <p>TemplateVersion takes effect only if you specify TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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

    /**
     * 
     * {@link CreateStackGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateStackGroupRequest</p>
     */
    public static class AutoDeployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("RetainStacksOnAccountRemoval")
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
             * <p>Indicates whether automatic deployment is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Automatic deployment is enabled. If you add a member account to the folder to which the stack group belongs after you enable automatic deployment, ROS automatically adds the stacks in the stack group to the member account. If you remove a member account from the folder, ROS automatically deletes the stacks from the member account.</li>
             * <li>false: Automatic deployment is disabled. After you disable automatic deployment, the stacks remain unchanged when you add member accounts to or remove member accounts from the folder.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Indicates whether the stacks within a member account are retained when you remove the member account from the folder.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p>You must specify RetainStacksOnAccountRemoval if Enabled is set to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreateStackGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateStackGroupRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The key of parameter N. If you do not specify the key and value of a parameter, ROS uses the default name and value that are defined in the template.</p>
             * <p>Maximum value of N: 200.</p>
             * <blockquote>
             * <p>Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Amount</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of parameter N.</p>
             * <p>Maximum value of N: 200.</p>
             * <blockquote>
             * <p>Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
    /**
     * 
     * {@link CreateStackGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateStackGroupRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key of the stack group.</p>
             * <blockquote>
             * <p>Tags is optional. If you want to specify Tags, you must also specify Tags.N.Key.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>usage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
