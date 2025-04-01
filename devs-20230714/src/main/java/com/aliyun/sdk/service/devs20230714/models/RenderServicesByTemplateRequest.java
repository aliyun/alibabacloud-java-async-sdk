// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link RenderServicesByTemplateRequest} extends {@link RequestModel}
 *
 * <p>RenderServicesByTemplateRequest</p>
 */
public class RenderServicesByTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceNameChanges")
    private java.util.Map<String, String> serviceNameChanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variableValues")
    private TemplateVariableValueMap variableValues;

    private RenderServicesByTemplateRequest(Builder builder) {
        super(builder);
        this.parameters = builder.parameters;
        this.projectName = builder.projectName;
        this.serviceNameChanges = builder.serviceNameChanges;
        this.templateName = builder.templateName;
        this.variableValues = builder.variableValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderServicesByTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return serviceNameChanges
     */
    public java.util.Map<String, String> getServiceNameChanges() {
        return this.serviceNameChanges;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return variableValues
     */
    public TemplateVariableValueMap getVariableValues() {
        return this.variableValues;
    }

    public static final class Builder extends Request.Builder<RenderServicesByTemplateRequest, Builder> {
        private java.util.Map<String, ?> parameters; 
        private String projectName; 
        private java.util.Map<String, String> serviceNameChanges; 
        private String templateName; 
        private TemplateVariableValueMap variableValues; 

        private Builder() {
            super();
        } 

        private Builder(RenderServicesByTemplateRequest request) {
            super(request);
            this.parameters = request.parameters;
            this.projectName = request.projectName;
            this.serviceNameChanges = request.serviceNameChanges;
            this.templateName = request.templateName;
            this.variableValues = request.variableValues;
        } 

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * serviceNameChanges.
         */
        public Builder serviceNameChanges(java.util.Map<String, String> serviceNameChanges) {
            this.putBodyParameter("serviceNameChanges", serviceNameChanges);
            this.serviceNameChanges = serviceNameChanges;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>start-springboot</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * variableValues.
         */
        public Builder variableValues(TemplateVariableValueMap variableValues) {
            this.putBodyParameter("variableValues", variableValues);
            this.variableValues = variableValues;
            return this;
        }

        @Override
        public RenderServicesByTemplateRequest build() {
            return new RenderServicesByTemplateRequest(this);
        } 

    } 

}
