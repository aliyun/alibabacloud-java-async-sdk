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
 * {@link AlertRuleAlertMetricInput} extends {@link TeaModel}
 *
 * <p>AlertRuleAlertMetricInput</p>
 */
public class AlertRuleAlertMetricInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("filterValues")
    private java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("metricId")
    private String metricId;

    @com.aliyun.core.annotation.NameInMap("paramValues")
    private java.util.List<AlertRuleAlertMetricInputParamValue> paramValues;

    private AlertRuleAlertMetricInput(Builder builder) {
        this.filterValues = builder.filterValues;
        this.groupId = builder.groupId;
        this.metricId = builder.metricId;
        this.paramValues = builder.paramValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleAlertMetricInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterValues
     */
    public java.util.List<AlertRuleAlertMetricInputFilterValue> getFilterValues() {
        return this.filterValues;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * @return paramValues
     */
    public java.util.List<AlertRuleAlertMetricInputParamValue> getParamValues() {
        return this.paramValues;
    }

    public static final class Builder {
        private java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues; 
        private String groupId; 
        private String metricId; 
        private java.util.List<AlertRuleAlertMetricInputParamValue> paramValues; 

        private Builder() {
        } 

        private Builder(AlertRuleAlertMetricInput model) {
            this.filterValues = model.filterValues;
            this.groupId = model.groupId;
            this.metricId = model.metricId;
            this.paramValues = model.paramValues;
        } 

        /**
         * filterValues.
         */
        public Builder filterValues(java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues) {
            this.filterValues = filterValues;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * metricId.
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * paramValues.
         */
        public Builder paramValues(java.util.List<AlertRuleAlertMetricInputParamValue> paramValues) {
            this.paramValues = paramValues;
            return this;
        }

        public AlertRuleAlertMetricInput build() {
            return new AlertRuleAlertMetricInput(this);
        } 

    } 

}
