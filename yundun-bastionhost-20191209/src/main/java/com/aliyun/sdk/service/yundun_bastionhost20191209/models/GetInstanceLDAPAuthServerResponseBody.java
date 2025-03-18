// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetInstanceLDAPAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceLDAPAuthServerResponseBody</p>
 */
public class GetInstanceLDAPAuthServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LDAP")
    private LDAP LDAP;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceLDAPAuthServerResponseBody(Builder builder) {
        this.LDAP = builder.LDAP;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLDAPAuthServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return LDAP
     */
    public LDAP getLDAP() {
        return this.LDAP;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LDAP LDAP; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceLDAPAuthServerResponseBody model) {
            this.LDAP = model.LDAP;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The settings of LDAP authentication.</p>
         */
        public Builder LDAP(LDAP LDAP) {
            this.LDAP = LDAP;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1C60E741-102D-5E8F-9710-B06D3F0183FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceLDAPAuthServerResponseBody build() {
            return new GetInstanceLDAPAuthServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceLDAPAuthServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceLDAPAuthServerResponseBody</p>
     */
    public static class LDAP extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("BaseDN")
        private String baseDN;

        @com.aliyun.core.annotation.NameInMap("EmailMapping")
        private String emailMapping;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private String hasPassword;

        @com.aliyun.core.annotation.NameInMap("IsSSL")
        private Boolean isSSL;

        @com.aliyun.core.annotation.NameInMap("LoginNameMapping")
        private String loginNameMapping;

        @com.aliyun.core.annotation.NameInMap("MobileMapping")
        private String mobileMapping;

        @com.aliyun.core.annotation.NameInMap("NameMapping")
        private String nameMapping;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("StandbyServer")
        private String standbyServer;

        private LDAP(Builder builder) {
            this.account = builder.account;
            this.baseDN = builder.baseDN;
            this.emailMapping = builder.emailMapping;
            this.filter = builder.filter;
            this.hasPassword = builder.hasPassword;
            this.isSSL = builder.isSSL;
            this.loginNameMapping = builder.loginNameMapping;
            this.mobileMapping = builder.mobileMapping;
            this.nameMapping = builder.nameMapping;
            this.port = builder.port;
            this.server = builder.server;
            this.standbyServer = builder.standbyServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LDAP create() {
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
         * @return hasPassword
         */
        public String getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return isSSL
         */
        public Boolean getIsSSL() {
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
         * @return port
         */
        public Long getPort() {
            return this.port;
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

        public static final class Builder {
            private String account; 
            private String baseDN; 
            private String emailMapping; 
            private String filter; 
            private String hasPassword; 
            private Boolean isSSL; 
            private String loginNameMapping; 
            private String mobileMapping; 
            private String nameMapping; 
            private Long port; 
            private String server; 
            private String standbyServer; 

            private Builder() {
            } 

            private Builder(LDAP model) {
                this.account = model.account;
                this.baseDN = model.baseDN;
                this.emailMapping = model.emailMapping;
                this.filter = model.filter;
                this.hasPassword = model.hasPassword;
                this.isSSL = model.isSSL;
                this.loginNameMapping = model.loginNameMapping;
                this.mobileMapping = model.mobileMapping;
                this.nameMapping = model.nameMapping;
                this.port = model.port;
                this.server = model.server;
                this.standbyServer = model.standbyServer;
            } 

            /**
             * <p>The account of the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>cn=Manager,dc=test,dc=com</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The Base distinguished name (DN).</p>
             * 
             * <strong>example:</strong>
             * <p>dc=test,dc=com</p>
             */
            public Builder baseDN(String baseDN) {
                this.baseDN = baseDN;
                return this;
            }

            /**
             * <p>The field that is used to indicate the email address of a user on the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>emailAttr</p>
             */
            public Builder emailMapping(String emailMapping) {
                this.emailMapping = emailMapping;
                return this;
            }

            /**
             * <p>The condition that is used to filter users.</p>
             * 
             * <strong>example:</strong>
             * <p>(&amp;(objectClass=top))</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>Indicates whether passwords are required. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: required</li>
             * <li><strong>false</strong>: not required</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPassword(String hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * <p>Indicates whether SSL is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: supported</li>
             * <li><strong>false</strong>: not supported</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSSL(Boolean isSSL) {
                this.isSSL = isSSL;
                return this;
            }

            /**
             * <p>The field that is used to indicate the logon name of a user on the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>userNameAttr</p>
             */
            public Builder loginNameMapping(String loginNameMapping) {
                this.loginNameMapping = loginNameMapping;
                return this;
            }

            /**
             * <p>The field that is used to indicate the mobile phone number of a user on the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>mobileAttr</p>
             */
            public Builder mobileMapping(String mobileMapping) {
                this.mobileMapping = mobileMapping;
                return this;
            }

            /**
             * <p>The field that is used to indicate the name of a user on the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>nameAttr</p>
             */
            public Builder nameMapping(String nameMapping) {
                this.nameMapping = nameMapping;
                return this;
            }

            /**
             * <p>The port that is used to access the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>389</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The address of the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The address of the secondary LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder standbyServer(String standbyServer) {
                this.standbyServer = standbyServer;
                return this;
            }

            public LDAP build() {
                return new LDAP(this);
            } 

        } 

    }
}
