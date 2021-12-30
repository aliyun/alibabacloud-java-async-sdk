// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceADAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceADAuthServerResponseBody</p>
 */
public class GetInstanceADAuthServerResponseBody extends TeaModel {
    @NameInMap("AD")
    private AD AD;

    @NameInMap("RequestId")
    private String requestId;


    private GetInstanceADAuthServerResponseBody(Builder builder) {
        this.AD = builder.AD;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceADAuthServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return AD
     */
    public AD getAD() {
        return this.AD;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AD AD; 
        private String requestId; 

        /**
         * <p>AD.</p>
         */
        public Builder AD(AD AD) {
            this.AD = AD;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceADAuthServerResponseBody build() {
            return new GetInstanceADAuthServerResponseBody(this);
        } 

    } 

    public static class AD extends TeaModel {
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


        private AD(Builder builder) {
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

        public static AD create() {
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
             * <p>Account.</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>BaseDN.</p>
             */
            public Builder baseDN(String baseDN) {
                this.baseDN = baseDN;
                return this;
            }

            /**
             * <p>Domain.</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>EmailMapping.</p>
             */
            public Builder emailMapping(String emailMapping) {
                this.emailMapping = emailMapping;
                return this;
            }

            /**
             * <p>Filter.</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>HasPassword.</p>
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * <p>IsSSL.</p>
             */
            public Builder isSSL(Boolean isSSL) {
                this.isSSL = isSSL;
                return this;
            }

            /**
             * <p>MobileMapping.</p>
             */
            public Builder mobileMapping(String mobileMapping) {
                this.mobileMapping = mobileMapping;
                return this;
            }

            /**
             * <p>NameMapping.</p>
             */
            public Builder nameMapping(String nameMapping) {
                this.nameMapping = nameMapping;
                return this;
            }

            /**
             * <p>Port.</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Server.</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>StandbyServer.</p>
             */
            public Builder standbyServer(String standbyServer) {
                this.standbyServer = standbyServer;
                return this;
            }

            public AD build() {
                return new AD(this);
            } 

        } 

    }
}
