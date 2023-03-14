// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceLDAPAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceLDAPAuthServerResponseBody</p>
 */
public class GetInstanceLDAPAuthServerResponseBody extends TeaModel {
    @NameInMap("LDAP")
    private LDAP LDAP;

    @NameInMap("RequestId")
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

        /**
         * The settings of LDAP authentication.
         */
        public Builder LDAP(LDAP LDAP) {
            this.LDAP = LDAP;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceLDAPAuthServerResponseBody build() {
            return new GetInstanceLDAPAuthServerResponseBody(this);
        } 

    } 

    public static class LDAP extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("BaseDN")
        private String baseDN;

        @NameInMap("EmailMapping")
        private String emailMapping;

        @NameInMap("Filter")
        private String filter;

        @NameInMap("HasPassword")
        private String hasPassword;

        @NameInMap("IsSSL")
        private Boolean isSSL;

        @NameInMap("LoginNameMapping")
        private String loginNameMapping;

        @NameInMap("MobileMapping")
        private String mobileMapping;

        @NameInMap("NameMapping")
        private String nameMapping;

        @NameInMap("Port")
        private Long port;

        @NameInMap("Server")
        private String server;

        @NameInMap("StandbyServer")
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

            /**
             * The account of the LDAP server.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * The Base distinguished name (DN).
             */
            public Builder baseDN(String baseDN) {
                this.baseDN = baseDN;
                return this;
            }

            /**
             * The field that is used to indicate the email address of a user on the LDAP server.
             */
            public Builder emailMapping(String emailMapping) {
                this.emailMapping = emailMapping;
                return this;
            }

            /**
             * The condition that is used to filter users.
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * Indicates whether passwords are required. Valid values:
             * <p>
             * 
             * *   **true**: required
             * *   **false**: not required
             */
            public Builder hasPassword(String hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * Indicates whether SSL is supported. Valid values:
             * <p>
             * 
             * *   **true**: supported
             * *   **false**: not supported
             */
            public Builder isSSL(Boolean isSSL) {
                this.isSSL = isSSL;
                return this;
            }

            /**
             * The field that is used to indicate the logon name of a user on the LDAP server.
             */
            public Builder loginNameMapping(String loginNameMapping) {
                this.loginNameMapping = loginNameMapping;
                return this;
            }

            /**
             * The field that is used to indicate the mobile phone number of a user on the LDAP server.
             */
            public Builder mobileMapping(String mobileMapping) {
                this.mobileMapping = mobileMapping;
                return this;
            }

            /**
             * The field that is used to indicate the name of a user on the LDAP server.
             */
            public Builder nameMapping(String nameMapping) {
                this.nameMapping = nameMapping;
                return this;
            }

            /**
             * The port that is used to access the LDAP server.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * The address of the LDAP server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The address of the secondary LDAP server.
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
