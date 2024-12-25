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
 * {@link FunctionCall} extends {@link TeaModel}
 *
 * <p>FunctionCall</p>
 */
public class FunctionCall extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arguments")
    private String arguments;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private FunctionCall(Builder builder) {
        this.arguments = builder.arguments;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionCall create() {
        return builder().build();
    }

    /**
     * @return arguments
     */
    public String getArguments() {
        return this.arguments;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String arguments; 
        private String name; 

        /**
         * Arguments.
         */
        public Builder arguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public FunctionCall build() {
            return new FunctionCall(this);
        } 

    } 

}
