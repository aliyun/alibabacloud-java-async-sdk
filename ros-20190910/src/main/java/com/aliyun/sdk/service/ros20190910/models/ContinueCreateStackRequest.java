// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ContinueCreateStackRequest} extends {@link RequestModel}
 *
 * <p>ContinueCreateStackRequest</p>
 */
public class ContinueCreateStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parallelism")
    private Long parallelism;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecreatingOptions")
    private java.util.List<String> recreatingOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecreatingResources")
    private java.util.List<String> recreatingResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
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
    public java.util.List<Parameters> getParameters() {
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
    public java.util.List<String> getRecreatingOptions() {
        return this.recreatingOptions;
    }

    /**
     * @return recreatingResources
     */
    public java.util.List<String> getRecreatingResources() {
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
        private java.util.List<Parameters> parameters; 
        private String ramRoleName; 
        private java.util.List<String> recreatingOptions; 
        private java.util.List<String> recreatingResources; 
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
         * <p>Specifies whether only to validate the stack in the request. Valid values:</p>
         * <ul>
         * <li>true: only validates the stack.</li>
         * <li>false (default): validates and continues to create the stack.</li>
         * </ul>
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
         * <p>The mode in which ROS continues to create the stack. Valid values:</p>
         * <ul>
         * <li><p>Recreate (default)</p>
         * <p>If you set this parameter to Recreate, ROS continues to create only the following types of resources:</p>
         * <ul>
         * <li>Resources that fail to be created</li>
         * <li>Resources that you specify for RecreatingResources.N</li>
         * <li>Dependencies of the resources that you specify for RecreatingResources.N</li>
         * <li>Resources that you have not created</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>RecreatingResources.N, TemplateBody, TemplateURL, and Parameters take effect only when Mode is set to Recreate.</p>
         * </blockquote>
         * <ul>
         * <li><p>Ignore</p>
         * <ul>
         * <li>ROS ignores and discards resources that fail to be created and you have not created, and considers that the stack is successfully created.</li>
         * <li>The body of the template that you use to create the stack is changed.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This mode is available only for ROS stacks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Recreate</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The maximum number of concurrent operations that can be performed on resources.</p>
         * <p>By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0.</p>
         * <blockquote>
         * <ul>
         * <li>If you set this parameter to an integer that is greater than 0, the integer is used.</li>
         * <li>If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</li>
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
         * <p>The template parameters that you want to use to override specific parameters.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.<br>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.<br>If you do not specify this parameter, ROS assumes the existing role that is associated with the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.<br>The name of the RAM role can be up to 64 bytes in length.</p>
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
         * <p>The options that ROS adopts when ROS continues to create the stack.</p>
         */
        public Builder recreatingOptions(java.util.List<String> recreatingOptions) {
            this.putQueryParameter("RecreatingOptions", recreatingOptions);
            this.recreatingOptions = recreatingOptions;
            return this;
        }

        /**
         * <p>The resources that ROS continues to create after the resources failed to be created. You can add new resources to the resources that ROS continues to create. ROS continues to create all dependencies of the new resources.</p>
         * <blockquote>
         * <p>This parameter is available only for ROS stacks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WebServer</p>
         */
        public Builder recreatingResources(java.util.List<String> recreatingResources) {
            this.putQueryParameter("RecreatingResources", recreatingResources);
            this.recreatingResources = recreatingResources;
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
         * <p>The stack ID.</p>
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
         * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.<br>If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
         * <p>A ROS template is subject to the following limits:</p>
         * <ul>
         * <li><p>You can modify only the following sections in the template: Description, Metadata, Resources, and Outputs.</p>
         * </li>
         * <li><p>You cannot add sections to or remove sections from the template.</p>
         * </li>
         * <li><p>The Resources section is subject to the following limits:</p>
         * <ul>
         * <li>You cannot delete the resources or change the template body for the resources that you do not want to continue to create.</li>
         * <li>You can delete the resources or change the template body for the resources that you want to continue to create.</li>
         * <li>You can add resources to this section.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when Mode is set to Recreate.</li>
         * <li>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The template ID. This parameter applies to shared and private templates.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect when <code>Mode</code> is set to <code>Recreate</code>. When you specify TemplateId of a template, the template is subject to the limits that are described for <code>TemplateBody</code> in this topic.</li>
         * <li>You can specify only one of the following parameters: <code>TemplateBody</code>, <code>TemplateURL</code>, and <code>TemplateId</code>. If you do not specify the parameters, the existing template is used.</li>
         * </ul>
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
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
         * <p>If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when Mode is set to Recreate. When you specify TemplateURL of a template, the template is subject to the limits that are described for TemplateBody in this topic.</li>
         * <li>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId. If you do not specify the parameters, the existing template is used.</li>
         * </ul>
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

        @Override
        public ContinueCreateStackRequest build() {
            return new ContinueCreateStackRequest(this);
        } 

    } 

    /**
     * 
     * {@link ContinueCreateStackRequest} extends {@link TeaModel}
     *
     * <p>ContinueCreateStackRequest</p>
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

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterKey = model.parameterKey;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The name of template parameter N that you want to use to override a specific parameter. If you do not specify the name and value of a template parameter, ROS uses the name and value specified in the previous operation that was performed to create the stack. Maximum value of N: 200.</p>
             * <blockquote>
             * <p>This parameter takes effect only when Mode is set to Recreate.</p>
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
             * <p>The value of template parameter N that you want to use to override a specific parameter. Maximum value of N: 200.</p>
             * <p>For ROS stacks, the template parameters that you use to override specific parameters are subject to the following limits:</p>
             * <ul>
             * <li>You cannot change the condition values in the Conditions section of a template from true to false or from false to true.</li>
             * <li>The template parameters can be referenced only by resources that ROS continues to create.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when Mode is set to Recreate.</p>
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
}
