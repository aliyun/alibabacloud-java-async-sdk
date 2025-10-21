// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link NodeExecutionContextDTO} extends {@link TeaModel}
 *
 * <p>NodeExecutionContextDTO</p>
 */
public class NodeExecutionContextDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("context")
    private java.util.Map<String, String> context;

    private NodeExecutionContextDTO(Builder builder) {
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeExecutionContextDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public java.util.Map<String, String> getContext() {
        return this.context;
    }

    public static final class Builder {
        private java.util.Map<String, String> context; 

        private Builder() {
        } 

        private Builder(NodeExecutionContextDTO model) {
            this.context = model.context;
        } 

        /**
         * context.
         */
        public Builder context(java.util.Map<String, String> context) {
            this.context = context;
            return this;
        }

        public NodeExecutionContextDTO build() {
            return new NodeExecutionContextDTO(this);
        } 

    } 

}
