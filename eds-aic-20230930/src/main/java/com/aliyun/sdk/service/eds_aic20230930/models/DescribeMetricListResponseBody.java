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
 * {@link DescribeMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricListResponseBody</p>
 */
public class DescribeMetricListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("MetricTotalModel")
    private java.util.List<MetricTotalModel> metricTotalModel;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMetricListResponseBody(Builder builder) {
        this.count = builder.count;
        this.metricTotalModel = builder.metricTotalModel;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricListResponseBody create() {
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

        private Builder(DescribeMetricListResponseBody model) {
            this.count = model.count;
            this.metricTotalModel = model.metricTotalModel;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * MetricTotalModel.
         */
        public Builder metricTotalModel(java.util.List<MetricTotalModel> metricTotalModel) {
            this.metricTotalModel = metricTotalModel;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMetricListResponseBody build() {
            return new DescribeMetricListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricListResponseBody</p>
     */
    public static class DataPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Average")
        private Double average;

        @com.aliyun.core.annotation.NameInMap("GpuId")
        private String gpuId;

        @com.aliyun.core.annotation.NameInMap("Maximum")
        private Double maximum;

        @com.aliyun.core.annotation.NameInMap("Minimum")
        private Double minimum;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private DataPoints(Builder builder) {
            this.average = builder.average;
            this.gpuId = builder.gpuId;
            this.maximum = builder.maximum;
            this.minimum = builder.minimum;
            this.timestamp = builder.timestamp;
            this.value = builder.value;
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
         * @return gpuId
         */
        public String getGpuId() {
            return this.gpuId;
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
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private Double average; 
            private String gpuId; 
            private Double maximum; 
            private Double minimum; 
            private Long timestamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(DataPoints model) {
                this.average = model.average;
                this.gpuId = model.gpuId;
                this.maximum = model.maximum;
                this.minimum = model.minimum;
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * Average.
             */
            public Builder average(Double average) {
                this.average = average;
                return this;
            }

            /**
             * GpuId.
             */
            public Builder gpuId(String gpuId) {
                this.gpuId = gpuId;
                return this;
            }

            /**
             * Maximum.
             */
            public Builder maximum(Double maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * Minimum.
             */
            public Builder minimum(Double minimum) {
                this.minimum = minimum;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public DataPoints build() {
                return new DataPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricListResponseBody</p>
     */
    public static class MetricModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPoints")
        private java.util.List<DataPoints> dataPoints;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        private MetricModelList(Builder builder) {
            this.dataPoints = builder.dataPoints;
            this.metricName = builder.metricName;
            this.processName = builder.processName;
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

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        public static final class Builder {
            private java.util.List<DataPoints> dataPoints; 
            private String metricName; 
            private String processName; 

            private Builder() {
            } 

            private Builder(MetricModelList model) {
                this.dataPoints = model.dataPoints;
                this.metricName = model.metricName;
                this.processName = model.processName;
            } 

            /**
             * DataPoints.
             */
            public Builder dataPoints(java.util.List<DataPoints> dataPoints) {
                this.dataPoints = dataPoints;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            public MetricModelList build() {
                return new MetricModelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricListResponseBody</p>
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
             * AndroidInstanceId.
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MetricModelList.
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
