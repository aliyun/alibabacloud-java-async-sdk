// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteLiveDomainMappingRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveDomainMappingRequest</p>
 */
public class DeleteLiveDomainMappingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pullDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DeleteLiveDomainMappingRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pullDomain = builder.pullDomain;
        this.pushDomain = builder.pushDomain;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveDomainMappingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pullDomain
     */
    public String getPullDomain() {
        return this.pullDomain;
    }

    /**
     * @return pushDomain
     */
    public String getPushDomain() {
        return this.pushDomain;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteLiveDomainMappingRequest, Builder> {
        private Long ownerId; 
        private String pullDomain; 
        private String pushDomain; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveDomainMappingRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.pullDomain = request.pullDomain;
            this.pushDomain = request.pushDomain;
            this.securityToken = request.securityToken;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The streaming domain. The type of the domain name is <strong>liveVideo</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder pullDomain(String pullDomain) {
            this.putQueryParameter("PullDomain", pullDomain);
            this.pullDomain = pullDomain;
            return this;
        }

        /**
         * <p>The ingest domain. The type of the domain name is <strong>liveEdge</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder pushDomain(String pushDomain) {
            this.putQueryParameter("PushDomain", pushDomain);
            this.pushDomain = pushDomain;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DeleteLiveDomainMappingRequest build() {
            return new DeleteLiveDomainMappingRequest(this);
        } 

    } 

}
