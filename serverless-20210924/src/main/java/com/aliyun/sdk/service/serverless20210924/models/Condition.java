// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Condition} extends {@link TeaModel}
 *
 * <p>Condition</p>
 */
public class Condition extends TeaModel {
    @NameInMap("expression")
    private String expression;

    private Condition(Builder builder) {
        this.expression = builder.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Condition create() {
        return builder().build();
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    public static final class Builder {
        private String expression; 

        /**
         * an expression with a boolean return type
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        public Condition build() {
            return new Condition(this);
        } 

    } 

}
