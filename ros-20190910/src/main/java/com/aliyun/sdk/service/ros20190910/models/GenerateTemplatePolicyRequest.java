// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The type of operation N for which you want to generate the policy information.
         * <p>
         * 
         * Valid values:
         * 
         * *   CreateStack: creates a stack by calling the CreateStack operation.
         * *   UpdateStack: updates a stack by calling the UpdateStack operation.
         * *   DeleteStack: deletes a stack by calling the DeleteStack operation.
         * *   DetectStackDrift: detects drifts on a stack by calling the DelectStackDrift operation.
         * *   ListStackOperationRisks: lists the risks of a deletion operation on a stack by setting the OperationType parameter to DeleteStack in the ListStackOperationRisks operation.
         * *   GetTemplateEstimateCost: queries the estimated prices of resources that you want to use in the template by calling the GetTemplateEstimateCost operation.
         * *   GetTemplateParameterConstraints: queries the values of parameters in the template by calling the GetTemplateParameterConstraints operation.
         * *   ImportResourcesToStack: imports resources to a stack by setting the ChangeSetType parameter to IMPORT in the CreateChangeSet operation.
         * *   SignalResource: sends a signal to a stack.
         * 
         * >  The default value is the combination of all valid values.
         */
        public Builder operationTypes(java.util.List < String > operationTypes) {
            this.putQueryParameter("OperationTypes", operationTypes);
            this.operationTypes = operationTypes;
            return this;
        }

        /**
         * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.
         * <p>
         * 
         * If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.
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
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.
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
         * >  If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.
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
         * The version of the template. This parameter takes effect only when the TemplateId parameter is specified.
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
