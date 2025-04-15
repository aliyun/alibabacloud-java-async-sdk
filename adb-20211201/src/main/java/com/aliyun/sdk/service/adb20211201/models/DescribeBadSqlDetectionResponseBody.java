// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeBadSqlDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBadSqlDetectionResponseBody</p>
 */
public class DescribeBadSqlDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List<DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeBadSqlDetectionResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.DBClusterId = builder.DBClusterId;
        this.detectionItems = builder.detectionItems;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBadSqlDetectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String DBClusterId; 
        private java.util.List<DetectionItems> detectionItems; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBadSqlDetectionResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.DBClusterId = model.DBClusterId;
            this.detectionItems = model.detectionItems;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the request denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-xxxx</p>
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
         * <p>584CFCAE-E3C8-5BBB-B46C-724E77A830A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBadSqlDetectionResponseBody build() {
            return new DescribeBadSqlDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBadSqlDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBadSqlDetectionResponseBody</p>
     */
    public static class DiagnosisResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("OperatorId")
        private String operatorId;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        private DiagnosisResults(Builder builder) {
            this.code = builder.code;
            this.detail = builder.detail;
            this.operatorId = builder.operatorId;
            this.stageId = builder.stageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosisResults create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return operatorId
         */
        public String getOperatorId() {
            return this.operatorId;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        public static final class Builder {
            private String code; 
            private String detail; 
            private String operatorId; 
            private String stageId; 

            private Builder() {
            } 

            private Builder(DiagnosisResults model) {
                this.code = model.code;
                this.detail = model.detail;
                this.operatorId = model.operatorId;
                this.stageId = model.stageId;
            } 

            /**
             * <p>The diagnostic code.</p>
             * 
             * <strong>example:</strong>
             * <p>Large amounts of data are returned to the client.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The information about the diagnostic result.</p>
             * 
             * <strong>example:</strong>
             * <p>Large amounts of data are returned to the client. Import the data to OSS.</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The operator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TableScan[234]</p>
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * <p>The stage ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Stage[67]</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            public DiagnosisResults build() {
                return new DiagnosisResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBadSqlDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBadSqlDetectionResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cost")
        private Long cost;

        @com.aliyun.core.annotation.NameInMap("DiagnosisResults")
        private java.util.List<DiagnosisResults> diagnosisResults;

        @com.aliyun.core.annotation.NameInMap("OperatorCost")
        private Long operatorCost;

        @com.aliyun.core.annotation.NameInMap("OutputDataSize")
        private Long outputDataSize;

        @com.aliyun.core.annotation.NameInMap("PatternId")
        private String patternId;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("SQL")
        private String SQL;

        @com.aliyun.core.annotation.NameInMap("ScanSize")
        private Long scanSize;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalStages")
        private Integer totalStages;

        private Results(Builder builder) {
            this.cost = builder.cost;
            this.diagnosisResults = builder.diagnosisResults;
            this.operatorCost = builder.operatorCost;
            this.outputDataSize = builder.outputDataSize;
            this.patternId = builder.patternId;
            this.peakMemory = builder.peakMemory;
            this.processId = builder.processId;
            this.SQL = builder.SQL;
            this.scanSize = builder.scanSize;
            this.startTime = builder.startTime;
            this.totalStages = builder.totalStages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public Long getCost() {
            return this.cost;
        }

        /**
         * @return diagnosisResults
         */
        public java.util.List<DiagnosisResults> getDiagnosisResults() {
            return this.diagnosisResults;
        }

        /**
         * @return operatorCost
         */
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        /**
         * @return outputDataSize
         */
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        /**
         * @return patternId
         */
        public String getPatternId() {
            return this.patternId;
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
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        /**
         * @return scanSize
         */
        public Long getScanSize() {
            return this.scanSize;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalStages
         */
        public Integer getTotalStages() {
            return this.totalStages;
        }

        public static final class Builder {
            private Long cost; 
            private java.util.List<DiagnosisResults> diagnosisResults; 
            private Long operatorCost; 
            private Long outputDataSize; 
            private String patternId; 
            private Long peakMemory; 
            private String processId; 
            private String SQL; 
            private Long scanSize; 
            private String startTime; 
            private Integer totalStages; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.cost = model.cost;
                this.diagnosisResults = model.diagnosisResults;
                this.operatorCost = model.operatorCost;
                this.outputDataSize = model.outputDataSize;
                this.patternId = model.patternId;
                this.peakMemory = model.peakMemory;
                this.processId = model.processId;
                this.SQL = model.SQL;
                this.scanSize = model.scanSize;
                this.startTime = model.startTime;
                this.totalStages = model.totalStages;
            } 

            /**
             * <p>The total execution duration. Unit: milliseconds.</p>
             * <blockquote>
             * <p> This value is the cumulative value of the <code>QueuedTime</code>, <code>TotalPlanningTime</code>, and <code>ExecutionTime</code> parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>709</p>
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The diagnostic result items.</p>
             */
            public Builder diagnosisResults(java.util.List<DiagnosisResults> diagnosisResults) {
                this.diagnosisResults = diagnosisResults;
                return this;
            }

            /**
             * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * <p>The amount of returned data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>235433</p>
             */
            public Builder outputDataSize(Long outputDataSize) {
                this.outputDataSize = outputDataSize;
                return this;
            }

            /**
             * <p>The SQL pattern ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3467484070025860498</p>
             */
            public Builder patternId(String patternId) {
                this.patternId = patternId;
                return this;
            }

            /**
             * <p>The peak memory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>202410161002191720161451770345363xxxx</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * <blockquote>
             * <p> For performance considerations, an SQL statement cannot exceed 5,120 characters in length. Otherwise, the SQL statement is truncated. You can call the <a href="https://help.aliyun.com/document_detail/308212.html">DownloadDiagnosisRecords</a> operation to download the information about SQL statements that meet a query condition for an AnalyticDB for MySQL cluster, including the complete SQL statements.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM device WHERE product_key = &quot;h66zXfxet2X&quot; AND name = &quot;device@zntbtfptv5_9237117&quot;</p>
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * <p>The amount of scanned data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2342</p>
             */
            public Builder scanSize(Long scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-06T02:11:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total number of stages generated.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalStages(Integer totalStages) {
                this.totalStages = totalStages;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBadSqlDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBadSqlDetectionResponseBody</p>
     */
    public static class DetectionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

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
        public java.util.List<Results> getResults() {
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
            private java.util.List<Results> results; 
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
             * <p>SQL statements that result in high peak memory are detected.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the detection item.</p>
             * 
             * <strong>example:</strong>
             * <p>Cost</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The detection result items.</p>
             */
            public Builder results(java.util.List<Results> results) {
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
