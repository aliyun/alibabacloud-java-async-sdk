// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostAccountsResponseBody</p>
 */
public class ListHostAccountsResponseBody extends TeaModel {
    @NameInMap("HostAccounts")
    private java.util.List < HostAccounts> hostAccounts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The ID of the host account.
         */
        public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }

        /**
         * An array that consists of the queried host accounts.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the bastion host in which you want to query accounts of the specified host.
         * <p>
         * 
         * >  You can call the DescribeInstances operation to query the ID of the bastion host.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostAccountsResponseBody build() {
            return new ListHostAccountsResponseBody(this);
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

        @NameInMap("HostShareKeyName")
        private String hostShareKeyName;

        @NameInMap("PrivateKeyFingerprint")
        private String privateKeyFingerprint;

        @NameInMap("ProtocolName")
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
             * The fingerprint of the private key for the host account.
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * The name of the shared key.
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
             * HostShareKeyName.
             */
            public Builder hostShareKeyName(String hostShareKeyName) {
                this.hostShareKeyName = hostShareKeyName;
                return this;
            }

            /**
             * The protocol that is used by the host.
             * <p>
             * 
             * Valid values:
             * 
             * *   SSH
             * *   RDP
             */
            public Builder privateKeyFingerprint(String privateKeyFingerprint) {
                this.privateKeyFingerprint = privateKeyFingerprint;
                return this;
            }

            /**
             * The number of the page to return. Default value: **1**.
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
