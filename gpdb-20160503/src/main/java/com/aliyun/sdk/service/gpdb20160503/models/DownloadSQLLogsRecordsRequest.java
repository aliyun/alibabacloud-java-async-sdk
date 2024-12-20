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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The end time must be later than the start time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-08T06:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The execution duration of the SQL statement. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder executeCost(String executeCost) {
            this.putQueryParameter("ExecuteCost", executeCost);
            this.executeCost = executeCost;
            return this;
        }

        /**
         * <p>The execution status of the SQL statement.</p>
         * <ul>
         * <li><strong>1</strong>: successful.</li>
         * <li><strong>0</strong>: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder executeState(String executeState) {
            this.putQueryParameter("ExecuteState", executeState);
            this.executeState = executeState;
            return this;
        }

        /**
         * <p>The language of the file that contains the query diagnostic information. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: simplified Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * <li><strong>ja</strong>: Japanese.</li>
         * <li><strong>zh-tw</strong>: traditional Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>999</p>
         */
        public Builder maxExecuteCost(String maxExecuteCost) {
            this.putQueryParameter("MaxExecuteCost", maxExecuteCost);
            this.maxExecuteCost = maxExecuteCost;
            return this;
        }

        /**
         * <p>The minimum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minExecuteCost(String minExecuteCost) {
            this.putQueryParameter("MinExecuteCost", minExecuteCost);
            this.minExecuteCost = minExecuteCost;
            return this;
        }

        /**
         * <p>The type of the query language. Example: DQL, DML, or DDL.</p>
         * 
         * <strong>example:</strong>
         * <p>DQL</p>
         */
        public Builder operationClass(String operationClass) {
            this.putQueryParameter("OperationClass", operationClass);
            this.operationClass = operationClass;
            return this;
        }

        /**
         * <p>The type of the SQL statement. Example: SELECT.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The keywords that are used for query.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1</p>
         */
        public Builder queryKeywords(String queryKeywords) {
            this.putQueryParameter("QueryKeywords", queryKeywords);
            this.queryKeywords = queryKeywords;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>100.XX.XX.90</p>
         */
        public Builder sourceIP(String sourceIP) {
            this.putQueryParameter("SourceIP", sourceIP);
            this.sourceIP = sourceIP;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-07T06:59Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
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
