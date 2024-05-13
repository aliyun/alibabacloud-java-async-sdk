// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < SensitiveDataAuditLogList> sensitiveDataAuditLogList;

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
    public java.util.List < SensitiveDataAuditLogList> getSensitiveDataAuditLogList() {
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
        private java.util.List < SensitiveDataAuditLogList> sensitiveDataAuditLogList; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The audit logs for sensitive data.
         */
        public Builder sensitiveDataAuditLogList(java.util.List < SensitiveDataAuditLogList> sensitiveDataAuditLogList) {
            this.sensitiveDataAuditLogList = sensitiveDataAuditLogList;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSensitiveDataAuditLogResponseBody build() {
            return new ListSensitiveDataAuditLogResponseBody(this);
        } 

    } 

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

            /**
             * The name of the column that contains sensitive data.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The permission that the user has on the column. Valid values:
             * <p>
             * 
             * *   **No permission**
             * *   **Partial redaction**
             * *   **Plaintext**
             * *   **Change**
             * *   **Enable data masking**
             * *   **Disable data masking**
             */
            public Builder columnPermissionType(String columnPermissionType) {
                this.columnPermissionType = columnPermissionType;
                return this;
            }

            /**
             * The algorithm used for data masking.
             */
            public Builder desensitizationRule(String desensitizationRule) {
                this.desensitizationRule = desensitizationRule;
                return this;
            }

            /**
             * The sensitivity level of the data. Valid values:
             * <p>
             * 
             * *   **Low**
             * *   **Medium**
             * *   **High**
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * The name of the table that stores the sensitive data.
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
        private java.util.List < SensitiveDataLog> sensitiveDataLog;

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
        public java.util.List < SensitiveDataLog> getSensitiveDataLog() {
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
            private java.util.List < SensitiveDataLog> sensitiveDataLog; 
            private String targetName; 
            private Long userId; 
            private String userName; 

            /**
             * The name of the database that stores the sensitive data.
             */
            public Builder dbDisplayName(String dbDisplayName) {
                this.dbDisplayName = dbDisplayName;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the function module whose audit logs were queried.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * The time when the operation was performed. The time is in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * The logs for sensitive data.
             */
            public Builder sensitiveDataLog(java.util.List < SensitiveDataLog> sensitiveDataLog) {
                this.sensitiveDataLog = sensitiveDataLog;
                return this;
            }

            /**
             * The details of the object on which the operation was performed. The value of this parameter is in one of the following formats:
             * <p>
             * 
             * *   Object name - object ID
             * *   Object name (object ID)
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The user ID of the requester.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The username of the requester.
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
