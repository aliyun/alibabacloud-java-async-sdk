// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyInstanceLDAPAuthServerRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceLDAPAuthServerRequest</p>
 */
public class ModifyInstanceLDAPAuthServerRequest extends Request {
    @Query
    @NameInMap("Account")
    private String account;

    @Query
    @NameInMap("BaseDN")
    private String baseDN;

    @Query
    @NameInMap("EmailMapping")
    private String emailMapping;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("IsSSL")
    private String isSSL;

    @Query
    @NameInMap("LoginNameMapping")
    private String loginNameMapping;

    @Query
    @NameInMap("MobileMapping")
    private String mobileMapping;

    @Query
    @NameInMap("NameMapping")
    private String nameMapping;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Server")
    private String server;

    @Query
    @NameInMap("StandbyServer")
    private String standbyServer;


    private ModifyInstanceLDAPAuthServerRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.baseDN = builder.baseDN;
        this.emailMapping = builder.emailMapping;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.isSSL = builder.isSSL;
        this.loginNameMapping = builder.loginNameMapping;
        this.mobileMapping = builder.mobileMapping;
        this.nameMapping = builder.nameMapping;
        this.password = builder.password;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.server = builder.server;
        this.standbyServer = builder.standbyServer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceLDAPAuthServerRequest create() {
        return builder().build();
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return baseDN
     */
    public String getBaseDN() {
        return this.baseDN;
    }

    /**
     * @return emailMapping
     */
    public String getEmailMapping() {
        return this.emailMapping;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSSL
     */
    public String getIsSSL() {
        return this.isSSL;
    }

    /**
     * @return loginNameMapping
     */
    public String getLoginNameMapping() {
        return this.loginNameMapping;
    }

    /**
     * @return mobileMapping
     */
    public String getMobileMapping() {
        return this.mobileMapping;
    }

    /**
     * @return nameMapping
     */
    public String getNameMapping() {
        return this.nameMapping;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return server
     */
    public String getServer() {
        return this.server;
    }

    /**
     * @return standbyServer
     */
    public String getStandbyServer() {
        return this.standbyServer;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String account; 
        private String baseDN; 
        private String emailMapping; 
        private String filter; 
        private String instanceId; 
        private String isSSL; 
        private String loginNameMapping; 
        private String mobileMapping; 
        private String nameMapping; 
        private String password; 
        private String port; 
        private String regionId; 
        private String server; 
        private String standbyServer; 

        /**
         * <p>Account.</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>BaseDN.</p>
         */
        public Builder baseDN(String baseDN) {
            this.putQueryParameter("BaseDN", baseDN);
            this.baseDN = baseDN;
            return this;
        }

        /**
         * <p>EmailMapping.</p>
         */
        public Builder emailMapping(String emailMapping) {
            this.putQueryParameter("EmailMapping", emailMapping);
            this.emailMapping = emailMapping;
            return this;
        }

        /**
         * <p>Filter.</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>IsSSL.</p>
         */
        public Builder isSSL(String isSSL) {
            this.putQueryParameter("IsSSL", isSSL);
            this.isSSL = isSSL;
            return this;
        }

        /**
         * <p>LoginNameMapping.</p>
         */
        public Builder loginNameMapping(String loginNameMapping) {
            this.putQueryParameter("LoginNameMapping", loginNameMapping);
            this.loginNameMapping = loginNameMapping;
            return this;
        }

        /**
         * <p>MobileMapping.</p>
         */
        public Builder mobileMapping(String mobileMapping) {
            this.putQueryParameter("MobileMapping", mobileMapping);
            this.mobileMapping = mobileMapping;
            return this;
        }

        /**
         * <p>NameMapping.</p>
         */
        public Builder nameMapping(String nameMapping) {
            this.putQueryParameter("NameMapping", nameMapping);
            this.nameMapping = nameMapping;
            return this;
        }

        /**
         * <p>Password.</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Port.</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Server.</p>
         */
        public Builder server(String server) {
            this.putQueryParameter("Server", server);
            this.server = server;
            return this;
        }

        /**
         * <p>StandbyServer.</p>
         */
        public Builder standbyServer(String standbyServer) {
            this.putQueryParameter("StandbyServer", standbyServer);
            this.standbyServer = standbyServer;
            return this;
        }

        public ModifyInstanceLDAPAuthServerRequest build() {
            return new ModifyInstanceLDAPAuthServerRequest(this);
        } 

    } 

}
