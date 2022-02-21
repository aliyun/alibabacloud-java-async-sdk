// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSourceHostConfigRequest} extends {@link RequestModel}
 *
 * <p>SetSourceHostConfigRequest</p>
 */
public class SetSourceHostConfigRequest extends Request {
    @Query
    @NameInMap("BackSrcDomain")
    private String backSrcDomain;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Enable")
    private String enable;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetSourceHostConfigRequest(Builder builder) {
        super(builder);
        this.backSrcDomain = builder.backSrcDomain;
        this.domainName = builder.domainName;
        this.enable = builder.enable;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSourceHostConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backSrcDomain
     */
    public String getBackSrcDomain() {
        return this.backSrcDomain;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
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

    public static final class Builder extends Request.Builder<SetSourceHostConfigRequest, Builder> {
        private String backSrcDomain; 
        private String domainName; 
        private String enable; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetSourceHostConfigRequest response) {
            super(response);
            this.backSrcDomain = response.backSrcDomain;
            this.domainName = response.domainName;
            this.enable = response.enable;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
        } 

        /**
         * BackSrcDomain.
         */
        public Builder backSrcDomain(String backSrcDomain) {
            this.putQueryParameter("BackSrcDomain", backSrcDomain);
            this.backSrcDomain = backSrcDomain;
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
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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
        public SetSourceHostConfigRequest build() {
            return new SetSourceHostConfigRequest(this);
        } 

    } 

}
