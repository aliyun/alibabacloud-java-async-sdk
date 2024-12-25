// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ToolCall} extends {@link TeaModel}
 *
 * <p>ToolCall</p>
 */
public class ToolCall extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Function")
    private FunctionCall function;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ToolCall(Builder builder) {
        this.function = builder.function;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToolCall create() {
        return builder().build();
    }

    /**
     * @return function
     */
    public FunctionCall getFunction() {
        return this.function;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private FunctionCall function; 
        private String type; 

        /**
         * Function.
         */
        public Builder function(FunctionCall function) {
            this.function = function;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ToolCall build() {
            return new ToolCall(this);
        } 

    } 

}
