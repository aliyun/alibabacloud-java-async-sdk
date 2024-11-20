// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateTemplatePolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateTemplatePolicyRequest</p>
 */
public class GenerateTemplatePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTypes")
    private java.util.List < String > operationTypes;

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

    private GenerateTemplatePolicyRequest(Builder builder) {
        super(builder);
        this.operationTypes = builder.operationTypes;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTemplatePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationTypes
     */
    public java.util.List < String > getOperationTypes() {
        return this.operationTypes;
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

    public static final class Builder extends Request.Builder<GenerateTemplatePolicyRequest, Builder> {
        private java.util.List < String > operationTypes; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTemplatePolicyRequest request) {
            super(request);
            this.operationTypes = request.operationTypes;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * <p>The type of operation N for which you want to generate the policy information.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CreateStack: creates a stack by calling the CreateStack operation.</li>
         * <li>UpdateStack: updates a stack by calling the UpdateStack operation.</li>
         * <li>DeleteStack: deletes a stack by calling the DeleteStack operation.</li>
         * <li>DetectStackDrift: detects drifts on a stack by calling the DelectStackDrift operation.</li>
         * <li>ListStackOperationRisks: lists the risks of a deletion operation on a stack by setting the OperationType parameter to DeleteStack in the ListStackOperationRisks operation.</li>
         * <li>GetTemplateEstimateCost: queries the estimated prices of resources that you want to use in the template by calling the GetTemplateEstimateCost operation.</li>
         * <li>GetTemplateParameterConstraints: queries the values of parameters in the template by calling the GetTemplateParameterConstraints operation.</li>
         * <li>ImportResourcesToStack: imports resources to a stack by setting the ChangeSetType parameter to IMPORT in the CreateChangeSet operation.</li>
         * <li>SignalResource: sends a signal to a stack.</li>
         * </ul>
         * <blockquote>
         * <p> The default value is the combination of all valid values.</p>
         * </blockquote>
         */
        public Builder operationTypes(java.util.List < String > operationTypes) {
            this.putQueryParameter("OperationTypes", operationTypes);
            this.operationTypes = operationTypes;
            return this;
        }

        /**
         * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.</p>
         * <p>If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
         * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The ID of the template. This parameter applies to shared templates and private templates.</p>
         * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
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
         * <blockquote>
         * <p> If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
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
         * <p>The version of the template. This parameter takes effect only when the TemplateId parameter is specified.</p>
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
        public GenerateTemplatePolicyRequest build() {
            return new GenerateTemplatePolicyRequest(this);
        } 

    } 

}
