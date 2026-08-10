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
 * {@link ListContextDatabaseMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseMembersResponseBody</p>
 */
public class ListContextDatabaseMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListContextDatabaseMembersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.members = builder.members;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextDatabaseMembersResponseBody create() {
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
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
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
        private Integer maxResults; 
        private java.util.List<Members> members; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListContextDatabaseMembersResponseBody model) {
            this.maxResults = model.maxResults;
            this.members = model.members;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Members.
         */
        public Builder members(java.util.List<Members> members) {
            this.members = members;
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

        public ListContextDatabaseMembersResponseBody build() {
            return new ListContextDatabaseMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseMembersResponseBody</p>
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
    /**
     * 
     * {@link ListContextDatabaseMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseMembersResponseBody</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private java.util.List<Keys> keys;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Members(Builder builder) {
            this.createdAt = builder.createdAt;
            this.keys = builder.keys;
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
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
            private String role; 
            private String status; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.createdAt = model.createdAt;
                this.keys = model.keys;
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.role = model.role;
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
             * Keys.
             */
            public Builder keys(java.util.List<Keys> keys) {
                this.keys = keys;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
