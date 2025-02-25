// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateChangeSetRequest} extends {@link RequestModel}
 *
 * <p>CreateChangeSetRequest</p>
 */
public class CreateChangeSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeSetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeSetType")
    private String changeSetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("ReplacementOption")
    private String replacementOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcesToImport")
    private java.util.List < ResourcesToImport> resourcesToImport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackName")
    private String stackName;

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
         * <p>The name of the change set.<br>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or a letter.</p>
         * <blockquote>
         * <p>Make sure that the name is unique among all names of change sets that are associated with the specified stack.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChangeSet</p>
         */
        public Builder changeSetName(String changeSetName) {
            this.putQueryParameter("ChangeSetName", changeSetName);
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * <p>The type of the change set. Valid values:</p>
         * <ul>
         * <li>CREATE: creates a change set for a new stack.</li>
         * <li>UPDATE (default): creates a change set for an existing stack.</li>
         * <li>IMPORT: creates a change set for a new stack or an existing stack to import resources that are not managed by ROS.</li>
         * </ul>
         * <p>If you set ChangeSetType to CREATE, ROS creates a stack. The stack remains in the <code>REVIEW_IN_PROGRESS</code> state until you execute the change set.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You cannot set ChangeSetType to UPDATE when you create a change set for a new stack. You cannot set ChangeSetType to CREATE when you create a change set for an existing stack.</p>
         * </li>
         * <li><p>If you set ChangeSetType to Import, you cannot configure a stack policy. You can specify ChangeSetType only when you create or update a stack.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        public Builder changeSetType(String changeSetType) {
            this.putQueryParameter("ChangeSetType", changeSetType);
            this.changeSetType = changeSetType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.<br>The token can contain letters, digits, hyphens (-), and underscores (_) and cannot exceed 64 characters in length.<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
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
         * <p>The description of the change set. The description can be up to 1,024 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a demo.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to disable rollback when the stack fails to be created.<br>Valid values:</p>
         * <ul>
         * <li>true: disables rollback for the stack when the stack fails to be created.</li>
         * <li>false (default): enables rollback for the stack when the stack fails to be created.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.</p>
         * </blockquote>
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
         * <p>The callback URLs that are used to receive stack events.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://my-site.com/ros-notify">http://my-site.com/ros-notify</a></p>
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.putQueryParameter("NotificationURLs", notificationURLs);
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * <p>The maximum number of concurrent operations that can be performed on resources. By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0. If you set this parameter to a specific value, ROS associates the value with the stack. The value can affect subsequent operations on the stack.</p>
         * <p>This parameter takes effect only if you set ChangeSetType to CREATE or UPDATE.</p>
         * <ul>
         * <li><p>Valid values for change sets of the CREATE type:</p>
         * <ul>
         * <li>If you set this parameter to an integer that is greater than 0, the integer is used.</li>
         * <li>If you set this parameter to 0 or leave this parameter empty, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
         * </ul>
         * </li>
         * <li><p>Valid values for change sets of the UPDATE type:</p>
         * <ul>
         * <li>If you set this parameter to an integer that is greater than 0, the integer is used.</li>
         * <li>If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
         * <li>If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The name of the Resource Access Management (RAM) role. ROS assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.<br>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack, ROS assumes the RAM role even if you do not have permissions to use the RAM role. You must make sure that permissions are granted to the RAM role based on the principle of least privilege.<br>If you do not specify this parameter, ROS assumes the existing role of the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.<br>The RAM role name can be up to 64 characters in length.</p>
         * <p>For more information about RAM roles, see <a href="https://help.aliyun.com/document_detail/2568025.html">Use a stack role</a>.</p>
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
         * <p>The region ID of the change set.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>Specifies whether to enable replacement update if a resource property is changed and you cannot modify the new resource property. For a change, the physical ID of the resource remains unchanged. For a replacement update, the existing resource is deleted, a new resource is created, and the physical ID of the resource is changed. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled (default)</li>
         * </ul>
         * <blockquote>
         * <p>Operations that you perform to modify the resource properties for an update take precedence over operations you perform to replace the resource properties for an update. This parameter takes effect only if you set ChangeSetType to UPDATE.</p>
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
         * <p>The resources that you want to import to the stack.</p>
         */
        public Builder resourcesToImport(java.util.List < ResourcesToImport> resourcesToImport) {
            this.putQueryParameter("ResourcesToImport", resourcesToImport);
            this.resourcesToImport = resourcesToImport;
            return this;
        }

        /**
         * <p>The ID of the stack for which you want to create the change set. ROS compares the stack information with the information that you submit, such as an updated template or parameter value, to generate the change set.<br>You can call the <a href="https://help.aliyun.com/document_detail/610818.html">ListStacks</a> operation to query the stack ID.</p>
         * <blockquote>
         * <p> This parameter takes effect only when ChangeSetType is set to UPDATE or IMPORT.</p>
         * </blockquote>
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
         * <p>The name of the stack for which you want to create the change set.<br>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or a letter.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.</p>
         * </blockquote>
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
         * <p>If you set ChangeSetType to <strong>CREATE</strong>, you can specify StackPolicyBody or StackPolicyURL.</p>
         * <p>If you set ChangeSetType to <strong>UPDATE</strong>, you can specify only one of the following parameters:</p>
         * <ul>
         * <li>StackPolicyBody</li>
         * <li>StackPolicyURL</li>
         * <li>StackPolicyDuringUpdateBody</li>
         * <li>StackPolicyDuringUpdateURL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:&quot;Update:<em>&quot;,&quot;Principal&quot;:&quot;</em>&quot;,&quot;Resource&quot;:&quot;*&quot;}]}</p>
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * <p>The structure of the temporary overriding stack policy. The policy body must be 1 to 16,384 bytes in length.<br>If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a temporary overriding stack policy, the existing stack policy that is associated with the stack is used.<br>This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:</p>
         * <ul>
         * <li>StackPolicyBody</li>
         * <li>StackPolicyURL</li>
         * <li>StackPolicyDuringUpdateBody</li>
         * <li>StackPolicyDuringUpdateURL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:&quot;Update:<em>&quot;,&quot;Principal&quot;:&quot;</em>&quot;,&quot;Resource&quot;:&quot;*&quot;}]}</p>
         */
        public Builder stackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
            this.putQueryParameter("StackPolicyDuringUpdateBody", stackPolicyDuringUpdateBody);
            this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
            return this;
        }

        /**
         * <p>The URL of the stack policy based on which the stack is updated. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
         * <blockquote>
         * <p>If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
         * </blockquote>
         * <p>The URL can be up to 1,350 bytes in length.<br>If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a stack policy, the existing policy that is associated with the stack is used. This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:</p>
         * <ul>
         * <li>StackPolicyBody</li>
         * <li>StackPolicyURL</li>
         * <li>StackPolicyDuringUpdateBody</li>
         * <li>StackPolicyDuringUpdateURL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://ros/stack-policy/demo</p>
         */
        public Builder stackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
            this.putQueryParameter("StackPolicyDuringUpdateURL", stackPolicyDuringUpdateURL);
            this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
            return this;
        }

        /**
         * <p>The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
         * <p>The URL can be up to 1,350 bytes in length.</p>
         * <blockquote>
         * <p> If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
         * </blockquote>
         * <p>If you set ChangeSetType to <strong>CREATE</strong>, you can specify StackPolicyBody or StackPolicyURL.</p>
         * <p>If you set ChangeSetType to <strong>UPDATE</strong>, you can specify only one of the following parameters:</p>
         * <ul>
         * <li>StackPolicyBody</li>
         * <li>StackPolicyURL</li>
         * <li>StackPolicyDuringUpdateBody</li>
         * <li>StackPolicyDuringUpdateURL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://ros/stack-policy/demo</p>
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
         * <p>The template ID. This parameter applies to shared templates and private templates.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/610842.html">ListTemplates</a> operation to query the template ID.</p>
         * <blockquote>
         * <p> You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
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
         * <p>The ID of the resource scenario. In this example, this parameter specifies the ID of a resource management scenario.</p>
         * <p>This parameter takes effect only when ChangeSetType is set to IMPORT. TemplateScratchId is supported only when you import resources to create a new stack.</p>
         * <p>If you want to use a resource management scenario to import resources, you can specify only TemplateScratchId rather than configuring parameters related to templates.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/610832.html">ListTemplateScratches</a> operation to query the ID of the resource management scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
         * <blockquote>
         * <p>If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
         * </blockquote>
         * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
         * <p>The URL can be up to 1,024 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ros/template/demo</p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * <p>The version of the template.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you specify TemplateId.</p>
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

        /**
         * <p>The amount of time that can elapse before the stack enters the CREATE_FAILED or UPDATE_FAILED state.<br>If you set ChangeSetType to CREATE, this parameter is required. If you set ChangeSetType to UPDATE, this parameter is optional.</p>
         * <ul>
         * <li>Unit: minutes.</li>
         * <li>Valid values: 10 to 1440.</li>
         * <li>Default value: 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder timeoutInMinutes(Long timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * <p>Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only if you set ChangeSetType to UPDATE or IMPORT.</p>
         * </blockquote>
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
        public CreateChangeSetRequest build() {
            return new CreateChangeSetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateChangeSetRequest} extends {@link TeaModel}
     *
     * <p>CreateChangeSetRequest</p>
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
             * <p>The key of parameter N that is defined in the template. If you do not specify the key and value of a parameter, ROS uses the default name and value that are defined in the template. Maximum value of N: 200.</p>
             * <blockquote>
             * <p> Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.</p>
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
             * <p>The value of parameter N that is defined in the template. Maximum value of N: 200.</p>
             * <blockquote>
             * <p> Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.</p>
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
     * {@link CreateChangeSetRequest} extends {@link TeaModel}
     *
     * <p>CreateChangeSetRequest</p>
     */
    public static class ResourcesToImport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceIdentifier")
        private String resourceIdentifier;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
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
             * <p>The logical ID of resource N. The logical ID is the name of the resource defined in the template.</p>
             * <blockquote>
             * <p> This parameter takes effect only when ChangeSetType is set to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must specify ResourcesToImport.N.LogicalResourceId.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Vpc</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The key-value mapping between strings. The key-value mapping is used to identify resource N that you want to import. The key-value mapping must be a JSON string.<br>A key is an identifier property of a resource and a value is the property value. For example, the key of the ALIYUN::ECS::VPC resource is VpcId and the value is <code>vpc-2zevx9ios****</code>.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/172485.html">GetTemplateSummary</a> operation to query the identifier property of the resource.</p>
             * <blockquote>
             * <p> This parameter takes effect only when ChangeSetType is set to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must specify ResourcesToImport.N.ResourceIdentifier.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VpcId&quot;: &quot;vpc-2zevx9ios******&quot;}</p>
             */
            public Builder resourceIdentifier(String resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            /**
             * <p>The type of resource N. The resource type must be the same as the resource type that is defined in the template.</p>
             * <blockquote>
             * <p> This parameter takes effect only when ChangeSetType is set to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must specify ResourcesToImport.N.ResourceType.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::VPC</p>
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
