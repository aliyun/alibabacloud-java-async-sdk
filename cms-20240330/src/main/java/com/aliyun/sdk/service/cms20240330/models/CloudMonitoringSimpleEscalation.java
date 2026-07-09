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
 * {@link CloudMonitoringSimpleEscalation} extends {@link TeaModel}
 *
 * <p>CloudMonitoringSimpleEscalation</p>
 */
public class CloudMonitoringSimpleEscalation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("escalations")
    private java.util.List<CloudMonitoringSimpleEscalationEntry> escalations;

    @com.aliyun.core.annotation.NameInMap("metricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("period")
    private Integer period;

    private CloudMonitoringSimpleEscalation(Builder builder) {
        this.escalations = builder.escalations;
        this.metricName = builder.metricName;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudMonitoringSimpleEscalation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return escalations
     */
    public java.util.List<CloudMonitoringSimpleEscalationEntry> getEscalations() {
        return this.escalations;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    public static final class Builder {
        private java.util.List<CloudMonitoringSimpleEscalationEntry> escalations; 
        private String metricName; 
        private Integer period; 

        private Builder() {
        } 

        private Builder(CloudMonitoringSimpleEscalation model) {
            this.escalations = model.escalations;
            this.metricName = model.metricName;
            this.period = model.period;
        } 

        /**
         * escalations.
         */
        public Builder escalations(java.util.List<CloudMonitoringSimpleEscalationEntry> escalations) {
            this.escalations = escalations;
            return this;
        }

        /**
         * metricName.
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * period.
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        public CloudMonitoringSimpleEscalation build() {
            return new CloudMonitoringSimpleEscalation(this);
        } 

    } 

}
