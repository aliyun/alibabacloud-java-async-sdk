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
 * {@link TargetServiceConfig} extends {@link TeaModel}
 *
 * <p>TargetServiceConfig</p>
 */
public class TargetServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("modelNamePattern")
    private String modelNamePattern;

    @com.aliyun.core.annotation.NameInMap("weight")
    private Long weight;

    private TargetServiceConfig(Builder builder) {
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelNamePattern = builder.modelNamePattern;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelNamePattern
     */
    public String getModelNamePattern() {
        return this.modelNamePattern;
    }

    /**
     * @return weight
     */
    public Long getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private String modelId; 
        private String modelName; 
        private String modelNamePattern; 
        private Long weight; 

        private Builder() {
        } 

        private Builder(TargetServiceConfig model) {
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelNamePattern = model.modelNamePattern;
            this.weight = model.weight;
        } 

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
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
         * modelNamePattern.
         */
        public Builder modelNamePattern(String modelNamePattern) {
            this.modelNamePattern = modelNamePattern;
            return this;
        }

        /**
         * weight.
         */
        public Builder weight(Long weight) {
            this.weight = weight;
            return this;
        }

        public TargetServiceConfig build() {
            return new TargetServiceConfig(this);
        } 

    } 

}
