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
 * {@link DescribeFirewallVSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallVSwitchResponseBody</p>
 */
public class DescribeFirewallVSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VswitchList")
    private java.util.List<VswitchList> vswitchList;

    private DescribeFirewallVSwitchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vswitchList = builder.vswitchList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallVSwitchResponseBody create() {
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

        private Builder(DescribeFirewallVSwitchResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vswitchList = model.vswitchList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VswitchList.
         */
        public Builder vswitchList(java.util.List<VswitchList> vswitchList) {
            this.vswitchList = vswitchList;
            return this;
        }

        public DescribeFirewallVSwitchResponseBody build() {
            return new DescribeFirewallVSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFirewallVSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallVSwitchResponseBody</p>
     */
    public static class FirewallList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirewallId")
        private String firewallId;

        @com.aliyun.core.annotation.NameInMap("FirewallName")
        private String firewallName;

        private FirewallList(Builder builder) {
            this.firewallId = builder.firewallId;
            this.firewallName = builder.firewallName;
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

        public static final class Builder {
            private String firewallId; 
            private String firewallName; 

            private Builder() {
            } 

            private Builder(FirewallList model) {
                this.firewallId = model.firewallId;
                this.firewallName = model.firewallName;
            } 

            /**
             * FirewallId.
             */
            public Builder firewallId(String firewallId) {
                this.firewallId = firewallId;
                return this;
            }

            /**
             * FirewallName.
             */
            public Builder firewallName(String firewallName) {
                this.firewallName = firewallName;
                return this;
            }

            public FirewallList build() {
                return new FirewallList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFirewallVSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallVSwitchResponseBody</p>
     */
    public static class VswitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIpCount")
        private String availableIpCount;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("FirewallCount")
        private String firewallCount;

        @com.aliyun.core.annotation.NameInMap("FirewallList")
        private java.util.List<FirewallList> firewallList;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("VswitchName")
        private String vswitchName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VswitchList(Builder builder) {
            this.availableIpCount = builder.availableIpCount;
            this.cidrBlock = builder.cidrBlock;
            this.firewallCount = builder.firewallCount;
            this.firewallList = builder.firewallList;
            this.memberUid = builder.memberUid;
            this.regionNo = builder.regionNo;
            this.vpcId = builder.vpcId;
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
         * @return firewallCount
         */
        public String getFirewallCount() {
            return this.firewallCount;
        }

        /**
         * @return firewallList
         */
        public java.util.List<FirewallList> getFirewallList() {
            return this.firewallList;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
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
            private String firewallCount; 
            private java.util.List<FirewallList> firewallList; 
            private String memberUid; 
            private String regionNo; 
            private String vpcId; 
            private String vswitchId; 
            private String vswitchName; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VswitchList model) {
                this.availableIpCount = model.availableIpCount;
                this.cidrBlock = model.cidrBlock;
                this.firewallCount = model.firewallCount;
                this.firewallList = model.firewallList;
                this.memberUid = model.memberUid;
                this.regionNo = model.regionNo;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
                this.vswitchName = model.vswitchName;
                this.zoneId = model.zoneId;
            } 

            /**
             * AvailableIpCount.
             */
            public Builder availableIpCount(String availableIpCount) {
                this.availableIpCount = availableIpCount;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * FirewallCount.
             */
            public Builder firewallCount(String firewallCount) {
                this.firewallCount = firewallCount;
                return this;
            }

            /**
             * FirewallList.
             */
            public Builder firewallList(java.util.List<FirewallList> firewallList) {
                this.firewallList = firewallList;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * VswitchName.
             */
            public Builder vswitchName(String vswitchName) {
                this.vswitchName = vswitchName;
                return this;
            }

            /**
             * ZoneId.
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
