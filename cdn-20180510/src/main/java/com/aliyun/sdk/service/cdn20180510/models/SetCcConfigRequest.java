// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCcConfigRequest} extends {@link RequestModel}
 *
 * <p>SetCcConfigRequest</p>
 */
public class SetCcConfigRequest extends Request {
    @Query
    @NameInMap("AllowIps")
    private String allowIps;

    @Query
    @NameInMap("BlockIps")
    private String blockIps;

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

    private SetCcConfigRequest(Builder builder) {
        super(builder);
        this.allowIps = builder.allowIps;
        this.blockIps = builder.blockIps;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCcConfigRequest create() {
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
     * @return blockIps
     */
    public String getBlockIps() {
        return this.blockIps;
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

    public static final class Builder extends Request.Builder<SetCcConfigRequest, Builder> {
        private String allowIps; 
        private String blockIps; 
        private String domainName; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetCcConfigRequest response) {
            super(response);
            this.allowIps = response.allowIps;
            this.blockIps = response.blockIps;
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
         * BlockIps.
         */
        public Builder blockIps(String blockIps) {
            this.putQueryParameter("BlockIps", blockIps);
            this.blockIps = blockIps;
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
        public SetCcConfigRequest build() {
            return new SetCcConfigRequest(this);
        } 

    } 

}
