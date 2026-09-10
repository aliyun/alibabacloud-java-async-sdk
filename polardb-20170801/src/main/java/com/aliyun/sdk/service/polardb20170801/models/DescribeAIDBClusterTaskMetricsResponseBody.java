// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterTaskMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterTaskMetricsResponseBody</p>
 */
public class DescribeAIDBClusterTaskMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RelativeDbClusterId")
    private String relativeDbClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeAIDBClusterTaskMetricsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.items = builder.items;
        this.metricType = builder.metricType;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.relativeDbClusterId = builder.relativeDbClusterId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterTaskMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return relativeDbClusterId
     */
    public String getRelativeDbClusterId() {
        return this.relativeDbClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String endTime; 
        private Items items; 
        private String metricType; 
        private Long pageNumber; 
        private Integer pageRecordCount; 
        private Long pageSize; 
        private String relativeDbClusterId; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterTaskMetricsResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.endTime = model.endTime;
            this.items = model.items;
            this.metricType = model.metricType;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.relativeDbClusterId = model.relativeDbClusterId;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2zejpr***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-15T15:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The metric type.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The page number of the returned page. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The total number of entries that match the query conditions. This parameter is optional and is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the associated PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zejpr***</p>
         */
        public Builder relativeDbClusterId(String relativeDbClusterId) {
            this.relativeDbClusterId = relativeDbClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-15T14:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeAIDBClusterTaskMetricsResponseBody build() {
            return new DescribeAIDBClusterTaskMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterTaskMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTaskMetricsResponseBody</p>
     */
    public static class SlsMetricsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private Integer currentStep;

        @com.aliyun.core.annotation.NameInMap("Epoch")
        private Double epoch;

        @com.aliyun.core.annotation.NameInMap("GlobalStep")
        private Integer globalStep;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private String logTime;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private java.util.Map<String, ?> metric;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private SlsMetricsItems(Builder builder) {
            this.currentStep = builder.currentStep;
            this.epoch = builder.epoch;
            this.globalStep = builder.globalStep;
            this.logTime = builder.logTime;
            this.metric = builder.metric;
            this.metricType = builder.metricType;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsMetricsItems create() {
            return builder().build();
        }

        /**
         * @return currentStep
         */
        public Integer getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return epoch
         */
        public Double getEpoch() {
            return this.epoch;
        }

        /**
         * @return globalStep
         */
        public Integer getGlobalStep() {
            return this.globalStep;
        }

        /**
         * @return logTime
         */
        public String getLogTime() {
            return this.logTime;
        }

        /**
         * @return metric
         */
        public java.util.Map<String, ?> getMetric() {
            return this.metric;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Integer currentStep; 
            private Double epoch; 
            private Integer globalStep; 
            private String logTime; 
            private java.util.Map<String, ?> metric; 
            private String metricType; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(SlsMetricsItems model) {
                this.currentStep = model.currentStep;
                this.epoch = model.epoch;
                this.globalStep = model.globalStep;
                this.logTime = model.logTime;
                this.metric = model.metric;
                this.metricType = model.metricType;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The current step.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder currentStep(Integer currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * <p>The epoch.</p>
             * 
             * <strong>example:</strong>
             * <p>0.23</p>
             */
            public Builder epoch(Double epoch) {
                this.epoch = epoch;
                return this;
            }

            /**
             * <p>The total number of steps.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder globalStep(Integer globalStep) {
                this.globalStep = globalStep;
                return this;
            }

            /**
             * <p>The log time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-15T14:16:49.52140317Z</p>
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * <p>The metric details.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;memory(GiB)&quot;:&quot;xxx&quot;}</p>
             */
            public Builder metric(java.util.Map<String, ?> metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The metric type.</p>
             * 
             * <strong>example:</strong>
             * <p>train</p>
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * <p>The specific point in time when the monitoring metric was collected. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1742090703</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public SlsMetricsItems build() {
                return new SlsMetricsItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterTaskMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterTaskMetricsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlsMetricsItems")
        private java.util.List<SlsMetricsItems> slsMetricsItems;

        private Items(Builder builder) {
            this.slsMetricsItems = builder.slsMetricsItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return slsMetricsItems
         */
        public java.util.List<SlsMetricsItems> getSlsMetricsItems() {
            return this.slsMetricsItems;
        }

        public static final class Builder {
            private java.util.List<SlsMetricsItems> slsMetricsItems; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.slsMetricsItems = model.slsMetricsItems;
            } 

            /**
             * <p>The list of metrics.</p>
             */
            public Builder slsMetricsItems(java.util.List<SlsMetricsItems> slsMetricsItems) {
                this.slsMetricsItems = slsMetricsItems;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
