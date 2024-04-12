// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceADAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceADAuthServerResponseBody</p>
 */
public class GetInstanceADAuthServerResponseBody extends TeaModel {
    @NameInMap("AD")
    private Ad ad;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceADAuthServerResponseBody(Builder builder) {
        this.ad = builder.ad;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceADAuthServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return ad
     */
    public Ad getAd() {
        return this.ad;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Ad ad; 
        private String requestId; 

        /**
         * The settings of AD authentication.
         */
        public Builder ad(Ad ad) {
            this.ad = ad;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceADAuthServerResponseBody build() {
            return new GetInstanceADAuthServerResponseBody(this);
        } 

    } 

    public static class Ad extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("BaseDN")
        private String baseDN;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("EmailMapping")
        private String emailMapping;

        @NameInMap("Filter")
        private String filter;

        @NameInMap("HasPassword")
        private Boolean hasPassword;

        @NameInMap("IsSSL")
        private Boolean isSSL;

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

        private Ad(Builder builder) {
            this.account = builder.account;
            this.baseDN = builder.baseDN;
            this.domain = builder.domain;
            this.emailMapping = builder.emailMapping;
            this.filter = builder.filter;
            this.hasPassword = builder.hasPassword;
            this.isSSL = builder.isSSL;
            this.mobileMapping = builder.mobileMapping;
            this.nameMapping = builder.nameMapping;
            this.port = builder.port;
            this.server = builder.server;
            this.standbyServer = builder.standbyServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ad create() {
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
         * @return hasPassword
         */
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return isSSL
         */
        public Boolean getIsSSL() {
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
            private String domain; 
            private String emailMapping; 
            private String filter; 
            private Boolean hasPassword; 
            private Boolean isSSL; 
            private String mobileMapping; 
            private String nameMapping; 
            private Long port; 
            private String server; 
            private String standbyServer; 

            /**
             * The distinguished name (DN) of the AD server account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * The Base DN of the AD server.
             */
            public Builder baseDN(String baseDN) {
                this.baseDN = baseDN;
                return this;
            }

            /**
             * The domain on the AD server.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The field that is used to indicate the email address of a user on the AD server.
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
             * *   **true**:
             * *   **false**
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * Indicates whether SSL is supported. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isSSL(Boolean isSSL) {
                this.isSSL = isSSL;
                return this;
            }

            /**
             * The field that is used to indicate the mobile phone number of a user on the AD server.
             */
            public Builder mobileMapping(String mobileMapping) {
                this.mobileMapping = mobileMapping;
                return this;
            }

            /**
             * The field that is used to indicate the name of a user on the AD server.
             */
            public Builder nameMapping(String nameMapping) {
                this.nameMapping = nameMapping;
                return this;
            }

            /**
             * The port that is used to access the AD server.
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

            public Ad build() {
                return new Ad(this);
            } 

        } 

    }
}
