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
         * Code.
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * Comments.
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
             * Tags.
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

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("DocsExamined")
        private String docsExamined;

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
            this.command = builder.command;
            this.DBName = builder.DBName;
            this.dbInstanceName = builder.dbInstanceName;
            this.docsExamined = builder.docsExamined;
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
            this.physicalIOReads = builder.physicalIOReads;
            this.psql = builder.psql;
            this.queryId = builder.queryId;
            this.queryStartTime = builder.queryStartTime;
            this.queryTime = builder.queryTime;
            this.queryTimeSeconds = builder.queryTimeSeconds;
            this.returnItemNumbers = builder.returnItemNumbers;
            this.returnNum = builder.returnNum;
            this.rows = builder.rows;
            this.rowsCountAffected = builder.rowsCountAffected;
            this.rowsExamined = builder.rowsExamined;
            this.rowsSent = builder.rowsSent;
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
            private String command; 
            private String DBName; 
            private String dbInstanceName; 
            private String docsExamined; 
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
            private Long physicalIOReads; 
            private String psql; 
            private String queryId; 
            private String queryStartTime; 
            private Long queryTime; 
            private Double queryTimeSeconds; 
            private String returnItemNumbers; 
            private String returnNum; 
            private Long rows; 
            private Long rowsCountAffected; 
            private Long rowsExamined; 
            private Long rowsSent; 
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
                this.command = model.command;
                this.DBName = model.DBName;
                this.dbInstanceName = model.dbInstanceName;
                this.docsExamined = model.docsExamined;
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
                this.physicalIOReads = model.physicalIOReads;
                this.psql = model.psql;
                this.queryId = model.queryId;
                this.queryStartTime = model.queryStartTime;
                this.queryTime = model.queryTime;
                this.queryTimeSeconds = model.queryTimeSeconds;
                this.returnItemNumbers = model.returnItemNumbers;
                this.returnNum = model.returnNum;
                this.rows = model.rows;
                this.rowsCountAffected = model.rowsCountAffected;
                this.rowsExamined = model.rowsExamined;
                this.rowsSent = model.rowsSent;
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
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * CPUTime.
             */
            public Builder CPUTime(Double CPUTime) {
                this.CPUTime = CPUTime;
                return this;
            }

            /**
             * CPUTimeSeconds.
             */
            public Builder CPUTimeSeconds(Double CPUTimeSeconds) {
                this.CPUTimeSeconds = CPUTimeSeconds;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * DocsExamined.
             */
            public Builder docsExamined(String docsExamined) {
                this.docsExamined = docsExamined;
                return this;
            }

            /**
             * Frows.
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * HostAddress.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * IOWrites.
             */
            public Builder IOWrites(Long IOWrites) {
                this.IOWrites = IOWrites;
                return this;
            }

            /**
             * InsName.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * KeysExamined.
             */
            public Builder keysExamined(String keysExamined) {
                this.keysExamined = keysExamined;
                return this;
            }

            /**
             * LastRowsCountAffected.
             */
            public Builder lastRowsCountAffected(Long lastRowsCountAffected) {
                this.lastRowsCountAffected = lastRowsCountAffected;
                return this;
            }

            /**
             * LockTime.
             */
            public Builder lockTime(Double lockTime) {
                this.lockTime = lockTime;
                return this;
            }

            /**
             * LockTimeSeconds.
             */
            public Builder lockTimeSeconds(Double lockTimeSeconds) {
                this.lockTimeSeconds = lockTimeSeconds;
                return this;
            }

            /**
             * LogicalIOReads.
             */
            public Builder logicalIOReads(Long logicalIOReads) {
                this.logicalIOReads = logicalIOReads;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * PhysicalIOReads.
             */
            public Builder physicalIOReads(Long physicalIOReads) {
                this.physicalIOReads = physicalIOReads;
                return this;
            }

            /**
             * Psql.
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * QueryId.
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * QueryStartTime.
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(Long queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * QueryTimeSeconds.
             */
            public Builder queryTimeSeconds(Double queryTimeSeconds) {
                this.queryTimeSeconds = queryTimeSeconds;
                return this;
            }

            /**
             * ReturnItemNumbers.
             */
            public Builder returnItemNumbers(String returnItemNumbers) {
                this.returnItemNumbers = returnItemNumbers;
                return this;
            }

            /**
             * ReturnNum.
             */
            public Builder returnNum(String returnNum) {
                this.returnNum = returnNum;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * RowsCountAffected.
             */
            public Builder rowsCountAffected(Long rowsCountAffected) {
                this.rowsCountAffected = rowsCountAffected;
                return this;
            }

            /**
             * RowsExamined.
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * RowsSent.
             */
            public Builder rowsSent(Long rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * Scnt.
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
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
             * SqlTag.
             */
            public Builder sqlTag(SqlTag sqlTag) {
                this.sqlTag = sqlTag;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * SubInstanceId.
             */
            public Builder subInstanceId(String subInstanceId) {
                this.subInstanceId = subInstanceId;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * ThreadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TraceId.
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
             * DbInstanceId.
             */
            public Builder dbInstanceId(Long dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ItemsNumbers.
             */
            public Builder itemsNumbers(Long itemsNumbers) {
                this.itemsNumbers = itemsNumbers;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * MaxRecordsPerPage.
             */
            public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
                this.maxRecordsPerPage = maxRecordsPerPage;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * PageNumbers.
             */
            public Builder pageNumbers(Integer pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalRecords.
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
