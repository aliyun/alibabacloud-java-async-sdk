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
 * {@link RevokeContextDatabaseApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>RevokeContextDatabaseApiKeyResponseBody</p>
 */
public class RevokeContextDatabaseApiKeyResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RevokedAt")
    private String revokedAt;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private RevokeContextDatabaseApiKeyResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.expiresAt = builder.expiresAt;
        this.keyDisplaySuffix = builder.keyDisplaySuffix;
        this.keyId = builder.keyId;
        this.keyPrefix = builder.keyPrefix;
        this.lastUsedAt = builder.lastUsedAt;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.revokedAt = builder.revokedAt;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeContextDatabaseApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private String revokedAt; 
        private String status; 

        private Builder() {
        } 

        private Builder(RevokeContextDatabaseApiKeyResponseBody model) {
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.expiresAt = model.expiresAt;
            this.keyDisplaySuffix = model.keyDisplaySuffix;
            this.keyId = model.keyId;
            this.keyPrefix = model.keyPrefix;
            this.lastUsedAt = model.lastUsedAt;
            this.name = model.name;
            this.requestId = model.requestId;
            this.revokedAt = model.revokedAt;
            this.status = model.status;
        } 

        /**
         * <p>The time when the API key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The description of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>for nightly cron</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>A reserved field. This field is currently empty.</p>
         * 
         * <strong>example:</strong>
         * <p>(null)</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The suffix of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>33631c</p>
         */
        public Builder keyDisplaySuffix(String keyDisplaySuffix) {
            this.keyDisplaySuffix = keyDisplaySuffix;
            return this;
        }

        /**
         * <p>The key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder keyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The prefix of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>ctxdb-</p>
         */
        public Builder keyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }

        /**
         * <p>The time when the API key was last used.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T08:30:12Z</p>
         */
        public Builder lastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }

        /**
         * <p>The name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>my-key</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the API key was revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-07T10:15:30Z</p>
         */
        public Builder revokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }

        /**
         * <p>The status of the API key. After revocation, the value is revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>revoked</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public RevokeContextDatabaseApiKeyResponseBody build() {
            return new RevokeContextDatabaseApiKeyResponseBody(this);
        } 

    } 

}
