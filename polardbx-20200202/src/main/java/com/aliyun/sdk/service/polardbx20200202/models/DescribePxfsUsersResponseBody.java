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
 * {@link DescribePxfsUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePxfsUsersResponseBody</p>
 */
public class DescribePxfsUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePxfsUsersResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePxfsUsersResponseBody create() {
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

        private Builder(DescribePxfsUsersResponseBody model) {
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
         * <p>接口返回的业务数据。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>请求的唯一标识，可用于排查问题。</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePxfsUsersResponseBody build() {
            return new DescribePxfsUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePxfsUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsUsersResponseBody</p>
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
     * {@link DescribePxfsUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IdentityName")
        private String identityName;

        @com.aliyun.core.annotation.NameInMap("PosixGid")
        private Long posixGid;

        @com.aliyun.core.annotation.NameInMap("PosixUid")
        private Long posixUid;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Users(Builder builder) {
            this.createTime = builder.createTime;
            this.identityName = builder.identityName;
            this.posixGid = builder.posixGid;
            this.posixUid = builder.posixUid;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return identityName
         */
        public String getIdentityName() {
            return this.identityName;
        }

        /**
         * @return posixGid
         */
        public Long getPosixGid() {
            return this.posixGid;
        }

        /**
         * @return posixUid
         */
        public Long getPosixUid() {
            return this.posixUid;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String identityName; 
            private Long posixGid; 
            private Long posixUid; 
            private String role; 
            private String status; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.createTime = model.createTime;
                this.identityName = model.identityName;
                this.posixGid = model.posixGid;
                this.posixUid = model.posixUid;
                this.role = model.role;
                this.status = model.status;
            } 

            /**
             * <p>资源的创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-03T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Agent文件服务租户内的身份名称，不是阿里云账号UID。</p>
             * 
             * <strong>example:</strong>
             * <p>agent-runtime</p>
             */
            public Builder identityName(String identityName) {
                this.identityName = identityName;
                return this;
            }

            /**
             * <p>POSIX GID</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder posixGid(Long posixGid) {
                this.posixGid = posixGid;
                return this;
            }

            /**
             * <p>POSIX UID</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder posixUid(Long posixUid) {
                this.posixUid = posixUid;
                return this;
            }

            /**
             * <p>租户身份角色，取值为ADMIN或MEMBER。</p>
             * 
             * <strong>example:</strong>
             * <p>MEMBER</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>当前资源状态。</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePxfsUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsUsersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List<Users> users;

        private Data(Builder builder) {
            this.tenantId = builder.tenantId;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return users
         */
        public java.util.List<Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String tenantId; 
            private java.util.List<Users> users; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.tenantId = model.tenantId;
                this.users = model.users;
            } 

            /**
             * <p>Agent文件服务的租户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>tenant-001</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Agent文件服务租户身份列表。</p>
             */
            public Builder users(java.util.List<Users> users) {
                this.users = users;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
