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
 * {@link DescribeAccessInstanceVSwitchListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessInstanceVSwitchListResponseBody</p>
 */
public class DescribeAccessInstanceVSwitchListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List<Zones> zones;

    private DescribeAccessInstanceVSwitchListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessInstanceVSwitchListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return zones
     */
    public java.util.List<Zones> getZones() {
        return this.zones;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<Zones> zones; 

        private Builder() {
        } 

        private Builder(DescribeAccessInstanceVSwitchListResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.zones = model.zones;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Zones.
         */
        public Builder zones(java.util.List<Zones> zones) {
            this.zones = zones;
            return this;
        }

        public DescribeAccessInstanceVSwitchListResponseBody build() {
            return new DescribeAccessInstanceVSwitchListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessInstanceVSwitchListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessInstanceVSwitchListResponseBody</p>
     */
    public static class VSwitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIpAddressCount")
        private Long availableIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("FirewallVSwitch")
        private Boolean firewallVSwitch;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VSwitchList(Builder builder) {
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.cidrBlock = builder.cidrBlock;
            this.firewallVSwitch = builder.firewallVSwitch;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchList create() {
            return builder().build();
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
         * @return firewallVSwitch
         */
        public Boolean getFirewallVSwitch() {
            return this.firewallVSwitch;
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

        public static final class Builder {
            private Long availableIpAddressCount; 
            private String cidrBlock; 
            private Boolean firewallVSwitch; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VSwitchList model) {
                this.availableIpAddressCount = model.availableIpAddressCount;
                this.cidrBlock = model.cidrBlock;
                this.firewallVSwitch = model.firewallVSwitch;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
                this.vpcId = model.vpcId;
            } 

            /**
             * AvailableIpAddressCount.
             */
            public Builder availableIpAddressCount(Long availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
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
             * FirewallVSwitch.
             */
            public Builder firewallVSwitch(Boolean firewallVSwitch) {
                this.firewallVSwitch = firewallVSwitch;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VSwitchName.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VSwitchList build() {
                return new VSwitchList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccessInstanceVSwitchListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessInstanceVSwitchListResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchList")
        private java.util.List<VSwitchList> vSwitchList;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.vSwitchList = builder.vSwitchList;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return vSwitchList
         */
        public java.util.List<VSwitchList> getVSwitchList() {
            return this.vSwitchList;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<VSwitchList> vSwitchList; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.vSwitchList = model.vSwitchList;
                this.zoneId = model.zoneId;
            } 

            /**
             * VSwitchList.
             */
            public Builder vSwitchList(java.util.List<VSwitchList> vSwitchList) {
                this.vSwitchList = vSwitchList;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}
