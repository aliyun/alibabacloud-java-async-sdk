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
 * {@link PodMetric} extends {@link TeaModel}
 *
 * <p>PodMetric</p>
 */
public class PodMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metric> metrics;

    @com.aliyun.core.annotation.NameInMap("PodId")
    private String podId;

    private PodMetric(Builder builder) {
        this.metrics = builder.metrics;
        this.podId = builder.podId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PodMetric create() {
        return builder().build();
    }

    /**
     * @return metrics
     */
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    public static final class Builder {
        private java.util.List<Metric> metrics; 
        private String podId; 

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<Metric> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        public PodMetric build() {
            return new PodMetric(this);
        } 

    } 

}
