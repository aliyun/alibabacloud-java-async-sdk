// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveDomainMappingRequest} extends {@link RequestModel}
 *
 * <p>AddLiveDomainMappingRequest</p>
 */
public class AddLiveDomainMappingRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PullDomain")
    @Validation(required = true)
    private String pullDomain;

    @Query
    @NameInMap("PushDomain")
    @Validation(required = true)
    private String pushDomain;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private AddLiveDomainMappingRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pullDomain = builder.pullDomain;
        this.pushDomain = builder.pushDomain;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveDomainMappingRequest create() {
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

    public static final class Builder extends Request.Builder<AddLiveDomainMappingRequest, Builder> {
        private Long ownerId; 
        private String pullDomain; 
        private String pushDomain; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveDomainMappingRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.pullDomain = response.pullDomain;
            this.pushDomain = response.pushDomain;
            this.securityToken = response.securityToken;
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
         * PullDomain.
         */
        public Builder pullDomain(String pullDomain) {
            this.putQueryParameter("PullDomain", pullDomain);
            this.pullDomain = pullDomain;
            return this;
        }

        /**
         * PushDomain.
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
        public AddLiveDomainMappingRequest build() {
            return new AddLiveDomainMappingRequest(this);
        } 

    } 

}
