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
 * {@link CloudMonitoringExpressEscalation} extends {@link TeaModel}
 *
 * <p>CloudMonitoringExpressEscalation</p>
 */
public class CloudMonitoringExpressEscalation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("rawExpression")
    private String rawExpression;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    private CloudMonitoringExpressEscalation(Builder builder) {
        this.rawExpression = builder.rawExpression;
        this.severity = builder.severity;
        this.times = builder.times;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudMonitoringExpressEscalation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rawExpression
     */
    public String getRawExpression() {
        return this.rawExpression;
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
        private String rawExpression; 
        private String severity; 
        private Integer times; 

        private Builder() {
        } 

        private Builder(CloudMonitoringExpressEscalation model) {
            this.rawExpression = model.rawExpression;
            this.severity = model.severity;
            this.times = model.times;
        } 

        /**
         * rawExpression.
         */
        public Builder rawExpression(String rawExpression) {
            this.rawExpression = rawExpression;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * times.
         */
        public Builder times(Integer times) {
            this.times = times;
            return this;
        }

        public CloudMonitoringExpressEscalation build() {
            return new CloudMonitoringExpressEscalation(this);
        } 

    } 

}
