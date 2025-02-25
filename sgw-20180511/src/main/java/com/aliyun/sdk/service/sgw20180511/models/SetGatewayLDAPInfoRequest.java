// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGatewayLDAPInfoRequest} extends {@link RequestModel}
 *
 * <p>SetGatewayLDAPInfoRequest</p>
 */
public class SetGatewayLDAPInfoRequest extends Request {
    @Query
    @NameInMap("BaseDN")
    private String baseDN;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @Query
    @NameInMap("IsTls")
    private Boolean isTls;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RootDN")
    private String rootDN;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ServerIp")
    private String serverIp;

    private SetGatewayLDAPInfoRequest(Builder builder) {
        super(builder);
        this.baseDN = builder.baseDN;
        this.gatewayId = builder.gatewayId;
        this.isEnabled = builder.isEnabled;
        this.isTls = builder.isTls;
        this.password = builder.password;
        this.rootDN = builder.rootDN;
        this.securityToken = builder.securityToken;
        this.serverIp = builder.serverIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGatewayLDAPInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseDN
     */
    public String getBaseDN() {
        return this.baseDN;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return isTls
     */
    public Boolean getIsTls() {
        return this.isTls;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return rootDN
     */
    public String getRootDN() {
        return this.rootDN;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return serverIp
     */
    public String getServerIp() {
        return this.serverIp;
    }

    public static final class Builder extends Request.Builder<SetGatewayLDAPInfoRequest, Builder> {
        private String baseDN; 
        private String gatewayId; 
        private Boolean isEnabled; 
        private Boolean isTls; 
        private String password; 
        private String rootDN; 
        private String securityToken; 
        private String serverIp; 

        private Builder() {
            super();
        } 

        private Builder(SetGatewayLDAPInfoRequest request) {
            super(request);
            this.baseDN = request.baseDN;
            this.gatewayId = request.gatewayId;
            this.isEnabled = request.isEnabled;
            this.isTls = request.isTls;
            this.password = request.password;
            this.rootDN = request.rootDN;
            this.securityToken = request.securityToken;
            this.serverIp = request.serverIp;
        } 

        /**
         * BaseDN.
         */
        public Builder baseDN(String baseDN) {
            this.putQueryParameter("BaseDN", baseDN);
            this.baseDN = baseDN;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IsEnabled.
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.putQueryParameter("IsEnabled", isEnabled);
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * IsTls.
         */
        public Builder isTls(Boolean isTls) {
            this.putQueryParameter("IsTls", isTls);
            this.isTls = isTls;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RootDN.
         */
        public Builder rootDN(String rootDN) {
            this.putQueryParameter("RootDN", rootDN);
            this.rootDN = rootDN;
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

        /**
         * ServerIp.
         */
        public Builder serverIp(String serverIp) {
            this.putQueryParameter("ServerIp", serverIp);
            this.serverIp = serverIp;
            return this;
        }

        @Override
        public SetGatewayLDAPInfoRequest build() {
            return new SetGatewayLDAPInfoRequest(this);
        } 

    } 

}
