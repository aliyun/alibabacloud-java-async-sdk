// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeTrailDeliveryMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrailDeliveryMetricDataResponseBody</p>
 */
public class DescribeTrailDeliveryMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricList")
    private java.util.List<MetricList> metricList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTrailDeliveryMetricDataResponseBody(Builder builder) {
        this.metricList = builder.metricList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrailDeliveryMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricList
     */
    public java.util.List<MetricList> getMetricList() {
        return this.metricList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MetricList> metricList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeTrailDeliveryMetricDataResponseBody model) {
            this.metricList = model.metricList;
            this.requestId = model.requestId;
        } 

        /**
         * MetricList.
         */
        public Builder metricList(java.util.List<MetricList> metricList) {
            this.metricList = metricList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrailDeliveryMetricDataResponseBody build() {
            return new DescribeTrailDeliveryMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrailDeliveryMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrailDeliveryMetricDataResponseBody</p>
     */
    public static class MetricList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private MetricList(Builder builder) {
            this.count = builder.count;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long count; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(MetricList model) {
                this.count = model.count;
                this.timestamp = model.timestamp;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public MetricList build() {
                return new MetricList(this);
            } 

        } 

    }
}
