// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssumeRoleWithSAMLResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeRoleWithSAMLResponseBody</p>
 */
public class AssumeRoleWithSAMLResponseBody extends TeaModel {
    @NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    private Credentials credentials;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SAMLAssertionInfo")
    private SAMLAssertionInfo SAMLAssertionInfo;

    private AssumeRoleWithSAMLResponseBody(Builder builder) {
        this.assumedRoleUser = builder.assumedRoleUser;
        this.credentials = builder.credentials;
        this.requestId = builder.requestId;
        this.SAMLAssertionInfo = builder.SAMLAssertionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithSAMLResponseBody create() {
        return builder().build();
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
     * @return SAMLAssertionInfo
     */
    public SAMLAssertionInfo getSAMLAssertionInfo() {
        return this.SAMLAssertionInfo;
    }

    public static final class Builder {
        private AssumedRoleUser assumedRoleUser; 
        private Credentials credentials; 
        private String requestId; 
        private SAMLAssertionInfo SAMLAssertionInfo; 

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
         * SAMLAssertionInfo.
         */
        public Builder SAMLAssertionInfo(SAMLAssertionInfo SAMLAssertionInfo) {
            this.SAMLAssertionInfo = SAMLAssertionInfo;
            return this;
        }

        public AssumeRoleWithSAMLResponseBody build() {
            return new AssumeRoleWithSAMLResponseBody(this);
        } 

    } 

    public static class AssumedRoleUser extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("AssumedRoleId")
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
    public static class Credentials extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("SecurityToken")
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
    public static class SAMLAssertionInfo extends TeaModel {
        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("Recipient")
        private String recipient;

        @NameInMap("Subject")
        private String subject;

        @NameInMap("SubjectType")
        private String subjectType;

        private SAMLAssertionInfo(Builder builder) {
            this.issuer = builder.issuer;
            this.recipient = builder.recipient;
            this.subject = builder.subject;
            this.subjectType = builder.subjectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLAssertionInfo create() {
            return builder().build();
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return recipient
         */
        public String getRecipient() {
            return this.recipient;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        public static final class Builder {
            private String issuer; 
            private String recipient; 
            private String subject; 
            private String subjectType; 

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * Recipient.
             */
            public Builder recipient(String recipient) {
                this.recipient = recipient;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * SubjectType.
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            public SAMLAssertionInfo build() {
                return new SAMLAssertionInfo(this);
            } 

        } 

    }
}
