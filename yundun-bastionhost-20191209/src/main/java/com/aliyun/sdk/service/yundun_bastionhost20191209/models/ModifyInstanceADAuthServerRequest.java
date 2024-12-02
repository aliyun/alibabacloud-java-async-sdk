// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceADAuthServerRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceADAuthServerRequest</p>
 */
public class ModifyInstanceADAuthServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseDN")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseDN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailMapping")
    private String emailMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSSL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isSSL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileMapping")
    private String mobileMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameMapping")
    private String nameMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Server")
    @com.aliyun.core.annotation.Validation(required = true)
    private String server;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyServer")
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
         * <p>The username of the account that is used for the AD server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn=Manager,dc=test,dc=com</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>The Base distinguished name (DN).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc=test,dc=com</p>
         */
        public Builder baseDN(String baseDN) {
            this.putQueryParameter("BaseDN", baseDN);
            this.baseDN = baseDN;
            return this;
        }

        /**
         * <p>The domain on the AD server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The field that is used to indicate the email address of a user on the AD server.</p>
         * 
         * <strong>example:</strong>
         * <p>emailAttr</p>
         */
        public Builder emailMapping(String emailMapping) {
            this.putQueryParameter("EmailMapping", emailMapping);
            this.emailMapping = emailMapping;
            return this;
        }

        /**
         * <p>The condition that is used to filter users.</p>
         * 
         * <strong>example:</strong>
         * <p>(objectClass=top)</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether SSL is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSSL(String isSSL) {
            this.putQueryParameter("IsSSL", isSSL);
            this.isSSL = isSSL;
            return this;
        }

        /**
         * <p>The field that is used to indicate the mobile phone number of a user on the AD server.</p>
         * 
         * <strong>example:</strong>
         * <p>mobileAttr</p>
         */
        public Builder mobileMapping(String mobileMapping) {
            this.putQueryParameter("MobileMapping", mobileMapping);
            this.mobileMapping = mobileMapping;
            return this;
        }

        /**
         * <p>The field that is used to indicate the name of a user on the AD server.</p>
         * 
         * <strong>example:</strong>
         * <p>nameAttr</p>
         */
        public Builder nameMapping(String nameMapping) {
            this.putQueryParameter("NameMapping", nameMapping);
            this.nameMapping = nameMapping;
            return this;
        }

        /**
         * <p>The password of the account that is used for the AD server.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The port that is used to access the server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>389</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The address of the AD server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder server(String server) {
            this.putQueryParameter("Server", server);
            this.server = server;
            return this;
        }

        /**
         * <p>The address of the secondary AD server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
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
