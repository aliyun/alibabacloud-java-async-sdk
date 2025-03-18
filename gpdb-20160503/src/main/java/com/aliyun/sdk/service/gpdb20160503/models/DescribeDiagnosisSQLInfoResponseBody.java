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
 * {@link DescribeDiagnosisSQLInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisSQLInfoResponseBody</p>
 */
public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.NameInMap("MaxOutputRows")
    private String maxOutputRows;

    @com.aliyun.core.annotation.NameInMap("QueryID")
    private String queryID;

    @com.aliyun.core.annotation.NameInMap("QueryPlan")
    private String queryPlan;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLStmt")
    private String SQLStmt;

    @com.aliyun.core.annotation.NameInMap("SessionID")
    private String sessionID;

    @com.aliyun.core.annotation.NameInMap("SortedMetrics")
    private String sortedMetrics;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TextPlan")
    private String textPlan;

    @com.aliyun.core.annotation.NameInMap("User")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDiagnosisSQLInfoResponseBody model) {
            this.database = model.database;
            this.duration = model.duration;
            this.maxOutputRows = model.maxOutputRows;
            this.queryID = model.queryID;
            this.queryPlan = model.queryPlan;
            this.requestId = model.requestId;
            this.SQLStmt = model.SQLStmt;
            this.sessionID = model.sessionID;
            this.sortedMetrics = model.sortedMetrics;
            this.startTime = model.startTime;
            this.status = model.status;
            this.textPlan = model.textPlan;
            this.user = model.user;
        } 

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
         * <p>16</p>
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The maximum number of output rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxOutputRows(String maxOutputRows) {
            this.maxOutputRows = maxOutputRows;
            return this;
        }

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71403480878****</p>
         */
        public Builder queryID(String queryID) {
            this.queryID = queryID;
            return this;
        }

        /**
         * <p>The information about the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:********&quot;startTime&quot;:1660719602199}</p>
         */
        public Builder queryPlan(String queryPlan) {
            this.queryPlan = queryPlan;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>425AAA6A-63E0-1929-A1CE-3D9036CBC463</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select n_live_tup, n_live_tup + n_dead_tup, pg_relation_size(table_name), last_vacuum from pg_stat_user_tables where relid = table_name::regclass</p>
         */
        public Builder SQLStmt(String SQLStmt) {
            this.SQLStmt = SQLStmt;
            return this;
        }

        /**
         * <p>The ID of the session that contains the query.</p>
         * 
         * <strong>example:</strong>
         * <p>658****</p>
         */
        public Builder sessionID(String sessionID) {
            this.sessionID = sessionID;
            return this;
        }

        /**
         * <p>The sequence of metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;costSort&quot;:******:&quot;Seq Scan-9&quot;,&quot;value&quot;:0.0}]}</p>
         */
        public Builder sortedMetrics(String sortedMetrics) {
            this.sortedMetrics = sortedMetrics;
            return this;
        }

        /**
         * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1660719602199</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The execution state of the query. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>finished</strong></li>
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
         * <p>The information about the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder textPlan(String textPlan) {
            this.textPlan = textPlan;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpguser</p>
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
