// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link NodeSpec} extends {@link TeaModel}
 *
 * <p>NodeSpec</p>
 */
public class NodeSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindingPolicy")
    private BindingPolicy bindingPolicy;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private NodeSpec(Builder builder) {
        this.bindingPolicy = builder.bindingPolicy;
        this.count = builder.count;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindingPolicy
     */
    public BindingPolicy getBindingPolicy() {
        return this.bindingPolicy;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private BindingPolicy bindingPolicy; 
        private Long count; 
        private String type; 

        private Builder() {
        } 

        private Builder(NodeSpec model) {
            this.bindingPolicy = model.bindingPolicy;
            this.count = model.count;
            this.type = model.type;
        } 

        /**
         * BindingPolicy.
         */
        public Builder bindingPolicy(BindingPolicy bindingPolicy) {
            this.bindingPolicy = bindingPolicy;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public NodeSpec build() {
            return new NodeSpec(this);
        } 

    } 

}
