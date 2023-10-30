// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostAccountsForHostShareKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostAccountsForHostShareKeyResponseBody</p>
 */
public class ListHostAccountsForHostShareKeyResponseBody extends TeaModel {
    @NameInMap("HostAccounts")
    private java.util.List < HostAccounts> hostAccounts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListHostAccountsForHostShareKeyResponseBody(Builder builder) {
        this.hostAccounts = builder.hostAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostAccountsForHostShareKeyResponseBody create() {
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
         * An array that consists of the host accounts that are associated with the shared key.
         */
        public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the host accounts that are associated with the shared key.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostAccountsForHostShareKeyResponseBody build() {
            return new ListHostAccountsForHostShareKeyResponseBody(this);
        } 

    } 

    public static class HostAccounts extends TeaModel {
        @NameInMap("HostAccountName")
        private String hostAccountName;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostsAccountId")
        private String hostsAccountId;

        @NameInMap("ProtocolName")
        private String protocolName;

        private HostAccounts(Builder builder) {
            this.hostAccountName = builder.hostAccountName;
            this.hostId = builder.hostId;
            this.hostsAccountId = builder.hostsAccountId;
            this.protocolName = builder.protocolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccounts create() {
            return builder().build();
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
         * @return hostsAccountId
         */
        public String getHostsAccountId() {
            return this.hostsAccountId;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private String hostAccountName; 
            private String hostId; 
            private String hostsAccountId; 
            private String protocolName; 

            /**
             * The name of the host account.
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The ID of the host account.
             */
            public Builder hostsAccountId(String hostsAccountId) {
                this.hostsAccountId = hostsAccountId;
                return this;
            }

            /**
             * The O\&M protocol.
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
