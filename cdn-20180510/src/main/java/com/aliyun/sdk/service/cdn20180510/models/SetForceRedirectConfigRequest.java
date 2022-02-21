// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetForceRedirectConfigRequest} extends {@link RequestModel}
 *
 * <p>SetForceRedirectConfigRequest</p>
 */
public class SetForceRedirectConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RedirectType")
    @Validation(required = true)
    private String redirectType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetForceRedirectConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.redirectType = builder.redirectType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetForceRedirectConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return redirectType
     */
    public String getRedirectType() {
        return this.redirectType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetForceRedirectConfigRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String redirectType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetForceRedirectConfigRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.redirectType = response.redirectType;
            this.securityToken = response.securityToken;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
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
         * RedirectType.
         */
        public Builder redirectType(String redirectType) {
            this.putQueryParameter("RedirectType", redirectType);
            this.redirectType = redirectType;
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
        public SetForceRedirectConfigRequest build() {
            return new SetForceRedirectConfigRequest(this);
        } 

    } 

}
