// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListContextDatabaseApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseApiKeysResponseBody</p>
 */
public class ListContextDatabaseApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List<Keys> keys;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListContextDatabaseApiKeysResponseBody(Builder builder) {
        this.keys = builder.keys;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextDatabaseApiKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keys
     */
    public java.util.List<Keys> getKeys() {
        return this.keys;
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

    public static final class Builder {
        private java.util.List<Keys> keys; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListContextDatabaseApiKeysResponseBody model) {
            this.keys = model.keys;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Keys.
         */
        public Builder keys(java.util.List<Keys> keys) {
            this.keys = keys;
            return this;
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

        public ListContextDatabaseApiKeysResponseBody build() {
            return new ListContextDatabaseApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseApiKeysResponseBody</p>
     */
    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("KeyDisplaySuffix")
        private String keyDisplaySuffix;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private Long keyId;

        @com.aliyun.core.annotation.NameInMap("KeyPrefix")
        private String keyPrefix;

        @com.aliyun.core.annotation.NameInMap("LastUsedAt")
        private String lastUsedAt;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RevokedAt")
        private String revokedAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Keys(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.expiresAt = builder.expiresAt;
            this.keyDisplaySuffix = builder.keyDisplaySuffix;
            this.keyId = builder.keyId;
            this.keyPrefix = builder.keyPrefix;
            this.lastUsedAt = builder.lastUsedAt;
            this.name = builder.name;
            this.revokedAt = builder.revokedAt;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return keyDisplaySuffix
         */
        public String getKeyDisplaySuffix() {
            return this.keyDisplaySuffix;
        }

        /**
         * @return keyId
         */
        public Long getKeyId() {
            return this.keyId;
        }

        /**
         * @return keyPrefix
         */
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        /**
         * @return lastUsedAt
         */
        public String getLastUsedAt() {
            return this.lastUsedAt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return revokedAt
         */
        public String getRevokedAt() {
            return this.revokedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private String expiresAt; 
            private String keyDisplaySuffix; 
            private Long keyId; 
            private String keyPrefix; 
            private String lastUsedAt; 
            private String name; 
            private String revokedAt; 
            private String status; 

            private Builder() {
            } 

            private Builder(Keys model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.expiresAt = model.expiresAt;
                this.keyDisplaySuffix = model.keyDisplaySuffix;
                this.keyId = model.keyId;
                this.keyPrefix = model.keyPrefix;
                this.lastUsedAt = model.lastUsedAt;
                this.name = model.name;
                this.revokedAt = model.revokedAt;
                this.status = model.status;
            } 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
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
             * ExpiresAt.
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * KeyDisplaySuffix.
             */
            public Builder keyDisplaySuffix(String keyDisplaySuffix) {
                this.keyDisplaySuffix = keyDisplaySuffix;
                return this;
            }

            /**
             * KeyId.
             */
            public Builder keyId(Long keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * KeyPrefix.
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            /**
             * LastUsedAt.
             */
            public Builder lastUsedAt(String lastUsedAt) {
                this.lastUsedAt = lastUsedAt;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RevokedAt.
             */
            public Builder revokedAt(String revokedAt) {
                this.revokedAt = revokedAt;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
}
