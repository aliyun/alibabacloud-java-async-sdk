// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetNodeMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeMetricsResponseBody</p>
 */
public class GetNodeMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("NodesMetrics")
    private java.util.List < NodeMetric > nodesMetrics;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    private GetNodeMetricsResponseBody(Builder builder) {
        this.metricType = builder.metricType;
        this.nodesMetrics = builder.nodesMetrics;
        this.resourceGroupID = builder.resourceGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return nodesMetrics
     */
    public java.util.List < NodeMetric > getNodesMetrics() {
        return this.nodesMetrics;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public static final class Builder {
        private String metricType; 
        private java.util.List < NodeMetric > nodesMetrics; 
        private String resourceGroupID; 

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * NodesMetrics.
         */
        public Builder nodesMetrics(java.util.List < NodeMetric > nodesMetrics) {
            this.nodesMetrics = nodesMetrics;
            return this;
        }

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        public GetNodeMetricsResponseBody build() {
            return new GetNodeMetricsResponseBody(this);
        } 

    } 

}
