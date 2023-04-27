// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveDataAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveDataAuditLogResponseBody</p>
 */
public class ListSensitiveDataAuditLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveDataAuditLogList")
    private java.util.List < SensitiveDataAuditLogList> sensitiveDataAuditLogList;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SensitiveDataAuditLogList.
         */
        public Builder sensitiveDataAuditLogList(java.util.List < SensitiveDataAuditLogList> sensitiveDataAuditLogList) {
            this.sensitiveDataAuditLogList = sensitiveDataAuditLogList;
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

        public ListSensitiveDataAuditLogResponseBody build() {
            return new ListSensitiveDataAuditLogResponseBody(this);
        } 

    } 

    public static class SensitiveDataLog extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ColumnPermissionType")
        private String columnPermissionType;

        @NameInMap("DesensitizationRule")
        private String desensitizationRule;

        @NameInMap("SecurityLevel")
        private String securityLevel;

        @NameInMap("TableName")
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * ColumnPermissionType.
             */
            public Builder columnPermissionType(String columnPermissionType) {
                this.columnPermissionType = columnPermissionType;
                return this;
            }

            /**
             * DesensitizationRule.
             */
            public Builder desensitizationRule(String desensitizationRule) {
                this.desensitizationRule = desensitizationRule;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * TableName.
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
        @NameInMap("DbDisplayName")
        private String dbDisplayName;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("OpTime")
        private String opTime;

        @NameInMap("SensitiveDataLog")
        private java.util.List < SensitiveDataLog> sensitiveDataLog;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
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
             * DbDisplayName.
             */
            public Builder dbDisplayName(String dbDisplayName) {
                this.dbDisplayName = dbDisplayName;
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
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
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
             * SensitiveDataLog.
             */
            public Builder sensitiveDataLog(java.util.List < SensitiveDataLog> sensitiveDataLog) {
                this.sensitiveDataLog = sensitiveDataLog;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
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

            public SensitiveDataAuditLogList build() {
                return new SensitiveDataAuditLogList(this);
            } 

        } 

    }
}
