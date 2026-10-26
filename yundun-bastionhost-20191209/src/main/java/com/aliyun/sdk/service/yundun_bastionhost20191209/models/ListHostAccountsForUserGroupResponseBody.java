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
 * {@link ListHostAccountsForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostAccountsForUserGroupResponseBody</p>
 */
public class ListHostAccountsForUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccounts")
    private java.util.List<HostAccounts> hostAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHostAccountsForUserGroupResponseBody(Builder builder) {
        this.hostAccounts = builder.hostAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostAccountsForUserGroupResponseBody create() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<HostAccounts> hostAccounts; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListHostAccountsForUserGroupResponseBody model) {
            this.hostAccounts = model.hostAccounts;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The host accounts.</p>
         */
        public Builder hostAccounts(java.util.List<HostAccounts> hostAccounts) {
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
         * <p>The total number of host accounts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostAccountsForUserGroupResponseBody build() {
            return new ListHostAccountsForUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostAccountsForUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostAccountsForUserGroupResponseBody</p>
     */
    public static class HostAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountId")
        private String hostAccountId;

        @com.aliyun.core.annotation.NameInMap("HostAccountName")
        private String hostAccountName;

        @com.aliyun.core.annotation.NameInMap("HostAccountType")
        private String hostAccountType;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("IsAuthorized")
        private Boolean isAuthorized;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        private HostAccounts(Builder builder) {
            this.hostAccountId = builder.hostAccountId;
            this.hostAccountName = builder.hostAccountName;
            this.hostAccountType = builder.hostAccountType;
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
         * @return hostAccountType
         */
        public String getHostAccountType() {
            return this.hostAccountType;
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
            private String hostAccountType; 
            private String hostId; 
            private Boolean isAuthorized; 
            private String protocolName; 

            private Builder() {
            } 

            private Builder(HostAccounts model) {
                this.hostAccountId = model.hostAccountId;
                this.hostAccountName = model.hostAccountName;
                this.hostAccountType = model.hostAccountType;
                this.hostId = model.hostId;
                this.isAuthorized = model.isAuthorized;
                this.protocolName = model.protocolName;
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
             * <p>host１</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * <p>The type of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Normal&quot;</p>
             */
            public Builder hostAccountType(String hostAccountType) {
                this.hostAccountType = hostAccountType;
                return this;
            }

            /**
             * <p>The ID of the host to which the host account belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>１</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>Indicates whether the host account is authorized for the current user group. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Authorized.</li>
             * <li><strong>false</strong>: Unauthorized.</li>
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
             * <p>The protocol name of the host account. Valid values:</p>
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
