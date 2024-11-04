// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleAlertMetricInputFilterValue} extends {@link TeaModel}
 *
 * <p>AlertRuleAlertMetricInputFilterValue</p>
 */
public class AlertRuleAlertMetricInputFilterValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dim")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dim;

    @com.aliyun.core.annotation.NameInMap("opt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String opt;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private AlertRuleAlertMetricInputFilterValue(Builder builder) {
        this.dim = builder.dim;
        this.opt = builder.opt;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleAlertMetricInputFilterValue create() {
        return builder().build();
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dim(String dim) {
            this.dim = dim;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder opt(String opt) {
            this.opt = opt;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public AlertRuleAlertMetricInputFilterValue build() {
            return new AlertRuleAlertMetricInputFilterValue(this);
        } 

    } 

}
