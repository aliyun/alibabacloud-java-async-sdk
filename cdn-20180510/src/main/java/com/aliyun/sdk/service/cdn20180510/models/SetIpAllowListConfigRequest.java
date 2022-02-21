// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIpAllowListConfigRequest} extends {@link RequestModel}
 *
 * <p>SetIpAllowListConfigRequest</p>
 */
public class SetIpAllowListConfigRequest extends Request {
    @Query
    @NameInMap("AllowIps")
    @Validation(required = true)
    private String allowIps;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetIpAllowListConfigRequest(Builder builder) {
        super(builder);
        this.allowIps = builder.allowIps;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIpAllowListConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowIps
     */
    public String getAllowIps() {
        return this.allowIps;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetIpAllowListConfigRequest, Builder> {
        private String allowIps; 
        private String domainName; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetIpAllowListConfigRequest response) {
            super(response);
            this.allowIps = response.allowIps;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
        } 

        /**
         * AllowIps.
         */
        public Builder allowIps(String allowIps) {
            this.putQueryParameter("AllowIps", allowIps);
            this.allowIps = allowIps;
            return this;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SetIpAllowListConfigRequest build() {
            return new SetIpAllowListConfigRequest(this);
        } 

    } 

}
