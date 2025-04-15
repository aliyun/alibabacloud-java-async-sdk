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
 * {@link DescribeAbnormalPatternDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAbnormalPatternDetectionResponseBody</p>
 */
public class DescribeAbnormalPatternDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List<DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeAbnormalPatternDetectionResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.detectionItems = builder.detectionItems;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAbnormalPatternDetectionResponseBody create() {
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

        private Builder(DescribeAbnormalPatternDetectionResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.detectionItems = model.detectionItems;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
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
         * <p>19B824E0-690D-5A78-9992-5398C2F43694</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAbnormalPatternDetectionResponseBody build() {
            return new DescribeAbnormalPatternDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAbnormalPatternDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAbnormalPatternDetectionResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessIp")
        private String accessIp;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("PatternId")
        private String patternId;

        @com.aliyun.core.annotation.NameInMap("QueryCount")
        private Long queryCount;

        @com.aliyun.core.annotation.NameInMap("RelatedMetrics")
        private String relatedMetrics;

        @com.aliyun.core.annotation.NameInMap("SQLPattern")
        private String SQLPattern;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private String tables;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Results(Builder builder) {
            this.accessIp = builder.accessIp;
            this.detail = builder.detail;
            this.failedCount = builder.failedCount;
            this.patternId = builder.patternId;
            this.queryCount = builder.queryCount;
            this.relatedMetrics = builder.relatedMetrics;
            this.SQLPattern = builder.SQLPattern;
            this.tables = builder.tables;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return accessIp
         */
        public String getAccessIp() {
            return this.accessIp;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return patternId
         */
        public String getPatternId() {
            return this.patternId;
        }

        /**
         * @return queryCount
         */
        public Long getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return relatedMetrics
         */
        public String getRelatedMetrics() {
            return this.relatedMetrics;
        }

        /**
         * @return SQLPattern
         */
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        /**
         * @return tables
         */
        public String getTables() {
            return this.tables;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String accessIp; 
            private String detail; 
            private Long failedCount; 
            private String patternId; 
            private Long queryCount; 
            private String relatedMetrics; 
            private String SQLPattern; 
            private String tables; 
            private String user; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.accessIp = model.accessIp;
                this.detail = model.detail;
                this.failedCount = model.failedCount;
                this.patternId = model.patternId;
                this.queryCount = model.queryCount;
                this.relatedMetrics = model.relatedMetrics;
                this.SQLPattern = model.SQLPattern;
                this.tables = model.tables;
                this.user = model.user;
            } 

            /**
             * <p>The IP address of the SQL client that submits the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.133.168</p>
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * <p>The description of the detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>Two SQL patterns that have abnormal totalTime metric values are detected. This may result in increased CPU utilization, query slowdown, and degraded system stability. Go to the monitoring page to diagnose the issue and then perform optimization.</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The number of failed SQL patterns within the time range.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The SQL pattern ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2803084667741875187</p>
             */
            public Builder patternId(String patternId) {
                this.patternId = patternId;
                return this;
            }

            /**
             * <p>The number of queries.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * <p>The metrics related to the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>Maximum query duration: 1.43s
             * Maximum peak memory: 20.73 MB
             * Maximum read table data: 10.12 MB</p>
             */
            public Builder relatedMetrics(String relatedMetrics) {
                this.relatedMetrics = relatedMetrics;
                return this;
            }

            /**
             * <p>The SQL statement that represents the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT <code>tsid</code>nFROM <code>prod_ods_marketing_engine_material</code>nWHERE <code>tsid</code> = ?nLIMIT ?</p>
             */
            public Builder SQLPattern(String SQLPattern) {
                this.SQLPattern = SQLPattern;
                return this;
            }

            /**
             * <p>The names of tables.</p>
             * 
             * <strong>example:</strong>
             * <p>dw_student_exam.ods_school_queanal</p>
             */
            public Builder tables(String tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The name of the database account that is used to submit the query.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAbnormalPatternDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAbnormalPatternDetectionResponseBody</p>
     */
    public static class DetectionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        private DetectionItems(Builder builder) {
            this.name = builder.name;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionItems create() {
            return builder().build();
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

        public static final class Builder {
            private String name; 
            private java.util.List<Results> results; 

            private Builder() {
            } 

            private Builder(DetectionItems model) {
                this.name = model.name;
                this.results = model.results;
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

            public DetectionItems build() {
                return new DetectionItems(this);
            } 

        } 

    }
}
