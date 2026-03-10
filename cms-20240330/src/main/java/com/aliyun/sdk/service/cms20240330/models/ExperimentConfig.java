// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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

    private ExperimentConfig(Builder builder) {
        this.label = builder.label;
        this.modelName = builder.modelName;
        this.modelParameters = builder.modelParameters;
        this.modelProvider = builder.modelProvider;
        this.name = builder.name;
        this.promptTemplate = builder.promptTemplate;
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

    public static final class Builder {
        private String label; 
        private String modelName; 
        private ModelParameters modelParameters; 
        private String modelProvider; 
        private String name; 
        private java.util.List<PromptTemplateItem> promptTemplate; 

        private Builder() {
        } 

        private Builder(ExperimentConfig model) {
            this.label = model.label;
            this.modelName = model.modelName;
            this.modelParameters = model.modelParameters;
            this.modelProvider = model.modelProvider;
            this.name = model.name;
            this.promptTemplate = model.promptTemplate;
        } 

        /**
         * label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * modelParameters.
         */
        public Builder modelParameters(ModelParameters modelParameters) {
            this.modelParameters = modelParameters;
            return this;
        }

        /**
         * modelProvider.
         */
        public Builder modelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * promptTemplate.
         */
        public Builder promptTemplate(java.util.List<PromptTemplateItem> promptTemplate) {
            this.promptTemplate = promptTemplate;
            return this;
        }

        public ExperimentConfig build() {
            return new ExperimentConfig(this);
        } 

    } 

}
