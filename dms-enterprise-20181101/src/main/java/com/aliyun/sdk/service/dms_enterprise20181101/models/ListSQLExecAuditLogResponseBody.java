// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSQLExecAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListSQLExecAuditLogResponseBody</p>
 */
public class ListSQLExecAuditLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLExecAuditLogList")
    private SQLExecAuditLogList SQLExecAuditLogList;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * SQLExecAuditLogList.
         */
        public Builder SQLExecAuditLogList(SQLExecAuditLogList SQLExecAuditLogList) {
            this.SQLExecAuditLogList = SQLExecAuditLogList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSQLExecAuditLogResponseBody build() {
            return new ListSQLExecAuditLogResponseBody(this);
        } 

    } 

    public static class SQLExecAuditLog extends TeaModel {
        @NameInMap("AffectRows")
        private Long affectRows;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("ElapsedTime")
        private Long elapsedTime;

        @NameInMap("ExecState")
        private String execState;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OpTime")
        private String opTime;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SQL")
        private String SQL;

        @NameInMap("SQLType")
        private String SQLType;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
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
             * AffectRows.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * ElapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * ExecState.
             */
            public Builder execState(String execState) {
                this.execState = execState;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * OpTime.
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SQL.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * SQLType.
             */
            public Builder SQLType(String SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
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
    public static class SQLExecAuditLogList extends TeaModel {
        @NameInMap("SQLExecAuditLog")
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
