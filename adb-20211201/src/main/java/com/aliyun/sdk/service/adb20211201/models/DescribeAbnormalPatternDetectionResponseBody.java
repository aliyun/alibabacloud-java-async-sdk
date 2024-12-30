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

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DetectionItems.
         */
        public Builder detectionItems(java.util.List<DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * AccessIp.
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * PatternId.
             */
            public Builder patternId(String patternId) {
                this.patternId = patternId;
                return this;
            }

            /**
             * QueryCount.
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * RelatedMetrics.
             */
            public Builder relatedMetrics(String relatedMetrics) {
                this.relatedMetrics = relatedMetrics;
                return this;
            }

            /**
             * SQLPattern.
             */
            public Builder SQLPattern(String SQLPattern) {
                this.SQLPattern = SQLPattern;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(String tables) {
                this.tables = tables;
                return this;
            }

            /**
             * User.
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

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Results.
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
