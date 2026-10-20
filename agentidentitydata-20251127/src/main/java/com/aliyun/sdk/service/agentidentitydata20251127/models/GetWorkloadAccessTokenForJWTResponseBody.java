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
 * {@link GetWorkloadAccessTokenForJWTResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkloadAccessTokenForJWTResponseBody</p>
 */
public class GetWorkloadAccessTokenForJWTResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserContext")
    private UserContext userContext;

    @com.aliyun.core.annotation.NameInMap("WorkloadAccessToken")
    private String workloadAccessToken;

    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityArn")
    private String workloadIdentityArn;

    private GetWorkloadAccessTokenForJWTResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userContext = builder.userContext;
        this.workloadAccessToken = builder.workloadAccessToken;
        this.workloadIdentityArn = builder.workloadIdentityArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadAccessTokenForJWTResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userContext
     */
    public UserContext getUserContext() {
        return this.userContext;
    }

    /**
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    /**
     * @return workloadIdentityArn
     */
    public String getWorkloadIdentityArn() {
        return this.workloadIdentityArn;
    }

    public static final class Builder {
        private String requestId; 
        private UserContext userContext; 
        private String workloadAccessToken; 
        private String workloadIdentityArn; 

        private Builder() {
        } 

        private Builder(GetWorkloadAccessTokenForJWTResponseBody model) {
            this.requestId = model.requestId;
            this.userContext = model.userContext;
            this.workloadAccessToken = model.workloadAccessToken;
            this.workloadIdentityArn = model.workloadIdentityArn;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserContext.
         */
        public Builder userContext(UserContext userContext) {
            this.userContext = userContext;
            return this;
        }

        /**
         * WorkloadAccessToken.
         */
        public Builder workloadAccessToken(String workloadAccessToken) {
            this.workloadAccessToken = workloadAccessToken;
            return this;
        }

        /**
         * WorkloadIdentityArn.
         */
        public Builder workloadIdentityArn(String workloadIdentityArn) {
            this.workloadIdentityArn = workloadIdentityArn;
            return this;
        }

        public GetWorkloadAccessTokenForJWTResponseBody build() {
            return new GetWorkloadAccessTokenForJWTResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkloadAccessTokenForJWTResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkloadAccessTokenForJWTResponseBody</p>
     */
    public static class JwtClaims extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audiences")
        private String audiences;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("JTI")
        private String JTI;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private JwtClaims(Builder builder) {
            this.audiences = builder.audiences;
            this.issuer = builder.issuer;
            this.JTI = builder.JTI;
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
         * @return JTI
         */
        public String getJTI() {
            return this.JTI;
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
            private String JTI; 
            private String subject; 

            private Builder() {
            } 

            private Builder(JwtClaims model) {
                this.audiences = model.audiences;
                this.issuer = model.issuer;
                this.JTI = model.JTI;
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
             * JTI.
             */
            public Builder JTI(String JTI) {
                this.JTI = JTI;
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
     * {@link GetWorkloadAccessTokenForJWTResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkloadAccessTokenForJWTResponseBody</p>
     */
    public static class UserContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JwtClaims")
        private JwtClaims jwtClaims;

        private UserContext(Builder builder) {
            this.jwtClaims = builder.jwtClaims;
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

        public static final class Builder {
            private JwtClaims jwtClaims; 

            private Builder() {
            } 

            private Builder(UserContext model) {
                this.jwtClaims = model.jwtClaims;
            } 

            /**
             * JwtClaims.
             */
            public Builder jwtClaims(JwtClaims jwtClaims) {
                this.jwtClaims = jwtClaims;
                return this;
            }

            public UserContext build() {
                return new UserContext(this);
            } 

        } 

    }
}
