// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceLoginAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceLoginAuditLogResponseBody</p>
 */
public class ListInstanceLoginAuditLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("InstanceLoginAuditLogList")
    private InstanceLoginAuditLogList instanceLoginAuditLogList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * The ID of the user.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The database account that is used to log on to the instance.
         */
        public Builder instanceLoginAuditLogList(InstanceLoginAuditLogList instanceLoginAuditLogList) {
            this.instanceLoginAuditLogList = instanceLoginAuditLogList;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * >  The start time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100.
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
        @NameInMap("DbUser")
        private String dbUser;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("OpTime")
        private String opTime;

        @NameInMap("RequestIp")
        private String requestIp;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
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
             * DbUser.
             */
            public Builder dbUser(String dbUser) {
                this.dbUser = dbUser;
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
             * The ID of the request.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * RequestIp.
             */
            public Builder requestIp(String requestIp) {
                this.requestIp = requestIp;
                return this;
            }

            /**
             * The source IP address of the request.
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
        @NameInMap("InstanceLoginAuditLog")
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
