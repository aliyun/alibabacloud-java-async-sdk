// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostAccountsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostAccountsForUserResponseBody</p>
 */
public class ListHostAccountsForUserResponseBody extends TeaModel {
    @NameInMap("HostAccounts")
    private java.util.List < HostAccounts> hostAccounts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListHostAccountsForUserResponseBody(Builder builder) {
        this.hostAccounts = builder.hostAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostAccountsForUserResponseBody create() {
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
         * The host accounts returned.
         */
        public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }

        /**
         * The ID of the Bastionhost instance where you want to query the host accounts that the user is authorized to manage on the host.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * The value of the PageSize parameter must not exceed 100. Default value: 20. If you leave the PageSize parameter empty, 20 entries are returned on each page.
         * 
         * >  We recommend that you do not leave the PageSize parameter empty.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostAccountsForUserResponseBody build() {
            return new ListHostAccountsForUserResponseBody(this);
        } 

    } 

    public static class HostAccounts extends TeaModel {
        @NameInMap("HostAccountId")
        private String hostAccountId;

        @NameInMap("HostAccountName")
        private String hostAccountName;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("IsAuthorized")
        private Boolean isAuthorized;

        @NameInMap("ProtocolName")
        private String protocolName;

        private HostAccounts(Builder builder) {
            this.hostAccountId = builder.hostAccountId;
            this.hostAccountName = builder.hostAccountName;
            this.hostId = builder.hostId;
            this.isAuthorized = builder.isAuthorized;
            this.protocolName = builder.protocolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccounts create() {
            return builder().build();
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
         * @return isAuthorized
         */
        public Boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private String hostAccountId; 
            private String hostAccountName; 
            private String hostId; 
            private Boolean isAuthorized; 
            private String protocolName; 

            /**
             * The protocol that is used by the host account. Valid values:
             * <p>
             * 
             * *   **SSH**
             * *   **RDP**
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * The ID of the host account.
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The ID of the host for which you want to query the host accounts that the user is authorized to manage.
             * <p>
             * 
             * >  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.
             */
            public Builder isAuthorized(Boolean isAuthorized) {
                this.isAuthorized = isAuthorized;
                return this;
            }

            /**
             * Indicates whether the user is authorized to manage the host account. Valid values:
             * <p>
             * 
             * *   **true**: The user is authorized to manage the host account.
             * *   **false**: The user is not authorized to manage the host account.
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
