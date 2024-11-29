// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDhcpOptionsSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetDhcpOptionsSetResponseBody</p>
 */
public class GetDhcpOptionsSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociateVpcs")
    private java.util.List < AssociateVpcs> associateVpcs;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private GetDhcpOptionsSetResponseBody(Builder builder) {
        this.associateVpcs = builder.associateVpcs;
        this.dhcpOptions = builder.dhcpOptions;
        this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDhcpOptionsSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return associateVpcs
     */
    public java.util.List < AssociateVpcs> getAssociateVpcs() {
        return this.associateVpcs;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.List < AssociateVpcs> associateVpcs; 
        private DhcpOptions dhcpOptions; 
        private String dhcpOptionsSetDescription; 
        private String dhcpOptionsSetId; 
        private String dhcpOptionsSetName; 
        private Long ownerId; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List < Tags> tags; 

        /**
         * <p>The information about the virtual private cloud (VPC) that is associated with the DHCP options set.</p>
         */
        public Builder associateVpcs(java.util.List < AssociateVpcs> associateVpcs) {
            this.associateVpcs = associateVpcs;
            return this;
        }

        /**
         * <p>The configuration information about the DHCP options set.</p>
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
         * <p>The ID of the Alibaba Cloud account to which the DHCP options set belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>283117732402483989</p>
         */
        public Builder ownerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
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
         * <li><strong>Available</strong>: available</li>
         * <li><strong>InUse</strong>: in use</li>
         * <li><strong>Deleted</strong>: deleted</li>
         * <li><strong>Pending</strong>: being configured</li>
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
         * <p>The tag list.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetDhcpOptionsSetResponseBody build() {
            return new GetDhcpOptionsSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDhcpOptionsSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetDhcpOptionsSetResponseBody</p>
     */
    public static class AssociateVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociateStatus")
        private String associateStatus;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AssociateVpcs(Builder builder) {
            this.associateStatus = builder.associateStatus;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociateVpcs create() {
            return builder().build();
        }

        /**
         * @return associateStatus
         */
        public String getAssociateStatus() {
            return this.associateStatus;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String associateStatus; 
            private String vpcId; 

            /**
             * <p>The status of the VPC that is associated with the DHCP options set. Valid values:</p>
             * <ul>
             * <li><strong>InUse</strong>: in use</li>
             * <li><strong>Pending</strong>: being configured</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
             */
            public Builder associateStatus(String associateStatus) {
                this.associateStatus = associateStatus;
                return this;
            }

            /**
             * <p>The ID of the VPC that is associated with the DHCP options set.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-eb3b54r6otues4tjj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AssociateVpcs build() {
                return new AssociateVpcs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDhcpOptionsSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetDhcpOptionsSetResponseBody</p>
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

            /**
             * <p>The suffix of the hostname.</p>
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
             * <p>192.XX.XX.123</p>
             */
            public Builder domainNameServers(String domainNameServers) {
                this.domainNameServers = domainNameServers;
                return this;
            }

            /**
             * <p>The lease time of the IPv6 addresses for the DHCP options set.</p>
             * <ul>
             * <li>If you use hours as the unit, Valid values are <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>87600h</strong>.</li>
             * <li>If you use days as the unit, Valid values are <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>3650d</strong>.</li>
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
             * <p>The lease time of the IPv4 addresses for the DHCP options set.</p>
             * <ul>
             * <li>If you use hours as the unit, valid values are <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>87600h</strong>.</li>
             * <li>If you use days as the unit, valid values are <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>3650d</strong>.</li>
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
     * {@link GetDhcpOptionsSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetDhcpOptionsSetResponseBody</p>
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
}
