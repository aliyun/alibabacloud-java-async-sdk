// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListProxySQLExecAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListProxySQLExecAuditLogResponseBody</p>
 */
public class ListProxySQLExecAuditLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProxySQLExecAuditLogList")
    private ProxySQLExecAuditLogList proxySQLExecAuditLogList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListProxySQLExecAuditLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.proxySQLExecAuditLogList = builder.proxySQLExecAuditLogList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProxySQLExecAuditLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return proxySQLExecAuditLogList
     */
    public ProxySQLExecAuditLogList getProxySQLExecAuditLogList() {
        return this.proxySQLExecAuditLogList;
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
        private ProxySQLExecAuditLogList proxySQLExecAuditLogList; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListProxySQLExecAuditLogResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.proxySQLExecAuditLogList = model.proxySQLExecAuditLogList;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidStartTime</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter StartTime is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The audit information about the database instance that is provided by the secure access proxy feature.</p>
         */
        public Builder proxySQLExecAuditLogList(ProxySQLExecAuditLogList proxySQLExecAuditLogList) {
            this.proxySQLExecAuditLogList = proxySQLExecAuditLogList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>50ECB006-2C35-5FCA-91B9-01987A0B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public ListProxySQLExecAuditLogResponseBody build() {
            return new ListProxySQLExecAuditLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProxySQLExecAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListProxySQLExecAuditLogResponseBody</p>
     */
    public static class ProxySQLExecAuditLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        private Long affectRows;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("ExecState")
        private String execState;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

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

        private ProxySQLExecAuditLog(Builder builder) {
            this.affectRows = builder.affectRows;
            this.elapsedTime = builder.elapsedTime;
            this.execState = builder.execState;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
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

        public static ProxySQLExecAuditLog create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Long getAffectRows() {
            return this.affectRows;
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
            private Long elapsedTime; 
            private String execState; 
            private Long instanceId; 
            private String instanceName; 
            private String opTime; 
            private String remark; 
            private String SQL; 
            private String SQLType; 
            private String schemaName; 
            private Long userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ProxySQLExecAuditLog model) {
                this.affectRows = model.affectRows;
                this.elapsedTime = model.elapsedTime;
                this.execState = model.execState;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.opTime = model.opTime;
                this.remark = model.remark;
                this.SQL = model.SQL;
                this.SQLType = model.SQLType;
                this.schemaName = model.schemaName;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>Indicates the total number of rows returned after the SQL statement was executed. If an SELECT SQL statement is executed, the return value of this parameter indicates the total number of the queried data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * <p>The amount of time that is consumed to execute the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1324</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The execution status of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>FAIL</strong>: The execution of the SQL statement fails.</li>
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
             * <p>The ID of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4***</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-uf662nrg017c6****.mysql.polardb.rds.aliyuncs.com:3306【test】</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The time at which the user executes the SQL statement on the database instance. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
             * 
             * <strong>example:</strong>
             * <p>1636876446000</p>
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The SQL statement that was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>select 1;</p>
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>SELECT</strong></li>
             * <li><strong>INSERT</strong></li>
             * <li><strong>DELETE</strong></li>
             * <li><strong>CREATE_TABLE</strong></li>
             * </ul>
             * <blockquote>
             * <p> You can choose Operation Audit &gt; Secure Access Proxy in the top navigation bar of the DMS console to view more types of SQL statements.</p>
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
             * <p>test_db</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>4****</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>testNickName</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ProxySQLExecAuditLog build() {
                return new ProxySQLExecAuditLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProxySQLExecAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListProxySQLExecAuditLogResponseBody</p>
     */
    public static class ProxySQLExecAuditLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProxySQLExecAuditLog")
        private java.util.List<ProxySQLExecAuditLog> proxySQLExecAuditLog;

        private ProxySQLExecAuditLogList(Builder builder) {
            this.proxySQLExecAuditLog = builder.proxySQLExecAuditLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxySQLExecAuditLogList create() {
            return builder().build();
        }

        /**
         * @return proxySQLExecAuditLog
         */
        public java.util.List<ProxySQLExecAuditLog> getProxySQLExecAuditLog() {
            return this.proxySQLExecAuditLog;
        }

        public static final class Builder {
            private java.util.List<ProxySQLExecAuditLog> proxySQLExecAuditLog; 

            private Builder() {
            } 

            private Builder(ProxySQLExecAuditLogList model) {
                this.proxySQLExecAuditLog = model.proxySQLExecAuditLog;
            } 

            /**
             * ProxySQLExecAuditLog.
             */
            public Builder proxySQLExecAuditLog(java.util.List<ProxySQLExecAuditLog> proxySQLExecAuditLog) {
                this.proxySQLExecAuditLog = proxySQLExecAuditLog;
                return this;
            }

            public ProxySQLExecAuditLogList build() {
                return new ProxySQLExecAuditLogList(this);
            } 

        } 

    }
}
