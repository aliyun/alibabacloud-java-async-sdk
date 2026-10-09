// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeFirewallVswitchResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallVswitchResourcesResponseBody</p>
 */
public class DescribeFirewallVswitchResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VswitchList")
    private java.util.List<VswitchList> vswitchList;

    private DescribeFirewallVswitchResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vswitchList = builder.vswitchList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallVswitchResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return vswitchList
     */
    public java.util.List<VswitchList> getVswitchList() {
        return this.vswitchList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VswitchList> vswitchList; 

        private Builder() {
        } 

        private Builder(DescribeFirewallVswitchResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vswitchList = model.vswitchList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A81E99DF-07CF-5EE4-966A-9FF9F2F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of vSwitches.</p>
         */
        public Builder vswitchList(java.util.List<VswitchList> vswitchList) {
            this.vswitchList = vswitchList;
            return this;
        }

        public DescribeFirewallVswitchResourcesResponseBody build() {
            return new DescribeFirewallVswitchResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFirewallVswitchResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallVswitchResourcesResponseBody</p>
     */
    public static class FirewallList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirewallId")
        private String firewallId;

        @com.aliyun.core.annotation.NameInMap("FirewallName")
        private String firewallName;

        @com.aliyun.core.annotation.NameInMap("FirewallType")
        private String firewallType;

        private FirewallList(Builder builder) {
            this.firewallId = builder.firewallId;
            this.firewallName = builder.firewallName;
            this.firewallType = builder.firewallType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallList create() {
            return builder().build();
        }

        /**
         * @return firewallId
         */
        public String getFirewallId() {
            return this.firewallId;
        }

        /**
         * @return firewallName
         */
        public String getFirewallName() {
            return this.firewallName;
        }

        /**
         * @return firewallType
         */
        public String getFirewallType() {
            return this.firewallType;
        }

        public static final class Builder {
            private String firewallId; 
            private String firewallName; 
            private String firewallType; 

            private Builder() {
            } 

            private Builder(FirewallList model) {
                this.firewallId = model.firewallId;
                this.firewallName = model.firewallName;
                this.firewallType = model.firewallType;
            } 

            /**
             * <p>The ID of the firewall instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-tr-37145c8f5ede45e9****</p>
             */
            public Builder firewallId(String firewallId) {
                this.firewallId = firewallId;
                return this;
            }

            /**
             * <p>The name of the Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>test-Firewall</p>
             */
            public Builder firewallName(String firewallName) {
                this.firewallName = firewallName;
                return this;
            }

            /**
             * <p>The type of the Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>NatFirewall</p>
             */
            public Builder firewallType(String firewallType) {
                this.firewallType = firewallType;
                return this;
            }

            public FirewallList build() {
                return new FirewallList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFirewallVswitchResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallVswitchResourcesResponseBody</p>
     */
    public static class VswitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIpCount")
        private String availableIpCount;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("FirewallList")
        private java.util.List<FirewallList> firewallList;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("RouteTableType")
        private String routeTableType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("VswitchName")
        private String vswitchName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VswitchList(Builder builder) {
            this.availableIpCount = builder.availableIpCount;
            this.cidrBlock = builder.cidrBlock;
            this.detail = builder.detail;
            this.firewallList = builder.firewallList;
            this.routeTableId = builder.routeTableId;
            this.routeTableType = builder.routeTableType;
            this.status = builder.status;
            this.vswitchId = builder.vswitchId;
            this.vswitchName = builder.vswitchName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswitchList create() {
            return builder().build();
        }

        /**
         * @return availableIpCount
         */
        public String getAvailableIpCount() {
            return this.availableIpCount;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return firewallList
         */
        public java.util.List<FirewallList> getFirewallList() {
            return this.firewallList;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return routeTableType
         */
        public String getRouteTableType() {
            return this.routeTableType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return vswitchName
         */
        public String getVswitchName() {
            return this.vswitchName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String availableIpCount; 
            private String cidrBlock; 
            private String detail; 
            private java.util.List<FirewallList> firewallList; 
            private String routeTableId; 
            private String routeTableType; 
            private String status; 
            private String vswitchId; 
            private String vswitchName; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VswitchList model) {
                this.availableIpCount = model.availableIpCount;
                this.cidrBlock = model.cidrBlock;
                this.detail = model.detail;
                this.firewallList = model.firewallList;
                this.routeTableId = model.routeTableId;
                this.routeTableType = model.routeTableType;
                this.status = model.status;
                this.vswitchId = model.vswitchId;
                this.vswitchName = model.vswitchName;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of available IP addresses in the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder availableIpCount(String availableIpCount) {
                this.availableIpCount = availableIpCount;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.XX/16</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The details of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The list of firewalls.</p>
             */
            public Builder firewallList(java.util.List<FirewallList> firewallList) {
                this.firewallList = firewallList;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-uf6ml7rgw5gzzdr****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The type of the route table. Valid values:</p>
             * <ul>
             * <li><p><strong>Custom</strong>: a custom route table.</p>
             * </li>
             * <li><p><strong>System</strong>: a system route table.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder routeTableType(String routeTableType) {
                this.routeTableType = routeTableType;
                return this;
            }

            /**
             * <p>The configuration status.</p>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp10qla9mgi42eo****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-test</p>
             */
            public Builder vswitchName(String vswitchName) {
                this.vswitchName = vswitchName;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VswitchList build() {
                return new VswitchList(this);
            } 

        } 

    }
}
