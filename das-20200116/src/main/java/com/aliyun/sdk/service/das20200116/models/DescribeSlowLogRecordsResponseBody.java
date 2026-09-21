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
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSlowLogRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>DBLogRecords<SlowLogItem></p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * <blockquote>
         * <p> This parameter returns <strong>Successful</strong> when the request succeeds. If the request fails, an exception message is returned, such as an error code.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1C79EE2-D04D-571B-8C60-961FAF8E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class SqlTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private SqlTag(Builder builder) {
            this.comments = builder.comments;
            this.sqlId = builder.sqlId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlTag create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String comments; 
            private String sqlId; 
            private String tags; 

            private Builder() {
            } 

            private Builder(SqlTag model) {
                this.comments = model.comments;
                this.sqlId = model.sqlId;
                this.tags = model.tags;
            } 

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>sqlid。</p>
             * 
             * <strong>example:</strong>
             * <p>8ad7069f236bcdaaa9b3ae4b6299****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>Multiple tags separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>DAS_IMPORTANT,DAS_IN_PLAN</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public SqlTag build() {
                return new SqlTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("CPUTime")
        private Double CPUTime;

        @com.aliyun.core.annotation.NameInMap("CPUTimeSeconds")
        private Double CPUTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Cmd")
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("DocsExamined")
        private String docsExamined;

        @com.aliyun.core.annotation.NameInMap("ExtText")
        private String extText;

        @com.aliyun.core.annotation.NameInMap("Fail")
        private String fail;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private Long frows;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("IOWrites")
        private Long IOWrites;

        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("KeysExamined")
        private String keysExamined;

        @com.aliyun.core.annotation.NameInMap("LastRowsCountAffected")
        private Long lastRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("LockTime")
        private Double lockTime;

        @com.aliyun.core.annotation.NameInMap("LockTimeSeconds")
        private Double lockTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("LogicalIOReads")
        private Long logicalIOReads;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("OriginTime")
        private String originTime;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("PhysicalIOReads")
        private Long physicalIOReads;

        @com.aliyun.core.annotation.NameInMap("Psql")
        private String psql;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private Long queryTime;

        @com.aliyun.core.annotation.NameInMap("QueryTimeSeconds")
        private Double queryTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("RequestSize")
        private Long requestSize;

        @com.aliyun.core.annotation.NameInMap("ResponseSize")
        private Long responseSize;

        @com.aliyun.core.annotation.NameInMap("ReturnItemNumbers")
        private String returnItemNumbers;

        @com.aliyun.core.annotation.NameInMap("ReturnNum")
        private String returnNum;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private Long rows;

        @com.aliyun.core.annotation.NameInMap("RowsCountAffected")
        private Long rowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private Long rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsSent")
        private Long rowsSent;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private Long rt;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("Scheme")
        private String scheme;

        @com.aliyun.core.annotation.NameInMap("Scnt")
        private Long scnt;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlTag")
        private SqlTag sqlTag;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("SubInstanceId")
        private String subInstanceId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private String threadId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private Logs(Builder builder) {
            this.accountName = builder.accountName;
            this.applicationName = builder.applicationName;
            this.CPUTime = builder.CPUTime;
            this.CPUTimeSeconds = builder.CPUTimeSeconds;
            this.clientIp = builder.clientIp;
            this.cmd = builder.cmd;
            this.command = builder.command;
            this.DBName = builder.DBName;
            this.dbId = builder.dbId;
            this.dbInstanceName = builder.dbInstanceName;
            this.docsExamined = builder.docsExamined;
            this.extText = builder.extText;
            this.fail = builder.fail;
            this.frows = builder.frows;
            this.hostAddress = builder.hostAddress;
            this.IOWrites = builder.IOWrites;
            this.insName = builder.insName;
            this.keysExamined = builder.keysExamined;
            this.lastRowsCountAffected = builder.lastRowsCountAffected;
            this.lockTime = builder.lockTime;
            this.lockTimeSeconds = builder.lockTimeSeconds;
            this.logicalIOReads = builder.logicalIOReads;
            this.namespace = builder.namespace;
            this.nodeId = builder.nodeId;
            this.opType = builder.opType;
            this.originTime = builder.originTime;
            this.params = builder.params;
            this.physicalIOReads = builder.physicalIOReads;
            this.psql = builder.psql;
            this.queryId = builder.queryId;
            this.queryStartTime = builder.queryStartTime;
            this.queryTime = builder.queryTime;
            this.queryTimeSeconds = builder.queryTimeSeconds;
            this.reason = builder.reason;
            this.reqId = builder.reqId;
            this.requestSize = builder.requestSize;
            this.responseSize = builder.responseSize;
            this.returnItemNumbers = builder.returnItemNumbers;
            this.returnNum = builder.returnNum;
            this.rows = builder.rows;
            this.rowsCountAffected = builder.rowsCountAffected;
            this.rowsExamined = builder.rowsExamined;
            this.rowsSent = builder.rowsSent;
            this.rt = builder.rt;
            this.SQLText = builder.SQLText;
            this.scheme = builder.scheme;
            this.scnt = builder.scnt;
            this.sqlId = builder.sqlId;
            this.sqlTag = builder.sqlTag;
            this.sqlType = builder.sqlType;
            this.subInstanceId = builder.subInstanceId;
            this.tableName = builder.tableName;
            this.templateId = builder.templateId;
            this.threadId = builder.threadId;
            this.timestamp = builder.timestamp;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return CPUTime
         */
        public Double getCPUTime() {
            return this.CPUTime;
        }

        /**
         * @return CPUTimeSeconds
         */
        public Double getCPUTimeSeconds() {
            return this.CPUTimeSeconds;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return docsExamined
         */
        public String getDocsExamined() {
            return this.docsExamined;
        }

        /**
         * @return extText
         */
        public String getExtText() {
            return this.extText;
        }

        /**
         * @return fail
         */
        public String getFail() {
            return this.fail;
        }

        /**
         * @return frows
         */
        public Long getFrows() {
            return this.frows;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return IOWrites
         */
        public Long getIOWrites() {
            return this.IOWrites;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return keysExamined
         */
        public String getKeysExamined() {
            return this.keysExamined;
        }

        /**
         * @return lastRowsCountAffected
         */
        public Long getLastRowsCountAffected() {
            return this.lastRowsCountAffected;
        }

        /**
         * @return lockTime
         */
        public Double getLockTime() {
            return this.lockTime;
        }

        /**
         * @return lockTimeSeconds
         */
        public Double getLockTimeSeconds() {
            return this.lockTimeSeconds;
        }

        /**
         * @return logicalIOReads
         */
        public Long getLogicalIOReads() {
            return this.logicalIOReads;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return originTime
         */
        public String getOriginTime() {
            return this.originTime;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return physicalIOReads
         */
        public Long getPhysicalIOReads() {
            return this.physicalIOReads;
        }

        /**
         * @return psql
         */
        public String getPsql() {
            return this.psql;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        /**
         * @return queryTime
         */
        public Long getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return queryTimeSeconds
         */
        public Double getQueryTimeSeconds() {
            return this.queryTimeSeconds;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reqId
         */
        public String getReqId() {
            return this.reqId;
        }

        /**
         * @return requestSize
         */
        public Long getRequestSize() {
            return this.requestSize;
        }

        /**
         * @return responseSize
         */
        public Long getResponseSize() {
            return this.responseSize;
        }

        /**
         * @return returnItemNumbers
         */
        public String getReturnItemNumbers() {
            return this.returnItemNumbers;
        }

        /**
         * @return returnNum
         */
        public String getReturnNum() {
            return this.returnNum;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
        }

        /**
         * @return rowsCountAffected
         */
        public Long getRowsCountAffected() {
            return this.rowsCountAffected;
        }

        /**
         * @return rowsExamined
         */
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        /**
         * @return rowsSent
         */
        public Long getRowsSent() {
            return this.rowsSent;
        }

        /**
         * @return rt
         */
        public Long getRt() {
            return this.rt;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        /**
         * @return scnt
         */
        public Long getScnt() {
            return this.scnt;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlTag
         */
        public SqlTag getSqlTag() {
            return this.sqlTag;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return subInstanceId
         */
        public String getSubInstanceId() {
            return this.subInstanceId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String accountName; 
            private String applicationName; 
            private Double CPUTime; 
            private Double CPUTimeSeconds; 
            private String clientIp; 
            private String cmd; 
            private String command; 
            private String DBName; 
            private String dbId; 
            private String dbInstanceName; 
            private String docsExamined; 
            private String extText; 
            private String fail; 
            private Long frows; 
            private String hostAddress; 
            private Long IOWrites; 
            private String insName; 
            private String keysExamined; 
            private Long lastRowsCountAffected; 
            private Double lockTime; 
            private Double lockTimeSeconds; 
            private Long logicalIOReads; 
            private String namespace; 
            private String nodeId; 
            private String opType; 
            private String originTime; 
            private String params; 
            private Long physicalIOReads; 
            private String psql; 
            private String queryId; 
            private String queryStartTime; 
            private Long queryTime; 
            private Double queryTimeSeconds; 
            private String reason; 
            private String reqId; 
            private Long requestSize; 
            private Long responseSize; 
            private String returnItemNumbers; 
            private String returnNum; 
            private Long rows; 
            private Long rowsCountAffected; 
            private Long rowsExamined; 
            private Long rowsSent; 
            private Long rt; 
            private String SQLText; 
            private String scheme; 
            private Long scnt; 
            private String sqlId; 
            private SqlTag sqlTag; 
            private String sqlType; 
            private String subInstanceId; 
            private String tableName; 
            private String templateId; 
            private String threadId; 
            private Long timestamp; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.accountName = model.accountName;
                this.applicationName = model.applicationName;
                this.CPUTime = model.CPUTime;
                this.CPUTimeSeconds = model.CPUTimeSeconds;
                this.clientIp = model.clientIp;
                this.cmd = model.cmd;
                this.command = model.command;
                this.DBName = model.DBName;
                this.dbId = model.dbId;
                this.dbInstanceName = model.dbInstanceName;
                this.docsExamined = model.docsExamined;
                this.extText = model.extText;
                this.fail = model.fail;
                this.frows = model.frows;
                this.hostAddress = model.hostAddress;
                this.IOWrites = model.IOWrites;
                this.insName = model.insName;
                this.keysExamined = model.keysExamined;
                this.lastRowsCountAffected = model.lastRowsCountAffected;
                this.lockTime = model.lockTime;
                this.lockTimeSeconds = model.lockTimeSeconds;
                this.logicalIOReads = model.logicalIOReads;
                this.namespace = model.namespace;
                this.nodeId = model.nodeId;
                this.opType = model.opType;
                this.originTime = model.originTime;
                this.params = model.params;
                this.physicalIOReads = model.physicalIOReads;
                this.psql = model.psql;
                this.queryId = model.queryId;
                this.queryStartTime = model.queryStartTime;
                this.queryTime = model.queryTime;
                this.queryTimeSeconds = model.queryTimeSeconds;
                this.reason = model.reason;
                this.reqId = model.reqId;
                this.requestSize = model.requestSize;
                this.responseSize = model.responseSize;
                this.returnItemNumbers = model.returnItemNumbers;
                this.returnNum = model.returnNum;
                this.rows = model.rows;
                this.rowsCountAffected = model.rowsCountAffected;
                this.rowsExamined = model.rowsExamined;
                this.rowsSent = model.rowsSent;
                this.rt = model.rt;
                this.SQLText = model.SQLText;
                this.scheme = model.scheme;
                this.scnt = model.scnt;
                this.sqlId = model.sqlId;
                this.sqlTag = model.sqlTag;
                this.sqlType = model.sqlType;
                this.subInstanceId = model.subInstanceId;
                this.tableName = model.tableName;
                this.templateId = model.templateId;
                this.threadId = model.threadId;
                this.timestamp = model.timestamp;
                this.traceId = model.traceId;
            } 

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The application name.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MyApp</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The CPU query time.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder CPUTime(Double CPUTime) {
                this.CPUTime = CPUTime;
                return this;
            }

            /**
             * <p>The CPU query time, in seconds.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder CPUTimeSeconds(Double CPUTimeSeconds) {
                this.CPUTimeSeconds = CPUTimeSeconds;
                return this;
            }

            /**
             * <p>The client IP address connected to the Redis proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.15.204</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The command executed at the Redis proxy layer.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * <p>The slow query statement.</p>
             * <blockquote>
             * <p>Only ApsaraDB Tair (Redis® OSS-Compatible) database instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GET async_c4d163675f44fe83f6214cf9ba5exxxx</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>Redis Proxy DbId</p>
             * 
             * <strong>example:</strong>
             * <p>r-uf6cfc5e1bcb1xxx-db-5</p>
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2zebg30mk056g****</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * <p>The number of documents scanned during the MongoDB operation.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder docsExamined(String docsExamined) {
                this.docsExamined = docsExamined;
                return this;
            }

            /**
             * <p>The extension field that contains additional information about the SQL execution.</p>
             * <blockquote>
             * <p>Only PolarDB for MySQL instances are supported.</p>
             * </blockquote>
             */
            public Builder extText(String extText) {
                this.extText = extText;
                return this;
            }

            /**
             * <p>Indicates whether the SQL execution was successful. 0 indicates success. A non-zero value indicates failure.</p>
             * <blockquote>
             * <p>Only ApsaraDB for Lindorm instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fail(String fail) {
                this.fail = fail;
                return this;
            }

            /**
             * <p>The number of rows fetched by the compute node (CN) of the PolarDB-X 2.0 database.</p>
             * <blockquote>
             * <p>Only ApsaraDB PolarDB-X 2.0 database instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * <p>The source address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The number of I/O writes.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder IOWrites(Long IOWrites) {
                this.IOWrites = IOWrites;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * <p>The number of index rows scanned in MongoDB.</p>
             * 
             * <strong>example:</strong>
             * <p>valueA</p>
             */
            public Builder keysExamined(String keysExamined) {
                this.keysExamined = keysExamined;
                return this;
            }

            /**
             * <p>The number of rows affected by the last statement.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder lastRowsCountAffected(Long lastRowsCountAffected) {
                this.lastRowsCountAffected = lastRowsCountAffected;
                return this;
            }

            /**
             * <p>The lock wait time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder lockTime(Double lockTime) {
                this.lockTime = lockTime;
                return this;
            }

            /**
             * <p>The lock wait time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder lockTimeSeconds(Double lockTimeSeconds) {
                this.lockTimeSeconds = lockTimeSeconds;
                return this;
            }

            /**
             * <p>The number of logical reads.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder logicalIOReads(Long logicalIOReads) {
                this.logicalIOReads = logicalIOReads;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * <blockquote>
             * <p>Only ApsaraDB for MongoDB instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>app.event</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-uf6cfc5e1xxx-proxy-11</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The operation type.</p>
             * <blockquote>
             * <p>Only ApsaraDB for MongoDB instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>getMore</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>The execution time at the Redis proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-18 10:54:55.311</p>
             */
            public Builder originTime(String originTime) {
                this.originTime = originTime;
                return this;
            }

            /**
             * <p>The parameter values attached to the SQL statement in parameter query scenarios. Multiple parameters are separated by commas (,).</p>
             * <blockquote>
             * <p>Only ApsaraDB for Lindorm database instances are supported.</p>
             * </blockquote>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The number of physical reads.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder physicalIOReads(Long physicalIOReads) {
                this.physicalIOReads = physicalIOReads;
                return this;
            }

            /**
             * <p>The SQL template.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM my_table WHERE ROWNUM &lt;= 10</p>
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * <blockquote>
             * <p>Only ApsaraDB for MongoDB instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>d236d0c4ae8485f6ffe5fdbe5e1bdxxx</p>
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * <p>The time when the query started. Format: yyyy-MM-dd hh:mm:ss (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-01 11:00:00</p>
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            /**
             * <p>The query duration.</p>
             * 
             * <strong>example:</strong>
             * <p>121</p>
             */
            public Builder queryTime(Long queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The query duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder queryTimeSeconds(Double queryTimeSeconds) {
                this.queryTimeSeconds = queryTimeSeconds;
                return this;
            }

            /**
             * <p>The error message when the slow query execution fails.</p>
             * <blockquote>
             * <p>Only ApsaraDB for Lindorm instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>create-by-mse-can-not-delete</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The unique identifier of the slow query log record.</p>
             * <blockquote>
             * <p>Only ApsaraDB for Lindorm instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hotspot-request-001</p>
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * <p>The request packet size at the Redis proxy layer, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder requestSize(Long requestSize) {
                this.requestSize = requestSize;
                return this;
            }

            /**
             * <p>The response packet size at the Redis proxy layer, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1535916</p>
             */
            public Builder responseSize(Long responseSize) {
                this.responseSize = responseSize;
                return this;
            }

            /**
             * <p>The number of returned items.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder returnItemNumbers(String returnItemNumbers) {
                this.returnItemNumbers = returnItemNumbers;
                return this;
            }

            /**
             * <p>The number of rows returned.</p>
             * <blockquote>
             * <p>Only ApsaraDB for MongoDB instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder returnNum(String returnNum) {
                this.returnNum = returnNum;
                return this;
            }

            /**
             * <p>The total number of rows updated or returned by the compute nodes of the PolarDB-X 2.0 database instance.</p>
             * <blockquote>
             * <p>Only ApsaraDB PolarDB-X 2.0 database instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The number of rows affected.</p>
             * <blockquote>
             * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rowsCountAffected(Long rowsCountAffected) {
                this.rowsCountAffected = rowsCountAffected;
                return this;
            }

            /**
             * <p>The number of rows scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * <p>The number of rows returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rowsSent(Long rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * <p>The total response time at the Redis proxy layer, in microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2055</p>
             */
            public Builder rt(Long rt) {
                this.rt = rt;
                return this;
            }

            /**
             * <p>The SQL text.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM my_table WHERE ROWNUM &lt;= 10</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The data schema.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * <p>The number of data node (DN) requests from the compute node (CN) of the PolarDB-X 2.0 database.</p>
             * <blockquote>
             * <p>Only ApsaraDB PolarDB-X 2.0 database instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * <p>The SQL template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sqlId</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The tag.</p>
             */
            public Builder sqlTag(SqlTag sqlTag) {
                this.sqlTag = sqlTag;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>SELECT</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The sub-instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-8vb219d10038****</p>
             */
            public Builder subInstanceId(String subInstanceId) {
                this.subInstanceId = subInstanceId;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>tableNameExample</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The template ID of the PolarDB-X 2.0 database.</p>
             * <blockquote>
             * <p>Only ApsaraDB PolarDB-X 2.0 database instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>6a63b6ac4572abfaef7d1163f684****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The thread ID.</p>
             * 
             * <strong>example:</strong>
             * <p>57472578</p>
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1747118812</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The trace ID of PolarDB-X 2.0, which is the execute ID of the SQL statement on the database data node.</p>
             * <blockquote>
             * <p>Only ApsaraDB PolarDB-X 2.0 database instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>074ce334-5247-40b9-b0c1-158aea5d****</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private Long dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
        private Long itemsNumbers;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<Logs> logs;

        @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
        private Integer maxRecordsPerPage;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private Integer pageNumbers;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalRecords")
        private Long totalRecords;

        private Data(Builder builder) {
            this.dbInstanceId = builder.dbInstanceId;
            this.dbInstanceName = builder.dbInstanceName;
            this.endTime = builder.endTime;
            this.itemsNumbers = builder.itemsNumbers;
            this.logs = builder.logs;
            this.maxRecordsPerPage = builder.maxRecordsPerPage;
            this.nodeId = builder.nodeId;
            this.pageNumbers = builder.pageNumbers;
            this.startTime = builder.startTime;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbInstanceId
         */
        public Long getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return itemsNumbers
         */
        public Long getItemsNumbers() {
            return this.itemsNumbers;
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return maxRecordsPerPage
         */
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return pageNumbers
         */
        public Integer getPageNumbers() {
            return this.pageNumbers;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Long dbInstanceId; 
            private String dbInstanceName; 
            private String endTime; 
            private Long itemsNumbers; 
            private java.util.List<Logs> logs; 
            private Integer maxRecordsPerPage; 
            private String nodeId; 
            private Integer pageNumbers; 
            private String startTime; 
            private Long totalRecords; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dbInstanceId = model.dbInstanceId;
                this.dbInstanceName = model.dbInstanceName;
                this.endTime = model.endTime;
                this.itemsNumbers = model.itemsNumbers;
                this.logs = model.logs;
                this.maxRecordsPerPage = model.maxRecordsPerPage;
                this.nodeId = model.nodeId;
                this.pageNumbers = model.pageNumbers;
                this.startTime = model.startTime;
                this.totalRecords = model.totalRecords;
            } 

            /**
             * <p>The numeric ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dbInstanceId(Long dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp157g54vy772****</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1672617600000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of items in the log list on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder itemsNumbers(Long itemsNumbers) {
                this.itemsNumbers = itemsNumbers;
                return this;
            }

            /**
             * <p>The returned data.</p>
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The maximum number of records per page for the paged query. Valid values: 5 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
                this.maxRecordsPerPage = maxRecordsPerPage;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>node123</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The page number for the paged query. The value starts from 1. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumbers(Integer pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1672531200000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
