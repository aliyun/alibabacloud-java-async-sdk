// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHostAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostAccountsResponseBody</p>
 */
public class ListHostAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccounts")
    private java.util.List < HostAccounts> hostAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHostAccountsResponseBody(Builder builder) {
        this.hostAccounts = builder.hostAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostAccountsResponseBody create() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < HostAccounts> hostAccounts; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array that consists of the queried host accounts.</p>
         */
        public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of host accounts that are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostAccountsResponseBody build() {
            return new ListHostAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostAccountsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @com.aliyun.core.annotation.NameInMap("PrivateKeyFingerprint")
        private String privateKeyFingerprint;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        private HostAccounts(Builder builder) {
            this.hasPassword = builder.hasPassword;
            this.hostAccountId = builder.hostAccountId;
            this.hostAccountName = builder.hostAccountName;
            this.hostId = builder.hostId;
            this.hostShareKeyId = builder.hostShareKeyId;
            this.hostShareKeyName = builder.hostShareKeyName;
            this.privateKeyFingerprint = builder.privateKeyFingerprint;
            this.protocolName = builder.protocolName;
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
         * @return hostShareKeyName
         */
        public String getHostShareKeyName() {
            return this.hostShareKeyName;
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

        public static final class Builder {
            private Boolean hasPassword; 
            private String hostAccountId; 
            private String hostAccountName; 
            private String hostId; 
            private String hostShareKeyId; 
            private String hostShareKeyName; 
            private String privateKeyFingerprint; 
            private String protocolName; 

            /**
             * <p>Indicates whether a password is configured for the host account.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: A password is configured for the host account.</li>
             * <li>false: No passwords are configured for the host account.</li>
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
             * <p>The ID of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * <p>The name of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The ID of the shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostShareKeyId(String hostShareKeyId) {
                this.hostShareKeyId = hostShareKeyId;
                return this;
            }

            /**
             * <p>The name of the shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder hostShareKeyName(String hostShareKeyName) {
                this.hostShareKeyName = hostShareKeyName;
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
             * <p>The protocol that is used by the host.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SSH</li>
             * <li>RDP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SSH</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            public HostAccounts build() {
                return new HostAccounts(this);
            } 

        } 

    }
}
