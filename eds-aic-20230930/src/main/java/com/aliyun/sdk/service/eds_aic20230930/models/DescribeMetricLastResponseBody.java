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
 * {@link DescribeMetricLastResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricLastResponseBody</p>
 */
public class DescribeMetricLastResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("MetricTotalModel")
    private java.util.List<MetricTotalModel> metricTotalModel;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMetricLastResponseBody(Builder builder) {
        this.count = builder.count;
        this.metricTotalModel = builder.metricTotalModel;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricLastResponseBody create() {
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

        private Builder(DescribeMetricLastResponseBody model) {
            this.count = model.count;
            this.metricTotalModel = model.metricTotalModel;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The token for the next query. If not all results are returned in a single query, the returned NextToken is not empty. You can use the returned NextToken in the next query to query the next page.</p>
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
         * <p>2B9E6946-0E2A-5D2B-B275-361DF81F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMetricLastResponseBody build() {
            return new DescribeMetricLastResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricLastResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricLastResponseBody</p>
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

        private DataPoints(Builder builder) {
            this.average = builder.average;
            this.gpuId = builder.gpuId;
            this.maximum = builder.maximum;
            this.minimum = builder.minimum;
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

        public static final class Builder {
            private Double average; 
            private String gpuId; 
            private Double maximum; 
            private Double minimum; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(DataPoints model) {
                this.average = model.average;
                this.gpuId = model.gpuId;
                this.maximum = model.maximum;
                this.minimum = model.minimum;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The average value. Unit: %.</p>
             * <blockquote>
             * <p>The unit is bps when the metric is \<code>bandwidth_package_usage_out\\</code> or \<code>bandwidth_package_usage_in\\</code>.</p>
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
             * <p>The GPU ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cpn-1t1bxvp9az2pk****-gpu-0</p>
             */
            public Builder gpuId(String gpuId) {
                this.gpuId = gpuId;
                return this;
            }

            /**
             * <p>The maximum value. Unit: %.</p>
             * <blockquote>
             * <p>The unit is bps when the metric is \<code>bandwidth_package_usage_out\\</code> or \<code>bandwidth_package_usage_in\\</code>.</p>
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
             * <p>The minimum value. Unit: %.</p>
             * <blockquote>
             * <p>The unit is bps when the metric is \<code>bandwidth_package_usage_out\\</code> or \<code>bandwidth_package_usage_in\\</code>.</p>
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
             * <p>The timestamp of the statistics. Unit: milliseconds.</p>
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
     * {@link DescribeMetricLastResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricLastResponseBody</p>
     */
    public static class ProcessLastInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuUsage")
        private Double cpuUsage;

        @com.aliyun.core.annotation.NameInMap("MemoryUsage")
        private Double memoryUsage;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProcessIds")
        private java.util.List<Integer> processIds;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private ProcessLastInfos(Builder builder) {
            this.cpuUsage = builder.cpuUsage;
            this.memoryUsage = builder.memoryUsage;
            this.name = builder.name;
            this.processIds = builder.processIds;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessLastInfos create() {
            return builder().build();
        }

        /**
         * @return cpuUsage
         */
        public Double getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return memoryUsage
         */
        public Double getMemoryUsage() {
            return this.memoryUsage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processIds
         */
        public java.util.List<Integer> getProcessIds() {
            return this.processIds;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Double cpuUsage; 
            private Double memoryUsage; 
            private String name; 
            private java.util.List<Integer> processIds; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(ProcessLastInfos model) {
                this.cpuUsage = model.cpuUsage;
                this.memoryUsage = model.memoryUsage;
                this.name = model.name;
                this.processIds = model.processIds;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The CPU utilization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder cpuUsage(Double cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The memory usage. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder memoryUsage(Double memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * <p>The process name.</p>
             * 
             * <strong>example:</strong>
             * <p>com.offerup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of process IDs.</p>
             */
            public Builder processIds(java.util.List<Integer> processIds) {
                this.processIds = processIds;
                return this;
            }

            /**
             * <p>The timestamp of the statistics. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1548777660000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public ProcessLastInfos build() {
                return new ProcessLastInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricLastResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricLastResponseBody</p>
     */
    public static class MetricModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPoints")
        private java.util.List<DataPoints> dataPoints;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("ProcessLastInfos")
        private java.util.List<ProcessLastInfos> processLastInfos;

        private MetricModelList(Builder builder) {
            this.dataPoints = builder.dataPoints;
            this.metricName = builder.metricName;
            this.processLastInfos = builder.processLastInfos;
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
         * @return processLastInfos
         */
        public java.util.List<ProcessLastInfos> getProcessLastInfos() {
            return this.processLastInfos;
        }

        public static final class Builder {
            private java.util.List<DataPoints> dataPoints; 
            private String metricName; 
            private java.util.List<ProcessLastInfos> processLastInfos; 

            private Builder() {
            } 

            private Builder(MetricModelList model) {
                this.dataPoints = model.dataPoints;
                this.metricName = model.metricName;
                this.processLastInfos = model.processLastInfos;
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
             * <p>cpu_utilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The process monitoring metrics.</p>
             * <blockquote>
             * <p>This parameter is returned when the metric is \<code>process_cpu\\</code> or \<code>process_memory\\</code>.</p>
             * </blockquote>
             */
            public Builder processLastInfos(java.util.List<ProcessLastInfos> processLastInfos) {
                this.processLastInfos = processLastInfos;
                return this;
            }

            public MetricModelList build() {
                return new MetricModelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricLastResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricLastResponseBody</p>
     */
    public static class MetricTotalModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("MetricModelList")
        private java.util.List<MetricModelList> metricModelList;

        private MetricTotalModel(Builder builder) {
            this.androidInstanceId = builder.androidInstanceId;
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
         * @return metricModelList
         */
        public java.util.List<MetricModelList> getMetricModelList() {
            return this.metricModelList;
        }

        public static final class Builder {
            private String androidInstanceId; 
            private java.util.List<MetricModelList> metricModelList; 

            private Builder() {
            } 

            private Builder(MetricTotalModel model) {
                this.androidInstanceId = model.androidInstanceId;
                this.metricModelList = model.metricModelList;
            } 

            /**
             * <p>For instance-level monitoring, the Cloud Phone instance ID is returned.
             * &lt;props=&quot;china&quot;&gt;For matrix-level monitoring, the matrix ID is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-fkuit0cmyru4p****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The monitoring data for metrics.</p>
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
