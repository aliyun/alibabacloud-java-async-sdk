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
 * {@link PrometheusMetricFilterValue} extends {@link TeaModel}
 *
 * <p>PrometheusMetricFilterValue</p>
 */
public class PrometheusMetricFilterValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dim")
    private String dim;

    @com.aliyun.core.annotation.NameInMap("opt")
    private String opt;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private PrometheusMetricFilterValue(Builder builder) {
        this.dim = builder.dim;
        this.opt = builder.opt;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrometheusMetricFilterValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dim
     */
    public String getDim() {
        return this.dim;
    }

    /**
     * @return opt
     */
    public String getOpt() {
        return this.opt;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String dim; 
        private String opt; 
        private String value; 

        private Builder() {
        } 

        private Builder(PrometheusMetricFilterValue model) {
            this.dim = model.dim;
            this.opt = model.opt;
            this.value = model.value;
        } 

        /**
         * <p>The filter dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        public Builder dim(String dim) {
            this.dim = dim;
            return this;
        }

        /**
         * <p>The filter operator, such as eq, neq, contain, not_contain, all, or disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        public Builder opt(String opt) {
            this.opt = opt;
            return this;
        }

        /**
         * <p>The filter value.</p>
         * 
         * <strong>example:</strong>
         * <p>web-01</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public PrometheusMetricFilterValue build() {
            return new PrometheusMetricFilterValue(this);
        } 

    } 

}
