// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisSQLInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisSQLInfoResponseBody</p>
 */
public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    @NameInMap("Database")
    private String database;

    @NameInMap("Duration")
    private Integer duration;

    @NameInMap("MaxOutputRows")
    private String maxOutputRows;

    @NameInMap("QueryID")
    private String queryID;

    @NameInMap("QueryPlan")
    private String queryPlan;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLStmt")
    private String SQLStmt;

    @NameInMap("SessionID")
    private String sessionID;

    @NameInMap("SortedMetrics")
    private String sortedMetrics;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("TextPlan")
    private String textPlan;

    @NameInMap("User")
    private String user;

    private DescribeDiagnosisSQLInfoResponseBody(Builder builder) {
        this.database = builder.database;
        this.duration = builder.duration;
        this.maxOutputRows = builder.maxOutputRows;
        this.queryID = builder.queryID;
        this.queryPlan = builder.queryPlan;
        this.requestId = builder.requestId;
        this.SQLStmt = builder.SQLStmt;
        this.sessionID = builder.sessionID;
        this.sortedMetrics = builder.sortedMetrics;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.textPlan = builder.textPlan;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisSQLInfoResponseBody create() {
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
     * @return maxOutputRows
     */
    public String getMaxOutputRows() {
        return this.maxOutputRows;
    }

    /**
     * @return queryID
     */
    public String getQueryID() {
        return this.queryID;
    }

    /**
     * @return queryPlan
     */
    public String getQueryPlan() {
        return this.queryPlan;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return sortedMetrics
     */
    public String getSortedMetrics() {
        return this.sortedMetrics;
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
     * @return textPlan
     */
    public String getTextPlan() {
        return this.textPlan;
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
        private String maxOutputRows; 
        private String queryID; 
        private String queryPlan; 
        private String requestId; 
        private String SQLStmt; 
        private String sessionID; 
        private String sortedMetrics; 
        private Long startTime; 
        private String status; 
        private String textPlan; 
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
         * The maximum number of output rows.
         */
        public Builder maxOutputRows(String maxOutputRows) {
            this.maxOutputRows = maxOutputRows;
            return this;
        }

        /**
         * The query ID.
         */
        public Builder queryID(String queryID) {
            this.queryID = queryID;
            return this;
        }

        /**
         * The information about the operator.
         */
        public Builder queryPlan(String queryPlan) {
            this.queryPlan = queryPlan;
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
         * The SQL statement.
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
         * The sequence of metrics.
         */
        public Builder sortedMetrics(String sortedMetrics) {
            this.sortedMetrics = sortedMetrics;
            return this;
        }

        /**
         * The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The execution state of the query. Valid values:
         * <p>
         * 
         * *   **running**
         * *   **finished**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The information about the execution plan.
         */
        public Builder textPlan(String textPlan) {
            this.textPlan = textPlan;
            return this;
        }

        /**
         * The username.
         */
        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public DescribeDiagnosisSQLInfoResponseBody build() {
            return new DescribeDiagnosisSQLInfoResponseBody(this);
        } 

    } 

}
