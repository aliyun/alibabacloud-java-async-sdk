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
 * {@link ListTokenVaultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTokenVaultsResponseBody</p>
 */
public class ListTokenVaultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenVaults")
    private java.util.List<TokenVaults> tokenVaults;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTokenVaultsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tokenVaults = builder.tokenVaults;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTokenVaultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenVaults
     */
    public java.util.List<TokenVaults> getTokenVaults() {
        return this.tokenVaults;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<TokenVaults> tokenVaults; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTokenVaultsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.tokenVaults = model.tokenVaults;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TokenVaults.
         */
        public Builder tokenVaults(java.util.List<TokenVaults> tokenVaults) {
            this.tokenVaults = tokenVaults;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTokenVaultsResponseBody build() {
            return new ListTokenVaultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTokenVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTokenVaultsResponseBody</p>
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
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * KmsKeyArn.
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
     * {@link ListTokenVaultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTokenVaultsResponseBody</p>
     */
    public static class TokenVaults extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TokenVaults(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.encryptionConfig = builder.encryptionConfig;
            this.roleArn = builder.roleArn;
            this.tokenVaultArn = builder.tokenVaultArn;
            this.tokenVaultName = builder.tokenVaultName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenVaults create() {
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

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private EncryptionConfig encryptionConfig; 
            private String roleArn; 
            private String tokenVaultArn; 
            private String tokenVaultName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(TokenVaults model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.encryptionConfig = model.encryptionConfig;
                this.roleArn = model.roleArn;
                this.tokenVaultArn = model.tokenVaultArn;
                this.tokenVaultName = model.tokenVaultName;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EncryptionConfig.
             */
            public Builder encryptionConfig(EncryptionConfig encryptionConfig) {
                this.encryptionConfig = encryptionConfig;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * TokenVaultArn.
             */
            public Builder tokenVaultArn(String tokenVaultArn) {
                this.tokenVaultArn = tokenVaultArn;
                return this;
            }

            /**
             * TokenVaultName.
             */
            public Builder tokenVaultName(String tokenVaultName) {
                this.tokenVaultName = tokenVaultName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TokenVaults build() {
                return new TokenVaults(this);
            } 

        } 

    }
}
