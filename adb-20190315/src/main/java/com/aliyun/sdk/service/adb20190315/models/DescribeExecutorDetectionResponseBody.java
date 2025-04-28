// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeExecutorDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExecutorDetectionResponseBody</p>
 */
public class DescribeExecutorDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List<DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeExecutorDetectionResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.detectionItems = builder.detectionItems;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExecutorDetectionResponseBody create() {
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
     * @return detectionItems
     */
    public java.util.List<DetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List<DetectionItems> detectionItems; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeExecutorDetectionResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.detectionItems = model.detectionItems;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-xxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The queried detection items and detection results.</p>
         */
        public Builder detectionItems(java.util.List<DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B20BA053-27A1-5FDF-B063-6D6146720DF6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExecutorDetectionResponseBody build() {
            return new DescribeExecutorDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExecutorDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExecutorDetectionResponseBody</p>
     */
    public static class SearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgValue")
        private Double avgValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private Long maxValue;

        @com.aliyun.core.annotation.NameInMap("OperatorCount")
        private Long operatorCount;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("TotalValue")
        private Long totalValue;

        private SearchResults(Builder builder) {
            this.avgValue = builder.avgValue;
            this.maxValue = builder.maxValue;
            this.operatorCount = builder.operatorCount;
            this.operatorName = builder.operatorName;
            this.totalValue = builder.totalValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResults create() {
            return builder().build();
        }

        /**
         * @return avgValue
         */
        public Double getAvgValue() {
            return this.avgValue;
        }

        /**
         * @return maxValue
         */
        public Long getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return operatorCount
         */
        public Long getOperatorCount() {
            return this.operatorCount;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return totalValue
         */
        public Long getTotalValue() {
            return this.totalValue;
        }

        public static final class Builder {
            private Double avgValue; 
            private Long maxValue; 
            private Long operatorCount; 
            private String operatorName; 
            private Long totalValue; 

            private Builder() {
            } 

            private Builder(SearchResults model) {
                this.avgValue = model.avgValue;
                this.maxValue = model.maxValue;
                this.operatorCount = model.operatorCount;
                this.operatorName = model.operatorName;
                this.totalValue = model.totalValue;
            } 

            /**
             * <p>The average value of the operator metric.</p>
             * 
             * <strong>example:</strong>
             * <p>235.5</p>
             */
            public Builder avgValue(Double avgValue) {
                this.avgValue = avgValue;
                return this;
            }

            /**
             * <p>The maximum value of the operator metric.</p>
             * 
             * <strong>example:</strong>
             * <p>2335</p>
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The number of occurrences of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder operatorCount(Long operatorCount) {
                this.operatorCount = operatorCount;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Aggregation</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The cumulative value of the operator metric.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder totalValue(Long totalValue) {
                this.totalValue = totalValue;
                return this;
            }

            public SearchResults build() {
                return new SearchResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExecutorDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExecutorDetectionResponseBody</p>
     */
    public static class OperatorAgg extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("SearchResults")
        private java.util.List<SearchResults> searchResults;

        private OperatorAgg(Builder builder) {
            this.metricName = builder.metricName;
            this.searchResults = builder.searchResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorAgg create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return searchResults
         */
        public java.util.List<SearchResults> getSearchResults() {
            return this.searchResults;
        }

        public static final class Builder {
            private String metricName; 
            private java.util.List<SearchResults> searchResults; 

            private Builder() {
            } 

            private Builder(OperatorAgg model) {
                this.metricName = model.metricName;
                this.searchResults = model.searchResults;
            } 

            /**
             * <p>The name of the detection metric.</p>
             * 
             * <strong>example:</strong>
             * <p>PeakMemory</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The detection result items of operator metric aggregation.</p>
             */
            public Builder searchResults(java.util.List<SearchResults> searchResults) {
                this.searchResults = searchResults;
                return this;
            }

            public OperatorAgg build() {
                return new OperatorAgg(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExecutorDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExecutorDetectionResponseBody</p>
     */
    public static class OperatorDetailsSearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputRows")
        private Long inputRows;

        @com.aliyun.core.annotation.NameInMap("InputSize")
        private Long inputSize;

        @com.aliyun.core.annotation.NameInMap("OperatorCost")
        private Double operatorCost;

        @com.aliyun.core.annotation.NameInMap("OperatorInfo")
        private String operatorInfo;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OutputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("OutputSize")
        private Long outputSize;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        private OperatorDetailsSearchResults(Builder builder) {
            this.inputRows = builder.inputRows;
            this.inputSize = builder.inputSize;
            this.operatorCost = builder.operatorCost;
            this.operatorInfo = builder.operatorInfo;
            this.operatorName = builder.operatorName;
            this.outputRows = builder.outputRows;
            this.outputSize = builder.outputSize;
            this.peakMemory = builder.peakMemory;
            this.processId = builder.processId;
            this.stageId = builder.stageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorDetailsSearchResults create() {
            return builder().build();
        }

        /**
         * @return inputRows
         */
        public Long getInputRows() {
            return this.inputRows;
        }

        /**
         * @return inputSize
         */
        public Long getInputSize() {
            return this.inputSize;
        }

        /**
         * @return operatorCost
         */
        public Double getOperatorCost() {
            return this.operatorCost;
        }

        /**
         * @return operatorInfo
         */
        public String getOperatorInfo() {
            return this.operatorInfo;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return outputSize
         */
        public Long getOutputSize() {
            return this.outputSize;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        public static final class Builder {
            private Long inputRows; 
            private Long inputSize; 
            private Double operatorCost; 
            private String operatorInfo; 
            private String operatorName; 
            private Long outputRows; 
            private Long outputSize; 
            private Long peakMemory; 
            private String processId; 
            private String stageId; 

            private Builder() {
            } 

            private Builder(OperatorDetailsSearchResults model) {
                this.inputRows = model.inputRows;
                this.inputSize = model.inputSize;
                this.operatorCost = model.operatorCost;
                this.operatorInfo = model.operatorInfo;
                this.operatorName = model.operatorName;
                this.outputRows = model.outputRows;
                this.outputSize = model.outputSize;
                this.peakMemory = model.peakMemory;
                this.processId = model.processId;
                this.stageId = model.stageId;
            } 

            /**
             * <p>The number of rows input by the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * <p>The amount of data input by the operator. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder inputSize(Long inputSize) {
                this.inputSize = inputSize;
                return this;
            }

            /**
             * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2354</p>
             */
            public Builder operatorCost(Double operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * <p>The property information about the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>GROUP BY field: uid</p>
             */
            public Builder operatorInfo(String operatorInfo) {
                this.operatorInfo = operatorInfo;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>TableScan</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The number of rows output by the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>2354</p>
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * <p>The amount of data output by the operator. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder outputSize(Long outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * <p>The peak memory of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>2334</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The query ID that can be used for diagnostics.</p>
             * 
             * <strong>example:</strong>
             * <p>202405061006230110150170540315119xxxx</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The stage ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Stage[7]</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            public OperatorDetailsSearchResults build() {
                return new OperatorDetailsSearchResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExecutorDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExecutorDetectionResponseBody</p>
     */
    public static class OperatorDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("SearchResults")
        private java.util.List<OperatorDetailsSearchResults> searchResults;

        private OperatorDetails(Builder builder) {
            this.metricName = builder.metricName;
            this.searchResults = builder.searchResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorDetails create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return searchResults
         */
        public java.util.List<OperatorDetailsSearchResults> getSearchResults() {
            return this.searchResults;
        }

        public static final class Builder {
            private String metricName; 
            private java.util.List<OperatorDetailsSearchResults> searchResults; 

            private Builder() {
            } 

            private Builder(OperatorDetails model) {
                this.metricName = model.metricName;
                this.searchResults = model.searchResults;
            } 

            /**
             * <p>The name of the detection metric.</p>
             * 
             * <strong>example:</strong>
             * <p>PeakMemory</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The detection result items of abnormal operators.</p>
             */
            public Builder searchResults(java.util.List<OperatorDetailsSearchResults> searchResults) {
                this.searchResults = searchResults;
                return this;
            }

            public OperatorDetails build() {
                return new OperatorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExecutorDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExecutorDetectionResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperatorAgg")
        private java.util.List<OperatorAgg> operatorAgg;

        @com.aliyun.core.annotation.NameInMap("OperatorDetails")
        private java.util.List<OperatorDetails> operatorDetails;

        private Results(Builder builder) {
            this.operatorAgg = builder.operatorAgg;
            this.operatorDetails = builder.operatorDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return operatorAgg
         */
        public java.util.List<OperatorAgg> getOperatorAgg() {
            return this.operatorAgg;
        }

        /**
         * @return operatorDetails
         */
        public java.util.List<OperatorDetails> getOperatorDetails() {
            return this.operatorDetails;
        }

        public static final class Builder {
            private java.util.List<OperatorAgg> operatorAgg; 
            private java.util.List<OperatorDetails> operatorDetails; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.operatorAgg = model.operatorAgg;
                this.operatorDetails = model.operatorDetails;
            } 

            /**
             * <p>The detection result items of operator metric aggregation.</p>
             */
            public Builder operatorAgg(java.util.List<OperatorAgg> operatorAgg) {
                this.operatorAgg = operatorAgg;
                return this;
            }

            /**
             * <p>The detection result items of abnormal operators.</p>
             */
            public Builder operatorDetails(java.util.List<OperatorDetails> operatorDetails) {
                this.operatorDetails = operatorDetails;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExecutorDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExecutorDetectionResponseBody</p>
     */
    public static class DetectionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Results")
        private Results results;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DetectionItems(Builder builder) {
            this.message = builder.message;
            this.name = builder.name;
            this.results = builder.results;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionItems create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return results
         */
        public Results getResults() {
            return this.results;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String name; 
            private Results results; 
            private String status; 

            private Builder() {
            } 

            private Builder(DetectionItems model) {
                this.message = model.message;
                this.name = model.name;
                this.results = model.results;
                this.status = model.status;
            } 

            /**
             * <p>The information about the detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>Large amounts of memory resources are used by the Aggregation operator.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the detection item.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU increase detection</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The detection result items.</p>
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The severity level of the detection result. Valid values:</p>
             * <ul>
             * <li>NORMAL</li>
             * <li>WARNING</li>
             * <li>CRITICAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WARNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DetectionItems build() {
                return new DetectionItems(this);
            } 

        } 

    }
}
