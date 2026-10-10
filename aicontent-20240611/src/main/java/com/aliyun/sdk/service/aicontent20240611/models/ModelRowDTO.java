// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRowDTO} extends {@link TeaModel}
 *
 * <p>ModelRowDTO</p>
 */
public class ModelRowDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("values")
    private String values;

    private ModelRowDTO(Builder builder) {
        this.modelCode = builder.modelCode;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRowDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder {
        private String modelCode; 
        private Long modelId; 
        private String modelName; 
        private String values; 

        private Builder() {
        } 

        private Builder(ModelRowDTO model) {
            this.modelCode = model.modelCode;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.values = model.values;
        } 

        /**
         * <p>Model identity</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * <p>Model ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>Model name</p>
         * 
         * <strong>example:</strong>
         * <p>通义千问-Plus</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>Metric value mapping, where the key is the metric name and the value is the numeric value</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;total_calls\&quot;:21,\&quot;video_duration\&quot;:210,\&quot;total_amount\&quot;:126,\&quot;image_count\&quot;:0}&quot;</p>
         */
        public Builder values(String values) {
            this.values = values;
            return this;
        }

        public ModelRowDTO build() {
            return new ModelRowDTO(this);
        } 

    } 

}
