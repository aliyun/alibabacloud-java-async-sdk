// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceLoginAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceLoginAuditLogResponseBody</p>
 */
public class ListInstanceLoginAuditLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("InstanceLoginAuditLogList")
    private InstanceLoginAuditLogList instanceLoginAuditLogList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstanceLoginAuditLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.instanceLoginAuditLogList = builder.instanceLoginAuditLogList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceLoginAuditLogResponseBody create() {
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
     * @return instanceLoginAuditLogList
     */
    public InstanceLoginAuditLogList getInstanceLoginAuditLogList() {
        return this.instanceLoginAuditLogList;
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
        private InstanceLoginAuditLogList instanceLoginAuditLogList; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The logon records of the instance.
         */
        public Builder instanceLoginAuditLogList(InstanceLoginAuditLogList instanceLoginAuditLogList) {
            this.instanceLoginAuditLogList = instanceLoginAuditLogList;
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
         * The number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceLoginAuditLogResponseBody build() {
            return new ListInstanceLoginAuditLogResponseBody(this);
        } 

    } 

    public static class InstanceLoginAuditLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbUser")
        private String dbUser;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("OpTime")
        private String opTime;

        @com.aliyun.core.annotation.NameInMap("RequestIp")
        private String requestIp;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private InstanceLoginAuditLog(Builder builder) {
            this.dbUser = builder.dbUser;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.opTime = builder.opTime;
            this.requestIp = builder.requestIp;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceLoginAuditLog create() {
            return builder().build();
        }

        /**
         * @return dbUser
         */
        public String getDbUser() {
            return this.dbUser;
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
         * @return requestIp
         */
        public String getRequestIp() {
            return this.requestIp;
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
            private String dbUser; 
            private Long instanceId; 
            private String instanceName; 
            private String opTime; 
            private String requestIp; 
            private Long userId; 
            private String userName; 

            /**
             * The database account that is used to log on to the instance.
             */
            public Builder dbUser(String dbUser) {
                this.dbUser = dbUser;
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
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The time when the user performed an operation on the instance.
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * The source IP address of the request.
             */
            public Builder requestIp(String requestIp) {
                this.requestIp = requestIp;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The alias of the user.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public InstanceLoginAuditLog build() {
                return new InstanceLoginAuditLog(this);
            } 

        } 

    }
    public static class InstanceLoginAuditLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceLoginAuditLog")
        private java.util.List < InstanceLoginAuditLog> instanceLoginAuditLog;

        private InstanceLoginAuditLogList(Builder builder) {
            this.instanceLoginAuditLog = builder.instanceLoginAuditLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceLoginAuditLogList create() {
            return builder().build();
        }

        /**
         * @return instanceLoginAuditLog
         */
        public java.util.List < InstanceLoginAuditLog> getInstanceLoginAuditLog() {
            return this.instanceLoginAuditLog;
        }

        public static final class Builder {
            private java.util.List < InstanceLoginAuditLog> instanceLoginAuditLog; 

            /**
             * InstanceLoginAuditLog.
             */
            public Builder instanceLoginAuditLog(java.util.List < InstanceLoginAuditLog> instanceLoginAuditLog) {
                this.instanceLoginAuditLog = instanceLoginAuditLog;
                return this;
            }

            public InstanceLoginAuditLogList build() {
                return new InstanceLoginAuditLogList(this);
            } 

        } 

    }
}
