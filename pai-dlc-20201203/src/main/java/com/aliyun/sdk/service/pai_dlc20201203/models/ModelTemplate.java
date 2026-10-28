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
 * {@link ModelTemplate} extends {@link TeaModel}
 *
 * <p>ModelTemplate</p>
 */
public class ModelTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Collections")
    private String collections;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    private ModelTemplate(Builder builder) {
        this.collections = builder.collections;
        this.modelName = builder.modelName;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collections
     */
    public String getCollections() {
        return this.collections;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder {
        private String collections; 
        private String modelName; 
        private String provider; 

        private Builder() {
        } 

        private Builder(ModelTemplate model) {
            this.collections = model.collections;
            this.modelName = model.modelName;
            this.provider = model.provider;
        } 

        /**
         * <p>The collection where the model template resides. Default value: QuickStartTemplate.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickStartTemplate</p>
         */
        public Builder collections(String collections) {
            this.collections = collections;
            return this;
        }

        /**
         * <p>The name of the model template.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-VL-32B-Instruct-PAI_template</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The provider of the model template. Default value: pai, which indicates that the model template is officially provided by PAI.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public ModelTemplate build() {
            return new ModelTemplate(this);
        } 

    } 

}
