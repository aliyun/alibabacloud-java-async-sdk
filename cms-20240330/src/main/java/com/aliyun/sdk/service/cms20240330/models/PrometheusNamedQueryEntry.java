// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PrometheusNamedQueryEntry} extends {@link TeaModel}
 *
 * <p>PrometheusNamedQueryEntry</p>
 */
public class PrometheusNamedQueryEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private PrometheusNamedQueryEntry(Builder builder) {
        this.expr = builder.expr;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrometheusNamedQueryEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String expr; 
        private String name; 

        private Builder() {
        } 

        private Builder(PrometheusNamedQueryEntry model) {
            this.expr = model.expr;
            this.name = model.name;
        } 

        /**
         * expr.
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public PrometheusNamedQueryEntry build() {
            return new PrometheusNamedQueryEntry(this);
        } 

    } 

}
