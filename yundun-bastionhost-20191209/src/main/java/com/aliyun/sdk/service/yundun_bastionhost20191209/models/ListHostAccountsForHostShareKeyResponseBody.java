// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHostAccountsForHostShareKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostAccountsForHostShareKeyResponseBody</p>
 */
public class ListHostAccountsForHostShareKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccounts")
    private java.util.List < HostAccounts> hostAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>An array that consists of the host accounts that are associated with the shared key.</p>
         */
        public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the host accounts that are associated with the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostAccountsForHostShareKeyResponseBody build() {
            return new ListHostAccountsForHostShareKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostAccountsForHostShareKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostAccountsForHostShareKeyResponseBody</p>
     */
    public static class HostAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountName")
        private String hostAccountName;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("HostsAccountId")
        private String hostsAccountId;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
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
             * <p>The name of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>root1234</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>1113</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The ID of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>1235</p>
             */
            public Builder hostsAccountId(String hostsAccountId) {
                this.hostsAccountId = hostsAccountId;
                return this;
            }

            /**
             * <p>The O&amp;M protocol.</p>
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
