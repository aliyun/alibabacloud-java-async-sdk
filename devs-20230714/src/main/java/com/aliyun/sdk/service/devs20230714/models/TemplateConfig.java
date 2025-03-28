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
 * {@link TemplateConfig} extends {@link TeaModel}
 *
 * <p>TemplateConfig</p>
 */
public class TemplateConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("serviceNameChanges")
    private java.util.Map<String, String> serviceNameChanges;

    @com.aliyun.core.annotation.NameInMap("templateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("variableValues")
    private TemplateVariableValueMap variableValues;

    private TemplateConfig(Builder builder) {
        this.parameters = builder.parameters;
        this.serviceNameChanges = builder.serviceNameChanges;
        this.templateName = builder.templateName;
        this.variableValues = builder.variableValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
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

    public static final class Builder {
        private java.util.Map<String, String> parameters; 
        private java.util.Map<String, String> serviceNameChanges; 
        private String templateName; 
        private TemplateVariableValueMap variableValues; 

        private Builder() {
        } 

        private Builder(TemplateConfig model) {
            this.parameters = model.parameters;
            this.serviceNameChanges = model.serviceNameChanges;
            this.templateName = model.templateName;
            this.variableValues = model.variableValues;
        } 

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * serviceNameChanges.
         */
        public Builder serviceNameChanges(java.util.Map<String, String> serviceNameChanges) {
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
            this.templateName = templateName;
            return this;
        }

        /**
         * variableValues.
         */
        public Builder variableValues(TemplateVariableValueMap variableValues) {
            this.variableValues = variableValues;
            return this;
        }

        public TemplateConfig build() {
            return new TemplateConfig(this);
        } 

    } 

}
