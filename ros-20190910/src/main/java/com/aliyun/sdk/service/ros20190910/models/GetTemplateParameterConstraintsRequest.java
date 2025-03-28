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
 * {@link GetTemplateParameterConstraintsRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateParameterConstraintsRequest</p>
 */
public class GetTemplateParameterConstraintsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParametersKeyFilter")
    private java.util.List<String> parametersKeyFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParametersOrder")
    private java.util.List<String> parametersOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

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

    private GetTemplateParameterConstraintsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.parameters = builder.parameters;
        this.parametersKeyFilter = builder.parametersKeyFilter;
        this.parametersOrder = builder.parametersOrder;
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

    public static GetTemplateParameterConstraintsRequest create() {
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
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return parametersKeyFilter
     */
    public java.util.List<String> getParametersKeyFilter() {
        return this.parametersKeyFilter;
    }

    /**
     * @return parametersOrder
     */
    public java.util.List<String> getParametersOrder() {
        return this.parametersOrder;
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

    public static final class Builder extends Request.Builder<GetTemplateParameterConstraintsRequest, Builder> {
        private String clientToken; 
        private java.util.List<Parameters> parameters; 
        private java.util.List<String> parametersKeyFilter; 
        private java.util.List<String> parametersOrder; 
        private String regionId; 
        private String stackId; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateParameterConstraintsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.parameters = request.parameters;
            this.parametersKeyFilter = request.parametersKeyFilter;
            this.parametersOrder = request.parametersOrder;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</p>
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
         * <p>The name of parameter N in the template.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The parameters whose values you want to query.</p>
         */
        public Builder parametersKeyFilter(java.util.List<String> parametersKeyFilter) {
            String parametersKeyFilterShrink = shrink(parametersKeyFilter, "ParametersKeyFilter", "json");
            this.putQueryParameter("ParametersKeyFilter", parametersKeyFilterShrink);
            this.parametersKeyFilter = parametersKeyFilter;
            return this;
        }

        /**
         * <p>The order in which associated parameters are arranged.</p>
         * <blockquote>
         * <p> By default, the order of the associated parameters specified in the <code>Metadata</code> section of the template is used.</p>
         * </blockquote>
         */
        public Builder parametersOrder(java.util.List<String> parametersOrder) {
            String parametersOrderShrink = shrink(parametersOrder, "ParametersOrder", "json");
            this.putQueryParameter("ParametersOrder", parametersOrderShrink);
            this.parametersOrder = parametersOrder;
            return this;
        }

        /**
         * <p>The region ID of the template.</p>
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
         * <p>The ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>c754d2a4-28f1-46df-b557-9586173a****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The structure that contains the template body.</p>
         * <p>The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
         * <blockquote>
         * <p> You must specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Parameters&quot;:{&quot;ZoneInfo&quot;:{&quot;Type&quot;: &quot;String&quot;},&quot;InstanceType&quot;: {&quot;Type&quot;: &quot;String&quot;}},&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,&quot;Resources&quot;:{&quot;ECS&quot;:{&quot;Properties&quot;:{&quot;ZoneId&quot;:{&quot;Ref&quot;: &quot;ZoneInfo&quot;},&quot;InstanceType&quot;: {&quot;Ref&quot;: &quot;InstanceType&quot;}},&quot;Type&quot;: &quot;ALIYUN::ECS::Instance&quot;}}}</p>
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The ID of the template. This parameter applies to shared and private templates.</p>
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
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
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
         * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
         * <blockquote>
         * <p> This parameter takes effect only if the TemplateId parameter is specified.</p>
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

        @Override
        public GetTemplateParameterConstraintsRequest build() {
            return new GetTemplateParameterConstraintsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateParameterConstraintsRequest} extends {@link TeaModel}
     *
     * <p>GetTemplateParameterConstraintsRequest</p>
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
             * <p>The name of parameter N in the template.</p>
             * <blockquote>
             * <p> The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterKey parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZoneInfo</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of parameter N in the template.</p>
             * <blockquote>
             * <p> The Parameters parameter is optional. If you specify the Parameters parameter, you must specify the Parameters.N.ParameterValue parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
