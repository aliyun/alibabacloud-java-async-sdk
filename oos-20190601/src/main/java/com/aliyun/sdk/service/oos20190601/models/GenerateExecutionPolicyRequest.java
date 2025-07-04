// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GenerateExecutionPolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateExecutionPolicyRequest</p>
 */
public class GenerateExecutionPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRole")
    private String ramRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    private String templateContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    private GenerateExecutionPolicyRequest(Builder builder) {
        super(builder);
        this.ramRole = builder.ramRole;
        this.regionId = builder.regionId;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateExecutionPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<GenerateExecutionPolicyRequest, Builder> {
        private String ramRole; 
        private String regionId; 
        private String templateContent; 
        private String templateName; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GenerateExecutionPolicyRequest request) {
            super(request);
            this.ramRole = request.ramRole;
            this.regionId = request.regionId;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * <p>The RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForOOSBandwidthScheduler</p>
         */
        public Builder ramRole(String ramRole) {
            this.putQueryParameter("RamRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
         * <p>The content of the template in the JSON or YAML format. This parameter is the same as the Content parameter that you can specify when you call the CreateTemplate operation. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;Description&quot;: &quot;Example template, describe instances in some status&quot;,   &quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;,   &quot;Parameters&quot;: {},   &quot;Tasks&quot;: [     {       &quot;Name&quot;: &quot;describeInstances&quot;,       &quot;Action&quot;: &quot;ACS::ExecuteAPI&quot;,       &quot;Description&quot;: &quot;desc-en&quot;,       &quot;Properties&quot;: {         &quot;Service&quot;: &quot;ECS&quot;,         &quot;API&quot;: &quot;DescribeInstances&quot;,         &quot;Parameters&quot;: {           &quot;Status&quot;: &quot;Running&quot;         }       }     }   ] }</p>
         */
        public Builder templateContent(String templateContent) {
            this.putQueryParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>vmeixme</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The version of the template. The default value is the latest version of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GenerateExecutionPolicyRequest build() {
            return new GenerateExecutionPolicyRequest(this);
        } 

    } 

}
