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
 * {@link PrometheusSimpleExpression} extends {@link TeaModel}
 *
 * <p>PrometheusSimpleExpression</p>
 */
public class PrometheusSimpleExpression extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    private PrometheusSimpleExpression(Builder builder) {
        this.operator = builder.operator;
        this.queryName = builder.queryName;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrometheusSimpleExpression create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String operator; 
        private String queryName; 
        private Double threshold; 

        private Builder() {
        } 

        private Builder(PrometheusSimpleExpression model) {
            this.operator = model.operator;
            this.queryName = model.queryName;
            this.threshold = model.threshold;
        } 

        /**
         * <p>The comparison operator. Valid values: GT (greater than), GE (greater than or equal to), LT (less than), LE (less than or equal to), EQ (equal to), and NE (not equal to).</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The referenced query name, corresponding to QueryConfigUnified.queries[].name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpuQuery</p>
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        /**
         * <p>The comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public PrometheusSimpleExpression build() {
            return new PrometheusSimpleExpression(this);
        } 

    } 

}
