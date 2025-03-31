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
 * {@link DescribeSparkSQLDiagnosisListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkSQLDiagnosisListResponseBody</p>
 */
public class DescribeSparkSQLDiagnosisListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLDiagnosisList")
    private java.util.List<SQLDiagnosisList> SQLDiagnosisList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSparkSQLDiagnosisListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.SQLDiagnosisList = builder.SQLDiagnosisList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkSQLDiagnosisListResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLDiagnosisList
     */
    public java.util.List<SQLDiagnosisList> getSQLDiagnosisList() {
        return this.SQLDiagnosisList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SQLDiagnosisList> SQLDiagnosisList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSparkSQLDiagnosisListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.SQLDiagnosisList = model.SQLDiagnosisList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the request denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A91C9D07-7462-5F35-BB47-83629CE6CCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried diagnostic information.</p>
         */
        public Builder SQLDiagnosisList(java.util.List<SQLDiagnosisList> SQLDiagnosisList) {
            this.SQLDiagnosisList = SQLDiagnosisList;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1343</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSparkSQLDiagnosisListResponseBody build() {
            return new DescribeSparkSQLDiagnosisListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSparkSQLDiagnosisListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSparkSQLDiagnosisListResponseBody</p>
     */
    public static class SQLDiagnosisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("InnerQueryId")
        private Long innerQueryId;

        @com.aliyun.core.annotation.NameInMap("MaxExclusiveTime")
        private Long maxExclusiveTime;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("SQL")
        private String SQL;

        @com.aliyun.core.annotation.NameInMap("ScanRowCount")
        private Long scanRowCount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StatementId")
        private Long statementId;

        private SQLDiagnosisList(Builder builder) {
            this.appId = builder.appId;
            this.elapsedTime = builder.elapsedTime;
            this.innerQueryId = builder.innerQueryId;
            this.maxExclusiveTime = builder.maxExclusiveTime;
            this.peakMemory = builder.peakMemory;
            this.SQL = builder.SQL;
            this.scanRowCount = builder.scanRowCount;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.statementId = builder.statementId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLDiagnosisList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return innerQueryId
         */
        public Long getInnerQueryId() {
            return this.innerQueryId;
        }

        /**
         * @return maxExclusiveTime
         */
        public Long getMaxExclusiveTime() {
            return this.maxExclusiveTime;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        /**
         * @return scanRowCount
         */
        public Long getScanRowCount() {
            return this.scanRowCount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statementId
         */
        public Long getStatementId() {
            return this.statementId;
        }

        public static final class Builder {
            private String appId; 
            private Long elapsedTime; 
            private Long innerQueryId; 
            private Long maxExclusiveTime; 
            private Long peakMemory; 
            private String SQL; 
            private Long scanRowCount; 
            private String startTime; 
            private String state; 
            private Long statementId; 

            private Builder() {
            } 

            private Builder(SQLDiagnosisList model) {
                this.appId = model.appId;
                this.elapsedTime = model.elapsedTime;
                this.innerQueryId = model.innerQueryId;
                this.maxExclusiveTime = model.maxExclusiveTime;
                this.peakMemory = model.peakMemory;
                this.SQL = model.SQL;
                this.scanRowCount = model.scanRowCount;
                this.startTime = model.startTime;
                this.state = model.state;
                this.statementId = model.statementId;
            } 

            /**
             * <p>The application ID.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/612475.html">ListSparkApps</a> operation to query a list of Spark application IDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>s202404291020bjd448ad40002122</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The execution duration of the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The ID of the query executed within the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder innerQueryId(Long innerQueryId) {
                this.innerQueryId = innerQueryId;
                return this;
            }

            /**
             * <p>The maximum operator execution duration. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder maxExclusiveTime(Long maxExclusiveTime) {
                this.maxExclusiveTime = maxExclusiveTime;
                return this;
            }

            /**
             * <p>The maximum operator memory used. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from device where name = &quot;105506012112790031&quot;</p>
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * <p>The number of entries scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder scanRowCount(Long scanRowCount) {
                this.scanRowCount = scanRowCount;
                return this;
            }

            /**
             * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-20 09:09:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The execution status of the query. Valid values:</p>
             * <ul>
             * <li>COMPLETED</li>
             * <li>CANCELED</li>
             * <li>ABORTED</li>
             * <li>FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The unique ID of the code block in the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder statementId(Long statementId) {
                this.statementId = statementId;
                return this;
            }

            public SQLDiagnosisList build() {
                return new SQLDiagnosisList(this);
            } 

        } 

    }
}
