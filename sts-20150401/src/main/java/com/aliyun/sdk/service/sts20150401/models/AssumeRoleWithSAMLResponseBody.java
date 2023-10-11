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
         * The temporary identity that you use to assume the RAM role.
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * The STS credentials.
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
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
         * The information in the SAML assertion.
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
             * The ARN of the temporary identity that you use to assume the RAM role.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the temporary identity that you use to assume the RAM role.
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
             * The AccessKey ID.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * The AccessKey secret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * The time when the STS token expires. The time is displayed in UTC.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * The STS token.
             * <p>
             * 
             * > Alibaba Cloud STS does not impose limits on the length of STS tokens. We strongly recommend that you do not specify a maximum length for STS tokens.
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
             * The value in the `Issuer` element in the SAML assertion.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * The `Recipient` attribute of the SubjectConfirmationData sub-element. SubjectConfirmationData is a sub-element of the `Subject` element in the SAML assertion.
             */
            public Builder recipient(String recipient) {
                this.recipient = recipient;
                return this;
            }

            /**
             * The value in the NameID sub-element of the `Subject` element in the SAML assertion.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * The Format attribute of the `NameID` element in the SAML assertion. If the Format attribute is prefixed with `urn:oasis:names:tc:SAML:2.0:nameid-format:`, the prefix is not included in the value of this parameter. For example, if the value of the Format attribute is urn:oasis:names:tc:SAML:2.0:nameid-format:persistent/transient, the value of this parameter is `persistent/transient`.
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
