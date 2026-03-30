// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link ObtainCloudAccountRoleAccessCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>ObtainCloudAccountRoleAccessCredentialResponseBody</p>
 */
public class ObtainCloudAccountRoleAccessCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cloudAccountId")
    private String cloudAccountId;

    @com.aliyun.core.annotation.NameInMap("cloudAccountRoleAccessCredential")
    private CloudAccountRoleAccessCredential cloudAccountRoleAccessCredential;

    @com.aliyun.core.annotation.NameInMap("cloudAccountRoleExternalId")
    private String cloudAccountRoleExternalId;

    @com.aliyun.core.annotation.NameInMap("cloudAccountRoleId")
    private String cloudAccountRoleId;

    @com.aliyun.core.annotation.NameInMap("cloudAccountRoleName")
    private String cloudAccountRoleName;

    @com.aliyun.core.annotation.NameInMap("cloudAccountVendorType")
    private String cloudAccountVendorType;

    private ObtainCloudAccountRoleAccessCredentialResponseBody(Builder builder) {
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudAccountRoleAccessCredential = builder.cloudAccountRoleAccessCredential;
        this.cloudAccountRoleExternalId = builder.cloudAccountRoleExternalId;
        this.cloudAccountRoleId = builder.cloudAccountRoleId;
        this.cloudAccountRoleName = builder.cloudAccountRoleName;
        this.cloudAccountVendorType = builder.cloudAccountVendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainCloudAccountRoleAccessCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccountId
     */
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    /**
     * @return cloudAccountRoleAccessCredential
     */
    public CloudAccountRoleAccessCredential getCloudAccountRoleAccessCredential() {
        return this.cloudAccountRoleAccessCredential;
    }

    /**
     * @return cloudAccountRoleExternalId
     */
    public String getCloudAccountRoleExternalId() {
        return this.cloudAccountRoleExternalId;
    }

    /**
     * @return cloudAccountRoleId
     */
    public String getCloudAccountRoleId() {
        return this.cloudAccountRoleId;
    }

    /**
     * @return cloudAccountRoleName
     */
    public String getCloudAccountRoleName() {
        return this.cloudAccountRoleName;
    }

    /**
     * @return cloudAccountVendorType
     */
    public String getCloudAccountVendorType() {
        return this.cloudAccountVendorType;
    }

    public static final class Builder {
        private String cloudAccountId; 
        private CloudAccountRoleAccessCredential cloudAccountRoleAccessCredential; 
        private String cloudAccountRoleExternalId; 
        private String cloudAccountRoleId; 
        private String cloudAccountRoleName; 
        private String cloudAccountVendorType; 

        private Builder() {
        } 

        private Builder(ObtainCloudAccountRoleAccessCredentialResponseBody model) {
            this.cloudAccountId = model.cloudAccountId;
            this.cloudAccountRoleAccessCredential = model.cloudAccountRoleAccessCredential;
            this.cloudAccountRoleExternalId = model.cloudAccountRoleExternalId;
            this.cloudAccountRoleId = model.cloudAccountRoleId;
            this.cloudAccountRoleName = model.cloudAccountRoleName;
            this.cloudAccountVendorType = model.cloudAccountVendorType;
        } 

        /**
         * cloudAccountId.
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * cloudAccountRoleAccessCredential.
         */
        public Builder cloudAccountRoleAccessCredential(CloudAccountRoleAccessCredential cloudAccountRoleAccessCredential) {
            this.cloudAccountRoleAccessCredential = cloudAccountRoleAccessCredential;
            return this;
        }

        /**
         * cloudAccountRoleExternalId.
         */
        public Builder cloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
            this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
            return this;
        }

        /**
         * cloudAccountRoleId.
         */
        public Builder cloudAccountRoleId(String cloudAccountRoleId) {
            this.cloudAccountRoleId = cloudAccountRoleId;
            return this;
        }

        /**
         * cloudAccountRoleName.
         */
        public Builder cloudAccountRoleName(String cloudAccountRoleName) {
            this.cloudAccountRoleName = cloudAccountRoleName;
            return this;
        }

        /**
         * cloudAccountVendorType.
         */
        public Builder cloudAccountVendorType(String cloudAccountVendorType) {
            this.cloudAccountVendorType = cloudAccountVendorType;
            return this;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBody build() {
            return new ObtainCloudAccountRoleAccessCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ObtainCloudAccountRoleAccessCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainCloudAccountRoleAccessCredentialResponseBody</p>
     */
    public static class AlibabaCloudStsToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("accessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("securityToken")
        private String securityToken;

        private AlibabaCloudStsToken(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.expiration = builder.expiration;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlibabaCloudStsToken create() {
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

            private Builder(AlibabaCloudStsToken model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.expiration = model.expiration;
                this.securityToken = model.securityToken;
            } 

            /**
             * accessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * accessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * securityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public AlibabaCloudStsToken build() {
                return new AlibabaCloudStsToken(this);
            } 

        } 

    }
    /**
     * 
     * {@link ObtainCloudAccountRoleAccessCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainCloudAccountRoleAccessCredentialResponseBody</p>
     */
    public static class AwsStsToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("secretAccessKey")
        private String secretAccessKey;

        @com.aliyun.core.annotation.NameInMap("sessionToken")
        private String sessionToken;

        private AwsStsToken(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.expiration = builder.expiration;
            this.secretAccessKey = builder.secretAccessKey;
            this.sessionToken = builder.sessionToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AwsStsToken create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return secretAccessKey
         */
        public String getSecretAccessKey() {
            return this.secretAccessKey;
        }

        /**
         * @return sessionToken
         */
        public String getSessionToken() {
            return this.sessionToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String expiration; 
            private String secretAccessKey; 
            private String sessionToken; 

            private Builder() {
            } 

            private Builder(AwsStsToken model) {
                this.accessKeyId = model.accessKeyId;
                this.expiration = model.expiration;
                this.secretAccessKey = model.secretAccessKey;
                this.sessionToken = model.sessionToken;
            } 

            /**
             * accessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * secretAccessKey.
             */
            public Builder secretAccessKey(String secretAccessKey) {
                this.secretAccessKey = secretAccessKey;
                return this;
            }

            /**
             * sessionToken.
             */
            public Builder sessionToken(String sessionToken) {
                this.sessionToken = sessionToken;
                return this;
            }

            public AwsStsToken build() {
                return new AwsStsToken(this);
            } 

        } 

    }
    /**
     * 
     * {@link ObtainCloudAccountRoleAccessCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainCloudAccountRoleAccessCredentialResponseBody</p>
     */
    public static class CloudAccountRoleAccessCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessCredentialExpiresAt")
        private Long accessCredentialExpiresAt;

        @com.aliyun.core.annotation.NameInMap("alibabaCloudStsToken")
        private AlibabaCloudStsToken alibabaCloudStsToken;

        @com.aliyun.core.annotation.NameInMap("awsStsToken")
        private AwsStsToken awsStsToken;

        private CloudAccountRoleAccessCredential(Builder builder) {
            this.accessCredentialExpiresAt = builder.accessCredentialExpiresAt;
            this.alibabaCloudStsToken = builder.alibabaCloudStsToken;
            this.awsStsToken = builder.awsStsToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountRoleAccessCredential create() {
            return builder().build();
        }

        /**
         * @return accessCredentialExpiresAt
         */
        public Long getAccessCredentialExpiresAt() {
            return this.accessCredentialExpiresAt;
        }

        /**
         * @return alibabaCloudStsToken
         */
        public AlibabaCloudStsToken getAlibabaCloudStsToken() {
            return this.alibabaCloudStsToken;
        }

        /**
         * @return awsStsToken
         */
        public AwsStsToken getAwsStsToken() {
            return this.awsStsToken;
        }

        public static final class Builder {
            private Long accessCredentialExpiresAt; 
            private AlibabaCloudStsToken alibabaCloudStsToken; 
            private AwsStsToken awsStsToken; 

            private Builder() {
            } 

            private Builder(CloudAccountRoleAccessCredential model) {
                this.accessCredentialExpiresAt = model.accessCredentialExpiresAt;
                this.alibabaCloudStsToken = model.alibabaCloudStsToken;
                this.awsStsToken = model.awsStsToken;
            } 

            /**
             * accessCredentialExpiresAt.
             */
            public Builder accessCredentialExpiresAt(Long accessCredentialExpiresAt) {
                this.accessCredentialExpiresAt = accessCredentialExpiresAt;
                return this;
            }

            /**
             * alibabaCloudStsToken.
             */
            public Builder alibabaCloudStsToken(AlibabaCloudStsToken alibabaCloudStsToken) {
                this.alibabaCloudStsToken = alibabaCloudStsToken;
                return this;
            }

            /**
             * awsStsToken.
             */
            public Builder awsStsToken(AwsStsToken awsStsToken) {
                this.awsStsToken = awsStsToken;
                return this;
            }

            public CloudAccountRoleAccessCredential build() {
                return new CloudAccountRoleAccessCredential(this);
            } 

        } 

    }
}
