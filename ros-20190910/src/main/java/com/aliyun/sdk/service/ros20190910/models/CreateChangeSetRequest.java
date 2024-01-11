// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChangeSetRequest} extends {@link RequestModel}
 *
 * <p>CreateChangeSetRequest</p>
 */
public class CreateChangeSetRequest extends Request {
    @Query
    @NameInMap("ChangeSetName")
    @Validation(required = true)
    private String changeSetName;

    @Query
    @NameInMap("ChangeSetType")
    private String changeSetType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

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
    @NameInMap("ReplacementOption")
    private String replacementOption;

    @Query
    @NameInMap("ResourcesToImport")
    private java.util.List < ResourcesToImport> resourcesToImport;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("StackName")
    private String stackName;

    @Query
    @NameInMap("StackPolicyBody")
    private String stackPolicyBody;

    @Query
    @NameInMap("StackPolicyDuringUpdateBody")
    private String stackPolicyDuringUpdateBody;

    @Query
    @NameInMap("StackPolicyDuringUpdateURL")
    private String stackPolicyDuringUpdateURL;

    @Query
    @NameInMap("StackPolicyURL")
    private String stackPolicyURL;

    @Body
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateScratchId")
    private String templateScratchId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    @Query
    @NameInMap("TimeoutInMinutes")
    private Long timeoutInMinutes;

    @Query
    @NameInMap("UsePreviousParameters")
    private Boolean usePreviousParameters;

