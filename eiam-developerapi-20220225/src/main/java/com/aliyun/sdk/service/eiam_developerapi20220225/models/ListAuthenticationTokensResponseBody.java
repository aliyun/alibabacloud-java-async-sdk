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
 * {@link ListAuthenticationTokensResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthenticationTokensResponseBody</p>
 */
public class ListAuthenticationTokensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("entities")
    private java.util.List<Entities> entities;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListAuthenticationTokensResponseBody(Builder builder) {
        this.entities = builder.entities;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthenticationTokensResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entities
     */
    public java.util.List<Entities> getEntities() {
        return this.entities;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Entities> entities; 
        private Long maxResults; 
        private String nextToken; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAuthenticationTokensResponseBody model) {
            this.entities = model.entities;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of resource entities.</p>
         */
        public Builder entities(java.util.List<Entities> entities) {
            this.entities = entities;
            return this;
        }

        /**
         * <p>Maximum number of records returned in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Token returned by this call. Use it for the next paged query to get the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Total number of resource entities that match the query criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthenticationTokensResponseBody build() {
            return new ListAuthenticationTokensResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthenticationTokensResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthenticationTokensResponseBody</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authenticationTokenId")
        private String authenticationTokenId;

        @com.aliyun.core.annotation.NameInMap("authenticationTokenType")
        private String authenticationTokenType;

        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("consumerType")
        private String consumerType;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("creatorType")
        private String creatorType;

        @com.aliyun.core.annotation.NameInMap("credentialProviderId")
        private String credentialProviderId;

        @com.aliyun.core.annotation.NameInMap("expirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("revoked")
        private Boolean revoked;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Entities(Builder builder) {
            this.authenticationTokenId = builder.authenticationTokenId;
            this.authenticationTokenType = builder.authenticationTokenType;
            this.consumerId = builder.consumerId;
            this.consumerType = builder.consumerType;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.creatorType = builder.creatorType;
            this.credentialProviderId = builder.credentialProviderId;
            this.expirationTime = builder.expirationTime;
            this.instanceId = builder.instanceId;
            this.revoked = builder.revoked;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return authenticationTokenId
         */
        public String getAuthenticationTokenId() {
            return this.authenticationTokenId;
        }

        /**
         * @return authenticationTokenType
         */
        public String getAuthenticationTokenType() {
            return this.authenticationTokenType;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return consumerType
         */
        public String getConsumerType() {
            return this.consumerType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorType
         */
        public String getCreatorType() {
            return this.creatorType;
        }

        /**
         * @return credentialProviderId
         */
        public String getCredentialProviderId() {
            return this.credentialProviderId;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return revoked
         */
        public Boolean getRevoked() {
            return this.revoked;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String authenticationTokenId; 
            private String authenticationTokenType; 
            private String consumerId; 
            private String consumerType; 
            private Long createTime; 
            private String creatorId; 
            private String creatorType; 
            private String credentialProviderId; 
            private Long expirationTime; 
            private String instanceId; 
            private Boolean revoked; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Entities model) {
                this.authenticationTokenId = model.authenticationTokenId;
                this.authenticationTokenType = model.authenticationTokenType;
                this.consumerId = model.consumerId;
                this.consumerType = model.consumerType;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.creatorType = model.creatorType;
                this.credentialProviderId = model.credentialProviderId;
                this.expirationTime = model.expirationTime;
                this.instanceId = model.instanceId;
                this.revoked = model.revoked;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Authentication token ID.</p>
             * 
             * <strong>example:</strong>
             * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
             */
            public Builder authenticationTokenId(String authenticationTokenId) {
                this.authenticationTokenId = authenticationTokenId;
                return this;
            }

            /**
             * <p>Authentication token type. Valid values:</p>
             * <ul>
             * <li><p>jwt: JWT authentication token</p>
             * </li>
             * <li><p>oauth_access_token: OAuth Access Token authentication token</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>jwt</p>
             */
            public Builder authenticationTokenType(String authenticationTokenType) {
                this.authenticationTokenType = authenticationTokenType;
                return this;
            }

            /**
             * <p>ID of the authentication token consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>test_jwt_subject</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>Type of the authentication token consumer. Valid values:</p>
             * <ul>
             * <li><p>application: Application</p>
             * </li>
             * <li><p>custom: Custom type</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder consumerType(String consumerType) {
                this.consumerType = consumerType;
                return this;
            }

            /**
             * <p>Creation time of the authentication token, as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>ID of the authentication token creator.</p>
             * 
             * <strong>example:</strong>
             * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>Type of the authentication token creator. Valid values:</p>
             * <ul>
             * <li>application: Application</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>application</p>
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            /**
             * <p>Credential provider ID.</p>
             * 
             * <strong>example:</strong>
             * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
             */
            public Builder credentialProviderId(String credentialProviderId) {
                this.credentialProviderId = credentialProviderId;
                return this;
            }

            /**
             * <p>Expiration time of the authentication token, as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1772693568000</p>
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the authentication token is revoked.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder revoked(Boolean revoked) {
                this.revoked = revoked;
                return this;
            }

            /**
             * <p>Last update time of the authentication token, as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
}
