// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DescribeSlowLogTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogTrendResponseBody</p>
 */
public class DescribeSlowLogTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSlowLogTrendResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlowLogTrendResponseBody build() {
            return new DescribeSlowLogTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogTrendResponseBody</p>
     */
    public static class ResultSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgQueryDurationMs")
        private Long avgQueryDurationMs;

        @com.aliyun.core.annotation.NameInMap("Cnt")
        private Long cnt;

        @com.aliyun.core.annotation.NameInMap("MaxQueryDurationMs")
        private Long maxQueryDurationMs;

        @com.aliyun.core.annotation.NameInMap("MinQueryDurationMs")
        private Long minQueryDurationMs;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        private ResultSet(Builder builder) {
            this.avgQueryDurationMs = builder.avgQueryDurationMs;
            this.cnt = builder.cnt;
            this.maxQueryDurationMs = builder.maxQueryDurationMs;
            this.minQueryDurationMs = builder.minQueryDurationMs;
            this.queryStartTime = builder.queryStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultSet create() {
            return builder().build();
        }

        /**
         * @return avgQueryDurationMs
         */
        public Long getAvgQueryDurationMs() {
            return this.avgQueryDurationMs;
        }

        /**
         * @return cnt
         */
        public Long getCnt() {
            return this.cnt;
        }

        /**
         * @return maxQueryDurationMs
         */
        public Long getMaxQueryDurationMs() {
            return this.maxQueryDurationMs;
        }

        /**
         * @return minQueryDurationMs
         */
        public Long getMinQueryDurationMs() {
            return this.minQueryDurationMs;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public static final class Builder {
            private Long avgQueryDurationMs; 
            private Long cnt; 
            private Long maxQueryDurationMs; 
            private Long minQueryDurationMs; 
            private String queryStartTime; 

            /**
             * AvgQueryDurationMs.
             */
            public Builder avgQueryDurationMs(Long avgQueryDurationMs) {
                this.avgQueryDurationMs = avgQueryDurationMs;
                return this;
            }

            /**
             * Cnt.
             */
            public Builder cnt(Long cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * MaxQueryDurationMs.
             */
            public Builder maxQueryDurationMs(Long maxQueryDurationMs) {
                this.maxQueryDurationMs = maxQueryDurationMs;
                return this;
            }

            /**
             * MinQueryDurationMs.
             */
            public Builder minQueryDurationMs(Long minQueryDurationMs) {
                this.minQueryDurationMs = minQueryDurationMs;
                return this;
            }

            /**
             * QueryStartTime.
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            public ResultSet build() {
                return new ResultSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceID")
        private Integer DBInstanceID;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResultSet")
        private java.util.List<ResultSet> resultSet;

        private Data(Builder builder) {
            this.DBInstanceID = builder.DBInstanceID;
            this.DBInstanceName = builder.DBInstanceName;
            this.resultSet = builder.resultSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBInstanceID
         */
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return resultSet
         */
        public java.util.List<ResultSet> getResultSet() {
            return this.resultSet;
        }

        public static final class Builder {
            private Integer DBInstanceID; 
            private String DBInstanceName; 
            private java.util.List<ResultSet> resultSet; 

            /**
             * DBInstanceID.
             */
            public Builder DBInstanceID(Integer DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * ResultSet.
             */
            public Builder resultSet(java.util.List<ResultSet> resultSet) {
                this.resultSet = resultSet;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
