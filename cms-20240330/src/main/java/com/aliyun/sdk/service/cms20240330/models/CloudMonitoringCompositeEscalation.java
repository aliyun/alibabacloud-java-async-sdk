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
 * {@link CloudMonitoringCompositeEscalation} extends {@link TeaModel}
 *
 * <p>CloudMonitoringCompositeEscalation</p>
 */
public class CloudMonitoringCompositeEscalation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("escalations")
    private java.util.List<CloudMonitoringCompositeEscalationEntry> escalations;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    private CloudMonitoringCompositeEscalation(Builder builder) {
        this.escalations = builder.escalations;
        this.relation = builder.relation;
        this.severity = builder.severity;
        this.times = builder.times;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudMonitoringCompositeEscalation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return escalations
     */
    public java.util.List<CloudMonitoringCompositeEscalationEntry> getEscalations() {
        return this.escalations;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
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
        private java.util.List<CloudMonitoringCompositeEscalationEntry> escalations; 
        private String relation; 
        private String severity; 
        private Integer times; 

        private Builder() {
        } 

        private Builder(CloudMonitoringCompositeEscalation model) {
            this.escalations = model.escalations;
            this.relation = model.relation;
            this.severity = model.severity;
            this.times = model.times;
        } 

        /**
         * <p>The multi-condition configuration list for cloud service monitoring composite triggers, which includes multiple sub-trigger conditions combined by logical operators (AND/OR) to determine whether to trigger an alert.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;metricName&quot;:&quot;cpuUsage&quot;,&quot;comparisonOperator&quot;:&quot;GT&quot;,&quot;threshold&quot;:&quot;80&quot;,&quot;period&quot;:60}]</p>
         */
        public Builder escalations(java.util.List<CloudMonitoringCompositeEscalationEntry> escalations) {
            this.escalations = escalations;
            return this;
        }

        /**
         * <p>The logical relationship between conditions (AND/OR).</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
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
         * <p>The consecutive trigger count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder times(Integer times) {
            this.times = times;
            return this;
        }

        public CloudMonitoringCompositeEscalation build() {
            return new CloudMonitoringCompositeEscalation(this);
        } 

    } 

}
