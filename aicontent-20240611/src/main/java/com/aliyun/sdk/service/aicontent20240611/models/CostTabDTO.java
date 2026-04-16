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
 * {@link CostTabDTO} extends {@link TeaModel}
 *
 * <p>CostTabDTO</p>
 */
public class CostTabDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("modelTypes")
    private java.util.List<String> modelTypes;

    private CostTabDTO(Builder builder) {
        this.key = builder.key;
        this.label = builder.label;
        this.modelTypes = builder.modelTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostTabDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return modelTypes
     */
    public java.util.List<String> getModelTypes() {
        return this.modelTypes;
    }

    public static final class Builder {
        private String key; 
        private String label; 
        private java.util.List<String> modelTypes; 

        private Builder() {
        } 

        private Builder(CostTabDTO model) {
            this.key = model.key;
            this.label = model.label;
            this.modelTypes = model.modelTypes;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * modelTypes.
         */
        public Builder modelTypes(java.util.List<String> modelTypes) {
            this.modelTypes = modelTypes;
            return this;
        }

        public CostTabDTO build() {
            return new CostTabDTO(this);
        } 

    } 

}
