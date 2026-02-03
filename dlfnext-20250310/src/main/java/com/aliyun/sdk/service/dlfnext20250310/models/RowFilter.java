// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link RowFilter} extends {@link TeaModel}
 *
 * <p>RowFilter</p>
 */
public class RowFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("predicate")
    private String predicate;

    private RowFilter(Builder builder) {
        this.expression = builder.expression;
        this.predicate = builder.predicate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RowFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return predicate
     */
    public String getPredicate() {
        return this.predicate;
    }

    public static final class Builder {
        private String expression; 
        private String predicate; 

        private Builder() {
        } 

        private Builder(RowFilter model) {
            this.expression = model.expression;
            this.predicate = model.predicate;
        } 

        /**
         * expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * predicate.
         */
        public Builder predicate(String predicate) {
            this.predicate = predicate;
            return this;
        }

        public RowFilter build() {
            return new RowFilter(this);
        } 

    } 

}
