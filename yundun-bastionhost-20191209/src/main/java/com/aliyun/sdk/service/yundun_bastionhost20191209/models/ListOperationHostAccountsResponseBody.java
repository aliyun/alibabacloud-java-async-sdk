// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationHostAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationHostAccountsResponseBody</p>
 */
public class ListOperationHostAccountsResponseBody extends TeaModel {
    @NameInMap("HostAccounts")
    private java.util.List < HostAccounts> hostAccounts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListOperationHostAccountsResponseBody(Builder builder) {
        this.hostAccounts = builder.hostAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationHostAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostAccounts
     */
    public java.util.List < HostAccounts> getHostAccounts() {
        return this.hostAccounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < HostAccounts> hostAccounts; 
        private String requestId; 
        private Long totalCount; 

        /**
         * HostAccounts.
         */
        public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationHostAccountsResponseBody build() {
            return new ListOperationHostAccountsResponseBody(this);
        } 

    } 

    public static class SSHConfig extends TeaModel {
        @NameInMap("EnableSFTPChannel")
        private Boolean enableSFTPChannel;

        @NameInMap("EnableSSHChannel")
        private Boolean enableSSHChannel;

        private SSHConfig(Builder builder) {
            this.enableSFTPChannel = builder.enableSFTPChannel;
            this.enableSSHChannel = builder.enableSSHChannel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SSHConfig create() {
            return builder().build();
        }

        /**
         * @return enableSFTPChannel
         */
        public Boolean getEnableSFTPChannel() {
            return this.enableSFTPChannel;
        }

        /**
         * @return enableSSHChannel
         */
        public Boolean getEnableSSHChannel() {
            return this.enableSSHChannel;
        }

        public static final class Builder {
            private Boolean enableSFTPChannel; 
            private Boolean enableSSHChannel; 

            /**
             * EnableSFTPChannel.
             */
            public Builder enableSFTPChannel(Boolean enableSFTPChannel) {
                this.enableSFTPChannel = enableSFTPChannel;
                return this;
            }

            /**
             * EnableSSHChannel.
             */
            public Builder enableSSHChannel(Boolean enableSSHChannel) {
                this.enableSSHChannel = enableSSHChannel;
                return this;
            }

            public SSHConfig build() {
                return new SSHConfig(this);
            } 

        } 

    }
    public static class HostAccounts extends TeaModel {
        @NameInMap("HasPassword")
        private Boolean hasPassword;

        @NameInMap("HostAccountId")
        private String hostAccountId;

        @NameInMap("HostAccountName")
        private String hostAccountName;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @NameInMap("PrivateKeyFingerprint")
        private String privateKeyFingerprint;

        @NameInMap("ProtocolName")
        private String protocolName;

        @NameInMap("SSHConfig")
        private SSHConfig SSHConfig;

        private HostAccounts(Builder builder) {
            this.hasPassword = builder.hasPassword;
            this.hostAccountId = builder.hostAccountId;
            this.hostAccountName = builder.hostAccountName;
            this.hostId = builder.hostId;
            this.hostShareKeyId = builder.hostShareKeyId;
            this.privateKeyFingerprint = builder.privateKeyFingerprint;
            this.protocolName = builder.protocolName;
            this.SSHConfig = builder.SSHConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccounts create() {
            return builder().build();
        }

        /**
         * @return hasPassword
         */
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return hostAccountId
         */
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        /**
         * @return hostAccountName
         */
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostShareKeyId
         */
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        /**
         * @return privateKeyFingerprint
         */
        public String getPrivateKeyFingerprint() {
            return this.privateKeyFingerprint;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        /**
         * @return SSHConfig
         */
        public SSHConfig getSSHConfig() {
            return this.SSHConfig;
        }

        public static final class Builder {
            private Boolean hasPassword; 
            private String hostAccountId; 
            private String hostAccountName; 
            private String hostId; 
            private String hostShareKeyId; 
            private String privateKeyFingerprint; 
            private String protocolName; 
            private SSHConfig SSHConfig; 

            /**
             * HasPassword.
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * HostAccountId.
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * HostAccountName.
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * HostShareKeyId.
             */
            public Builder hostShareKeyId(String hostShareKeyId) {
                this.hostShareKeyId = hostShareKeyId;
                return this;
            }

            /**
             * PrivateKeyFingerprint.
             */
            public Builder privateKeyFingerprint(String privateKeyFingerprint) {
                this.privateKeyFingerprint = privateKeyFingerprint;
                return this;
            }

            /**
             * ProtocolName.
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            /**
             * SSHConfig.
             */
            public Builder SSHConfig(SSHConfig SSHConfig) {
                this.SSHConfig = SSHConfig;
                return this;
            }

            public HostAccounts build() {
                return new HostAccounts(this);
            } 

        } 

    }
}
