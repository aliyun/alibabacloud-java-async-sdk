// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateTokenVaultResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTokenVaultResponseBody</p>
 */
public class CreateTokenVaultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenVault")
    private TokenVault tokenVault;

    private CreateTokenVaultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tokenVault = builder.tokenVault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTokenVaultResponseBody create() {
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
     * @return tokenVault
     */
    public TokenVault getTokenVault() {
        return this.tokenVault;
    }

    public static final class Builder {
        private String requestId; 
        private TokenVault tokenVault; 

        private Builder() {
        } 

        private Builder(CreateTokenVaultResponseBody model) {
            this.requestId = model.requestId;
            this.tokenVault = model.tokenVault;
        } 

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the token vault.</p>
         */
        public Builder tokenVault(TokenVault tokenVault) {
            this.tokenVault = tokenVault;
            return this;
        }

        public CreateTokenVaultResponseBody build() {
            return new CreateTokenVaultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTokenVaultResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTokenVaultResponseBody</p>
     */
    public static class EncryptionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("KmsKeyArn")
        private String kmsKeyArn;

        private EncryptionConfig(Builder builder) {
            this.keyType = builder.keyType;
            this.kmsKeyArn = builder.kmsKeyArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptionConfig create() {
            return builder().build();
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        /**
         * @return kmsKeyArn
         */
        public String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        public static final class Builder {
            private String keyType; 
            private String kmsKeyArn; 

            private Builder() {
            } 

            private Builder(EncryptionConfig model) {
                this.keyType = model.keyType;
                this.kmsKeyArn = model.kmsKeyArn;
            } 

            /**
             * <p>The type of the encryption key. Valid values:</p>
             * <ul>
             * <li>SERVICE_MANAGED_KEY: service-managed key</li>
             * <li>CUSTOMER_MANAGED_KEY: customer-managed KMS key</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SERVICE_MANAGED_KEY</p>
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * <p>The ARN of the KMS key used when KeyType is set to CUSTOMER_MANAGED_KEY.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:kms:cn-beijing:123456:key/key-bjxxxxxxxx</p>
             */
            public Builder kmsKeyArn(String kmsKeyArn) {
                this.kmsKeyArn = kmsKeyArn;
                return this;
            }

            public EncryptionConfig build() {
                return new EncryptionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTokenVaultResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTokenVaultResponseBody</p>
     */
    public static class TokenVault extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptionConfig")
        private EncryptionConfig encryptionConfig;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("TokenVaultArn")
        private String tokenVaultArn;

        @com.aliyun.core.annotation.NameInMap("TokenVaultName")
        private String tokenVaultName;

        private TokenVault(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.encryptionConfig = builder.encryptionConfig;
            this.roleArn = builder.roleArn;
            this.tokenVaultArn = builder.tokenVaultArn;
            this.tokenVaultName = builder.tokenVaultName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenVault create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encryptionConfig
         */
        public EncryptionConfig getEncryptionConfig() {
            return this.encryptionConfig;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return tokenVaultArn
         */
        public String getTokenVaultArn() {
            return this.tokenVaultArn;
        }

        /**
         * @return tokenVaultName
         */
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private EncryptionConfig encryptionConfig; 
            private String roleArn; 
            private String tokenVaultArn; 
            private String tokenVaultName; 

            private Builder() {
            } 

            private Builder(TokenVault model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.encryptionConfig = model.encryptionConfig;
                this.roleArn = model.roleArn;
                this.tokenVaultArn = model.tokenVaultArn;
                this.tokenVaultName = model.tokenVaultName;
            } 

            /**
             * <p>The time when the token vault was created, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-08T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the token vault.</p>
             * 
             * <strong>example:</strong>
             * <p>example description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The encryption configuration of the token vault.</p>
             */
            public Builder encryptionConfig(EncryptionConfig encryptionConfig) {
                this.encryptionConfig = encryptionConfig;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role used to authorize the AgentIdentity service to access other cloud resources such as KMS.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456:role/AliyunAgentIdentityVaultRole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The ARN of the token vault.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default</p>
             */
            public Builder tokenVaultArn(String tokenVaultArn) {
                this.tokenVaultArn = tokenVaultArn;
                return this;
            }

            /**
             * <p>The name of the token vault. The name must be unique within the current Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder tokenVaultName(String tokenVaultName) {
                this.tokenVaultName = tokenVaultName;
                return this;
            }

            public TokenVault build() {
                return new TokenVault(this);
            } 

        } 

    }
}
