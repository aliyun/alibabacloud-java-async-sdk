// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SAMLAssertionInfo")
    private SAMLAssertionInfo SAMLAssertionInfo;

    @NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    private Credentials credentials;

    private AssumeRoleWithSAMLResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLAssertionInfo = builder.SAMLAssertionInfo;
        this.assumedRoleUser = builder.assumedRoleUser;
        this.credentials = builder.credentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithSAMLResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private SAMLAssertionInfo SAMLAssertionInfo; 
        private AssumedRoleUser assumedRoleUser; 
        private Credentials credentials; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Part of the information in the SAML assertion.
         */
        public Builder SAMLAssertionInfo(SAMLAssertionInfo SAMLAssertionInfo) {
            this.SAMLAssertionInfo = SAMLAssertionInfo;
            return this;
        }

        /**
         * The temporary role-playing identity.
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * The access credential.
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public AssumeRoleWithSAMLResponseBody build() {
            return new AssumeRoleWithSAMLResponseBody(this);
        } 

    } 

    public static class SAMLAssertionInfo extends TeaModel {
        @NameInMap("SubjectType")
        private String subjectType;

        @NameInMap("Subject")
        private String subject;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("Recipient")
        private String recipient;

        private SAMLAssertionInfo(Builder builder) {
            this.subjectType = builder.subjectType;
            this.subject = builder.subject;
            this.issuer = builder.issuer;
            this.recipient = builder.recipient;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLAssertionInfo create() {
            return builder().build();
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
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

        public static final class Builder {
            private String subjectType; 
            private String subject; 
            private String issuer; 
            private String recipient; 

            /**
             * The format of "NameID" in The SAML assertion. If the prefix is "urn:oasis:names:tc:SAML:2.0:nameid-format:", the prefix is removed. For example, "persistent/transient ".
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            /**
             * The value of the Subject-NameID field in the SAML assertion.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * The value of the "Issuer" field in the SAML assertion.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * The value of the Subject-SubjectConfirmation-SubjectConfirmationData attribute in the SAML assertion.
             */
            public Builder recipient(String recipient) {
                this.recipient = recipient;
                return this;
            }

            public SAMLAssertionInfo build() {
                return new SAMLAssertionInfo(this);
            } 

        } 

    }
    public static class AssumedRoleUser extends TeaModel {
        @NameInMap("AssumedRoleId")
        private String assumedRoleId;

        @NameInMap("Arn")
        private String arn;

        private AssumedRoleUser(Builder builder) {
            this.assumedRoleId = builder.assumedRoleId;
            this.arn = builder.arn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssumedRoleUser create() {
            return builder().build();
        }

        /**
         * @return assumedRoleId
         */
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        public static final class Builder {
            private String assumedRoleId; 
            private String arn; 

            /**
             * The ID of the temporary identity.
             */
            public Builder assumedRoleId(String assumedRoleId) {
                this.assumedRoleId = assumedRoleId;
                return this;
            }

            /**
             * The ARN of the temporary identity.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            public AssumedRoleUser build() {
                return new AssumedRoleUser(this);
            } 

        } 

    }
    public static class Credentials extends TeaModel {
        @NameInMap("SecurityToken")
        private String securityToken;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("AccessKeyId")
        private String accessKeyId;

        private Credentials(Builder builder) {
            this.securityToken = builder.securityToken;
            this.expiration = builder.expiration;
            this.accessKeySecret = builder.accessKeySecret;
            this.accessKeyId = builder.accessKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public static final class Builder {
            private String securityToken; 
            private String expiration; 
            private String accessKeySecret; 
            private String accessKeyId; 

            /**
             * The security token.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * The accesskey pair.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * The accesskey ID.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
