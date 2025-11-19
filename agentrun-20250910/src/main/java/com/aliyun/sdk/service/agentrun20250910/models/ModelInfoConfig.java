// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ModelInfoConfig} extends {@link TeaModel}
 *
 * <p>ModelInfoConfig</p>
 */
public class ModelInfoConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("modelFeatures")
    private ModelFeatures modelFeatures;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("modelParameterRules")
    private java.util.List<ModelParameterRule> modelParameterRules;

    @com.aliyun.core.annotation.NameInMap("modelProperties")
    private ModelProperties modelProperties;

    private ModelInfoConfig(Builder builder) {
        this.modelFeatures = builder.modelFeatures;
        this.modelName = builder.modelName;
        this.modelParameterRules = builder.modelParameterRules;
        this.modelProperties = builder.modelProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelInfoConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelFeatures
     */
    public ModelFeatures getModelFeatures() {
        return this.modelFeatures;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelParameterRules
     */
    public java.util.List<ModelParameterRule> getModelParameterRules() {
        return this.modelParameterRules;
    }

    /**
     * @return modelProperties
     */
    public ModelProperties getModelProperties() {
        return this.modelProperties;
    }

    public static final class Builder {
        private ModelFeatures modelFeatures; 
        private String modelName; 
        private java.util.List<ModelParameterRule> modelParameterRules; 
        private ModelProperties modelProperties; 

        private Builder() {
        } 

        private Builder(ModelInfoConfig model) {
            this.modelFeatures = model.modelFeatures;
            this.modelName = model.modelName;
            this.modelParameterRules = model.modelParameterRules;
            this.modelProperties = model.modelProperties;
        } 

        /**
         * modelFeatures.
         */
        public Builder modelFeatures(ModelFeatures modelFeatures) {
            this.modelFeatures = modelFeatures;
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
         * modelParameterRules.
         */
        public Builder modelParameterRules(java.util.List<ModelParameterRule> modelParameterRules) {
            this.modelParameterRules = modelParameterRules;
            return this;
        }

        /**
         * modelProperties.
         */
        public Builder modelProperties(ModelProperties modelProperties) {
            this.modelProperties = modelProperties;
            return this;
        }

        public ModelInfoConfig build() {
            return new ModelInfoConfig(this);
        } 

    } 

}
