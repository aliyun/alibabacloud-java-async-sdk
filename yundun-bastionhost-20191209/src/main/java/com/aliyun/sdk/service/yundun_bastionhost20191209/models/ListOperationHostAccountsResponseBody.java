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
 * {@link ListOperationHostAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationHostAccountsResponseBody</p>
 */
public class ListOperationHostAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccounts")
    private java.util.List<HostAccounts> hostAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccounts
     */
    public java.util.List<HostAccounts> getHostAccounts() {
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
        private java.util.List<HostAccounts> hostAccounts; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOperationHostAccountsResponseBody model) {
            this.hostAccounts = model.hostAccounts;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The host accounts returned.</p>
         */
        public Builder hostAccounts(java.util.List<HostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of host accounts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationHostAccountsResponseBody build() {
            return new ListOperationHostAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationHostAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationHostAccountsResponseBody</p>
     */
    public static class SSHConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSFTPChannel")
        private Boolean enableSFTPChannel;

        @com.aliyun.core.annotation.NameInMap("EnableSSHChannel")
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

            private Builder() {
            } 

            private Builder(SSHConfig model) {
                this.enableSFTPChannel = model.enableSFTPChannel;
                this.enableSSHChannel = model.enableSSHChannel;
            } 

            /**
             * <p>Indicates whether SFTP channels are enabled for the account.</p>
             */
            public Builder enableSFTPChannel(Boolean enableSFTPChannel) {
                this.enableSFTPChannel = enableSFTPChannel;
                return this;
            }

            /**
             * <p>Indicates whether SSH channels are enabled for the account.</p>
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
    /**
     * 
     * {@link ListOperationHostAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationHostAccountsResponseBody</p>
     */
    public static class HostAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private Boolean hasPassword;

        @com.aliyun.core.annotation.NameInMap("HostAccountId")
        private String hostAccountId;

        @com.aliyun.core.annotation.NameInMap("HostAccountName")
        private String hostAccountName;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("HostShareKeyId")
        private String hostShareKeyId;

        @com.aliyun.core.annotation.NameInMap("PrivateKeyFingerprint")
        private String privateKeyFingerprint;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        @com.aliyun.core.annotation.NameInMap("SSHConfig")
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

            private Builder() {
            } 

            private Builder(HostAccounts model) {
                this.hasPassword = model.hasPassword;
                this.hostAccountId = model.hostAccountId;
                this.hostAccountName = model.hostAccountName;
                this.hostId = model.hostId;
                this.hostShareKeyId = model.hostShareKeyId;
                this.privateKeyFingerprint = model.privateKeyFingerprint;
                this.protocolName = model.protocolName;
                this.SSHConfig = model.SSHConfig;
            } 

            /**
             * <p>Indicates whether a password is configured for the host account.</p>
             * <ul>
             * <li><strong>true</strong></li>
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
             * <p>The host account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * <p>The host account name.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * <p>The host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>１</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The ID of the shared key that is associated with the host.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder hostShareKeyId(String hostShareKeyId) {
                this.hostShareKeyId = hostShareKeyId;
                return this;
            }

            /**
             * <p>The fingerprint of the private key for the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>fe:ca:37:42:30:00:9d:95:e6:73:e5:b0:32:0a:<strong>:</strong></p>
             */
            public Builder privateKeyFingerprint(String privateKeyFingerprint) {
                this.privateKeyFingerprint = privateKeyFingerprint;
                return this;
            }

            /**
             * <p>The protocol that is used by the host account.</p>
             * <ul>
             * <li><strong>SSH</strong></li>
             * <li><strong>RDP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SSH</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            /**
             * <p>Indicates whether the Secure File Transfer Protocol (SFTP) channels or the SSH channels are enabled for the host account that uses the SSH protocol.</p>
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
