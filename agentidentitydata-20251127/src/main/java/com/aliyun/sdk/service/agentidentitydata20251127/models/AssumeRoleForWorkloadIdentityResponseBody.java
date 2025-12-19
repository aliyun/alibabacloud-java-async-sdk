// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link AssumeRoleForWorkloadIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeRoleForWorkloadIdentityResponseBody</p>
 */
public class AssumeRoleForWorkloadIdentityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @com.aliyun.core.annotation.NameInMap("Credentials")
    private Credentials credentials;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkloadContextInfo")
    private WorkloadContextInfo workloadContextInfo;

    private AssumeRoleForWorkloadIdentityResponseBody(Builder builder) {
        this.assumedRoleUser = builder.assumedRoleUser;
        this.credentials = builder.credentials;
        this.requestId = builder.requestId;
        this.workloadContextInfo = builder.workloadContextInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleForWorkloadIdentityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumedRoleUser
     */
    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    /**
     * @return credentials
     */
    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workloadContextInfo
     */
    public WorkloadContextInfo getWorkloadContextInfo() {
        return this.workloadContextInfo;
    }

    public static final class Builder {
        private AssumedRoleUser assumedRoleUser; 
        private Credentials credentials; 
        private String requestId; 
        private WorkloadContextInfo workloadContextInfo; 

        private Builder() {
        } 

        private Builder(AssumeRoleForWorkloadIdentityResponseBody model) {
            this.assumedRoleUser = model.assumedRoleUser;
            this.credentials = model.credentials;
            this.requestId = model.requestId;
            this.workloadContextInfo = model.workloadContextInfo;
        } 

        /**
         * AssumedRoleUser.
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * Credentials.
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
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
         * WorkloadContextInfo.
         */
        public Builder workloadContextInfo(WorkloadContextInfo workloadContextInfo) {
            this.workloadContextInfo = workloadContextInfo;
            return this;
        }

        public AssumeRoleForWorkloadIdentityResponseBody build() {
            return new AssumeRoleForWorkloadIdentityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssumeRoleForWorkloadIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleForWorkloadIdentityResponseBody</p>
     */
    public static class AssumedRoleUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("AssumedRoleId")
        private String assumedRoleId;

        private AssumedRoleUser(Builder builder) {
            this.arn = builder.arn;
            this.assumedRoleId = builder.assumedRoleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssumedRoleUser create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return assumedRoleId
         */
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        public static final class Builder {
            private String arn; 
            private String assumedRoleId; 

            private Builder() {
            } 

            private Builder(AssumedRoleUser model) {
                this.arn = model.arn;
                this.assumedRoleId = model.assumedRoleId;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * AssumedRoleId.
             */
            public Builder assumedRoleId(String assumedRoleId) {
                this.assumedRoleId = assumedRoleId;
                return this;
            }

            public AssumedRoleUser build() {
                return new AssumedRoleUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssumeRoleForWorkloadIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleForWorkloadIdentityResponseBody</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private Credentials(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.expiration = builder.expiration;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String expiration; 
            private String securityToken; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.expiration = model.expiration;
                this.securityToken = model.securityToken;
            } 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssumeRoleForWorkloadIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleForWorkloadIdentityResponseBody</p>
     */
    public static class JwtClaims extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audiences")
        private String audiences;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private JwtClaims(Builder builder) {
            this.audiences = builder.audiences;
            this.issuer = builder.issuer;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JwtClaims create() {
            return builder().build();
        }

        /**
         * @return audiences
         */
        public String getAudiences() {
            return this.audiences;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String audiences; 
            private String issuer; 
            private String subject; 

            private Builder() {
            } 

            private Builder(JwtClaims model) {
                this.audiences = model.audiences;
                this.issuer = model.issuer;
                this.subject = model.subject;
            } 

            /**
             * Audiences.
             */
            public Builder audiences(String audiences) {
                this.audiences = audiences;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public JwtClaims build() {
                return new JwtClaims(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssumeRoleForWorkloadIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleForWorkloadIdentityResponseBody</p>
     */
    public static class UserContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JwtClaims")
        private JwtClaims jwtClaims;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserContext(Builder builder) {
            this.jwtClaims = builder.jwtClaims;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserContext create() {
            return builder().build();
        }

        /**
         * @return jwtClaims
         */
        public JwtClaims getJwtClaims() {
            return this.jwtClaims;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private JwtClaims jwtClaims; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserContext model) {
                this.jwtClaims = model.jwtClaims;
                this.userId = model.userId;
            } 

            /**
             * JwtClaims.
             */
            public Builder jwtClaims(JwtClaims jwtClaims) {
                this.jwtClaims = jwtClaims;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserContext build() {
                return new UserContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssumeRoleForWorkloadIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleForWorkloadIdentityResponseBody</p>
     */
    public static class WorkloadContextInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserContext")
        private UserContext userContext;

        @com.aliyun.core.annotation.NameInMap("WorkloadIdentityArn")
        private String workloadIdentityArn;

        private WorkloadContextInfo(Builder builder) {
            this.userContext = builder.userContext;
            this.workloadIdentityArn = builder.workloadIdentityArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkloadContextInfo create() {
            return builder().build();
        }

        /**
         * @return userContext
         */
        public UserContext getUserContext() {
            return this.userContext;
        }

        /**
         * @return workloadIdentityArn
         */
        public String getWorkloadIdentityArn() {
            return this.workloadIdentityArn;
        }

        public static final class Builder {
            private UserContext userContext; 
            private String workloadIdentityArn; 

            private Builder() {
            } 

            private Builder(WorkloadContextInfo model) {
                this.userContext = model.userContext;
                this.workloadIdentityArn = model.workloadIdentityArn;
            } 

            /**
             * UserContext.
             */
            public Builder userContext(UserContext userContext) {
                this.userContext = userContext;
                return this;
            }

            /**
             * WorkloadIdentityArn.
             */
            public Builder workloadIdentityArn(String workloadIdentityArn) {
                this.workloadIdentityArn = workloadIdentityArn;
                return this;
            }

            public WorkloadContextInfo build() {
                return new WorkloadContextInfo(this);
            } 

        } 

    }
}
