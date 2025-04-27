// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeWaitingSQLRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWaitingSQLRecordsResponseBody</p>
 */
public class DescribeWaitingSQLRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeWaitingSQLRecordsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of lock diagnostics records.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWaitingSQLRecordsResponseBody build() {
            return new DescribeWaitingSQLRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWaitingSQLRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWaitingSQLRecordsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.database = model.database;
                this.PID = model.PID;
                this.SQLStmt = model.SQLStmt;
                this.sessionID = model.sessionID;
                this.startTime = model.startTime;
                this.status = model.status;
                this.user = model.user;
                this.waitingTime = model.waitingTime;
            } 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The ID of the process that uniquely identifies the query.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
            public Builder SQLStmt(String SQLStmt) {
                this.SQLStmt = SQLStmt;
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
             * <p>The start time of the query. This value is in the timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1660902033374</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The waiting state of the query. Valid values:</p>
             * <ul>
             * <li><strong>LockWaiting</strong></li>
             * <li><strong>ResourceWaiting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LockWaiting</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The database account that is used to perform the query.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The waiting period of the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>26911000</p>
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
