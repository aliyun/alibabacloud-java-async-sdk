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
 * {@link GetTemplateParameterConstraintsRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateParameterConstraintsRequest</p>
 */
public class GetTemplateParameterConstraintsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

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
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    private GetTemplateParameterConstraintsRequest(Builder builder) {
        super(builder);
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateParameterConstraintsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
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

    public static final class Builder extends Request.Builder<GetTemplateParameterConstraintsRequest, Builder> {
        private String parameters; 
        private String regionId; 
        private String templateContent; 
        private String templateName; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateParameterConstraintsRequest request) {
            super(request);
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * <p>The information about the parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;endDate&quot;: &quot;2022-04-13T03:31:20Z&quot;, &quot;Status&quot;: &quot;Stopped&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>{
         *     &quot;Description&quot;: &quot;Example template, describe instances in some status&quot;,
         *     &quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;,
         *     &quot;Parameters&quot;: {},
         *     &quot;Tasks&quot;: [{
         *         &quot;Name&quot;: &quot;describeInstances&quot;,
         *         &quot;Action&quot;: &quot;ACS::ExecuteAPI&quot;,
         *         &quot;Description&quot;: &quot;desc-en&quot;,
         *         &quot;Properties&quot;: {
         *             &quot;Service&quot;: &quot;ECS&quot;,
         *             &quot;API&quot;: &quot;DescribeInstances&quot;,
         *             &quot;Parameters&quot;: {
         *                 &quot;Status&quot;: &quot;Running&quot;
         *             }
         *         }
         *     }]
         * }</p>
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
         * <p>MyTemplate</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The URL that is used to store the content of the Operation Orchestration Service (OOS) template in the Alibaba Cloud Object Storage Service (OSS). Only the public-read URL is supported. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oos-template.cn-hangzhou.oss.aliyun-inc.com/oos-test-template.json">http://oos-template.cn-hangzhou.oss.aliyun-inc.com/oos-test-template.json</a></p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * <p>The version of the template. The default value is the latest version of the template.</p>
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
        public GetTemplateParameterConstraintsRequest build() {
            return new GetTemplateParameterConstraintsRequest(this);
        } 

    } 

}
