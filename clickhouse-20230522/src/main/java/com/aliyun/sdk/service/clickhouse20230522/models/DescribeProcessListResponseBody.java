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
 * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessListResponseBody</p>
 */
public class DescribeProcessListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProcessListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessListResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxx-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessListResponseBody build() {
            return new DescribeProcessListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class ResultSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InitialAddress")
        private String initialAddress;

        @com.aliyun.core.annotation.NameInMap("InitialQueryId")
        private String initialQueryId;

        @com.aliyun.core.annotation.NameInMap("InitialUser")
        private String initialUser;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
        private Long queryDurationMs;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        private ResultSet(Builder builder) {
            this.initialAddress = builder.initialAddress;
            this.initialQueryId = builder.initialQueryId;
            this.initialUser = builder.initialUser;
            this.query = builder.query;
            this.queryDurationMs = builder.queryDurationMs;
            this.queryStartTime = builder.queryStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultSet create() {
            return builder().build();
        }

        /**
         * @return initialAddress
         */
        public String getInitialAddress() {
            return this.initialAddress;
        }

        /**
         * @return initialQueryId
         */
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        /**
         * @return initialUser
         */
        public String getInitialUser() {
            return this.initialUser;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryDurationMs
         */
        public Long getQueryDurationMs() {
            return this.queryDurationMs;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public static final class Builder {
            private String initialAddress; 
            private String initialQueryId; 
            private String initialUser; 
            private String query; 
            private Long queryDurationMs; 
            private String queryStartTime; 

            /**
             * <p>The address to which the query statement is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>0:0:0:0:0:ffff:1edd65ea</p>
             */
            public Builder initialAddress(String initialAddress) {
                this.initialAddress = initialAddress;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;79f7e40b-87e2-4ef4-b6df-21889a3a030e&quot;</p>
             */
            public Builder initialQueryId(String initialQueryId) {
                this.initialQueryId = initialQueryId;
                return this;
            }

            /**
             * <p>The user who executes the query statement.</p>
             * 
             * <strong>example:</strong>
             * <p>bany</p>
             */
            public Builder initialUser(String initialUser) {
                this.initialUser = initialUser;
                return this;
            }

            /**
             * <p>The query statement that is running.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from test</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The minimum query duration. Minimum value: <strong>1000</strong>. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder queryDurationMs(Long queryDurationMs) {
                this.queryDurationMs = queryDurationMs;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-23T10:13:23Z</p>
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
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceID")
        private Integer DBInstanceID;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResultSet")
        private java.util.List<ResultSet> resultSet;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.DBInstanceID = builder.DBInstanceID;
            this.DBInstanceName = builder.DBInstanceName;
            this.resultSet = builder.resultSet;
            this.totalCount = builder.totalCount;
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

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer DBInstanceID; 
            private String DBInstanceName; 
            private java.util.List<ResultSet> resultSet; 
            private Integer totalCount; 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-xxxx</p>
             */
            public Builder DBInstanceID(Integer DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The result sets.</p>
             */
            public Builder resultSet(java.util.List<ResultSet> resultSet) {
                this.resultSet = resultSet;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
