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
 * {@link ListAuthenticationTokensRequest} extends {@link RequestModel}
 *
 * <p>ListAuthenticationTokensRequest</p>
 */
public class ListAuthenticationTokensRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("credentialProviderIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialProviderIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expired")
    private Boolean expired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("revoked")
    private Boolean revoked;

    private ListAuthenticationTokensRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.consumerId = builder.consumerId;
        this.credentialProviderIdentifier = builder.credentialProviderIdentifier;
        this.expired = builder.expired;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.revoked = builder.revoked;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthenticationTokensRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return credentialProviderIdentifier
     */
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
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
     * @return revoked
     */
    public Boolean getRevoked() {
        return this.revoked;
    }

    public static final class Builder extends Request.Builder<ListAuthenticationTokensRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorization; 
        private String consumerId; 
        private String credentialProviderIdentifier; 
        private Boolean expired; 
        private Long maxResults; 
        private String nextToken; 
        private Boolean revoked; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthenticationTokensRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.consumerId = request.consumerId;
            this.credentialProviderIdentifier = request.credentialProviderIdentifier;
            this.expired = request.expired;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.revoked = request.revoked;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer xxxxxx</p>
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_identifier</p>
         */
        public Builder credentialProviderIdentifier(String credentialProviderIdentifier) {
            this.putQueryParameter("credentialProviderIdentifier", credentialProviderIdentifier);
            this.credentialProviderIdentifier = credentialProviderIdentifier;
            return this;
        }

        /**
         * expired.
         */
        public Builder expired(Boolean expired) {
            this.putQueryParameter("expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * revoked.
         */
        public Builder revoked(Boolean revoked) {
            this.putQueryParameter("revoked", revoked);
            this.revoked = revoked;
            return this;
        }

        @Override
        public ListAuthenticationTokensRequest build() {
            return new ListAuthenticationTokensRequest(this);
        } 

    } 

}
