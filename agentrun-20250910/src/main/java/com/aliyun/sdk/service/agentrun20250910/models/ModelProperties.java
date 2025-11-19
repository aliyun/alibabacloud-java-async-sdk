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
 * {@link ModelProperties} extends {@link TeaModel}
 *
 * <p>ModelProperties</p>
 */
public class ModelProperties extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contextSize")
    private Integer contextSize;

    private ModelProperties(Builder builder) {
        this.contextSize = builder.contextSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelProperties create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contextSize
     */
    public Integer getContextSize() {
        return this.contextSize;
    }

    public static final class Builder {
        private Integer contextSize; 

        private Builder() {
        } 

        private Builder(ModelProperties model) {
            this.contextSize = model.contextSize;
        } 

        /**
         * contextSize.
         */
        public Builder contextSize(Integer contextSize) {
            this.contextSize = contextSize;
            return this;
        }

        public ModelProperties build() {
            return new ModelProperties(this);
        } 

    } 

}
