// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceADAuthServerRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceADAuthServerRequest</p>
 */
public class ModifyInstanceADAuthServerRequest extends Request {
    @Query
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Query
    @NameInMap("BaseDN")
    @Validation(required = true)
    private String baseDN;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("EmailMapping")
    private String emailMapping;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsSSL")
    @Validation(required = true)
    private String isSSL;

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
    @Validation(required = true)
    private String port;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Server")
    @Validation(required = true)
    private String server;

    @Query
    @NameInMap("StandbyServer")
    private String standbyServer;

    private ModifyInstanceADAuthServerRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.baseDN = builder.baseDN;
        this.domain = builder.domain;
        this.emailMapping = builder.emailMapping;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.isSSL = builder.isSSL;
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

    public static ModifyInstanceADAuthServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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

    public static final class Builder extends Request.Builder<ModifyInstanceADAuthServerRequest, Builder> {
        private String account; 
        private String baseDN; 
        private String domain; 
        private String emailMapping; 
        private String filter; 
        private String instanceId; 
        private String isSSL; 
        private String mobileMapping; 
        private String nameMapping; 
        private String password; 
        private String port; 
        private String regionId; 
        private String server; 
        private String standbyServer; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceADAuthServerRequest request) {
            super(request);
            this.account = request.account;
            this.baseDN = request.baseDN;
            this.domain = request.domain;
            this.emailMapping = request.emailMapping;
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.isSSL = request.isSSL;
            this.mobileMapping = request.mobileMapping;
            this.nameMapping = request.nameMapping;
            this.password = request.password;
            this.port = request.port;
            this.regionId = request.regionId;
            this.server = request.server;
            this.standbyServer = request.standbyServer;
        } 

        /**
         * The username of the account that is used for the AD server.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * The Base distinguished name (DN).
         */
        public Builder baseDN(String baseDN) {
            this.putQueryParameter("BaseDN", baseDN);
            this.baseDN = baseDN;
            return this;
        }

        /**
         * The domain on the AD server.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The field that is used to indicate the email address of a user on the AD server.
         */
        public Builder emailMapping(String emailMapping) {
            this.putQueryParameter("EmailMapping", emailMapping);
            this.emailMapping = emailMapping;
            return this;
        }

        /**
         * The condition that is used to filter users.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The ID of the bastion host. You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to support SSL. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder isSSL(String isSSL) {
            this.putQueryParameter("IsSSL", isSSL);
            this.isSSL = isSSL;
            return this;
        }

        /**
         * The field that is used to indicate the mobile phone number of a user on the AD server.
         */
        public Builder mobileMapping(String mobileMapping) {
            this.putQueryParameter("MobileMapping", mobileMapping);
            this.mobileMapping = mobileMapping;
            return this;
        }

        /**
         * The field that is used to indicate the name of a user on the AD server.
         */
        public Builder nameMapping(String nameMapping) {
            this.putQueryParameter("NameMapping", nameMapping);
            this.nameMapping = nameMapping;
            return this;
        }

        /**
         * The password of the account that is used for the AD server.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The port that is used to access the AD server.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The region ID of the bastion host. For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The address of the AD server.
         */
        public Builder server(String server) {
            this.putQueryParameter("Server", server);
            this.server = server;
            return this;
        }

        /**
         * The address of the secondary AD server.
         */
        public Builder standbyServer(String standbyServer) {
            this.putQueryParameter("StandbyServer", standbyServer);
            this.standbyServer = standbyServer;
            return this;
        }

        @Override
        public ModifyInstanceADAuthServerRequest build() {
            return new ModifyInstanceADAuthServerRequest(this);
        } 

    } 

}
