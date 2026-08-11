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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceADAuthServerResponseBody model) {
            this.ad = model.ad;
            this.requestId = model.requestId;
        } 

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

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("IsSSL")
        private Boolean isSSL;

        @com.aliyun.core.annotation.NameInMap("IsSyncEmailAttr")
        private Boolean isSyncEmailAttr;

        @com.aliyun.core.annotation.NameInMap("IsSyncMobileAttr")
        private Boolean isSyncMobileAttr;

        @com.aliyun.core.annotation.NameInMap("IsSyncNameAttr")
        private Boolean isSyncNameAttr;

        @com.aliyun.core.annotation.NameInMap("IsSyncOuAsUserGroup")
        private Boolean isSyncOuAsUserGroup;

        @com.aliyun.core.annotation.NameInMap("LatestSyncTime")
        private Long latestSyncTime;

        @com.aliyun.core.annotation.NameInMap("MobileMapping")
        private String mobileMapping;

        @com.aliyun.core.annotation.NameInMap("NameMapping")
        private String nameMapping;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("ServerName")
        private String serverName;

        @com.aliyun.core.annotation.NameInMap("StandbyServer")
        private String standbyServer;

        @com.aliyun.core.annotation.NameInMap("SyncInterval")
        private Long syncInterval;

        @com.aliyun.core.annotation.NameInMap("UserSourceId")
        private String userSourceId;

        private Ad(Builder builder) {
            this.account = builder.account;
            this.baseDN = builder.baseDN;
            this.domain = builder.domain;
            this.emailMapping = builder.emailMapping;
            this.filter = builder.filter;
            this.hasPassword = builder.hasPassword;
            this.isDefault = builder.isDefault;
            this.isSSL = builder.isSSL;
            this.isSyncEmailAttr = builder.isSyncEmailAttr;
            this.isSyncMobileAttr = builder.isSyncMobileAttr;
            this.isSyncNameAttr = builder.isSyncNameAttr;
            this.isSyncOuAsUserGroup = builder.isSyncOuAsUserGroup;
            this.latestSyncTime = builder.latestSyncTime;
            this.mobileMapping = builder.mobileMapping;
            this.nameMapping = builder.nameMapping;
            this.port = builder.port;
            this.server = builder.server;
            this.serverName = builder.serverName;
            this.standbyServer = builder.standbyServer;
            this.syncInterval = builder.syncInterval;
            this.userSourceId = builder.userSourceId;
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
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return isSSL
         */
        public Boolean getIsSSL() {
            return this.isSSL;
        }

        /**
         * @return isSyncEmailAttr
         */
        public Boolean getIsSyncEmailAttr() {
            return this.isSyncEmailAttr;
        }

        /**
         * @return isSyncMobileAttr
         */
        public Boolean getIsSyncMobileAttr() {
            return this.isSyncMobileAttr;
        }

        /**
         * @return isSyncNameAttr
         */
        public Boolean getIsSyncNameAttr() {
            return this.isSyncNameAttr;
        }

        /**
         * @return isSyncOuAsUserGroup
         */
        public Boolean getIsSyncOuAsUserGroup() {
            return this.isSyncOuAsUserGroup;
        }

        /**
         * @return latestSyncTime
         */
        public Long getLatestSyncTime() {
            return this.latestSyncTime;
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
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        /**
         * @return standbyServer
         */
        public String getStandbyServer() {
            return this.standbyServer;
        }

        /**
         * @return syncInterval
         */
        public Long getSyncInterval() {
            return this.syncInterval;
        }

        /**
         * @return userSourceId
         */
        public String getUserSourceId() {
            return this.userSourceId;
        }

        public static final class Builder {
            private String account; 
            private String baseDN; 
            private String domain; 
            private String emailMapping; 
            private String filter; 
            private Boolean hasPassword; 
            private Boolean isDefault; 
            private Boolean isSSL; 
            private Boolean isSyncEmailAttr; 
            private Boolean isSyncMobileAttr; 
            private Boolean isSyncNameAttr; 
            private Boolean isSyncOuAsUserGroup; 
            private Long latestSyncTime; 
            private String mobileMapping; 
            private String nameMapping; 
            private Long port; 
            private String server; 
            private String serverName; 
            private String standbyServer; 
            private Long syncInterval; 
            private String userSourceId; 

            private Builder() {
            } 

            private Builder(Ad model) {
                this.account = model.account;
                this.baseDN = model.baseDN;
                this.domain = model.domain;
                this.emailMapping = model.emailMapping;
                this.filter = model.filter;
                this.hasPassword = model.hasPassword;
                this.isDefault = model.isDefault;
                this.isSSL = model.isSSL;
                this.isSyncEmailAttr = model.isSyncEmailAttr;
                this.isSyncMobileAttr = model.isSyncMobileAttr;
                this.isSyncNameAttr = model.isSyncNameAttr;
                this.isSyncOuAsUserGroup = model.isSyncOuAsUserGroup;
                this.latestSyncTime = model.latestSyncTime;
                this.mobileMapping = model.mobileMapping;
                this.nameMapping = model.nameMapping;
                this.port = model.port;
                this.server = model.server;
                this.serverName = model.serverName;
                this.standbyServer = model.standbyServer;
                this.syncInterval = model.syncInterval;
                this.userSourceId = model.userSourceId;
            } 

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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
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
             * IsSyncEmailAttr.
             */
            public Builder isSyncEmailAttr(Boolean isSyncEmailAttr) {
                this.isSyncEmailAttr = isSyncEmailAttr;
                return this;
            }

            /**
             * IsSyncMobileAttr.
             */
            public Builder isSyncMobileAttr(Boolean isSyncMobileAttr) {
                this.isSyncMobileAttr = isSyncMobileAttr;
                return this;
            }

            /**
             * IsSyncNameAttr.
             */
            public Builder isSyncNameAttr(Boolean isSyncNameAttr) {
                this.isSyncNameAttr = isSyncNameAttr;
                return this;
            }

            /**
             * IsSyncOuAsUserGroup.
             */
            public Builder isSyncOuAsUserGroup(Boolean isSyncOuAsUserGroup) {
                this.isSyncOuAsUserGroup = isSyncOuAsUserGroup;
                return this;
            }

            /**
             * LatestSyncTime.
             */
            public Builder latestSyncTime(Long latestSyncTime) {
                this.latestSyncTime = latestSyncTime;
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
             * ServerName.
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
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

            /**
             * SyncInterval.
             */
            public Builder syncInterval(Long syncInterval) {
                this.syncInterval = syncInterval;
                return this;
            }

            /**
             * UserSourceId.
             */
            public Builder userSourceId(String userSourceId) {
                this.userSourceId = userSourceId;
                return this;
            }

            public Ad build() {
                return new Ad(this);
            } 

        } 

    }
}
