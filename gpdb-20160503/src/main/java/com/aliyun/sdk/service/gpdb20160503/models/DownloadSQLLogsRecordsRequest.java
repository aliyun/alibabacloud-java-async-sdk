// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadSQLLogsRecordsRequest} extends {@link RequestModel}
 *
 * <p>DownloadSQLLogsRecordsRequest</p>
 */
public class DownloadSQLLogsRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteCost")
    private String executeCost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteState")
    private String executeState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxExecuteCost")
    private String maxExecuteCost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinExecuteCost")
    private String minExecuteCost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationClass")
    private String operationClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryKeywords")
    private String queryKeywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIP")
    private String sourceIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DownloadSQLLogsRecordsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.endTime = builder.endTime;
        this.executeCost = builder.executeCost;
        this.executeState = builder.executeState;
        this.lang = builder.lang;
        this.maxExecuteCost = builder.maxExecuteCost;
        this.minExecuteCost = builder.minExecuteCost;
        this.operationClass = builder.operationClass;
        this.operationType = builder.operationType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryKeywords = builder.queryKeywords;
        this.sourceIP = builder.sourceIP;
        this.startTime = builder.startTime;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadSQLLogsRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return executeCost
     */
    public String getExecuteCost() {
        return this.executeCost;
    }

    /**
     * @return executeState
     */
    public String getExecuteState() {
        return this.executeState;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxExecuteCost
     */
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    /**
     * @return minExecuteCost
     */
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    /**
     * @return operationClass
     */
    public String getOperationClass() {
        return this.operationClass;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryKeywords
     */
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    /**
     * @return sourceIP
     */
    public String getSourceIP() {
        return this.sourceIP;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<DownloadSQLLogsRecordsRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private String endTime; 
        private String executeCost; 
        private String executeState; 
        private String lang; 
        private String maxExecuteCost; 
        private String minExecuteCost; 
        private String operationClass; 
        private String operationType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryKeywords; 
        private String sourceIP; 
        private String startTime; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(DownloadSQLLogsRecordsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.endTime = request.endTime;
            this.executeCost = request.executeCost;
            this.executeState = request.executeState;
            this.lang = request.lang;
            this.maxExecuteCost = request.maxExecuteCost;
            this.minExecuteCost = request.minExecuteCost;
            this.operationClass = request.operationClass;
            this.operationType = request.operationType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryKeywords = request.queryKeywords;
            this.sourceIP = request.sourceIP;
            this.startTime = request.startTime;
            this.user = request.user;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The execution duration of the SQL statement. Unit: seconds.
         */
        public Builder executeCost(String executeCost) {
            this.putQueryParameter("ExecuteCost", executeCost);
            this.executeCost = executeCost;
            return this;
        }

        /**
         * The execution status of the SQL statement.
         * <p>
         * 
         * *   **1**: successful.
         * *   **0**: failed.
         */
        public Builder executeState(String executeState) {
            this.putQueryParameter("ExecuteState", executeState);
            this.executeState = executeState;
            return this;
        }

        /**
         * The language of the file that contains the query diagnostic information. Valid values:
         * <p>
         * 
         * *   **zh**: simplified Chinese.
         * *   **en**: English.
         * *   **ja**: Japanese.
         * *   **zh-tw**: traditional Chinese.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The maximum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.
         */
        public Builder maxExecuteCost(String maxExecuteCost) {
            this.putQueryParameter("MaxExecuteCost", maxExecuteCost);
            this.maxExecuteCost = maxExecuteCost;
            return this;
        }

        /**
         * The minimum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.
         */
        public Builder minExecuteCost(String minExecuteCost) {
            this.putQueryParameter("MinExecuteCost", minExecuteCost);
            this.minExecuteCost = minExecuteCost;
            return this;
        }

        /**
         * The type of the query language. Example: DQL, DML, or DDL.
         */
        public Builder operationClass(String operationClass) {
            this.putQueryParameter("OperationClass", operationClass);
            this.operationClass = operationClass;
            return this;
        }

        /**
         * The type of the SQL statement. Example: SELECT.
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **30**
         * *   **50**
         * *   **100**
         * 
         * Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The keywords that are used for query.
         */
        public Builder queryKeywords(String queryKeywords) {
            this.putQueryParameter("QueryKeywords", queryKeywords);
            this.queryKeywords = queryKeywords;
            return this;
        }

        /**
         * The source IP address.
         */
        public Builder sourceIP(String sourceIP) {
            this.putQueryParameter("SourceIP", sourceIP);
            this.sourceIP = sourceIP;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The name of the database account.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DownloadSQLLogsRecordsRequest build() {
            return new DownloadSQLLogsRecordsRequest(this);
        } 

    } 

}
