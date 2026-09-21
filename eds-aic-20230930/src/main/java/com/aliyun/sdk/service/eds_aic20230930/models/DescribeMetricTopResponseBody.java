// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeMetricTopResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricTopResponseBody</p>
 */
public class DescribeMetricTopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("MetricTotalModel")
    private java.util.List<MetricTotalModel> metricTotalModel;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMetricTopResponseBody(Builder builder) {
        this.count = builder.count;
        this.metricTotalModel = builder.metricTotalModel;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricTopResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return metricTotalModel
     */
    public java.util.List<MetricTotalModel> getMetricTotalModel() {
        return this.metricTotalModel;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<MetricTotalModel> metricTotalModel; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMetricTopResponseBody model) {
            this.count = model.count;
            this.metricTotalModel = model.metricTotalModel;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The instance monitoring data.</p>
         */
        public Builder metricTotalModel(java.util.List<MetricTotalModel> metricTotalModel) {
            this.metricTotalModel = metricTotalModel;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If the results are not fully returned in a single query, this parameter is not empty. You can use this token in a subsequent query to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4610632D-D661-5982-B3D7-5D3FD183F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMetricTopResponseBody build() {
            return new DescribeMetricTopResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricTopResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricTopResponseBody</p>
     */
    public static class DataPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Average")
        private Double average;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Maximum")
        private Double maximum;

        @com.aliyun.core.annotation.NameInMap("Minimum")
        private Double minimum;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private DataPoints(Builder builder) {
            this.average = builder.average;
            this.id = builder.id;
            this.maximum = builder.maximum;
            this.minimum = builder.minimum;
            this.name = builder.name;
            this.properties = builder.properties;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoints create() {
            return builder().build();
        }

        /**
         * @return average
         */
        public Double getAverage() {
            return this.average;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return maximum
         */
        public Double getMaximum() {
            return this.maximum;
        }

        /**
         * @return minimum
         */
        public Double getMinimum() {
            return this.minimum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Double average; 
            private String id; 
            private Double maximum; 
            private Double minimum; 
            private String name; 
            private String properties; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(DataPoints model) {
                this.average = model.average;
                this.id = model.id;
                this.maximum = model.maximum;
                this.minimum = model.minimum;
                this.name = model.name;
                this.properties = model.properties;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The average value. Unit: %.</p>
             * <blockquote>
             * <p>The unit is bps when the metric is \<code>instance_in_traffic\\</code> or \<code>instance_out_traffic\\</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>99.52</p>
             */
            public Builder average(Double average) {
                this.average = average;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-fkuit0cmyru4p****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The maximum value. Unit: %.</p>
             * <blockquote>
             * <p>The unit is bps when the metric is \<code>instance_in_traffic\\</code> or \<code>instance_out_traffic\\</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maximum(Double maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * <p>The minimum value.</p>
             * <blockquote>
             * <p>The unit is bps when the metric is \<code>instance_in_traffic\\</code> or \<code>instance_out_traffic\\</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>93.1</p>
             */
            public Builder minimum(Double minimum) {
                this.minimum = minimum;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudPhone-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The properties.</p>
             * <blockquote>
             * <p>A JSON string that contains the extension properties.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;IP&quot;:&quot;192.168.<em>.</em>**&quot;}</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The timestamp of the data point. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1548777660000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public DataPoints build() {
                return new DataPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricTopResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricTopResponseBody</p>
     */
    public static class MetricModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPoints")
        private java.util.List<DataPoints> dataPoints;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        private MetricModelList(Builder builder) {
            this.dataPoints = builder.dataPoints;
            this.metricName = builder.metricName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricModelList create() {
            return builder().build();
        }

        /**
         * @return dataPoints
         */
        public java.util.List<DataPoints> getDataPoints() {
            return this.dataPoints;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        public static final class Builder {
            private java.util.List<DataPoints> dataPoints; 
            private String metricName; 

            private Builder() {
            } 

            private Builder(MetricModelList model) {
                this.dataPoints = model.dataPoints;
                this.metricName = model.metricName;
            } 

            /**
             * <p>The monitoring data points.</p>
             */
            public Builder dataPoints(java.util.List<DataPoints> dataPoints) {
                this.dataPoints = dataPoints;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_in_traffic</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            public MetricModelList build() {
                return new MetricModelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricTopResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricTopResponseBody</p>
     */
    public static class MetricTotalModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MetricModelList")
        private java.util.List<MetricModelList> metricModelList;

        private MetricTotalModel(Builder builder) {
            this.androidInstanceId = builder.androidInstanceId;
            this.instanceId = builder.instanceId;
            this.metricModelList = builder.metricModelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricTotalModel create() {
            return builder().build();
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return metricModelList
         */
        public java.util.List<MetricModelList> getMetricModelList() {
            return this.metricModelList;
        }

        public static final class Builder {
            private String androidInstanceId; 
            private String instanceId; 
            private java.util.List<MetricModelList> metricModelList; 

            private Builder() {
            } 

            private Builder(MetricTotalModel model) {
                this.androidInstanceId = model.androidInstanceId;
                this.instanceId = model.instanceId;
                this.metricModelList = model.metricModelList;
            } 

            /**
             * <p>For instance-level monitoring, this is the cloud phone instance ID.
             * &lt;props=&quot;china&quot;&gt;For matrix-level monitoring, this is the matrix ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-fkuit0cmyru4p****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np-5hh4a31emkt6u****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The monitoring data of metrics.</p>
             */
            public Builder metricModelList(java.util.List<MetricModelList> metricModelList) {
                this.metricModelList = metricModelList;
                return this;
            }

            public MetricTotalModel build() {
                return new MetricTotalModel(this);
            } 

        } 

    }
}
