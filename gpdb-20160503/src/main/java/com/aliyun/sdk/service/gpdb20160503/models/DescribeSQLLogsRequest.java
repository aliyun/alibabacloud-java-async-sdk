// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLLogsRequest</p>
 */
public class DescribeSQLLogsRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Database")
    private String database;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("ExecuteCost")
    private String executeCost;

    @Query
    @NameInMap("ExecuteState")
    private String executeState;

    @Query
    @NameInMap("MaxExecuteCost")
    private String maxExecuteCost;

    @Query
    @NameInMap("MinExecuteCost")
    private String minExecuteCost;

    @Query
    @NameInMap("OperationClass")
    private String operationClass;

    @Query
    @NameInMap("OperationType")
    private String operationType;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200)
    private Integer pageSize;

    @Query
    @NameInMap("QueryKeywords")
    private String queryKeywords;

    @Query
    @NameInMap("SourceIP")
    private String sourceIP;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("User")
    private String user;

    private DescribeSQLLogsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.endTime = builder.endTime;
        this.executeCost = builder.executeCost;
        this.executeState = builder.executeState;
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

    public static DescribeSQLLogsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSQLLogsRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private String endTime; 
        private String executeCost; 
        private String executeState; 
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

        private Builder(DescribeSQLLogsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.endTime = request.endTime;
            this.executeCost = request.executeCost;
            this.executeState = request.executeState;
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
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.
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
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.
         * <p>
         * 
         * > The end time must be later than the start time. The maximum time range that can be specified is seven days.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The execution duration of the query. Unit: seconds.
         */
        public Builder executeCost(String executeCost) {
            this.putQueryParameter("ExecuteCost", executeCost);
            this.executeCost = executeCost;
            return this;
        }

        /**
         * The execution state of the query. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder executeState(String executeState) {
            this.putQueryParameter("ExecuteState", executeState);
            this.executeState = executeState;
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
         * The type of the query language. Valid values:
         * <p>
         * 
         * *   **DQL**
         * *   **DML**
         * *   **DDL**
         * *   **DCL**
         * *   **TCL**
         */
        public Builder operationClass(String operationClass) {
            this.putQueryParameter("OperationClass", operationClass);
            this.operationClass = operationClass;
            return this;
        }

        /**
         * The type of the SQL statement.
         * <p>
         * 
         * > 
         * 
         * *   If **OperationClass** is specified, the value of **OperationType** must belong to the corresponding query language. For example, if **OperationClass** is set to **DQL**, the value of **OperationType** must be a **DQL** statement such as **SELECT**.
         * 
         * *   If **OperationClass** is not specified, the value of **OperationType** can be an SQL statement of any query language.
         * *   If **OperationClass** and **OperationType** are not specified, all types of SQL statements are returned.
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
         * The keywords of the SQL statement.
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
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.
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
        public DescribeSQLLogsRequest build() {
            return new DescribeSQLLogsRequest(this);
        } 

    } 

}
