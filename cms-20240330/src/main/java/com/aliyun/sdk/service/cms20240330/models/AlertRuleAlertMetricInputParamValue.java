// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleAlertMetricInputParamValue} extends {@link TeaModel}
 *
 * <p>AlertRuleAlertMetricInputParamValue</p>
 */
public class AlertRuleAlertMetricInputParamValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private AlertRuleAlertMetricInputParamValue(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleAlertMetricInputParamValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String name; 
        private String value; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public AlertRuleAlertMetricInputParamValue build() {
            return new AlertRuleAlertMetricInputParamValue(this);
        } 

    } 

}
