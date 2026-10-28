// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ModelConfig} extends {@link TeaModel}
 *
 * <p>ModelConfig</p>
 */
public class ModelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ModelTemplate")
    private ModelTemplate modelTemplate;

    private ModelConfig(Builder builder) {
        this.modelName = builder.modelName;
        this.modelTemplate = builder.modelTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelTemplate
     */
    public ModelTemplate getModelTemplate() {
        return this.modelTemplate;
    }

    public static final class Builder {
        private String modelName; 
        private ModelTemplate modelTemplate; 

        private Builder() {
        } 

        private Builder(ModelConfig model) {
            this.modelName = model.modelName;
            this.modelTemplate = model.modelTemplate;
        } 

        /**
         * <p>The name of the output model. The output model of a joint training job is registered in the Models section of AI Asset Management under this name.</p>
         * 
         * <strong>example:</strong>
         * <p>model_a</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model template configuration. This configuration is required if you want to deploy the output model to Elastic Algorithm Service (EAS) with one click.</p>
         */
        public Builder modelTemplate(ModelTemplate modelTemplate) {
            this.modelTemplate = modelTemplate;
            return this;
        }

        public ModelConfig build() {
            return new ModelConfig(this);
        } 

    } 

}
