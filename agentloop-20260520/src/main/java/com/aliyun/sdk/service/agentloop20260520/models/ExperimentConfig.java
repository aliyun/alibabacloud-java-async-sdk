// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ExperimentConfig} extends {@link TeaModel}
 *
 * <p>ExperimentConfig</p>
 */
public class ExperimentConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endpointConnectorId")
    private String endpointConnectorId;

    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("modelParameters")
    private ModelParameters modelParameters;

    @com.aliyun.core.annotation.NameInMap("modelProvider")
    private String modelProvider;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("promptTemplate")
    private java.util.List<PromptTemplateItem> promptTemplate;

    @com.aliyun.core.annotation.NameInMap("requestBodyTemplate")
    private String requestBodyTemplate;

    @com.aliyun.core.annotation.NameInMap("requestHeaderTemplate")
    private String requestHeaderTemplate;

    @com.aliyun.core.annotation.NameInMap("requestMethod")
    private String requestMethod;

    private ExperimentConfig(Builder builder) {
        this.endpointConnectorId = builder.endpointConnectorId;
        this.label = builder.label;
        this.modelName = builder.modelName;
        this.modelParameters = builder.modelParameters;
        this.modelProvider = builder.modelProvider;
        this.name = builder.name;
        this.promptTemplate = builder.promptTemplate;
        this.requestBodyTemplate = builder.requestBodyTemplate;
        this.requestHeaderTemplate = builder.requestHeaderTemplate;
        this.requestMethod = builder.requestMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExperimentConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointConnectorId
     */
    public String getEndpointConnectorId() {
        return this.endpointConnectorId;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelParameters
     */
    public ModelParameters getModelParameters() {
        return this.modelParameters;
    }

    /**
     * @return modelProvider
     */
    public String getModelProvider() {
        return this.modelProvider;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return promptTemplate
     */
    public java.util.List<PromptTemplateItem> getPromptTemplate() {
        return this.promptTemplate;
    }

    /**
     * @return requestBodyTemplate
     */
    public String getRequestBodyTemplate() {
        return this.requestBodyTemplate;
    }

    /**
     * @return requestHeaderTemplate
     */
    public String getRequestHeaderTemplate() {
        return this.requestHeaderTemplate;
    }

    /**
     * @return requestMethod
     */
    public String getRequestMethod() {
        return this.requestMethod;
    }

    public static final class Builder {
        private String endpointConnectorId; 
        private String label; 
        private String modelName; 
        private ModelParameters modelParameters; 
        private String modelProvider; 
        private String name; 
        private java.util.List<PromptTemplateItem> promptTemplate; 
        private String requestBodyTemplate; 
        private String requestHeaderTemplate; 
        private String requestMethod; 

        private Builder() {
        } 

        private Builder(ExperimentConfig model) {
            this.endpointConnectorId = model.endpointConnectorId;
            this.label = model.label;
            this.modelName = model.modelName;
            this.modelParameters = model.modelParameters;
            this.modelProvider = model.modelProvider;
            this.name = model.name;
            this.promptTemplate = model.promptTemplate;
            this.requestBodyTemplate = model.requestBodyTemplate;
            this.requestHeaderTemplate = model.requestHeaderTemplate;
            this.requestMethod = model.requestMethod;
        } 

        /**
         * <p>The endpoint connector ID. This parameter is required in user/agent mode.</p>
         */
        public Builder endpointConnectorId(String endpointConnectorId) {
            this.endpointConnectorId = endpointConnectorId;
            return this;
        }

        /**
         * <p>The experiment label (A/B/C/D/E).</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>The model name. You can set this parameter to agent in agent scenarios.</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model parameters.</p>
         */
        public Builder modelParameters(ModelParameters modelParameters) {
            this.modelParameters = modelParameters;
            return this;
        }

        /**
         * <p>The model provider. Valid values: dashscope (default), user, and agent.</p>
         */
        public Builder modelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }

        /**
         * <p>The experiment name.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The prompt message template. Supports {{variable name}} placeholders.</p>
         */
        public Builder promptTemplate(java.util.List<PromptTemplateItem> promptTemplate) {
            this.promptTemplate = promptTemplate;
            return this;
        }

        /**
         * <p>The agent request body template. This parameter is required in agent mode. Supports {{variable name}} placeholders.</p>
         */
        public Builder requestBodyTemplate(String requestBodyTemplate) {
            this.requestBodyTemplate = requestBodyTemplate;
            return this;
        }

        /**
         * <p>The agent request header template. This parameter is optional in agent mode. Supports {{variable name}} placeholders.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Content-Type: application/json&quot; }</p>
         */
        public Builder requestHeaderTemplate(String requestHeaderTemplate) {
            this.requestHeaderTemplate = requestHeaderTemplate;
            return this;
        }

        /**
         * <p>The agent request method. Valid values: POST (default) and GET.</p>
         */
        public Builder requestMethod(String requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public ExperimentConfig build() {
            return new ExperimentConfig(this);
        } 

    } 

}
