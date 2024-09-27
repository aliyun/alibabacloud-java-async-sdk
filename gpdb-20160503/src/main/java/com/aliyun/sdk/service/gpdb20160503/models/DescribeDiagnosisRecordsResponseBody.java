// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDiagnosisRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisRecordsResponseBody</p>
 */
public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The threshold that determines whether the SQL statement must be truncated. The value is the number of characters.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnosisRecordsResponseBody build() {
            return new DescribeDiagnosisRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosisRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosisRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("QueryID")
        private String queryID;

        @com.aliyun.core.annotation.NameInMap("SQLStmt")
        private String SQLStmt;

        @com.aliyun.core.annotation.NameInMap("SQLTruncated")
        private Boolean SQLTruncated;

        @com.aliyun.core.annotation.NameInMap("SQLTruncatedThreshold")
        private Integer SQLTruncatedThreshold;

        @com.aliyun.core.annotation.NameInMap("SessionID")
        private String sessionID;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("User")
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
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adbtest</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The execution duration of the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the query. It is a unique identifier of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>2022042612465401000000012903151998970</p>
             */
            public Builder queryID(String queryID) {
                this.queryID = queryID;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM t1,t2 WHERE t1.id=t2.id;</p>
             */
            public Builder SQLStmt(String SQLStmt) {
                this.SQLStmt = SQLStmt;
                return this;
            }

            /**
             * <p>Indicates whether the SQL statement needs to be truncated. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The SQL statement needs to be truncated.</li>
             * <li><strong>false</strong>: The SQL statement does not need to be truncated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder SQLTruncated(Boolean SQLTruncated) {
                this.SQLTruncated = SQLTruncated;
                return this;
            }

            /**
             * <p>The threshold used to determine whether an SQL statement must be truncated. The value is the number of characters.</p>
             * 
             * <strong>example:</strong>
             * <p>5120</p>
             */
            public Builder SQLTruncatedThreshold(Integer SQLTruncatedThreshold) {
                this.SQLTruncatedThreshold = SQLTruncatedThreshold;
                return this;
            }

            /**
             * <p>The ID of the session that contains the query.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder sessionID(String sessionID) {
                this.sessionID = sessionID;
                return this;
            }

            /**
             * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1651877940000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The execution state of the query. Valid values:</p>
             * <ul>
             * <li><strong>running</strong>: The query is being executed.</li>
             * <li><strong>finished</strong>: The query is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpguser</p>
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
