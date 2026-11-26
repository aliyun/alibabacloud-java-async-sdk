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
 * {@link DescribeSQLLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLLogsRequest</p>
 */
public class DescribeSQLLogsRequest extends Request {
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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxx</p>
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
         * <p>adbpgadmin</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the <i>YYYY-MM-DDThh:mmZ</i> format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time. The interval between the start time and the end time cannot exceed seven days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-17T06:30Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The execution duration. Unit: seconds.</p>
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
         * <p>The execution state. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Successful.</li>
         * <li><strong>0</strong>: Failed.</li>
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
         * <p>The maximum execution duration of slow SQL statements. The value must be greater than or equal to 0. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxExecuteCost(String maxExecuteCost) {
            this.putQueryParameter("MaxExecuteCost", maxExecuteCost);
            this.maxExecuteCost = maxExecuteCost;
            return this;
        }

        /**
         * <p>The minimum execution duration of slow SQL statements. The value must be greater than or equal to 0. Unit: seconds.</p>
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
         * <p>The operation class. Valid values:</p>
         * <ul>
         * <li><strong>DQL</strong></li>
         * <li><strong>DML</strong></li>
         * <li><strong>DDL</strong></li>
         * <li><strong>DCL</strong></li>
         * <li><strong>TCL</strong></li>
         * </ul>
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
         * <p>The type of the executed SQL statement.</p>
         * <blockquote>
         * <ul>
         * <li>If the <strong>OperationClass</strong> parameter is specified, the value of <strong>OperationType</strong> must belong to the corresponding language type. For example, if the value of <strong>OperationClass</strong> is <strong>DQL</strong>, the value of <strong>OperationType</strong> must be a DQL statement, such as <strong>SELECT</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If the <strong>OperationClass</strong> parameter is not specified, the value of <strong>OperationType</strong> can be any type of SQL statement.</li>
         * <li>If neither the <strong>OperationClass</strong> parameter nor the <strong>OperationType</strong> parameter is specified, all types of SQL statements are returned.</li>
         * </ul>
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
         * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the Integer type. Default value: 1.</p>
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
         * <p>The SQL keyword.</p>
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
         * <p>100.<strong>.</strong>.90</p>
         */
        public Builder sourceIP(String sourceIP) {
            this.putQueryParameter("SourceIP", sourceIP);
            this.sourceIP = sourceIP;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the <i>YYYY-MM-DDThh:mmZ</i> format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-10T06:30Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>testadmin</p>
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
