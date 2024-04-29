// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWaitingSQLRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWaitingSQLRecordsResponseBody</p>
 */
public class DescribeWaitingSQLRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWaitingSQLRecordsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWaitingSQLRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of lock diagnostics records.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWaitingSQLRecordsResponseBody build() {
            return new DescribeWaitingSQLRecordsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("PID")
        private String PID;

        @com.aliyun.core.annotation.NameInMap("SQLStmt")
        private String SQLStmt;

        @com.aliyun.core.annotation.NameInMap("SessionID")
        private String sessionID;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("WaitingTime")
        private Long waitingTime;

        private Items(Builder builder) {
            this.database = builder.database;
            this.PID = builder.PID;
            this.SQLStmt = builder.SQLStmt;
            this.sessionID = builder.sessionID;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.user = builder.user;
            this.waitingTime = builder.waitingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return SQLStmt
         */
        public String getSQLStmt() {
            return this.SQLStmt;
        }

        /**
         * @return sessionID
         */
        public String getSessionID() {
            return this.sessionID;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return waitingTime
         */
        public Long getWaitingTime() {
            return this.waitingTime;
        }

        public static final class Builder {
            private String database; 
            private String PID; 
            private String SQLStmt; 
            private String sessionID; 
            private Long startTime; 
            private String status; 
            private String user; 
            private Long waitingTime; 

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The ID of the process that uniquely identifies the query.
             */
            public Builder PID(String PID) {
                this.PID = PID;
                return this;
            }

            /**
             * The SQL statement of the query.
             */
            public Builder SQLStmt(String SQLStmt) {
                this.SQLStmt = SQLStmt;
                return this;
            }

            /**
             * The ID of the session that contains the query.
             */
            public Builder sessionID(String sessionID) {
                this.sessionID = sessionID;
                return this;
            }

            /**
             * The start time of the query. This value is in the timestamp format. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The waiting state of the query. Valid values:
             * <p>
             * 
             * *   **LockWaiting**
             * *   **ResourceWaiting**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The database account that is used to perform the query.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * The waiting period of the query. Unit: milliseconds.
             */
            public Builder waitingTime(Long waitingTime) {
                this.waitingTime = waitingTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