    private CreateChangeSetRequest(Builder builder) {
        super(builder);
        this.changeSetName = builder.changeSetName;
        this.changeSetType = builder.changeSetType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.disableRollback = builder.disableRollback;
        this.notificationURLs = builder.notificationURLs;
        this.parallelism = builder.parallelism;
        this.parameters = builder.parameters;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.replacementOption = builder.replacementOption;
        this.resourcesToImport = builder.resourcesToImport;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyDuringUpdateBody = builder.stackPolicyDuringUpdateBody;
        this.stackPolicyDuringUpdateURL = builder.stackPolicyDuringUpdateURL;
        this.stackPolicyURL = builder.stackPolicyURL;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateScratchId = builder.templateScratchId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
        this.timeoutInMinutes = builder.timeoutInMinutes;
        this.usePreviousParameters = builder.usePreviousParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChangeSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeSetName
     */
    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * @return changeSetType
     */
    public String getChangeSetType() {
        return this.changeSetType;
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
     * @return replacementOption
     */
    public String getReplacementOption() {
        return this.replacementOption;
    }

    /**
     * @return resourcesToImport
     */
    public java.util.List < ResourcesToImport> getResourcesToImport() {
        return this.resourcesToImport;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
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

    public static final class Builder extends Request.Builder<CreateChangeSetRequest, Builder> {
        private String changeSetName; 
        private String changeSetType; 
        private String clientToken; 
        private String description; 
        private Boolean disableRollback; 
        private java.util.List < String > notificationURLs; 
        private Long parallelism; 
        private java.util.List < Parameters> parameters; 
        private String ramRoleName; 
        private String regionId; 
        private String replacementOption; 
        private java.util.List < ResourcesToImport> resourcesToImport; 
        private String stackId; 
        private String stackName; 
        private String stackPolicyBody; 
        private String stackPolicyDuringUpdateBody; 
        private String stackPolicyDuringUpdateURL; 
        private String stackPolicyURL; 
        private String templateBody; 
        private String templateId; 
        private String templateScratchId; 
        private String templateURL; 
        private String templateVersion; 
        private Long timeoutInMinutes; 
        private Boolean usePreviousParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateChangeSetRequest request) {
            super(request);
            this.changeSetName = request.changeSetName;
            this.changeSetType = request.changeSetType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.disableRollback = request.disableRollback;
            this.notificationURLs = request.notificationURLs;
            this.parallelism = request.parallelism;
            this.parameters = request.parameters;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.replacementOption = request.replacementOption;
            this.resourcesToImport = request.resourcesToImport;
            this.stackId = request.stackId;
            this.stackName = request.stackName;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyDuringUpdateBody = request.stackPolicyDuringUpdateBody;
            this.stackPolicyDuringUpdateURL = request.stackPolicyDuringUpdateURL;
            this.stackPolicyURL = request.stackPolicyURL;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateScratchId = request.templateScratchId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
            this.timeoutInMinutes = request.timeoutInMinutes;
            this.usePreviousParameters = request.usePreviousParameters;
        } 

        /**
         * The name of the change set.\
         * <p>
         * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.
         * 
         * > Make sure that the name is unique among all names of change sets that are associated with the specified stack.
         */
        public Builder changeSetName(String changeSetName) {
            this.putQueryParameter("ChangeSetName", changeSetName);
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * The type of the change set. Valid values:
         * <p>
         * 
         * *   CREATE: creates a change set for a new stack.
         * *   UPDATE (default): creates a change set for an existing stack.
         * *   IMPORT: creates a change set for a new stack or an existing stack to import resources that are not managed by ROS.
         * 
         * If you create a change set for a new stack, ROS generates a unique stack ID for the stack. The stack remains in the REVIEW_IN_PROGRESS state until you execute the change set.\
         * If you want to create a change set for a new stack, do not set ChangeSetType to UPDATE. If you want to create a change set for an existing stack, do not set ChangeSetType to CREATE.
         */
        public Builder changeSetType(String changeSetType) {
            this.putQueryParameter("ChangeSetType", changeSetType);
            this.changeSetType = changeSetType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.\
         * <p>
         * The token can contain letters, digits, hyphens (-), and underscores (\_) and cannot exceed 64 characters in length.\
         * For more information, see [How to ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the change set. The description can be up to 1,024 bytes in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to disable rollback when the stack fails to be created.\
         * <p>
         * Valid values:
         * 
         * *   true: disables rollback for the stack when the stack fails to be created.
         * *   false (default): enables rollback for the stack when the stack fails to be created.
         * 
         * > This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putQueryParameter("DisableRollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * The callback URLs that are used to receive stack events.
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.putQueryParameter("NotificationURLs", notificationURLs);
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * The maximum number of concurrent operations that can be performed on resources. By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0. If you set this parameter to a specific value, ROS associates the value with the stack. The value can affect subsequent operations on the stack.
         * <p>
         * 
         * This parameter takes effect only if you set ChangeSetType to CREATE or UPDATE.
         * 
         * *   Valid values for change sets of the CREATE type:
         * 
         *     *   If you set this parameter to an integer that is greater than 0, the integer is used.
         *     *   If you set this parameter to 0 or leave this parameter empty, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.
         * 
         * *   Valid values for change sets of the UPDATE type:
         * 
         *     *   If you set this parameter to an integer that is greater than 0, the integer is used.
         *     *   If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.
         *     *   If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.
         */
        public Builder parallelism(Long parallelism) {
            this.putQueryParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * The parameters that are defined in the template.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The name of the Resource Access Management (RAM) role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.\
         * <p>
         * ROS assumes the role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.\
         * If you do not specify this parameter, ROS uses the existing role that is associated with the stack. If no roles are available for ROS to assume, ROS uses a temporary credential that is generated from the credentials of your Alibaba Cloud account.\
         * The name of the RAM role can be up to 64 bytes in length.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The region ID of the change set. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable replacement update if a resource property is changed and you cannot modify the new resource property. For a change, the physical ID of the resource remains unchanged. For a replacement update, the existing resource is deleted, a new resource is created, and the physical ID of the resource is changed. Valid values:
         * <p>
         * 
         * *   Enabled
         * *   Disabled (default)
         * 
         * > Operations that you perform to modify the resource properties for an update take precedence over operations you perform to replace the resource properties for an update. This parameter takes effect only if you set ChangeSetType to UPDATE.
         */
        public Builder replacementOption(String replacementOption) {
            this.putQueryParameter("ReplacementOption", replacementOption);
            this.replacementOption = replacementOption;
            return this;
        }

        /**
         * The resources that you want to import into the stack.
         */
        public Builder resourcesToImport(java.util.List < ResourcesToImport> resourcesToImport) {
            this.putQueryParameter("ResourcesToImport", resourcesToImport);
            this.resourcesToImport = resourcesToImport;
            return this;
        }

        /**
         * The ID of the stack for which you want to create a change set. ROS compares the stack information with the information that you submit, such as a modified template or a changed parameter value, to generate the change set.
         * <p>
         * 
         * > This parameter takes effect only for change sets of the UPDATE or IMPORT.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * The name of the stack for which you want to create the change set.\
         * <p>
         * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.
         * 
         * > This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.
         */
        public Builder stackName(String stackName) {
            this.putQueryParameter("StackName", stackName);
            this.stackName = stackName;
            return this;
        }

        /**
         * The structure of the stack policy body. The policy body must be 1 to 16,384 bytes in length. If you set ChangeSetType to CREATE, you can specify StackPolicyBody or StackPolicyURL. If you set ChangeSetType to UPDATE, you can specify only one of the following parameters:
         * <p>
         * 
         * *   StackPolicyBody
         * *   StackPolicyURL
         * *   StackPolicyDuringUpdateBody
         * *   StackPolicyDuringUpdateURL
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * The structure of the temporary overriding stack policy. The policy body must be 1 to 16,384 bytes in length.\
         * <p>
         * If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a temporary overriding stack policy, the existing stack policy that is associated with the stack is used.\
         * This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:
         * 
         * *   StackPolicyBody
         * *   StackPolicyURL
         * *   StackPolicyDuringUpdateBody
         * *   StackPolicyDuringUpdateURL
         */
        public Builder stackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
            this.putQueryParameter("StackPolicyDuringUpdateBody", stackPolicyDuringUpdateBody);
            this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
            return this;
        }

        /**
         * The URL of the stack policy based on which the stack is updated. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.
         * <p>
         * 
         * > If you do not specify the region of the OSS bucket, the value of RegionId is used.
         * 
         * The URL can be up to 1,350 bytes in length.\
         * If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a stack policy, the existing policy that is associated with the stack is used. This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:
         * 
         * *   StackPolicyBody
         * *   StackPolicyURL
         * *   StackPolicyDuringUpdateBody
         * *   StackPolicyDuringUpdateURL
         */
        public Builder stackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
            this.putQueryParameter("StackPolicyDuringUpdateURL", stackPolicyDuringUpdateURL);
            this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
            return this;
        }

        /**
         * The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.
         * <p>
         * 
         * > If you do not specify the region of the OSS bucket, the value of RegionId is used.
         * 
         * You can specify only one of the following parameters: StackPolicyBody and StackPolicyURL.\
         * The URL can be up to 1,350 bytes in length.
         * 
         * If you set ChangeSetType to CREATE, you can specify StackPolicyBody or StackPolicyURL. If you set ChangeSetType to UPDATE, you can specify only one of the following parameters:
         * 
         * *   StackPolicyBody
         * *   StackPolicyURL
         * *   StackPolicyDuringUpdateBody
         * *   StackPolicyDuringUpdateURL
         */
        public Builder stackPolicyURL(String stackPolicyURL) {
            this.putQueryParameter("StackPolicyURL", stackPolicyURL);
            this.stackPolicyURL = stackPolicyURL;
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
         * The ID of the template. This parameter applies to shared and private templates.
         * <p>
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the scenario template.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.
         * <p>
         * 
         * > If you do not specify the region of the OSS bucket, the value of RegionId is used.
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.
         * 
         * The URL can be up to 1,024 bytes in length.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The version of the template.
         * <p>
         * 
         * > This parameter takes effect only if you specify TemplateId.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * The amount of time that can elapse before the stack enters the CREATE_FAILED or UPDATE_FAILED state.\
         * <p>
         * If you set ChangeSetType to CREATE, this parameter is required. If you set ChangeSetType to UPDATE, this parameter is optional.
         * 
         * *   Unit: minutes.
         * *   Valid values: 10 to 1440.
         * *   Default value: 60.
         */
        public Builder timeoutInMinutes(Long timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         * 
         * > This parameter takes effect only if you set ChangeSetType to UPDATE or IMPORT.
         */
        public Builder usePreviousParameters(Boolean usePreviousParameters) {
            this.putQueryParameter("UsePreviousParameters", usePreviousParameters);
            this.usePreviousParameters = usePreviousParameters;
            return this;
        }

        @Override
        public CreateChangeSetRequest build() {
            return new CreateChangeSetRequest(this);
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
             * The key of parameter N that is defined in the template. If you do not specify the key and value of a parameter, ROS uses the default name and value that are defined in the template. Maximum value of N: 200.
             * <p>
             * 
             * >  Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of parameter N that is defined in the template. Maximum value of N: 200.
             * <p>
             * 
             * >  Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.
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
    public static class ResourcesToImport extends TeaModel {
        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("ResourceIdentifier")
        private String resourceIdentifier;

        @NameInMap("ResourceType")
        private String resourceType;

        private ResourcesToImport(Builder builder) {
            this.logicalResourceId = builder.logicalResourceId;
            this.resourceIdentifier = builder.resourceIdentifier;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesToImport create() {
            return builder().build();
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return resourceIdentifier
         */
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String logicalResourceId; 
            private String resourceIdentifier; 
            private String resourceType; 

            /**
             * The logical ID of resource N that you want to import. The logical ID specifies the name of resource N that is defined in the template.
             * <p>
             * 
             * > This parameter takes effect only if you set ChangeSetType to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.LogicalResourceId.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * The key-value mapping between strings. The value is a JSON string that identifies resource N that you want to import.\
             * <p>
             * A key is an identifier for a resource and a value is an assignment of data to the key. For example, VpcId is a key that indicates the ID of a virtual private cloud (VPC), and `vpc-2zevx9ios****` is a value that is assigned to VpcId. You can call the [GetTemplateSummary](~~172485~~) operation to obtain the key of a resource.
             * 
             * > This parameter takes effect only if you set ChangeSetType to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.ResourceIdentifier.
             */
            public Builder resourceIdentifier(String resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            /**
             * The type of resource N that you want to import. The resource type must be the same as the resource type that is defined in the template.
             * <p>
             * 
             * > This parameter takes effect only if you set ChangeSetType to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourcesToImport build() {
                return new ResourcesToImport(this);
            } 

        } 

    }
}
