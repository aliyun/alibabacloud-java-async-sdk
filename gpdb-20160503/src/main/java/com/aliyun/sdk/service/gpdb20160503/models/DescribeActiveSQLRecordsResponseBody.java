// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeActiveSQLRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveSQLRecordsResponseBody</p>
 */
public class DescribeActiveSQLRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Queries")
    private java.util.List < Queries> queries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeActiveSQLRecordsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.queries = builder.queries;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveSQLRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return queries
     */
    public java.util.List < Queries> getQueries() {
        return this.queries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private java.util.List < Queries> queries; 
        private String requestId; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The queried SQL records.</p>
         */
        public Builder queries(java.util.List < Queries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeActiveSQLRecordsResponseBody build() {
            return new DescribeActiveSQLRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeActiveSQLRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActiveSQLRecordsResponseBody</p>
     */
    public static class Queries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientAddr")
        private String clientAddr;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("PID")
        private String PID;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryDuration")
        private String queryDuration;

        @com.aliyun.core.annotation.NameInMap("QueryStart")
        private String queryStart;

        @com.aliyun.core.annotation.NameInMap("SessionID")
        private String sessionID;

        @com.aliyun.core.annotation.NameInMap("SqlTruncated")
        private String sqlTruncated;

        @com.aliyun.core.annotation.NameInMap("SqlTruncatedThreshold")
        private String sqlTruncatedThreshold;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Queries(Builder builder) {
            this.clientAddr = builder.clientAddr;
            this.database = builder.database;
            this.PID = builder.PID;
            this.query = builder.query;
            this.queryDuration = builder.queryDuration;
            this.queryStart = builder.queryStart;
            this.sessionID = builder.sessionID;
            this.sqlTruncated = builder.sqlTruncated;
            this.sqlTruncatedThreshold = builder.sqlTruncatedThreshold;
            this.state = builder.state;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queries create() {
            return builder().build();
        }

        /**
         * @return clientAddr
         */
        public String getClientAddr() {
            return this.clientAddr;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return PID
         */
        public String getPID() {
            return this.PID;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryDuration
         */
        public String getQueryDuration() {
            return this.queryDuration;
        }

        /**
         * @return queryStart
         */
        public String getQueryStart() {
            return this.queryStart;
        }

        /**
         * @return sessionID
         */
        public String getSessionID() {
            return this.sessionID;
        }

        /**
         * @return sqlTruncated
         */
        public String getSqlTruncated() {
            return this.sqlTruncated;
        }

        /**
         * @return sqlTruncatedThreshold
         */
        public String getSqlTruncatedThreshold() {
            return this.sqlTruncatedThreshold;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String clientAddr; 
            private String database; 
            private String PID; 
            private String query; 
            private String queryDuration; 
            private String queryStart; 
            private String sessionID; 
            private String sqlTruncated; 
            private String sqlTruncatedThreshold; 
            private String state; 
            private String user; 

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0</p>
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>xg_analyse</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The progress ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6164</p>
             */
            public Builder PID(String PID) {
                this.PID = PID;
                return this;
            }

            /**
             * <p>The SQL statement of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>Select * from t1,t2 where t1.id=t2.id;</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The execution duration of the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60s</p>
             */
            public Builder queryDuration(String queryDuration) {
                this.queryDuration = queryDuration;
                return this;
            }

            /**
             * <p>The start time of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-07T06:59Z</p>
             */
            public Builder queryStart(String queryStart) {
                this.queryStart = queryStart;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6612</p>
             */
            public Builder sessionID(String sessionID) {
                this.sessionID = sessionID;
                return this;
            }

            /**
             * <p>Indicates whether the SQL statement is truncated. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sqlTruncated(String sqlTruncated) {
                this.sqlTruncated = sqlTruncated;
                return this;
            }

            /**
             * <p>The threshold that is used to truncate the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder sqlTruncatedThreshold(String sqlTruncatedThreshold) {
                this.sqlTruncatedThreshold = sqlTruncatedThreshold;
                return this;
            }

            /**
             * <p>The status of the asynchronous request. Valid values:</p>
             * <ul>
             * <li><strong>running</strong></li>
             * <li><strong>block</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Queries build() {
                return new Queries(this);
            } 

        } 

    }
}
