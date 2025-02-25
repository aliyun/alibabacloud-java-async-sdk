// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateStackRequest} extends {@link RequestModel}
 *
 * <p>CreateStackRequest</p>
 */
public class CreateStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateOption")
    private String createOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateOptions")
    private java.util.List < String > createOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private String deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableRollback")
    private Boolean disableRollback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationURLs")
    private java.util.List < String > notificationURLs;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackPolicyBody")
    private String stackPolicyBody;

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
    @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
    private String templateScratchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateScratchRegionId")
    private String templateScratchRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
    private Long timeoutInMinutes;

    private CreateStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.createOption = builder.createOption;
        this.createOptions = builder.createOptions;
        this.deletionProtection = builder.deletionProtection;
        this.disableRollback = builder.disableRollback;
        this.notificationURLs = builder.notificationURLs;
        this.parallelism = builder.parallelism;
        this.parameters = builder.parameters;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.stackName = builder.stackName;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyURL = builder.stackPolicyURL;
        this.tags = builder.tags;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateScratchId = builder.templateScratchId;
        this.templateScratchRegionId = builder.templateScratchRegionId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStackRequest create() {
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
     * @return createOption
     */
    public String getCreateOption() {
        return this.createOption;
    }

    /**
     * @return createOptions
     */
    public java.util.List < String > getCreateOptions() {
        return this.createOptions;
    }

    /**
     * @return deletionProtection
     */
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * @return notificationURLs
     */
    public java.util.List < String > getNotificationURLs() {
        return this.notificationURLs;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return stackName
     */
    public String getStackName() {
        return this.stackName;
    }

    /**
     * @return stackPolicyBody
     */
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
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
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    /**
     * @return templateScratchRegionId
     */
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
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

    public static final class Builder extends Request.Builder<CreateStackRequest, Builder> {
        private String clientToken; 
        private String createOption; 
        private java.util.List < String > createOptions; 
        private String deletionProtection; 
        private Boolean disableRollback; 
        private java.util.List < String > notificationURLs; 
        private Long parallelism; 
        private java.util.List < Parameters> parameters; 
        private String ramRoleName; 
        private String regionId; 
        private String resourceGroupId; 
        private String stackName; 
        private String stackPolicyBody; 
        private String stackPolicyURL; 
        private java.util.List < Tags> tags; 
        private String templateBody; 
        private String templateId; 
        private String templateScratchId; 
        private String templateScratchRegionId; 
        private String templateURL; 
        private String templateVersion; 
        private Long timeoutInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(CreateStackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.createOption = request.createOption;
            this.createOptions = request.createOptions;
            this.deletionProtection = request.deletionProtection;
            this.disableRollback = request.disableRollback;
            this.notificationURLs = request.notificationURLs;
            this.parallelism = request.parallelism;
            this.parameters = request.parameters;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.stackName = request.stackName;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyURL = request.stackPolicyURL;
            this.tags = request.tags;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateScratchId = request.templateScratchId;
            this.templateScratchRegionId = request.templateScratchRegionId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
            this.timeoutInMinutes = request.timeoutInMinutes;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</p>
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
         * <p>The creation option for the stack. Valid values:</p>
         * <ul>
         * <li>KeepStackOnCreationComplete (default): After the stack is created, the stack and its resources are retained. The quota for the maximum number of stacks that can be created in ROS is consumed.</li>
         * <li>AbandonStackOnCreationComplete: After the stack is created, the stack is deleted, but its resources are retained. The quota for the maximum number of stacks that can be created in ROS is not consumed. If the stack fails to be created, the stack is retained.</li>
         * <li>AbandonStackOnCreationRollbackComplete: When the resources of the stack are rolled back after the stack fails to be created, the stack is deleted. The quota for the maximum number of stacks that can be created in ROS is not consumed. In other rollback scenarios, the stack is retained.</li>
         * <li>ManuallyPay: When you create the stack, you must manually pay for the subscription resources that are used. The following resource types support manual payment: <code>ALIYUN::ECS::InstanceGroup</code>, <code>ALIYUN::RDS::DBInstance</code>, <code>ALIYUN::SLB::LoadBalancer</code>, <code>ALIYUN::VPC::EIP</code>, and <code>ALIYUN::VPC::VpnGateway</code>.</li>
         * </ul>
         * <blockquote>
         * <p> You can specify only one of CreateOption and CreateOptions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>KeepStackOnCreationComplete</p>
         */
        public Builder createOption(String createOption) {
            this.putQueryParameter("CreateOption", createOption);
            this.createOption = createOption;
            return this;
        }

        /**
         * <p>The creation options for the stack.</p>
         */
        public Builder createOptions(java.util.List < String > createOptions) {
            this.putQueryParameter("CreateOptions", createOptions);
            this.createOptions = createOptions;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the stack. Valid values:</p>
         * <ul>
         * <li>Enabled.</li>
         * <li>Disabled (default). If deletion protection is disabled, you can delete the stack by using the ROS console or by calling the DeleteStack operation.</li>
         * </ul>
         * <blockquote>
         * <p>The value of DeletionProtection that you specify for the root stack applies to its nested stacks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder deletionProtection(String deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Specifies whether to disable rollback for the resources when the stack fails to be created.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
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
         * <p>The callback URLs that are used to receive stack events. Valid values:</p>
         * <ul>
         * <li>HTTP POST URL</li>
         * </ul>
         * <p>Each URL can be up to 1,024 bytes in length.</p>
         * <ul>
         * <li>eventbridge</li>
         * </ul>
         * <p>When the status of a stack changes, ROS sends notifications to the EventBridge service. You can view the event information in the <a href="https://eventbridge.console.aliyun.com">EventBridge</a> console.</p>
         * <blockquote>
         * <p>This feature is supported in the China (Hangzhou), China (Shanghai), China (Beijing), China (Hong Kong), and China (Zhangjiakou) regions.</p>
         * </blockquote>
         * <p>Maximum value of N: 5. When the status of a stack changes, ROS sends a notification to the specified URL. When rollback is enabled for the stack, notifications are sent if the stack is in the CREATE_ROLLBACK or ROLLBACK state, but are not sent if the stack is in the CREATE_FAILED, UPDATE_FAILED, or IN_PROGRESS state.<br>ROS sends notifications regardless of whether you specify the Outputs section. The following sample code provides an example on the content of a notification:</p>
         * <pre><code>{
         *    &quot;Outputs&quot;: [
         *        {
         *            &quot;Description&quot;: &quot;No description given&quot;,
         *            &quot;OutputKey&quot;: &quot;InstanceId&quot;,
         *            &quot;OutputValue&quot;: &quot;i-xxx&quot;
         *        }
         *    ],
         *    &quot;StackId&quot;: &quot;80bd6b6c-e888-4573-ae3b-93d29113****&quot;,
         *    &quot;StackName&quot;: &quot;test-notification-url&quot;,
         *    &quot;Status&quot;: &quot;CREATE_COMPLETE&quot;
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p><a href="http://my-site.com/ros-event">http://my-site.com/ros-event</a></p>
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.putQueryParameter("NotificationURLs", notificationURLs);
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * <p>The maximum number of concurrent operations that can be performed on resources.</p>
         * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
         * <blockquote>
         * <ul>
         * <li>If you set this parameter to an integer that is greater than 0, the integer is used. If you set this parameter to 0 or leave this parameter empty, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
         * <li>If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack, such as an update operation.</li>
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
         * <p>The parameters that are defined in the template.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The name of the RAM role. ROS assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.<br>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.</p>
         * <p>If you do not specify this parameter, ROS assumes the existing role that is associated with the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.</p>
         * <p>The RAM role name can be up to 64 characters in length.</p>
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
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group. If you leave this parameter empty, the stack is added to the default resource group.</p>
         * <p>For more information about resource groups, see the &quot;Resource group&quot; section of the <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a> topic.</p>
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
         * <p>The name of the stack.<br>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). It must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStack</p>
         */
        public Builder stackName(String stackName) {
            this.putQueryParameter("StackName", stackName);
            this.stackName = stackName;
            return this;
        }

        /**
         * <p>The structure that contains the stack policy body. The policy body must be 1 to 16,384 bytes in length.</p>
         * <blockquote>
         * <p>You can specify only one of StackPolicyBody and StackPolicyURL.</p>
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
         * <p>The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
         * <blockquote>
         * <p>You can specify only one of StackPolicyBody and StackPolicyURL.</p>
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
         * <p>The tags that you want to add to the stack.</p>
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
         * <p>The template ID. This parameter applies to shared templates and private templates.</p>
         * <blockquote>
         * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
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
         * <p>The scenario ID.</p>
         * <p>For more information about how to query the scenario ID, see <a href="https://help.aliyun.com/document_detail/363050.html">ListTemplateScratches</a>.</p>
         * <blockquote>
         * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ts-aa9c62feab844a6b****</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * <p>The region ID of the scenario. The default value is the same as the value of RegionId.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder templateScratchRegionId(String templateScratchRegionId) {
            this.putQueryParameter("TemplateScratchRegionId", templateScratchRegionId);
            this.templateScratchRegionId = templateScratchRegionId;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
         * <blockquote>
         * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
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
         * <p>The version of the template. This parameter takes effect only when TemplateId is specified.</p>
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
         * <p>The timeout period for creating the stack.</p>
         * <ul>
         * <li>Default value: 60.</li>
         * <li>Unit: minutes.</li>
         * <li>Valid values: 10 to 1440.</li>
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

        @Override
        public CreateStackRequest build() {
            return new CreateStackRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateStackRequest} extends {@link TeaModel}
     *
     * <p>CreateStackRequest</p>
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
             * <p>The key of parameter N that is defined in the template. If you do not specify the name and value of a parameter, ROS uses the default name and value that are specified in the template.</p>
             * <p>Maximum value of N: 200.<br>The name must be 1 to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * <blockquote>
             * <p>The Parameters parameter is optional. If you specify Parameters, you must specify Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceId</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of parameter N that is defined in the template.</p>
             * <p>Maximum value of N: 200.<br>The value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * <blockquote>
             * <p>The Parameters parameter is optional. If you specify Parameters, you must specify Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
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
     * {@link CreateStackRequest} extends {@link TeaModel}
     *
     * <p>CreateStackRequest</p>
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
             * <p>The tag of a stack is propagated to each resource that supports the tag feature in the stack. For more information, see <a href="https://help.aliyun.com/document_detail/201421.html">Propagate tags</a>.</p>
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
