// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListDhcpOptionsSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDhcpOptionsSetsResponseBody</p>
 */
public class ListDhcpOptionsSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DhcpOptionsSets")
    private java.util.List<DhcpOptionsSets> dhcpOptionsSets;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListDhcpOptionsSetsResponseBody(Builder builder) {
        this.dhcpOptionsSets = builder.dhcpOptionsSets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDhcpOptionsSetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dhcpOptionsSets
     */
    public java.util.List<DhcpOptionsSets> getDhcpOptionsSets() {
        return this.dhcpOptionsSets;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DhcpOptionsSets> dhcpOptionsSets; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListDhcpOptionsSetsResponseBody model) {
            this.dhcpOptionsSets = model.dhcpOptionsSets;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of DHCP options sets.</p>
         */
        public Builder dhcpOptionsSets(java.util.List<DhcpOptionsSets> dhcpOptionsSets) {
            this.dhcpOptionsSets = dhcpOptionsSets;
            return this;
        }

        /**
         * <p>The pagination token. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no subsequent query exists.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd********</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDhcpOptionsSetsResponseBody build() {
            return new ListDhcpOptionsSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDhcpOptionsSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDhcpOptionsSetsResponseBody</p>
     */
    public static class DhcpOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainNameServers")
        private String domainNameServers;

        @com.aliyun.core.annotation.NameInMap("Ipv6LeaseTime")
        private String ipv6LeaseTime;

        @com.aliyun.core.annotation.NameInMap("LeaseTime")
        private String leaseTime;

        private DhcpOptions(Builder builder) {
            this.domainName = builder.domainName;
            this.domainNameServers = builder.domainNameServers;
            this.ipv6LeaseTime = builder.ipv6LeaseTime;
            this.leaseTime = builder.leaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DhcpOptions create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainNameServers
         */
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        /**
         * @return ipv6LeaseTime
         */
        public String getIpv6LeaseTime() {
            return this.ipv6LeaseTime;
        }

        /**
         * @return leaseTime
         */
        public String getLeaseTime() {
            return this.leaseTime;
        }

        public static final class Builder {
            private String domainName; 
            private String domainNameServers; 
            private String ipv6LeaseTime; 
            private String leaseTime; 

            private Builder() {
            } 

            private Builder(DhcpOptions model) {
                this.domainName = model.domainName;
                this.domainNameServers = model.domainNameServers;
                this.ipv6LeaseTime = model.ipv6LeaseTime;
                this.leaseTime = model.leaseTime;
            } 

            /**
             * <p>The hostname suffix.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The IP address of the DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder domainNameServers(String domainNameServers) {
                this.domainNameServers = domainNameServers;
                return this;
            }

            /**
             * <p>The lease time of the IPv6 DHCP options set.</p>
             * <ul>
             * <li><p>If the lease time is in hours, the unit is h. Valid values: <strong>24h</strong> to <strong>1176h</strong> and <strong>87600h</strong> to <strong>175200h</strong>. Default value: <strong>24h</strong>.</p>
             * </li>
             * <li><p>If the lease time is in days, the unit is d. Valid values: <strong>1d</strong> to <strong>49d</strong> and <strong>3650d</strong> to <strong>7300d</strong>. Default value: <strong>1d</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3650d</p>
             */
            public Builder ipv6LeaseTime(String ipv6LeaseTime) {
                this.ipv6LeaseTime = ipv6LeaseTime;
                return this;
            }

            /**
             * <p>The lease time of the IPv4 DHCP options set.</p>
             * <ul>
             * <li><p>If the lease time is in hours, the unit is h. Valid values: <strong>24h</strong> to <strong>1176h</strong> and <strong>87600h</strong> to <strong>175200h</strong>. Default value: <strong>87600h</strong>.</p>
             * </li>
             * <li><p>If the lease time is in days, the unit is d. Valid values: <strong>1d</strong> to <strong>49d</strong> and <strong>3650d</strong> to <strong>7300d</strong>. Default value: <strong>3650d</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3650d</p>
             */
            public Builder leaseTime(String leaseTime) {
                this.leaseTime = leaseTime;
                return this;
            }

            public DhcpOptions build() {
                return new DhcpOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDhcpOptionsSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDhcpOptionsSetsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDhcpOptionsSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDhcpOptionsSetsResponseBody</p>
     */
    public static class DhcpOptionsSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociateVpcCount")
        private Integer associateVpcCount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DhcpOptions")
        private DhcpOptions dhcpOptions;

        @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetDescription")
        private String dhcpOptionsSetDescription;

        @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetId")
        private String dhcpOptionsSetId;

        @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetName")
        private String dhcpOptionsSetName;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private DhcpOptionsSets(Builder builder) {
            this.associateVpcCount = builder.associateVpcCount;
            this.creationTime = builder.creationTime;
            this.dhcpOptions = builder.dhcpOptions;
            this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
            this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
            this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
            this.ownerId = builder.ownerId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DhcpOptionsSets create() {
            return builder().build();
        }

        /**
         * @return associateVpcCount
         */
        public Integer getAssociateVpcCount() {
            return this.associateVpcCount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dhcpOptions
         */
        public DhcpOptions getDhcpOptions() {
            return this.dhcpOptions;
        }

        /**
         * @return dhcpOptionsSetDescription
         */
        public String getDhcpOptionsSetDescription() {
            return this.dhcpOptionsSetDescription;
        }

        /**
         * @return dhcpOptionsSetId
         */
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        /**
         * @return dhcpOptionsSetName
         */
        public String getDhcpOptionsSetName() {
            return this.dhcpOptionsSetName;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Integer associateVpcCount; 
            private String creationTime; 
            private DhcpOptions dhcpOptions; 
            private String dhcpOptionsSetDescription; 
            private String dhcpOptionsSetId; 
            private String dhcpOptionsSetName; 
            private Long ownerId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(DhcpOptionsSets model) {
                this.associateVpcCount = model.associateVpcCount;
                this.creationTime = model.creationTime;
                this.dhcpOptions = model.dhcpOptions;
                this.dhcpOptionsSetDescription = model.dhcpOptionsSetDescription;
                this.dhcpOptionsSetId = model.dhcpOptionsSetId;
                this.dhcpOptionsSetName = model.dhcpOptionsSetName;
                this.ownerId = model.ownerId;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The number of VPCs associated with the DHCP options set.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder associateVpcCount(Integer associateVpcCount) {
                this.associateVpcCount = associateVpcCount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-21 ***</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The DHCP options configuration.</p>
             */
            public Builder dhcpOptions(DhcpOptions dhcpOptions) {
                this.dhcpOptions = dhcpOptions;
                return this;
            }

            /**
             * <p>The description of the DHCP options set.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
                this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
                return this;
            }

            /**
             * <p>The ID of the DHCP options set.</p>
             * 
             * <strong>example:</strong>
             * <p>dopt-o6w0df4epg9zo8isy****</p>
             */
            public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
                this.dhcpOptionsSetId = dhcpOptionsSetId;
                return this;
            }

            /**
             * <p>The name of the DHCP options set.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
                this.dhcpOptionsSetName = dhcpOptionsSetName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID to which the DHCP options set belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the DHCP options set belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the DHCP options set. Valid values:</p>
             * <ul>
             * <li><p><strong>Available</strong>: available.</p>
             * </li>
             * <li><p><strong>InUse</strong>: in use.</p>
             * </li>
             * <li><p><strong>Pending</strong>: being configured.</p>
             * </li>
             * <li><p><strong>Deleted</strong>: deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public DhcpOptionsSets build() {
                return new DhcpOptionsSets(this);
            } 

        } 

    }
}
