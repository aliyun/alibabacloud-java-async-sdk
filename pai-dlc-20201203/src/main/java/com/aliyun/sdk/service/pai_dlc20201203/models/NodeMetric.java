// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link NodeMetric} extends {@link TeaModel}
 *
 * <p>NodeMetric</p>
 */
public class NodeMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metric> metrics;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    private NodeMetric(Builder builder) {
        this.metrics = builder.metrics;
        this.nodeName = builder.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeMetric create() {
        return builder().build();
    }

    /**
     * @return metrics
     */
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    public static final class Builder {
        private java.util.List<Metric> metrics; 
        private String nodeName; 

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<Metric> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public NodeMetric build() {
            return new NodeMetric(this);
        } 

    } 

}
