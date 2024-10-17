// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidPageSize</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter PageSize is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The logon records of the instance.</p>
         */
        public Builder instanceLoginAuditLogList(InstanceLoginAuditLogList instanceLoginAuditLogList) {
            this.instanceLoginAuditLogList = instanceLoginAuditLogList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>074CE7C9-4F9C-5B62-89BC-7B4914A3****</p>
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

        public ListInstanceLoginAuditLogResponseBody build() {
            return new ListInstanceLoginAuditLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceLoginAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceLoginAuditLogResponseBody</p>
     */
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
             * <p>The database account that is used to log on to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test_User</p>
             */
            public Builder dbUser(String dbUser) {
                this.dbUser = dbUser;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>177****</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp144d5ky4l4rli0417****.mysql.rds.aliyuncs.com:3306[rm-bp144d5ky4l4r****]</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The time when the user performed an operation on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-18 11:13:26</p>
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * <p>The source IP address of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>117.36.XX.XX,100.104.XX.XX</p>
             */
            public Builder requestIp(String requestIp) {
                this.requestIp = requestIp;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>12****</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The alias of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>test_UserName</p>
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
    /**
     * 
     * {@link ListInstanceLoginAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceLoginAuditLogResponseBody</p>
     */
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
