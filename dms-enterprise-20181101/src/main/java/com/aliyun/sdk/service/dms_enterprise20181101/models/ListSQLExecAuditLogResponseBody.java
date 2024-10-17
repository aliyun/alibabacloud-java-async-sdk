// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSQLExecAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListSQLExecAuditLogResponseBody</p>
 */
public class ListSQLExecAuditLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLExecAuditLogList")
    private SQLExecAuditLogList SQLExecAuditLogList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSQLExecAuditLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.SQLExecAuditLogList = builder.SQLExecAuditLogList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSQLExecAuditLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLExecAuditLogList
     */
    public SQLExecAuditLogList getSQLExecAuditLogList() {
        return this.SQLExecAuditLogList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SQLExecAuditLogList SQLExecAuditLogList; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingStartTime</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>StartTime is mandatory for this action.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>39BC9C86-95AE-58F2-9862-A7C3D896****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The entries returned.</p>
         */
        public Builder SQLExecAuditLogList(SQLExecAuditLogList SQLExecAuditLogList) {
            this.SQLExecAuditLogList = SQLExecAuditLogList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSQLExecAuditLogResponseBody build() {
            return new ListSQLExecAuditLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSQLExecAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListSQLExecAuditLogResponseBody</p>
     */
    public static class SQLExecAuditLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        private Long affectRows;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("ExecState")
        private String execState;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OpTime")
        private String opTime;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SQL")
        private String SQL;

        @com.aliyun.core.annotation.NameInMap("SQLType")
        private String SQLType;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SQLExecAuditLog(Builder builder) {
            this.affectRows = builder.affectRows;
            this.dbId = builder.dbId;
            this.elapsedTime = builder.elapsedTime;
            this.execState = builder.execState;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.logic = builder.logic;
            this.opTime = builder.opTime;
            this.remark = builder.remark;
            this.SQL = builder.SQL;
            this.SQLType = builder.SQLType;
            this.schemaName = builder.schemaName;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLExecAuditLog create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Long getAffectRows() {
            return this.affectRows;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return execState
         */
        public String getExecState() {
            return this.execState;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return opTime
         */
        public String getOpTime() {
            return this.opTime;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        /**
         * @return SQLType
         */
        public String getSQLType() {
            return this.SQLType;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long affectRows; 
            private Long dbId; 
            private Long elapsedTime; 
            private String execState; 
            private Long instanceId; 
            private String instanceName; 
            private Boolean logic; 
            private String opTime; 
            private String remark; 
            private String SQL; 
            private String SQLType; 
            private String schemaName; 
            private Long userId; 
            private String userName; 

            /**
             * <p>The number of rows affected by the SQL statement. For example, if you execute an SQL statement to query data, the number of retrieved rows is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>2157****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The amount of time consumed by the execution of the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The execution status of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>FAIL</strong>: The SQL statement fails to be executed.</li>
             * <li><strong>NOEXE</strong>: The SQL statement has not been executed.</li>
             * <li><strong>RUNNING</strong>: The SQL statement is being executed.</li>
             * <li><strong>CANCEL</strong>: The execution of the SQL statement is canceled.</li>
             * <li><strong>SUCCESS</strong>: The SQL statement is executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder execState(String execState) {
                this.execState = execState;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>185***</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * <blockquote>
             * <p> If the SQL statement takes effect on an instance, the name of the instance is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>polar123@pc-bp1h9tgq4st9g****.mysql.polardb.rds.aliyuncs.com:3306[polar_qw_test]</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is a physical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The time when the operation specified by the SQL statement was performed on the instance or database.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-08 11:04:27</p>
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * <p>The comment on the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The SQL statement that was written.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM <code>polar123</code>.<code>p_qw</code> ORDER BY <code>id</code> DESC</p>
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>SELECT</strong>: the SQL statement that is used to query data.</li>
             * <li><strong>INSERT</strong>: the SQL statement that is used to insert data.</li>
             * <li><strong>DELETE</strong>: the SQL statement that is used to delete data.</li>
             * <li><strong>CREATE_TABLE</strong>: the SQL statement that is used to create tables.</li>
             * </ul>
             * <blockquote>
             * <p> To view more types of SQL statements, log on to the DMS console and click Security and Specifications. In the left-side navigation pane, click <strong>Operation Audit</strong>. Then, you can view all supported types of SQL statements from the <strong>SQL type</strong> drop-down list.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder SQLType(String SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>polar123</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The ID of the user who wrote the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>12****</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user who wrote the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>test_UserName</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SQLExecAuditLog build() {
                return new SQLExecAuditLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSQLExecAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListSQLExecAuditLogResponseBody</p>
     */
    public static class SQLExecAuditLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLExecAuditLog")
        private java.util.List < SQLExecAuditLog> SQLExecAuditLog;

        private SQLExecAuditLogList(Builder builder) {
            this.SQLExecAuditLog = builder.SQLExecAuditLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLExecAuditLogList create() {
            return builder().build();
        }

        /**
         * @return SQLExecAuditLog
         */
        public java.util.List < SQLExecAuditLog> getSQLExecAuditLog() {
            return this.SQLExecAuditLog;
        }

        public static final class Builder {
            private java.util.List < SQLExecAuditLog> SQLExecAuditLog; 

            /**
             * SQLExecAuditLog.
             */
            public Builder SQLExecAuditLog(java.util.List < SQLExecAuditLog> SQLExecAuditLog) {
                this.SQLExecAuditLog = SQLExecAuditLog;
                return this;
            }

            public SQLExecAuditLogList build() {
                return new SQLExecAuditLogList(this);
            } 

        } 

    }
}
