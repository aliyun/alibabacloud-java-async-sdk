// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHostAccountsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostAccountsForUserResponseBody</p>
 */
public class ListHostAccountsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccounts")
    private java.util.List < HostAccounts> hostAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The total number of host accounts that were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostAccountsForUserResponseBody build() {
            return new ListHostAccountsForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostAccountsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostAccountsForUserResponseBody</p>
     */
    public static class HostAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountId")
        private String hostAccountId;

        @com.aliyun.core.annotation.NameInMap("HostAccountName")
        private String hostAccountName;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("IsAuthorized")
        private Boolean isAuthorized;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
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
             * <p>root</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * <p>The ID of the host for which the host accounts were queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>Indicates whether the user is authorized to manage the host account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAuthorized(Boolean isAuthorized) {
                this.isAuthorized = isAuthorized;
                return this;
            }

            /**
             * <p>The protocol that is used by the host. Valid values:</p>
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

            public HostAccounts build() {
                return new HostAccounts(this);
            } 

        } 

    }
}
