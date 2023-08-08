// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDhcpOptionsSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDhcpOptionsSetsResponseBody</p>
 */
public class ListDhcpOptionsSetsResponseBody extends TeaModel {
    @NameInMap("DhcpOptionsSets")
    private java.util.List < DhcpOptionsSets> dhcpOptionsSets;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return dhcpOptionsSets
     */
    public java.util.List < DhcpOptionsSets> getDhcpOptionsSets() {
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
        private java.util.List < DhcpOptionsSets> dhcpOptionsSets; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * The list of the DHCP options sets.
         */
        public Builder dhcpOptionsSets(java.util.List < DhcpOptionsSets> dhcpOptionsSets) {
            this.dhcpOptionsSets = dhcpOptionsSets;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no next query is to be sent.
         * *   If a value is returned for **NextToken**, the value is the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDhcpOptionsSetsResponseBody build() {
            return new ListDhcpOptionsSetsResponseBody(this);
        } 

    } 

    public static class DhcpOptions extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameServers")
        private String domainNameServers;

        @NameInMap("Ipv6LeaseTime")
        private String ipv6LeaseTime;

        @NameInMap("LeaseTime")
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

            /**
             * The suffix of the hostname.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The DNS server IP address.
             */
            public Builder domainNameServers(String domainNameServers) {
                this.domainNameServers = domainNameServers;
                return this;
            }

            /**
             * The lease time of the IPv6 addresses for the DHCP options set.
             * <p>
             * 
             * *   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.
             * *   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.
             */
            public Builder ipv6LeaseTime(String ipv6LeaseTime) {
                this.ipv6LeaseTime = ipv6LeaseTime;
                return this;
            }

            /**
             * The lease time of the IPv4 addresses for the DHCP options set.
             * <p>
             * 
             * *   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.
             * *   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class DhcpOptionsSets extends TeaModel {
        @NameInMap("AssociateVpcCount")
        private Integer associateVpcCount;

        @NameInMap("DhcpOptions")
        private DhcpOptions dhcpOptions;

        @NameInMap("DhcpOptionsSetDescription")
        private String dhcpOptionsSetDescription;

        @NameInMap("DhcpOptionsSetId")
        private String dhcpOptionsSetId;

        @NameInMap("DhcpOptionsSetName")
        private String dhcpOptionsSetName;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private DhcpOptionsSets(Builder builder) {
            this.associateVpcCount = builder.associateVpcCount;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Integer associateVpcCount; 
            private DhcpOptions dhcpOptions; 
            private String dhcpOptionsSetDescription; 
            private String dhcpOptionsSetId; 
            private String dhcpOptionsSetName; 
            private Long ownerId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * The number of VPCs with which the DHCP options set is associated.
             */
            public Builder associateVpcCount(Integer associateVpcCount) {
                this.associateVpcCount = associateVpcCount;
                return this;
            }

            /**
             * The configuration information about the DHCP options set.
             */
            public Builder dhcpOptions(DhcpOptions dhcpOptions) {
                this.dhcpOptions = dhcpOptions;
                return this;
            }

            /**
             * The description of the DHCP options set.
             */
            public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
                this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
                return this;
            }

            /**
             * The ID of the DHCP options set.
             */
            public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
                this.dhcpOptionsSetId = dhcpOptionsSetId;
                return this;
            }

            /**
             * The name of the DHCP options set.
             */
            public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
                this.dhcpOptionsSetName = dhcpOptionsSetName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the DHCP options set belongs.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the DHCP options set. Valid values:
             * <p>
             * 
             * *   **Available**: available
             * *   **InUse**: in use
             * *   **Pending**: being configured
             * *   **Deleted**: deleted
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public DhcpOptionsSets build() {
                return new DhcpOptionsSets(this);
            } 

        } 

    }
}
