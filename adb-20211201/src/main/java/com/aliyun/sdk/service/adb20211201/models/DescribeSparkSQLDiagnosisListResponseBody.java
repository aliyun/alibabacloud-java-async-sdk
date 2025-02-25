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

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * SQLDiagnosisList.
         */
        public Builder SQLDiagnosisList(java.util.List<SQLDiagnosisList> SQLDiagnosisList) {
            this.SQLDiagnosisList = SQLDiagnosisList;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ElapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * InnerQueryId.
             */
            public Builder innerQueryId(Long innerQueryId) {
                this.innerQueryId = innerQueryId;
                return this;
            }

            /**
             * MaxExclusiveTime.
             */
            public Builder maxExclusiveTime(Long maxExclusiveTime) {
                this.maxExclusiveTime = maxExclusiveTime;
                return this;
            }

            /**
             * PeakMemory.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * SQL.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * ScanRowCount.
             */
            public Builder scanRowCount(Long scanRowCount) {
                this.scanRowCount = scanRowCount;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * StatementId.
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
