// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateContextDBResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContextDBResponseBody</p>
 */
public class CreateContextDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateContextDBResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDBResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateContextDBResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateContextDBResponseBody build() {
            return new CreateContextDBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateContextDBResponseBody} extends {@link TeaModel}
     *
     * <p>CreateContextDBResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>NoPermissionType</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContextDBResponseBody} extends {@link TeaModel}
     *
     * <p>CreateContextDBResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContextDBAdminKey")
        private String contextDBAdminKey;

        @com.aliyun.core.annotation.NameInMap("ContextDBInstanceName")
        private String contextDBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DashboardReplicaSetName")
        private String dashboardReplicaSetName;

        @com.aliyun.core.annotation.NameInMap("OpenSearchInstanceName")
        private String openSearchInstanceName;

        @com.aliyun.core.annotation.NameInMap("ServiceReplicaSetName")
        private String serviceReplicaSetName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private Data(Builder builder) {
            this.contextDBAdminKey = builder.contextDBAdminKey;
            this.contextDBInstanceName = builder.contextDBInstanceName;
            this.DBInstanceName = builder.DBInstanceName;
            this.dashboardReplicaSetName = builder.dashboardReplicaSetName;
            this.openSearchInstanceName = builder.openSearchInstanceName;
            this.serviceReplicaSetName = builder.serviceReplicaSetName;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contextDBAdminKey
         */
        public String getContextDBAdminKey() {
            return this.contextDBAdminKey;
        }

        /**
         * @return contextDBInstanceName
         */
        public String getContextDBInstanceName() {
            return this.contextDBInstanceName;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return dashboardReplicaSetName
         */
        public String getDashboardReplicaSetName() {
            return this.dashboardReplicaSetName;
        }

        /**
         * @return openSearchInstanceName
         */
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

        /**
         * @return serviceReplicaSetName
         */
        public String getServiceReplicaSetName() {
            return this.serviceReplicaSetName;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String contextDBAdminKey; 
            private String contextDBInstanceName; 
            private String DBInstanceName; 
            private String dashboardReplicaSetName; 
            private String openSearchInstanceName; 
            private String serviceReplicaSetName; 
            private Integer taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contextDBAdminKey = model.contextDBAdminKey;
                this.contextDBInstanceName = model.contextDBInstanceName;
                this.DBInstanceName = model.DBInstanceName;
                this.dashboardReplicaSetName = model.dashboardReplicaSetName;
                this.openSearchInstanceName = model.openSearchInstanceName;
                this.serviceReplicaSetName = model.serviceReplicaSetName;
                this.taskId = model.taskId;
            } 

            /**
             * ContextDBAdminKey.
             */
            public Builder contextDBAdminKey(String contextDBAdminKey) {
                this.contextDBAdminKey = contextDBAdminKey;
                return this;
            }

            /**
             * ContextDBInstanceName.
             */
            public Builder contextDBInstanceName(String contextDBInstanceName) {
                this.contextDBInstanceName = contextDBInstanceName;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * DashboardReplicaSetName.
             */
            public Builder dashboardReplicaSetName(String dashboardReplicaSetName) {
                this.dashboardReplicaSetName = dashboardReplicaSetName;
                return this;
            }

            /**
             * OpenSearchInstanceName.
             */
            public Builder openSearchInstanceName(String openSearchInstanceName) {
                this.openSearchInstanceName = openSearchInstanceName;
                return this;
            }

            /**
             * ServiceReplicaSetName.
             */
            public Builder serviceReplicaSetName(String serviceReplicaSetName) {
                this.serviceReplicaSetName = serviceReplicaSetName;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
