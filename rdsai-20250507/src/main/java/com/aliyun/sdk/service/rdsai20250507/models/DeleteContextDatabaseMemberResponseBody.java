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
 * {@link DeleteContextDatabaseMemberResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteContextDatabaseMemberResponseBody</p>
 */
public class DeleteContextDatabaseMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List<Keys> keys;

    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.NameInMap("MemberName")
    private String memberName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DeleteContextDatabaseMemberResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.keys = builder.keys;
        this.memberId = builder.memberId;
        this.memberName = builder.memberName;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextDatabaseMemberResponseBody create() {
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
     * @return keys
     */
    public java.util.List<Keys> getKeys() {
        return this.keys;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String createdAt; 
        private java.util.List<Keys> keys; 
        private String memberId; 
        private String memberName; 
        private String requestId; 
        private String role; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteContextDatabaseMemberResponseBody model) {
            this.createdAt = model.createdAt;
            this.keys = model.keys;
            this.memberId = model.memberId;
            this.memberName = model.memberName;
            this.requestId = model.requestId;
            this.role = model.role;
            this.status = model.status;
        } 

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The API key details. An empty array is returned.</p>
         */
        public Builder keys(java.util.List<Keys> keys) {
            this.keys = keys;
            return this;
        }

        /**
         * <p>The member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mb-cz51tnnp8****</p>
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The member name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder memberName(String memberName) {
            this.memberName = memberName;
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
         * <p>The member role.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The member status.</p>
         * 
         * <strong>example:</strong>
         * <p>deleted</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteContextDatabaseMemberResponseBody build() {
            return new DeleteContextDatabaseMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteContextDatabaseMemberResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteContextDatabaseMemberResponseBody</p>
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
             * <p>The creation time. This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The API key description. This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The API key suffix. This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder keyDisplaySuffix(String keyDisplaySuffix) {
                this.keyDisplaySuffix = keyDisplaySuffix;
                return this;
            }

            /**
             * <p>The key ID. This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder keyId(Long keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The API key prefix. This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            /**
             * <p>This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder lastUsedAt(String lastUsedAt) {
                this.lastUsedAt = lastUsedAt;
                return this;
            }

            /**
             * <p>The API key name. This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
             */
            public Builder revokedAt(String revokedAt) {
                this.revokedAt = revokedAt;
                return this;
            }

            /**
             * <p>The API key status. This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>(null)</p>
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
