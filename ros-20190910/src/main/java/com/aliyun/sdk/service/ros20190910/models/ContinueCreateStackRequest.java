// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueCreateStackRequest} extends {@link RequestModel}
 *
 * <p>ContinueCreateStackRequest</p>
 */
public class ContinueCreateStackRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Mode")
    private String mode;

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
    @NameInMap("RecreatingOptions")
    private java.util.List < String > recreatingOptions;

    @Query
    @NameInMap("RecreatingResources")
    private java.util.List < String > recreatingResources;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
    private String stackId;

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

    private ContinueCreateStackRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.mode = builder.mode;
        this.parallelism = builder.parallelism;
        this.parameters = builder.parameters;
        this.ramRoleName = builder.ramRoleName;
        this.recreatingOptions = builder.recreatingOptions;
        this.recreatingResources = builder.recreatingResources;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinueCreateStackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return recreatingOptions
     */
    public java.util.List < String > getRecreatingOptions() {
        return this.recreatingOptions;
    }

    /**
     * @return recreatingResources
     */
    public java.util.List < String > getRecreatingResources() {
        return this.recreatingResources;
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

    public static final class Builder extends Request.Builder<ContinueCreateStackRequest, Builder> {
        private Boolean dryRun; 
        private String mode; 
        private Long parallelism; 
        private java.util.List < Parameters> parameters; 
        private String ramRoleName; 
        private java.util.List < String > recreatingOptions; 
        private java.util.List < String > recreatingResources; 
        private String regionId; 
        private String stackId; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(ContinueCreateStackRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.mode = request.mode;
            this.parallelism = request.parallelism;
            this.parameters = request.parameters;
            this.ramRoleName = request.ramRoleName;
            this.recreatingOptions = request.recreatingOptions;
            this.recreatingResources = request.recreatingResources;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * Specifies whether only to validate the stack in the request. Default value: false. Valid values:
         * <p>
         * 
         * *   true: only validates the stack.
         * *   false: validates and continues to create the stack.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The mode in which ROS continues to create the stack. Default value: Recreate. Valid values:
         * <p>
         * 
         * *   Recreate
         * 
         *     If you set this parameter to Recreate, ROS continues to create only the following types of resources:
         * 
         *     *   Resources that fail to be created
         * 
         *     *   Resources that you specify for the RecreatingResources.N parameter
         * 
         *     *   Dependencies of the resources that you specify for the RecreatingResources.N parameter
         * 
         *     *   Resources that you have not created
         * 
         * >  The RecreatingResources.N, TemplateBody, and TemplateURL parameters, and the Parameters section take effect only when the Mode parameter is set to Recreate.
         * 
         * *   Ignore
         * 
         *     *   ROS ignores and discards resources that fail to be created and you have not created, and marks the stack as successfully created.
         * 
         *     *   The body of the template that you use to create the stack is changed.
         * 
         * >  This value is valid only for ROS stacks.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The maximum number of concurrent operations that can be performed on resources.
         * <p>
         * 
         * By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.
         * 
         * > 
         * *   If you set this parameter to an integer that is greater than 0, the integer is used.
         * *   If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.
         * *   If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.
         * *   If you set this parameter to a specific value, ROS associates the value with the stack. The value affects subsequent operations on the stack.
         */
        public Builder parallelism(Long parallelism) {
            this.putQueryParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * The parameters of the template.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.
         * <p>
         * 
         * ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.
         * 
         * If you do not specify this parameter, ROS assumes the existing RAM role that is associated with the stack. If no RAM roles are available, ROS uses a temporary credential that is generated from the credentials of your account.
         * 
         * The name of the RAM role can be up to 64 bytes in length.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * Option N that ROS adopts when ROS continues to create the stack.
         */
        public Builder recreatingOptions(java.util.List < String > recreatingOptions) {
            this.putQueryParameter("RecreatingOptions", recreatingOptions);
            this.recreatingOptions = recreatingOptions;
            return this;
        }

        /**
         * Resource N that ROS continues to create after the resource failed to be created.
         */
        public Builder recreatingResources(java.util.List < String > recreatingResources) {
            this.putQueryParameter("RecreatingResources", recreatingResources);
            this.recreatingResources = recreatingResources;
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
         * The ID of the stack.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.
         * <p>
         * 
         * If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.
         * 
         * An ROS template is subject to the following limits:
         * 
         * *   You can modify only the following sections in the template: Description, Metadata, Resources, and Outputs.
         * 
         * *   You cannot add sections to or remove sections from the template.
         * 
         * *   The Resources section is subject to the following limits:
         * 
         *     *   You cannot delete the resources or change the template body for the resources that you do not want to continue to create.
         * 
         *     *   You can delete the resources or change the template body for the resources that you want to continue to create.
         * 
         *     *   You can add resources to this section.
         * 
         * > *   This parameter takes effect only when the Mode parameter is set to Recreate.
         *    *   You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.
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
         * > 
         * *   This parameter takes effect when the `Mode` parameter is set to `Recreate`. When you specify the TemplateId parameter in a template, the template is subject to the limits that are described for the `TemplateBody` parameter in this topic.
         * *   You can specify only one of the following parameters: `TemplateBody`, `TemplateURL`, and `TemplateId`. If you do not specify the parameters, the existing template is used.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.
         * <p>
         * 
         * If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.
         * 
         * > 
         * *   This parameter takes effect only when the Mode parameter is set to Recreate. When you specify the TemplateURL parameter in a template, the template is subject to the limits that are described for the TemplateBody parameter in this topic.
         * *   You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.
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

        @Override
        public ContinueCreateStackRequest build() {
            return new ContinueCreateStackRequest(this);
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
             * The name of template parameter N that you want to use to override another parameter. If you do not specify the name and value of a template parameter, ROS uses the name and value specified in the previous operation that was performed to create the stack. Maximum value of N: 200.
             * <p>
             * 
             * >  This parameter takes effect only when the Mode parameter is set to Recreate.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of template parameter N that you want to use to override another parameter. Maximum value of N: 200.
             * <p>
             * 
             * For ROS stacks, the following limits are imposed on the template parameters that you use to override other parameters:
             * 
             * *   You cannot change the condition values in the Conditions section of a template from true to false or from false to true.
             * *   The template parameters can be referenced only by resources that ROS continues to create.
             * 
             * >  This parameter takes effect only when the Mode parameter is set to Recreate.
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
