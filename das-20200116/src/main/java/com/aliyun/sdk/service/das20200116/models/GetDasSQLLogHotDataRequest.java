// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
         * <p>The database account.</p>
         * <blockquote>
         * <p>You can specify multiple database accounts. Separate multiple accounts with a space. For example: <code>user1 user2 user3</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>This parameter is required if the database instance is a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-bp179lg03445l****</p>
         */
        public Builder childDBInstanceIDs(String childDBInstanceIDs) {
            this.putBodyParameter("ChildDBInstanceIDs", childDBInstanceIDs);
            this.childDBInstanceIDs = childDBInstanceIDs;
            return this;
        }

        /**
         * <p>The database name.</p>
         * <blockquote>
         * <p>You can specify multiple database names. Separate multiple names with a space. For example: <code>DB1 DB2 DB3</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        public Builder DBName(String DBName) {
            this.putBodyParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The end of the time range to query. This value must be a Unix timestamp in milliseconds.</p>
         * <blockquote>
         * <p>The end time must be later than the start time. The time range cannot exceed one day.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1684820697000</p>
         */
        public Builder end(Long end) {
            this.putBodyParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * <p>The SQL execution error code. You can call the <a href="https://help.aliyun.com/document_detail/409804.html">GetAsyncErrorRequestStatByCode</a> operation to obtain the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1064</p>
         */
        public Builder fail(String fail) {
            this.putBodyParameter("Fail", fail);
            this.fail = fail;
            return this;
        }

        /**
         * <p>The client IP address.</p>
         * <blockquote>
         * <p>You can specify multiple client IP addresses. Separate multiple IP addresses with a space. For example: <code>IP1 IP2 IP3</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        public Builder hostAddress(String hostAddress) {
            this.putBodyParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * <p>The ID of the database instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The logical operator to use with multiple keywords. Valid values:</p>
         * <ul>
         * <li><p><strong>or</strong></p>
         * </li>
         * <li><p><strong>and</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        public Builder logicalOperator(String logicalOperator) {
            this.putBodyParameter("LogicalOperator", logicalOperator);
            this.logicalOperator = logicalOperator;
            return this;
        }

        /**
         * <p>The maximum execution time in microseconds. Returns SQL statements that have an execution time less than this value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxLatancy(Long maxLatancy) {
            this.putBodyParameter("MaxLatancy", maxLatancy);
            this.maxLatancy = maxLatancy;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 5 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxRecordsPerPage(Long maxRecordsPerPage) {
            this.putBodyParameter("MaxRecordsPerPage", maxRecordsPerPage);
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder maxRows(Long maxRows) {
            this.putBodyParameter("MaxRows", maxRows);
            this.maxRows = maxRows;
            return this;
        }

        /**
         * <p>The maximum number of scanned rows. Returns SQL statements that scanned fewer than this number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder maxScanRows(Long maxScanRows) {
            this.putBodyParameter("MaxScanRows", maxScanRows);
            this.maxScanRows = maxScanRows;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder maxSpillCnt(Long maxSpillCnt) {
            this.putBodyParameter("MaxSpillCnt", maxSpillCnt);
            this.maxSpillCnt = maxSpillCnt;
            return this;
        }

        /**
         * <p>The minimum execution time in microseconds. Returns SQL statements with an execution time greater than or equal to this value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minLatancy(Long minLatancy) {
            this.putBodyParameter("MinLatancy", minLatancy);
            this.minLatancy = minLatancy;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder minRows(Long minRows) {
            this.putBodyParameter("MinRows", minRows);
            this.minRows = minRows;
            return this;
        }

        /**
         * <p>The minimum number of scanned rows. Returns SQL statements that scanned at least this number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minScanRows(Long minScanRows) {
            this.putBodyParameter("MinScanRows", minScanRows);
            this.minScanRows = minScanRows;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder minSpillCnt(Long minSpillCnt) {
            this.putBodyParameter("MinSpillCnt", minSpillCnt);
            this.minSpillCnt = minSpillCnt;
            return this;
        }

        /**
         * <p>The page number to return. Pages start from 1. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumbers(Long pageNumbers) {
            this.putBodyParameter("PageNumbers", pageNumbers);
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * <p>The query keyword.</p>
         * <blockquote>
         * <p>Fuzzy search is supported. You can specify up to 10 keywords. Separate multiple keywords with a space. For example: a1 b2 c3.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1 b2</p>
         */
        public Builder queryKeyword(String queryKeyword) {
            this.putBodyParameter("QueryKeyword", queryKeyword);
            this.queryKeyword = queryKeyword;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder role(String role) {
            this.putBodyParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The sort key. Valid values:</p>
         * <ul>
         * <li><p><strong>ScanRows</strong>: scanned rows.</p>
         * </li>
         * <li><p><strong>UpdateRows</strong>: updated rows.</p>
         * </li>
         * <li><p><strong>Consume</strong>: execution time.</p>
         * </li>
         * <li><p><strong>OriginTime</strong>: The execution start time.</p>
         * </li>
         * <li><p><strong>ReturnRows</strong>: returned rows.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ScanRows</p>
         */
        public Builder sortKey(String sortKey) {
            this.putBodyParameter("SortKey", sortKey);
            this.sortKey = sortKey;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><strong>ASC</strong>: ascending</p>
         * </li>
         * <li><p><strong>DESC</strong>: descending</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder sortMethod(String sortMethod) {
            this.putBodyParameter("SortMethod", sortMethod);
            this.sortMethod = sortMethod;
            return this;
        }

        /**
         * <p>The SQL type.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        public Builder sqlType(String sqlType) {
            this.putBodyParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * <p>The start of the time range to query. This value must be a Unix timestamp in milliseconds.</p>
         * <blockquote>
         * <p>You can query only data that is generated after you enable DAS Enterprise Edition. The start time cannot be earlier than seven days before the current time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1684734297000</p>
         */
        public Builder start(Long start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>The execution state. Set this parameter to <strong>0</strong> to query for successfully executed SQL statements. You can also specify an error code to query for the corresponding SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder state(String state) {
            this.putBodyParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The thread ID.</p>
         * <blockquote>
         * <p>You can specify multiple thread IDs. Separate multiple IDs with a space. For example: <code>657 658 659</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>657</p>
         */
        public Builder threadID(String threadID) {
            this.putBodyParameter("ThreadID", threadID);
            this.threadID = threadID;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder traceId(String traceId) {
            this.putBodyParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * <p>The transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
