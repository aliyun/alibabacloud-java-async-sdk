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
 * {@link DescribeVpcFirewallManualVSwitchListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallManualVSwitchListResponseBody</p>
 */
public class DescribeVpcFirewallManualVSwitchListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VSwitchList")
    private java.util.List<VSwitchList> vSwitchList;

    private DescribeVpcFirewallManualVSwitchListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vSwitchList = builder.vSwitchList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallManualVSwitchListResponseBody create() {
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
     * @return vSwitchList
     */
    public java.util.List<VSwitchList> getVSwitchList() {
        return this.vSwitchList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VSwitchList> vSwitchList; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallManualVSwitchListResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vSwitchList = model.vSwitchList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EED3674-74E7-54DC-8FD4-6A374133****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The vSwitch list.</p>
         */
        public Builder vSwitchList(java.util.List<VSwitchList> vSwitchList) {
            this.vSwitchList = vSwitchList;
            return this;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBody build() {
            return new DescribeVpcFirewallManualVSwitchListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallManualVSwitchListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallManualVSwitchListResponseBody</p>
     */
    public static class VSwitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AvailableIpAddressCount")
        private Long availableIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitchList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.cidrBlock = builder.cidrBlock;
            this.ownerId = builder.ownerId;
            this.regionNo = builder.regionNo;
            this.routeTableId = builder.routeTableId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return availableIpAddressCount
         */
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long availableIpAddressCount; 
            private String cidrBlock; 
            private Long ownerId; 
            private String regionNo; 
            private String routeTableId; 
            private String status; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitchList model) {
                this.aliUid = model.aliUid;
                this.availableIpAddressCount = model.availableIpAddressCount;
                this.cidrBlock = model.cidrBlock;
                this.ownerId = model.ownerId;
                this.regionNo = model.regionNo;
                this.routeTableId = model.routeTableId;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The UID of the Alibaba Cloud account.</p>
             * <blockquote>
             * <p>The primary account of the Cloud Firewall member accounts.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>122167357026****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The number of available IP addresses in the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder availableIpAddressCount(Long availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.31.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The owner user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>137578716100****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The ID of the associate a prefix list with a route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-2zet3gyk01o07so****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp10d0kcp907721z****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-test</p>
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * <p>The VPC-connected instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf62kq7c364sil2z2****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitchList build() {
                return new VSwitchList(this);
            } 

        } 

    }
}
