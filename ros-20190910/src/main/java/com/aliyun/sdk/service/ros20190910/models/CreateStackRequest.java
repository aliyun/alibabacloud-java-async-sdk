// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStackRequest} extends {@link RequestModel}
 *
 * <p>CreateStackRequest</p>
 */
public class CreateStackRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CreateOption")
    private String createOption;

    @Query
    @NameInMap("DeletionProtection")
    private String deletionProtection;

    @Query
    @NameInMap("DisableRollback")
    private Boolean disableRollback;

    @Query
    @NameInMap("NotificationURLs")
    private java.util.List < String > notificationURLs;

    @Query
    @NameInMap("Parallelism")
    private Long parallelism;

    @Query
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StackName")
    @Validation(required = true)
    private String stackName;

    @Query
    @NameInMap("StackPolicyBody")
    private String stackPolicyBody;

    @Query
    @NameInMap("StackPolicyURL")
    private String stackPolicyURL;

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
    @NameInMap("TemplateScratchId")
    private String templateScratchId;

    @Query
    @NameInMap("TemplateScratchRegionId")
    private String templateScratchRegionId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    @Query
    @NameInMap("TimeoutInMinutes")
    private Long timeoutInMinutes;

    private CreateStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.createOption = builder.createOption;
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
         * <p>
         * 
         * For more information, see [Ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The option for the stack after you create the stack. Default value: KeepStackOnCreationComplete. Valid values:
         * <p>
         * 
         * *   KeepStackOnCreationComplete: retains the stack and its resources after the stack is created. In this case, your stack quota in ROS is consumed.
         * *   AbandonStackOnCreationComplete: deletes the stack, but retains its resources after the stack is created. In this case, your stack quota in ROS is not consumed. If the stack fails to be created, the stack is retained.
         * *   AbandonStackOnCreationRollbackComplete: deletes the stack when its resources are rolled back after the stack fails to be created. In this case, your stack quota in ROS is not consumed. In other rollback scenarios, the stack is retained.
         */
        public Builder createOption(String createOption) {
            this.putQueryParameter("CreateOption", createOption);
            this.createOption = createOption;
            return this;
        }

        /**
         * Specifies whether to enable deletion protection for the stack. Default value: Disabled. Valid values:
         * <p>
         * 
         * *   Enabled: enables deletion protection.
         * *   Disabled: disables deletion protection. You can delete the stack by using the ROS console or by calling the DeleteStack operation.
         * 
         * >  The DeletionProtection parameter that you specify for the root stack applies to its nested stacks.
         */
        public Builder deletionProtection(String deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Specifies whether to disable rollback for the resources when the stack fails to be created.
         * <p>
         * 
         * Default value: false. Valid values:
         * 
         * *   true
         * *   false
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putQueryParameter("DisableRollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * NotificationURLs.
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.putQueryParameter("NotificationURLs", notificationURLs);
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * The maximum number of concurrent operations that can be performed on resources.
         * <p>
         * 
         * By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.
         * 
         * > 
         * *   If you set this parameter to an integer that is greater than 0, the integer is used. If you set this parameter to 0 or leave this parameter empty, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.
         * *   If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack, such as an update operation.
         */
        public Builder parallelism(Long parallelism) {
            this.putQueryParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
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
         * The name of the RAM role. ROS assumes the RAM role to create the stack and uses credentials of the role to call the APIs of Alibaba Cloud services.
         * <p>
         * 
         * ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.
         * 
         * If you do not specify this parameter, ROS assumes the existing role that is associated with the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.
         * 
         * The name can be up to 64 characters in length.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group. If you do not specify this parameter, the stack is added to the default resource group.
         * <p>
         * 
         * For more information about resource groups, see the "Resource Group" section of the [What is Resource Management?](~~94475~~) topic.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the stack.
         * <p>
         * 
         * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a letter.
         */
        public Builder stackName(String stackName) {
            this.putQueryParameter("StackName", stackName);
            this.stackName = stackName;
            return this;
        }

        /**
         * The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
         * <p>
         * 
         * >  You can specify only one of the StackPolicyBody and StackPolicyURL parameters.
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.
         * <p>
         * 
         * >  You can specify only one of the StackPolicyBody and StackPolicyURL parameters.
         * 
         * The URL can be up to 1,350 bytes in length.
         */
        public Builder stackPolicyURL(String stackPolicyURL) {
            this.putQueryParameter("StackPolicyURL", stackPolicyURL);
            this.stackPolicyURL = stackPolicyURL;
            return this;
        }

        /**
         * test
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.
         * <p>
         * 
         * >  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The ID of the template. This parameter applies to shared templates and private templates.
         * <p>
         * 
         * >  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the scenario.
         * <p>
         * 
         * For more information about how to query the IDs of scenarios, see [ListTemplateScratches](~~363050~~).
         * 
         * >  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * The region ID of the scenario. The default value is the same as the value of the RegionId parameter.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder templateScratchRegionId(String templateScratchRegionId) {
            this.putQueryParameter("TemplateScratchRegionId", templateScratchRegionId);
            this.templateScratchRegionId = templateScratchRegionId;
            return this;
        }

        /**
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.
         * <p>
         * 
         * >  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The version of the template. This parameter takes effect only when the TemplateId parameter is specified.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * The timeout period that is allowed to create the stack.
         * <p>
         * 
         * *   Default value: 60.
         * *   Unit: minutes.
         * *   Valid values: 10 to 1440.
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
             * The name of parameter N that is defined in the template. If you do not specify the name and value of a parameter, ROS uses the default name and value in the template.
             * <p>
             * 
             * Maximum value of N: 200.
             * 
             * The name must be 1 to 128 characters in length, and cannot contain `http://` or `https://`. The name cannot start with `aliyun` or `acs:`.
             * 
             * >  The Parameters parameter is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of parameter N that is defined in the template.
             * <p>
             * 
             * Maximum value of N: 200.
             * 
             * The value can be up to 128 characters in length, and cannot contain `http://` or `https://`. The value cannot start with `aliyun` or `acs:`.
             * 
             * >  The Parameters parameter is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.
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
             * The key of tag N that you want to add to the stack.
             * <p>
             * 
             * Valid values of N: 1 to 20.
             * 
             * > 
             * *   The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key parameter.
             * *   The tag of a stack is propagated to each stack resource that supports the tag feature. For more information, see [Propagate tags](~~201421~~).
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that you want to add to the stack.
             * <p>
             * 
             * Valid values of N: 1 to 20.
             * 
             * >  The tag of a stack is propagated to each stack resource that supports the tag feature. For more information, see [Propagate tags](~~201421~~).
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
