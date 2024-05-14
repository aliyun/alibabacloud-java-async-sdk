// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDasSQLLogHotDataRequest} extends {@link RequestModel}
 *
 * <p>GetDasSQLLogHotDataRequest</p>
 */
public class GetDasSQLLogHotDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildDBInstanceIDs")
    private String childDBInstanceIDs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long end;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fail")
    private String fail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HostAddress")
    private String hostAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogicalOperator")
    private String logicalOperator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxLatancy")
    private Long maxLatancy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
    private Long maxRecordsPerPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRows")
    private Long maxRows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxScanRows")
    private Long maxScanRows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxSpillCnt")
    private Long maxSpillCnt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinLatancy")
    private Long minLatancy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinRows")
    private Long minRows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinScanRows")
    private Long minScanRows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinSpillCnt")
    private Long minSpillCnt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumbers")
    private Long pageNumbers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryKeyword")
    private String queryKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortKey")
    private String sortKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortMethod")
    private String sortMethod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long start;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThreadID")
    private String threadID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionId")
    private String transactionId;

    private GetDasSQLLogHotDataRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.childDBInstanceIDs = builder.childDBInstanceIDs;
        this.DBName = builder.DBName;
        this.end = builder.end;
        this.fail = builder.fail;
        this.hostAddress = builder.hostAddress;
        this.instanceId = builder.instanceId;
        this.logicalOperator = builder.logicalOperator;
        this.maxLatancy = builder.maxLatancy;
        this.maxRecordsPerPage = builder.maxRecordsPerPage;
        this.maxRows = builder.maxRows;
        this.maxScanRows = builder.maxScanRows;
        this.maxSpillCnt = builder.maxSpillCnt;
        this.minLatancy = builder.minLatancy;
        this.minRows = builder.minRows;
        this.minScanRows = builder.minScanRows;
        this.minSpillCnt = builder.minSpillCnt;
        this.pageNumbers = builder.pageNumbers;
        this.queryKeyword = builder.queryKeyword;
        this.role = builder.role;
        this.sortKey = builder.sortKey;
        this.sortMethod = builder.sortMethod;
        this.sqlType = builder.sqlType;
        this.start = builder.start;
        this.state = builder.state;
        this.threadID = builder.threadID;
        this.traceId = builder.traceId;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDasSQLLogHotDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return childDBInstanceIDs
     */
    public String getChildDBInstanceIDs() {
        return this.childDBInstanceIDs;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return fail
     */
    public String getFail() {
        return this.fail;
    }

    /**
     * @return hostAddress
     */
    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logicalOperator
     */
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    /**
     * @return maxLatancy
     */
    public Long getMaxLatancy() {
        return this.maxLatancy;
    }

    /**
     * @return maxRecordsPerPage
     */
    public Long getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    /**
     * @return maxRows
     */
    public Long getMaxRows() {
        return this.maxRows;
    }

    /**
     * @return maxScanRows
     */
    public Long getMaxScanRows() {
        return this.maxScanRows;
    }

    /**
     * @return maxSpillCnt
     */
    public Long getMaxSpillCnt() {
        return this.maxSpillCnt;
    }

    /**
     * @return minLatancy
     */
    public Long getMinLatancy() {
        return this.minLatancy;
    }

    /**
     * @return minRows
     */
    public Long getMinRows() {
        return this.minRows;
    }

    /**
     * @return minScanRows
     */
    public Long getMinScanRows() {
        return this.minScanRows;
    }

    /**
     * @return minSpillCnt
     */
    public Long getMinSpillCnt() {
        return this.minSpillCnt;
    }

    /**
     * @return pageNumbers
     */
    public Long getPageNumbers() {
        return this.pageNumbers;
    }

    /**
     * @return queryKeyword
     */
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return sortKey
     */
    public String getSortKey() {
        return this.sortKey;
    }

    /**
     * @return sortMethod
     */
    public String getSortMethod() {
        return this.sortMethod;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return threadID
     */
    public String getThreadID() {
        return this.threadID;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return transactionId
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder extends Request.Builder<GetDasSQLLogHotDataRequest, Builder> {
        private String accountName; 
        private String childDBInstanceIDs; 
        private String DBName; 
        private Long end; 
        private String fail; 
        private String hostAddress; 
        private String instanceId; 
        private String logicalOperator; 
        private Long maxLatancy; 
        private Long maxRecordsPerPage; 
        private Long maxRows; 
        private Long maxScanRows; 
        private Long maxSpillCnt; 
        private Long minLatancy; 
        private Long minRows; 
        private Long minScanRows; 
        private Long minSpillCnt; 
        private Long pageNumbers; 
        private String queryKeyword; 
        private String role; 
        private String sortKey; 
        private String sortMethod; 
        private String sqlType; 
        private Long start; 
        private String state; 
        private String threadID; 
        private String traceId; 
        private String transactionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDasSQLLogHotDataRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.childDBInstanceIDs = request.childDBInstanceIDs;
            this.DBName = request.DBName;
            this.end = request.end;
            this.fail = request.fail;
            this.hostAddress = request.hostAddress;
            this.instanceId = request.instanceId;
            this.logicalOperator = request.logicalOperator;
            this.maxLatancy = request.maxLatancy;
            this.maxRecordsPerPage = request.maxRecordsPerPage;
            this.maxRows = request.maxRows;
            this.maxScanRows = request.maxScanRows;
            this.maxSpillCnt = request.maxSpillCnt;
            this.minLatancy = request.minLatancy;
            this.minRows = request.minRows;
            this.minScanRows = request.minScanRows;
            this.minSpillCnt = request.minSpillCnt;
            this.pageNumbers = request.pageNumbers;
            this.queryKeyword = request.queryKeyword;
            this.role = request.role;
            this.sortKey = request.sortKey;
            this.sortMethod = request.sortMethod;
            this.sqlType = request.sqlType;
            this.start = request.start;
            this.state = request.state;
            this.threadID = request.threadID;
            this.traceId = request.traceId;
            this.transactionId = request.transactionId;
        } 

        /**
         * The account of the database.
         * <p>
         * 
         * >  You can specify multiple database accounts that are separated by spaces. Example: `user1 user2 user3`.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  This parameter must be specified if the database instance is a PolarDB for MySQL cluster.
         */
        public Builder childDBInstanceIDs(String childDBInstanceIDs) {
            this.putBodyParameter("ChildDBInstanceIDs", childDBInstanceIDs);
            this.childDBInstanceIDs = childDBInstanceIDs;
            return this;
        }

        /**
         * The name of the database.
         * <p>
         * 
         * >  You can specify multiple database names that are separated by spaces. Example: `DB1 DB2 DB3`.
         */
        public Builder DBName(String DBName) {
            this.putBodyParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. The interval between the start time and the end time cannot exceed 24 hours.
         */
        public Builder end(Long end) {
            this.putBodyParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * The error code of SQL execution. You can call the [GetAsyncErrorRequestStatByCode](~~409804~~) operation to query MySQL error codes in SQL Explorer data.
         */
        public Builder fail(String fail) {
            this.putBodyParameter("Fail", fail);
            this.fail = fail;
            return this;
        }

        /**
         * The IP address of the client.
         * <p>
         * 
         * >  You can specify multiple IP addresses that are separated by spaces. Example: `IP1 IP2 IP3`.
         */
        public Builder hostAddress(String hostAddress) {
            this.putBodyParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * The ID of the database instance.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The logical relationship among multiple keywords.
         * <p>
         * 
         * *   **or**
         * *   **and**
         */
        public Builder logicalOperator(String logicalOperator) {
            this.putBodyParameter("LogicalOperator", logicalOperator);
            this.logicalOperator = logicalOperator;
            return this;
        }

        /**
         * The maximum execution duration. Unit: microseconds. You can specify this parameter to query the SQL statements whose execution duration is smaller than the value of this parameter.
         */
        public Builder maxLatancy(Long maxLatancy) {
            this.putBodyParameter("MaxLatancy", maxLatancy);
            this.maxLatancy = maxLatancy;
            return this;
        }

        /**
         * The maximum number of entries per page. Valid values: 5 to 100.
         */
        public Builder maxRecordsPerPage(Long maxRecordsPerPage) {
            this.putBodyParameter("MaxRecordsPerPage", maxRecordsPerPage);
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * The reserved parameter. This parameter is not supported.
         */
        public Builder maxRows(Long maxRows) {
            this.putBodyParameter("MaxRows", maxRows);
            this.maxRows = maxRows;
            return this;
        }

        /**
         * The maximum number of scanned rows. You can specify this parameter to query the SQL statements that scan a smaller number of rows than the value of this parameter.
         */
        public Builder maxScanRows(Long maxScanRows) {
            this.putBodyParameter("MaxScanRows", maxScanRows);
            this.maxScanRows = maxScanRows;
            return this;
        }

        /**
         * The reserved parameter. This parameter is not supported.
         */
        public Builder maxSpillCnt(Long maxSpillCnt) {
            this.putBodyParameter("MaxSpillCnt", maxSpillCnt);
            this.maxSpillCnt = maxSpillCnt;
            return this;
        }

        /**
         * The minimum execution duration. Unit: microseconds. You can specify this parameter to query the SQL statements whose execution duration is greater than or equal to the value of this parameter.
         */
        public Builder minLatancy(Long minLatancy) {
            this.putBodyParameter("MinLatancy", minLatancy);
            this.minLatancy = minLatancy;
            return this;
        }

        /**
         * The reserved parameter. This parameter is not supported.
         */
        public Builder minRows(Long minRows) {
            this.putBodyParameter("MinRows", minRows);
            this.minRows = minRows;
            return this;
        }

        /**
         * The minimum number of scanned rows. You can specify this parameter to query the SQL statements that scan a larger or an equal number of rows than the value of this parameter.
         */
        public Builder minScanRows(Long minScanRows) {
            this.putBodyParameter("MinScanRows", minScanRows);
            this.minScanRows = minScanRows;
            return this;
        }

        /**
         * The reserved parameter. This parameter is not supported.
         */
        public Builder minSpillCnt(Long minSpillCnt) {
            this.putBodyParameter("MinSpillCnt", minSpillCnt);
            this.minSpillCnt = minSpillCnt;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumbers(Long pageNumbers) {
            this.putBodyParameter("PageNumbers", pageNumbers);
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * The keyword that is used for the query.
         * <p>
         * 
         * >  The keyword must be at least four characters in length. You can specify multiple keywords that are separated by spaces. Fuzzy queries are not supported.
         */
        public Builder queryKeyword(String queryKeyword) {
            this.putBodyParameter("QueryKeyword", queryKeyword);
            this.queryKeyword = queryKeyword;
            return this;
        }

        /**
         * The reserved parameter. This parameter is not supported.
         */
        public Builder role(String role) {
            this.putBodyParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * The basis on which you want to sort the query results.
         * <p>
         * 
         * *   **SCAN_ROWS**: the number of scanned rows.
         * *   **UPDATE_ROWS**: the number of updated rows.
         * *   **CONSUME**: the time consumed.
         * *   **ORIGIN_TIME**: the execution duration.
         */
        public Builder sortKey(String sortKey) {
            this.putBodyParameter("SortKey", sortKey);
            this.sortKey = sortKey;
            return this;
        }

        /**
         * The order in which you want to sort the query results.
         * <p>
         * 
         * *   **ase**: ascending order.
         * *   **desc**: descending order.
         */
        public Builder sortMethod(String sortMethod) {
            this.putBodyParameter("SortMethod", sortMethod);
            this.sortMethod = sortMethod;
            return this;
        }

        /**
         * The type of the SQL statement. Valid values:
         * <p>
         * 
         * *   **SELECT**
         * *   **UPDATE**
         * *   **DELETE**
         */
        public Builder sqlType(String sqlType) {
            this.putBodyParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  You can query only the data that is generated after the new SQL Explorer and Audit feature is enabled. The start time can be up to seven days earlier than the current time.
         */
        public Builder start(Long start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * The execution results. You can specify **0** to query the SQL statements that are successfully executed. You can also specify an error code to query the corresponding SQL statements that fail to be executed.
         */
        public Builder state(String state) {
            this.putBodyParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * The thread ID.
         * <p>
         * 
         * >  You can specify multiple thread IDs that are separated by spaces. Example: `Thread ID1 Thread ID2 Thread ID3`.
         */
        public Builder threadID(String threadID) {
            this.putBodyParameter("ThreadID", threadID);
            this.threadID = threadID;
            return this;
        }

        /**
         * The reserved parameter. This parameter is not supported.
         */
        public Builder traceId(String traceId) {
            this.putBodyParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * The transaction ID.
         */
        public Builder transactionId(String transactionId) {
            this.putBodyParameter("TransactionId", transactionId);
            this.transactionId = transactionId;
            return this;
        }

        @Override
        public GetDasSQLLogHotDataRequest build() {
            return new GetDasSQLLogHotDataRequest(this);
        } 

    } 

}
