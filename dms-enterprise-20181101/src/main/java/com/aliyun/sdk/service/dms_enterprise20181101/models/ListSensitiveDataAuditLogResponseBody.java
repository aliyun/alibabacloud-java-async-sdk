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
 * {@link ListSensitiveDataAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveDataAuditLogResponseBody</p>
 */
public class ListSensitiveDataAuditLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitiveDataAuditLogList")
    private java.util.List<SensitiveDataAuditLogList> sensitiveDataAuditLogList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSensitiveDataAuditLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sensitiveDataAuditLogList = builder.sensitiveDataAuditLogList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveDataAuditLogResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveDataAuditLogList
     */
    public java.util.List<SensitiveDataAuditLogList> getSensitiveDataAuditLogList() {
        return this.sensitiveDataAuditLogList;
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
        private java.util.List<SensitiveDataAuditLogList> sensitiveDataAuditLogList; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSensitiveDataAuditLogResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.sensitiveDataAuditLogList = model.sensitiveDataAuditLogList;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The audit logs for sensitive data.</p>
         */
        public Builder sensitiveDataAuditLogList(java.util.List<SensitiveDataAuditLogList> sensitiveDataAuditLogList) {
            this.sensitiveDataAuditLogList = sensitiveDataAuditLogList;
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSensitiveDataAuditLogResponseBody build() {
            return new ListSensitiveDataAuditLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSensitiveDataAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveDataAuditLogResponseBody</p>
     */
    public static class SensitiveDataLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnPermissionType")
        private String columnPermissionType;

        @com.aliyun.core.annotation.NameInMap("DesensitizationRule")
        private String desensitizationRule;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private SensitiveDataLog(Builder builder) {
            this.columnName = builder.columnName;
            this.columnPermissionType = builder.columnPermissionType;
            this.desensitizationRule = builder.desensitizationRule;
            this.securityLevel = builder.securityLevel;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveDataLog create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnPermissionType
         */
        public String getColumnPermissionType() {
            return this.columnPermissionType;
        }

        /**
         * @return desensitizationRule
         */
        public String getDesensitizationRule() {
            return this.desensitizationRule;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String columnName; 
            private String columnPermissionType; 
            private String desensitizationRule; 
            private String securityLevel; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(SensitiveDataLog model) {
                this.columnName = model.columnName;
                this.columnPermissionType = model.columnPermissionType;
                this.desensitizationRule = model.desensitizationRule;
                this.securityLevel = model.securityLevel;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The name of the column that contains sensitive data.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleColumnName</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The permission that the user has on the column. Valid values:</p>
             * <ul>
             * <li><strong>No permission</strong></li>
             * <li><strong>Partial redaction</strong></li>
             * <li><strong>Plaintext</strong></li>
             * <li><strong>Change</strong></li>
             * <li><strong>Enable data masking</strong></li>
             * <li><strong>Disable data masking</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Change</p>
             */
            public Builder columnPermissionType(String columnPermissionType) {
                this.columnPermissionType = columnPermissionType;
                return this;
            }

            /**
             * <p>The algorithm used for data masking.</p>
             * 
             * <strong>example:</strong>
             * <p>Default - Full redaction</p>
             */
            public Builder desensitizationRule(String desensitizationRule) {
                this.desensitizationRule = desensitizationRule;
                return this;
            }

            /**
             * <p>The sensitivity level of the data. Valid values:</p>
             * <ul>
             * <li><strong>Low</strong></li>
             * <li><strong>Medium</strong></li>
             * <li><strong>High</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Low</p>
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * <p>The name of the table that stores the sensitive data.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleTableName</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SensitiveDataLog build() {
                return new SensitiveDataLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSensitiveDataAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveDataAuditLogResponseBody</p>
     */
    public static class SensitiveDataAuditLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbDisplayName")
        private String dbDisplayName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("OpTime")
        private String opTime;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataLog")
        private java.util.List<SensitiveDataLog> sensitiveDataLog;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SensitiveDataAuditLogList(Builder builder) {
            this.dbDisplayName = builder.dbDisplayName;
            this.instanceId = builder.instanceId;
            this.moduleName = builder.moduleName;
            this.opTime = builder.opTime;
            this.sensitiveDataLog = builder.sensitiveDataLog;
            this.targetName = builder.targetName;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveDataAuditLogList create() {
            return builder().build();
        }

        /**
         * @return dbDisplayName
         */
        public String getDbDisplayName() {
            return this.dbDisplayName;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return opTime
         */
        public String getOpTime() {
            return this.opTime;
        }

        /**
         * @return sensitiveDataLog
         */
        public java.util.List<SensitiveDataLog> getSensitiveDataLog() {
            return this.sensitiveDataLog;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
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
            private String dbDisplayName; 
            private Long instanceId; 
            private String moduleName; 
            private String opTime; 
            private java.util.List<SensitiveDataLog> sensitiveDataLog; 
            private String targetName; 
            private Long userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(SensitiveDataAuditLogList model) {
                this.dbDisplayName = model.dbDisplayName;
                this.instanceId = model.instanceId;
                this.moduleName = model.moduleName;
                this.opTime = model.opTime;
                this.sensitiveDataLog = model.sensitiveDataLog;
                this.targetName = model.targetName;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database that stores the sensitive data.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:ExampleDbName@xxx.xxx.xxx.xxx">ExampleDbName@xxx.xxx.xxx.xxx</a>:3306</p>
             */
            public Builder dbDisplayName(String dbDisplayName) {
                this.dbDisplayName = dbDisplayName;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12****</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the function module whose audit logs were queried.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL_CONSOLE</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The time when the operation was performed. The time is in the yyyy-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-18 10:01:00</p>
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * <p>The logs for sensitive data.</p>
             */
            public Builder sensitiveDataLog(java.util.List<SensitiveDataLog> sensitiveDataLog) {
                this.sensitiveDataLog = sensitiveDataLog;
                return this;
            }

            /**
             * <p>The details of the object on which the operation was performed. The value of this parameter is in one of the following formats:</p>
             * <ul>
             * <li>Object name - object ID</li>
             * <li>Object name (object ID)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ticket - 1****</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The user ID of the requester.</p>
             * 
             * <strong>example:</strong>
             * <p>1**</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username of the requester.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleUserName</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SensitiveDataAuditLogList build() {
                return new SensitiveDataAuditLogList(this);
            } 

        } 

    }
}
