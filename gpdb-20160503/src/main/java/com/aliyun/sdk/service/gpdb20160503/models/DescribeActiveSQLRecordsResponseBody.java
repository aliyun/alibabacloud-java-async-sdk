// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveSQLRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveSQLRecordsResponseBody</p>
 */
public class DescribeActiveSQLRecordsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("Queries")
    private java.util.List < Queries> queries;

    @NameInMap("RequestId")
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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Queries.
         */
        public Builder queries(java.util.List < Queries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeActiveSQLRecordsResponseBody build() {
            return new DescribeActiveSQLRecordsResponseBody(this);
        } 

    } 

    public static class Queries extends TeaModel {
        @NameInMap("ClientAddr")
        private String clientAddr;

        @NameInMap("Database")
        private String database;

        @NameInMap("PID")
        private String PID;

        @NameInMap("Query")
        private String query;

        @NameInMap("QueryDuration")
        private String queryDuration;

        @NameInMap("QueryStart")
        private String queryStart;

        @NameInMap("SessionID")
        private String sessionID;

        @NameInMap("SqlTruncated")
        private String sqlTruncated;

        @NameInMap("SqlTruncatedThreshold")
        private String sqlTruncatedThreshold;

        @NameInMap("State")
        private String state;

        @NameInMap("User")
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
             * ClientAddr.
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * PID.
             */
            public Builder PID(String PID) {
                this.PID = PID;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * QueryDuration.
             */
            public Builder queryDuration(String queryDuration) {
                this.queryDuration = queryDuration;
                return this;
            }

            /**
             * QueryStart.
             */
            public Builder queryStart(String queryStart) {
                this.queryStart = queryStart;
                return this;
            }

            /**
             * SessionID.
             */
            public Builder sessionID(String sessionID) {
                this.sessionID = sessionID;
                return this;
            }

            /**
             * SqlTruncated.
             */
            public Builder sqlTruncated(String sqlTruncated) {
                this.sqlTruncated = sqlTruncated;
                return this;
            }

            /**
             * SqlTruncatedThreshold.
             */
            public Builder sqlTruncatedThreshold(String sqlTruncatedThreshold) {
                this.sqlTruncatedThreshold = sqlTruncatedThreshold;
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
             * User.
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
