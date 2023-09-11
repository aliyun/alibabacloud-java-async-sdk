// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisRecordsResponseBody</p>
 */
public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDiagnosisRecordsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisRecordsResponseBody create() {
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
         * The threshold that determines whether the SQL statement must be truncated. The value is the number of characters.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The request ID.
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

        public DescribeDiagnosisRecordsResponseBody build() {
            return new DescribeDiagnosisRecordsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("QueryID")
        private String queryID;

        @NameInMap("SQLStmt")
        private String SQLStmt;

        @NameInMap("SQLTruncated")
        private Boolean SQLTruncated;

        @NameInMap("SQLTruncatedThreshold")
        private Integer SQLTruncatedThreshold;

        @NameInMap("SessionID")
        private String sessionID;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("User")
        private String user;

        private Items(Builder builder) {
            this.database = builder.database;
            this.duration = builder.duration;
            this.queryID = builder.queryID;
            this.SQLStmt = builder.SQLStmt;
            this.SQLTruncated = builder.SQLTruncated;
            this.SQLTruncatedThreshold = builder.SQLTruncatedThreshold;
            this.sessionID = builder.sessionID;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.user = builder.user;
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
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return queryID
         */
        public String getQueryID() {
            return this.queryID;
        }

        /**
         * @return SQLStmt
         */
        public String getSQLStmt() {
            return this.SQLStmt;
        }

        /**
         * @return SQLTruncated
         */
        public Boolean getSQLTruncated() {
            return this.SQLTruncated;
        }

        /**
         * @return SQLTruncatedThreshold
         */
        public Integer getSQLTruncatedThreshold() {
            return this.SQLTruncatedThreshold;
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

        public static final class Builder {
            private String database; 
            private Integer duration; 
            private String queryID; 
            private String SQLStmt; 
            private Boolean SQLTruncated; 
            private Integer SQLTruncatedThreshold; 
            private String sessionID; 
            private Long startTime; 
            private String status; 
            private String user; 

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The execution duration of the query. Unit: seconds.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The ID of the query. It is a unique identifier of the query.
             */
            public Builder queryID(String queryID) {
                this.queryID = queryID;
                return this;
            }

            /**
             * The SQL statement.
             */
            public Builder SQLStmt(String SQLStmt) {
                this.SQLStmt = SQLStmt;
                return this;
            }

            /**
             * Indicates whether the SQL statement needs to be truncated. Valid values:
             * <p>
             * 
             * *   **true**: The SQL statement needs to be truncated.
             * *   **false**: The SQL statement does not need to be truncated.
             */
            public Builder SQLTruncated(Boolean SQLTruncated) {
                this.SQLTruncated = SQLTruncated;
                return this;
            }

            /**
             * The threshold used to determine whether an SQL statement must be truncated. The value is the number of characters.
             */
            public Builder SQLTruncatedThreshold(Integer SQLTruncatedThreshold) {
                this.SQLTruncatedThreshold = SQLTruncatedThreshold;
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
             * The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The execution state of the query. Valid values:
             * <p>
             * 
             * *   **running**: The query is being executed.
             * *   **finished**: The query is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the database account.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
