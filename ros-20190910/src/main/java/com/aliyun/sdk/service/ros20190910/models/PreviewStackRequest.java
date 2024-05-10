// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewStackRequest} extends {@link RequestModel}
 *
 * <p>PreviewStackRequest</p>
 */
public class PreviewStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableRollback")
    private Boolean disableRollback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePreConfig")
    private Boolean enablePreConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parallelism")
    private Long parallelism;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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

    private PreviewStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.disableRollback = builder.disableRollback;
        this.enablePreConfig = builder.enablePreConfig;
        this.parallelism = builder.parallelism;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyURL = builder.stackPolicyURL;
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

    public static PreviewStackRequest create() {
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
     * @return enablePreConfig
     */
    public Boolean getEnablePreConfig() {
        return this.enablePreConfig;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<PreviewStackRequest, Builder> {
        private String clientToken; 
        private Boolean disableRollback; 
        private Boolean enablePreConfig; 
        private Long parallelism; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private String stackId; 
        private String stackName; 
        private String stackPolicyBody; 
        private String stackPolicyURL; 
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

        private Builder(PreviewStackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.disableRollback = request.disableRollback;
            this.enablePreConfig = request.enablePreConfig;
            this.parallelism = request.parallelism;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.stackName = request.stackName;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyURL = request.stackPolicyURL;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateScratchId = request.templateScratchId;
            this.templateScratchRegionId = request.templateScratchRegionId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
            this.timeoutInMinutes = request.timeoutInMinutes;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\
         * <p>
         * The token can be up to 64 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-).\
         * For more information, see [Ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to disable rollback for the resources when the stack fails to be created. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putQueryParameter("DisableRollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * Specifies whether to query the parameters that you want to use in compliance precheck.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false (default)
         */
        public Builder enablePreConfig(Boolean enablePreConfig) {
            this.putQueryParameter("EnablePreConfig", enablePreConfig);
            this.enablePreConfig = enablePreConfig;
            return this;
        }

        /**
         * The maximum number of concurrent operations that can be performed on resources. This parameter takes effect only for Terraform stacks.
         * <p>
         * 
         * By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.
         * 
         * > If you set this parameter to an integer greater than 0, the integer is used. If you set this parameter to 0 or leave this parameter empty, the default value of Terraform is used. In most cases, the default value of Terraform is 10.
         */
        public Builder parallelism(Long parallelism) {
            this.putQueryParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * The parameters of the stack.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
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
         * The stack ID. You can use this parameter to preview a stack that you want to update.
         * <p>
         * 
         * 
         * 
         * > -  You must and can specify only one of StackName and StackId.
         * > - In the scenario in which you preview a stack that you want to create or update, you cannot preview the resources in its nested stacks.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * The stack name. You can use this parameter to preview the stack that you want to create. The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.
         * <p>
         * 
         * > You must and can specify only one of StackName and StackId.
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
         * > You can specify only one of StackPolicyBody and StackPolicyURL.
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.
         * <p>
         * 
         * > You can specify only one of StackPolicyBody and StackPolicyURL.
         * 
         * The URL can be up to 1,350 bytes in length.
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
         * The template ID. This parameter applies to shared and private templates.
         * <p>
         * 
         * > You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The scenario ID.
         * <p>
         * 
         * For more information about how to query the scenario ID, see [ListTemplateScratches](~~363050~~).
         * 
         * > You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * The region ID of the scenario. The default value is the same as the value of RegionId.
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
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.
         * <p>
         * 
         * > You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The version of the template. This parameter takes effect only when TemplateId is specified.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * The timeout period for creating the stack.
         * <p>
         * 
         * Unit: minutes.
         * 
         * Default value: 60.
         */
        public Builder timeoutInMinutes(Long timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        @Override
        public PreviewStackRequest build() {
            return new PreviewStackRequest(this);
        } 

    } 

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
             * The name of the parameter N. If you do not specify the name and value of a parameter, Resource Orchestration Service (ROS) uses the default name and value that are specified in the template. Maximum value of N: 200.
             * <p>
             * 
             * > If you specify Parameters, you must specify Parameters.N.ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of parameter N. Maximum value of N: 200.
             * <p>
             * 
             * > If you specify Parameters, you must specify Parameters.N.ParameterValue.
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
}
