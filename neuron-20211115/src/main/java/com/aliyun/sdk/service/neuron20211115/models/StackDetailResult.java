// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link StackDetailResult} extends {@link TeaModel}
 *
 * <p>StackDetailResult</p>
 */
public class StackDetailResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("stacks")
    private java.util.List<StackInfo> stacks;

    private StackDetailResult(Builder builder) {
        this.stacks = builder.stacks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StackDetailResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stacks
     */
    public java.util.List<StackInfo> getStacks() {
        return this.stacks;
    }

    public static final class Builder {
        private java.util.List<StackInfo> stacks; 

        private Builder() {
        } 

        private Builder(StackDetailResult model) {
            this.stacks = model.stacks;
        } 

        /**
         * stacks.
         */
        public Builder stacks(java.util.List<StackInfo> stacks) {
            this.stacks = stacks;
            return this;
        }

        public StackDetailResult build() {
            return new StackDetailResult(this);
        } 

    } 

}
