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

    private ModelConfig(Builder builder) {
        this.modelName = builder.modelName;
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

    public static final class Builder {
        private String modelName; 

        private Builder() {
        } 

        private Builder(ModelConfig model) {
            this.modelName = model.modelName;
        } 

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public ModelConfig build() {
            return new ModelConfig(this);
        } 

    } 

}
