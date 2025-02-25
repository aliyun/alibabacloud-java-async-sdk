// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssumeRoleWithSAMLResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeRoleWithSAMLResponseBody</p>
 */
public class AssumeRoleWithSAMLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @com.aliyun.core.annotation.NameInMap("Credentials")
    private Credentials credentials;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLAssertionInfo")
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
         * <p>The temporary identity that you use to assume the RAM role.</p>
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * <p>The STS credentials.</p>
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6894B13B-6D71-4EF5-88FA-F32781734A7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information in the SAML assertion.</p>
         */
        public Builder SAMLAssertionInfo(SAMLAssertionInfo SAMLAssertionInfo) {
            this.SAMLAssertionInfo = SAMLAssertionInfo;
            return this;
        }

        public AssumeRoleWithSAMLResponseBody build() {
            return new AssumeRoleWithSAMLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssumeRoleWithSAMLResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleWithSAMLResponseBody</p>
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

            /**
             * <p>The ARN of the temporary identity that you use to assume the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:sts::123456789012****:assumed-role/AdminRole/alice</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the temporary identity that you use to assume the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>34458433936495****:alice</p>
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
     * {@link AssumeRoleWithSAMLResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleWithSAMLResponseBody</p>
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

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.L4aBSCSJVMuKg5U1****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>wyLTSmsyPGP1ohvvw8xYgB29dlGI8KMiH2pK****</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The time when the STS token expires. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-04-09T11:52:19Z</p>
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The STS token.</p>
             * <blockquote>
             * <p>Alibaba Cloud STS does not impose limits on the length of STS tokens. We strongly recommend that you do not specify a maximum length for STS tokens.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <hr>
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
     * {@link AssumeRoleWithSAMLResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleWithSAMLResponseBody</p>
     */
    public static class SAMLAssertionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Recipient")
        private String recipient;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("SubjectType")
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
             * <p>The value in the <code>Issuer</code> element in the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/adfs/services/trust">http://example.com/adfs/services/trust</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The <code>Recipient</code> attribute of the SubjectConfirmationData sub-element. SubjectConfirmationData is a sub-element of the <code>Subject</code> element in the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://signin.aliyun.com/saml-role/SSO">https://signin.aliyun.com/saml-role/SSO</a></p>
             */
            public Builder recipient(String recipient) {
                this.recipient = recipient;
                return this;
            }

            /**
             * <p>The value in the NameID sub-element of the <code>Subject</code> element in the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The Format attribute of the <code>NameID</code> element in the SAML assertion. If the Format attribute is prefixed with <code>urn:oasis:names:tc:SAML:2.0:nameid-format:</code>, the prefix is not included in the value of this parameter. For example, if the value of the Format attribute is urn:oasis:names:tc:SAML:2.0:nameid-format:persistent/transient, the value of this parameter is <code>persistent/transient</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>persistent</p>
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
