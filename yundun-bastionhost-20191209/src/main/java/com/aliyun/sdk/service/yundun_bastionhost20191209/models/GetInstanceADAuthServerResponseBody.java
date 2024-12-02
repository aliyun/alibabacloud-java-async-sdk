// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceADAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceADAuthServerResponseBody</p>
 */
public class GetInstanceADAuthServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AD")
    private Ad ad;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The settings of AD authentication.</p>
         */
        public Builder ad(Ad ad) {
            this.ad = ad;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>89398CFB-4EB6-4C7E-BB3C-EF213AC8FA50</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceADAuthServerResponseBody build() {
            return new GetInstanceADAuthServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceADAuthServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceADAuthServerResponseBody</p>
     */
    public static class Ad extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("BaseDN")
        private String baseDN;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EmailMapping")
        private String emailMapping;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private Boolean hasPassword;

        @com.aliyun.core.annotation.NameInMap("IsSSL")
        private Boolean isSSL;

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
             * <p>The distinguished name (DN) of the AD server account.</p>
             * 
             * <strong>example:</strong>
             * <p>cn=Manager,dc=test,dc=com</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The Base DN of the AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>dc=test,dc=com</p>
             */
            public Builder baseDN(String baseDN) {
                this.baseDN = baseDN;
                return this;
            }

            /**
             * <p>The domain on the AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder domain(String domain) {
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
             * <li><strong>true</strong>:</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * <p>Indicates whether SSL is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The field that is used to indicate the mobile phone number of a user on the AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>mobileAttr</p>
             */
            public Builder mobileMapping(String mobileMapping) {
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
                this.nameMapping = nameMapping;
                return this;
            }

            /**
             * <p>The port that is used to access the AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>389</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The address of the AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder server(String server) {
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
                this.standbyServer = standbyServer;
                return this;
            }

            public Ad build() {
                return new Ad(this);
            } 

        } 

    }
}
