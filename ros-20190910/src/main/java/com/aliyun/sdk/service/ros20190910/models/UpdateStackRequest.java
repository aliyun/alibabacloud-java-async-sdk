// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateStackRequest} extends {@link RequestModel}
 *
 * <p>UpdateStackRequest</p>
 */
public class UpdateStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableRollback")
    @Deprecated
    private Boolean disableRollback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRunOptions")
    private java.util.List < String > dryRunOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parallelism")
    private Long parallelism;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplacementOption")
    private String replacementOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackPolicyBody")
    private String stackPolicyBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackPolicyDuringUpdateBody")
    private String stackPolicyDuringUpdateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackPolicyDuringUpdateURL")
    private String stackPolicyDuringUpdateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackPolicyURL")
    private String stackPolicyURL;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
    private Long timeoutInMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsePreviousParameters")
    private Boolean usePreviousParameters;

    private UpdateStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.disableRollback = builder.disableRollback;
        this.dryRun = builder.dryRun;
        this.dryRunOptions = builder.dryRunOptions;
        this.parallelism = builder.parallelism;
        this.parameters = builder.parameters;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.replacementOption = builder.replacementOption;
        this.resourceGroupId = builder.resourceGroupId;
        this.stackId = builder.stackId;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyDuringUpdateBody = builder.stackPolicyDuringUpdateBody;
        this.stackPolicyDuringUpdateURL = builder.stackPolicyDuringUpdateURL;
        this.stackPolicyURL = builder.stackPolicyURL;
        this.tags = builder.tags;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
        this.timeoutInMinutes = builder.timeoutInMinutes;
        this.usePreviousParameters = builder.usePreviousParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackRequest create() {
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
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dryRunOptions
     */
    public java.util.List < String > getDryRunOptions() {
        return this.dryRunOptions;
    }

    /**
     * @return parallelism
     */
    public Long getParallelism() {
        return this.parallelism;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replacementOption
     */
    public String getReplacementOption() {
        return this.replacementOption;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return stackPolicyBody
     */
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * @return stackPolicyDuringUpdateBody
     */
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    /**
     * @return stackPolicyDuringUpdateURL
     */
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    /**
     * @return stackPolicyURL
     */
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
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

    /**
     * @return timeoutInMinutes
     */
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * @return usePreviousParameters
     */
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public static final class Builder extends Request.Builder<UpdateStackRequest, Builder> {
        private String clientToken; 
        private Boolean disableRollback; 
        private Boolean dryRun; 
        private java.util.List < String > dryRunOptions; 
        private Long parallelism; 
        private java.util.List < Parameters> parameters; 
        private String ramRoleName; 
        private String regionId; 
        private String replacementOption; 
        private String resourceGroupId; 
        private String stackId; 
        private String stackPolicyBody; 
        private String stackPolicyDuringUpdateBody; 
        private String stackPolicyDuringUpdateURL; 
        private String stackPolicyURL; 
        private java.util.List < Tags> tags; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 
        private Long timeoutInMinutes; 
        private Boolean usePreviousParameters; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.disableRollback = request.disableRollback;
            this.dryRun = request.dryRun;
            this.dryRunOptions = request.dryRunOptions;
            this.parallelism = request.parallelism;
            this.parameters = request.parameters;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.replacementOption = request.replacementOption;
            this.resourceGroupId = request.resourceGroupId;
            this.stackId = request.stackId;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyDuringUpdateBody = request.stackPolicyDuringUpdateBody;
            this.stackPolicyDuringUpdateURL = request.stackPolicyDuringUpdateURL;
            this.stackPolicyURL = request.stackPolicyURL;
            this.tags = request.tags;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
            this.timeoutInMinutes = request.timeoutInMinutes;
            this.usePreviousParameters = request.usePreviousParameters;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
         * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">Ensure idempotence</a>.</p>
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
         * <p>Specifies whether to roll back the resources in the stack when the stack fails to be updated.</p>
         * <p>Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putQueryParameter("DisableRollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * <p>Specifies whether only to validate the stack in the request. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: only validates the stack.</li>
         * <li>false: validates and updates the stack.</li>
         * </ul>
         * <blockquote>
         * <p> When no changes are made during the update, the following rules apply: If you set the DryRun parameter to false, the NotSupported error code is returned. If you set the DryRun parameter to true, no error is reported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The dry run option in the list format. You can specify only one dry run option.</p>
         * <blockquote>
         * <p>This parameter takes effect only when DryRun is set to true.</p>
         * </blockquote>
         */
        public Builder dryRunOptions(java.util.List < String > dryRunOptions) {
            this.putQueryParameter("DryRunOptions", dryRunOptions);
            this.dryRunOptions = dryRunOptions;
            return this;
        }

        /**
         * <p>The maximum number of concurrent operations that can be performed on resources.</p>
         * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
         * <blockquote>
         * <ul>
         * <li>If you set this parameter to an integer that is greater than 0, the integer is used.</li>
         * <li>If you set this parameter to 0, no limit is imposed on Resource Orchestration Service (ROS) stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
         * <li>If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
         * <li>If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parallelism(Long parallelism) {
            this.putQueryParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * <p>The parameters.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.</p>
         * <p>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.</p>
         * <p>If you do not specify this parameter, ROS assumes the existing RAM role that is associated with the stack. If no RAM roles are available, ROS uses a temporary credential that is generated from the credentials of your account.</p>
         * <p>The name of the RAM role can be up to 64 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The ID of the region in which the stack is deployed. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the replacement update feature. If you cannot change resource properties, you can enable the replacement update feature to replace the resource properties. If the replacement update feature is used, the existing resource is deleted and a new resource is created. The physical ID of the new resource is different from the physical ID of the deleted resource.</p>
         * <p>Default value: Disabled. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * <blockquote>
         * <p> Changes have higher priorities than replacement updates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder replacementOption(String replacementOption) {
            this.putQueryParameter("ReplacementOption", replacementOption);
            this.replacementOption = replacementOption;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
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
         * <p>The ID of the stack.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The structure that contains the stack policy body. The policy body must be 1 to 16,384 bytes in length.</p>
         * <blockquote>
         * <p> You can specify only one of the StackPolicyBody and StackPolicyURL parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;Update:<em>&quot;, &quot;Resource&quot;: &quot;</em>&quot;, &quot;Effect&quot;: &quot;Allow&quot;, &quot;Principal&quot;: &quot;*&quot;}]}</p>
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * <p>The structure that contains the body of the temporary overriding stack policy. The policy body must be 1 to 16,384 bytes in length.</p>
         * <p>If you want to update protected resources, you must specify a temporary overriding stack policy during the update. If you do not specify a temporary overriding stack policy, the existing policy that is associated with the stack is used.</p>
         * <p>This parameter takes effect only when the ChangeSetType parameter is set to UPDATE. You can specify only one of the following parameters:</p>
         * <ul>
         * <li>StackPolicyBody</li>
         * <li>StackPolicyURL</li>
         * <li>StackPolicyDuringUpdateBody</li>
         * <li>StackPolicyDuringUpdateURL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;: [{&quot;Effect&quot;: &quot;Allow&quot;, &quot;Action&quot;: &quot;Update:<em>&quot;, &quot;Principal&quot;: &quot;</em>&quot;, &quot;Resource&quot;: &quot;*&quot;}]}</p>
         */
        public Builder stackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
            this.putQueryParameter("StackPolicyDuringUpdateBody", stackPolicyDuringUpdateBody);
            this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
            return this;
        }

        /**
         * <p>The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
         * <blockquote>
         * <p> If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
         * </blockquote>
         * <p>The URL can be up to 1,350 bytes in length.</p>
         * <p>If you want to update protected resources, you must specify a temporary overriding stack policy during the update. If you do not specify a temporary overriding stack policy, the existing policy that is associated with the stack is used. This parameter takes effect only when the ChangeSetType parameter is set to UPDATE. You can specify only one of the following parameters:</p>
         * <ul>
         * <li>StackPolicyBody</li>
         * <li>StackPolicyURL</li>
         * <li>StackPolicyDuringUpdateBody</li>
         * <li>StackPolicyDuringUpdateURL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://ros-stack-policy/demo</p>
         */
        public Builder stackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
            this.putQueryParameter("StackPolicyDuringUpdateURL", stackPolicyDuringUpdateURL);
            this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
            return this;
        }

        /**
         * <p>The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
         * <blockquote>
         * <p> You can specify only one of the StackPolicyBody and StackPolicyURL parameters.</p>
         * </blockquote>
         * <p>The URL can be up to 1,350 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ros-stack-policy/demo</p>
         */
        public Builder stackPolicyURL(String stackPolicyURL) {
            this.putQueryParameter("StackPolicyURL", stackPolicyURL);
            this.stackPolicyURL = stackPolicyURL;
            return this;
        }

        /**
         * <p>The value of tag N that you want to add to the template.</p>
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
         * <p>The ID of the template. This parameter applies to shared templates and private templates.</p>
         * <blockquote>
         * <p> You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
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
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body must be 1 to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
         * <blockquote>
         * <p> You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
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
         * <p>The version of the template. This parameter takes effect only when the TemplateId parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>The timeout period for the update operation on the stack.</p>
         * <ul>
         * <li>Default value: 60.</li>
         * <li>Unit: minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder timeoutInMinutes(Long timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * <p>Specifies whether to use the values specified in the previous request for the parameters that you do not specify in the current request.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder usePreviousParameters(Boolean usePreviousParameters) {
            this.putQueryParameter("UsePreviousParameters", usePreviousParameters);
            this.usePreviousParameters = usePreviousParameters;
            return this;
        }

        @Override
        public UpdateStackRequest build() {
            return new UpdateStackRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateStackRequest} extends {@link TeaModel}
     *
     * <p>UpdateStackRequest</p>
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
             * <p>The name of parameter N. If you do not specify the name and value of a parameter, ROS uses the default name and value in the template.</p>
             * <p>Maximum value of N: 200.</p>
             * <blockquote>
             * <p> The Parameters parameter is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
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
             * <p>The value of parameter N. Maximum value of N: 200.</p>
             * <blockquote>
             * <p> The Parameters parameter is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
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
     * {@link UpdateStackRequest} extends {@link TeaModel}
     *
     * <p>UpdateStackRequest</p>
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
             * <p>The key of tag N that you want to add to the stack.</p>
             * <p>Valid values of N: 1 to 20.</p>
             * <blockquote>
             * <ul>
             * <li>The Tags parameter is optional. If you specify Tags, you must specify Tags.N.Key.</li>
             * <li>The tag of a stack is propagated to each resource that supports the tag feature in the stack. For more information, see <a href="https://help.aliyun.com/document_detail/201421.html">Propagate tags</a>.</li>
             * </ul>
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
             * <p>The value of tag N that you want to add to the stack.</p>
             * <p>Valid values of N: 1 to 20.</p>
             * <blockquote>
             * <p> The tag of a stack is propagated to each resource that supports the tag feature in the stack. For more information, see <a href="https://help.aliyun.com/document_detail/201421.html">Propagate tags</a>.</p>
             * </blockquote>
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
