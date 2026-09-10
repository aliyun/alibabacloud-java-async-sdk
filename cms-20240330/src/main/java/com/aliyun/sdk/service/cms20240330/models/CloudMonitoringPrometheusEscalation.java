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
 * {@link CloudMonitoringPrometheusEscalation} extends {@link TeaModel}
 *
 * <p>CloudMonitoringPrometheusEscalation</p>
 */
public class CloudMonitoringPrometheusEscalation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("promQl")
    private String promQl;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    private CloudMonitoringPrometheusEscalation(Builder builder) {
        this.promQl = builder.promQl;
        this.severity = builder.severity;
        this.times = builder.times;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudMonitoringPrometheusEscalation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return promQl
     */
    public String getPromQl() {
        return this.promQl;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return times
     */
    public Integer getTimes() {
        return this.times;
    }

    public static final class Builder {
        private String promQl; 
        private String severity; 
        private Integer times; 

        private Builder() {
        } 

        private Builder(CloudMonitoringPrometheusEscalation model) {
            this.promQl = model.promQl;
            this.severity = model.severity;
            this.times = model.times;
        } 

        /**
         * <p>The PromQL query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>rate(http_errors_total[5m]) &gt; 0.1</p>
         */
        public Builder promQl(String promQl) {
            this.promQl = promQl;
            return this;
        }

        /**
         * <p>The severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The number of consecutive times the alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder times(Integer times) {
            this.times = times;
            return this;
        }

        public CloudMonitoringPrometheusEscalation build() {
            return new CloudMonitoringPrometheusEscalation(this);
        } 

    } 

}
