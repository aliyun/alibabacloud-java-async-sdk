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
 * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatGatewaysResponseBody</p>
 */
public class DescribeNatGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatGateways")
    private NatGateways natGateways;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNatGatewaysResponseBody(Builder builder) {
        this.natGateways = builder.natGateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return natGateways
     */
    public NatGateways getNatGateways() {
        return this.natGateways;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private NatGateways natGateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details about the NAT gateway.</p>
         */
        public Builder natGateways(NatGateways natGateways) {
            this.natGateways = natGateways;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of NAT gateway entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNatGatewaysResponseBody build() {
            return new DescribeNatGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class AccessMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModeValue")
        private String modeValue;

        @com.aliyun.core.annotation.NameInMap("TunnelType")
        private String tunnelType;

        private AccessMode(Builder builder) {
            this.modeValue = builder.modeValue;
            this.tunnelType = builder.tunnelType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessMode create() {
            return builder().build();
        }

        /**
         * @return modeValue
         */
        public String getModeValue() {
            return this.modeValue;
        }

        /**
         * @return tunnelType
         */
        public String getTunnelType() {
            return this.tunnelType;
        }

        public static final class Builder {
            private String modeValue; 
            private String tunnelType; 

            /**
             * ModeValue.
             */
            public Builder modeValue(String modeValue) {
                this.modeValue = modeValue;
                return this;
            }

            /**
             * TunnelType.
             */
            public Builder tunnelType(String tunnelType) {
                this.tunnelType = tunnelType;
                return this;
            }

            public AccessMode build() {
                return new AccessMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class ForwardTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardTableId")
        private java.util.List<String> forwardTableId;

        private ForwardTableIds(Builder builder) {
            this.forwardTableId = builder.forwardTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTableIds create() {
            return builder().build();
        }

        /**
         * @return forwardTableId
         */
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

        public static final class Builder {
            private java.util.List<String> forwardTableId; 

            /**
             * ForwardTableId.
             */
            public Builder forwardTableId(java.util.List<String> forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            public ForwardTableIds build() {
                return new ForwardTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class FullNatTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullNatTableId")
        private java.util.List<String> fullNatTableId;

        private FullNatTableIds(Builder builder) {
            this.fullNatTableId = builder.fullNatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullNatTableIds create() {
            return builder().build();
        }

        /**
         * @return fullNatTableId
         */
        public java.util.List<String> getFullNatTableId() {
            return this.fullNatTableId;
        }

        public static final class Builder {
            private java.util.List<String> fullNatTableId; 

            /**
             * FullNatTableId.
             */
            public Builder fullNatTableId(java.util.List<String> fullNatTableId) {
                this.fullNatTableId = fullNatTableId;
                return this;
            }

            public FullNatTableIds build() {
                return new FullNatTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class IpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("SnatEntryEnabled")
        private Boolean snatEntryEnabled;

        @com.aliyun.core.annotation.NameInMap("UsingStatus")
        private String usingStatus;

        private IpList(Builder builder) {
            this.allocationId = builder.allocationId;
            this.ipAddress = builder.ipAddress;
            this.privateIpAddress = builder.privateIpAddress;
            this.snatEntryEnabled = builder.snatEntryEnabled;
            this.usingStatus = builder.usingStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return snatEntryEnabled
         */
        public Boolean getSnatEntryEnabled() {
            return this.snatEntryEnabled;
        }

        /**
         * @return usingStatus
         */
        public String getUsingStatus() {
            return this.usingStatus;
        }

        public static final class Builder {
            private String allocationId; 
            private String ipAddress; 
            private String privateIpAddress; 
            private Boolean snatEntryEnabled; 
            private String usingStatus; 

            /**
             * <p>The ID of the EIP associated with the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-m5egzuvp3dgixen6****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The IP address of the EIP associated with the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>116.62.XX.XX</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The private IP address of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>Indicates whether IP addresses that are used in DNAT entries can be specified in SNAT entries. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder snatEntryEnabled(Boolean snatEntryEnabled) {
                this.snatEntryEnabled = snatEntryEnabled;
                return this;
            }

            /**
             * <p>The association between the EIP and the Internet NAT gateway. Valid values:</p>
             * <ul>
             * <li><strong>UsedByForwardTable</strong>: The EIP is specified in a DNAT entry.</li>
             * <li><strong>UsedBySnatTable</strong>: The EIP is specified in an SNAT entry.</li>
             * <li><strong>UsedByForwardSnatTable</strong>: The EIP is specified in both an SNAT entry and a DNAT entry.</li>
             * <li><strong>Idle</strong>: The EIP is not specified in a DNAT or SNAT entry.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UsedByForwardTable</p>
             */
            public Builder usingStatus(String usingStatus) {
                this.usingStatus = usingStatus;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class IpLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpList")
        private java.util.List<IpList> ipList;

        private IpLists(Builder builder) {
            this.ipList = builder.ipList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpLists create() {
            return builder().build();
        }

        /**
         * @return ipList
         */
        public java.util.List<IpList> getIpList() {
            return this.ipList;
        }

        public static final class Builder {
            private java.util.List<IpList> ipList; 

            /**
             * IpList.
             */
            public Builder ipList(java.util.List<IpList> ipList) {
                this.ipList = ipList;
                return this;
            }

            public IpLists build() {
                return new IpLists(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class NatGatewayPrivateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniInstanceId")
        private String eniInstanceId;

        @com.aliyun.core.annotation.NameInMap("EniType")
        private String eniType;

        @com.aliyun.core.annotation.NameInMap("IzNo")
        private String izNo;

        @com.aliyun.core.annotation.NameInMap("MaxBandwidth")
        private Integer maxBandwidth;

        @com.aliyun.core.annotation.NameInMap("MaxSessionEstablishRate")
        private Integer maxSessionEstablishRate;

        @com.aliyun.core.annotation.NameInMap("MaxSessionQuota")
        private Integer maxSessionQuota;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private NatGatewayPrivateInfo(Builder builder) {
            this.eniInstanceId = builder.eniInstanceId;
            this.eniType = builder.eniType;
            this.izNo = builder.izNo;
            this.maxBandwidth = builder.maxBandwidth;
            this.maxSessionEstablishRate = builder.maxSessionEstablishRate;
            this.maxSessionQuota = builder.maxSessionQuota;
            this.privateIpAddress = builder.privateIpAddress;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayPrivateInfo create() {
            return builder().build();
        }

        /**
         * @return eniInstanceId
         */
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        /**
         * @return eniType
         */
        public String getEniType() {
            return this.eniType;
        }

        /**
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
        }

        /**
         * @return maxBandwidth
         */
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

        /**
         * @return maxSessionEstablishRate
         */
        public Integer getMaxSessionEstablishRate() {
            return this.maxSessionEstablishRate;
        }

        /**
         * @return maxSessionQuota
         */
        public Integer getMaxSessionQuota() {
            return this.maxSessionQuota;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String eniInstanceId; 
            private String eniType; 
            private String izNo; 
            private Integer maxBandwidth; 
            private Integer maxSessionEstablishRate; 
            private Integer maxSessionQuota; 
            private String privateIpAddress; 
            private String vswitchId; 

            /**
             * <p>The ID of the elastic network interface (ENI).</p>
             * 
             * <strong>example:</strong>
             * <p>eni-m5eg4ozy5st8q3q4****</p>
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * <p>The mode in which the ENI is associated with the NAT gateway.</p>
             * <ul>
             * <li><strong>indirect</strong>: non-cut-through mode</li>
             * <li>If an empty value is returned, it indicates that the cut-through mode is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>indirect</p>
             */
            public Builder eniType(String eniType) {
                this.eniType = eniType;
                return this;
            }

            /**
             * <p>The zone to which the NAT gateway belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * <p>The maximum bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5120</p>
             */
            public Builder maxBandwidth(Integer maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * <p>The number of new connections to the NAT gateway. Unit: connections per second.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder maxSessionEstablishRate(Integer maxSessionEstablishRate) {
                this.maxSessionEstablishRate = maxSessionEstablishRate;
                return this;
            }

            /**
             * <p>The number of concurrent connections to the NAT gateway. Unit: connections.</p>
             * 
             * <strong>example:</strong>
             * <p>2000000</p>
             */
            public Builder maxSessionQuota(Integer maxSessionQuota) {
                this.maxSessionQuota = maxSessionQuota;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the NAT gateway belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1s2laxhdf9ayjbo****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public NatGatewayPrivateInfo build() {
                return new NatGatewayPrivateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class SnatTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnatTableId")
        private java.util.List<String> snatTableId;

        private SnatTableIds(Builder builder) {
            this.snatTableId = builder.snatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTableIds create() {
            return builder().build();
        }

        /**
         * @return snatTableId
         */
        public java.util.List<String> getSnatTableId() {
            return this.snatTableId;
        }

        public static final class Builder {
            private java.util.List<String> snatTableId; 

            /**
             * SnatTableId.
             */
            public Builder snatTableId(java.util.List<String> snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            public SnatTableIds build() {
                return new SnatTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>valueTest</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class NatGateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private AccessMode accessMode;

        @com.aliyun.core.annotation.NameInMap("AutoPay")
        private Boolean autoPay;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcsMetricEnabled")
        private Boolean ecsMetricEnabled;

        @com.aliyun.core.annotation.NameInMap("EipBindMode")
        private String eipBindMode;

        @com.aliyun.core.annotation.NameInMap("EnableSessionLog")
        private String enableSessionLog;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ForwardTableIds")
        private ForwardTableIds forwardTableIds;

        @com.aliyun.core.annotation.NameInMap("FullNatTableIds")
        private FullNatTableIds fullNatTableIds;

        @com.aliyun.core.annotation.NameInMap("IcmpReplyEnabled")
        private Boolean icmpReplyEnabled;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpLists")
        private IpLists ipLists;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayPrivateInfo")
        private NatGatewayPrivateInfo natGatewayPrivateInfo;

        @com.aliyun.core.annotation.NameInMap("NatType")
        private String natType;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PrivateLinkEnabled")
        private Boolean privateLinkEnabled;

        @com.aliyun.core.annotation.NameInMap("PrivateLinkMode")
        private String privateLinkMode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityProtectionEnabled")
        private Boolean securityProtectionEnabled;

        @com.aliyun.core.annotation.NameInMap("SnatTableIds")
        private SnatTableIds snatTableIds;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NatGateway(Builder builder) {
            this.accessMode = builder.accessMode;
            this.autoPay = builder.autoPay;
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.deletionProtection = builder.deletionProtection;
            this.description = builder.description;
            this.ecsMetricEnabled = builder.ecsMetricEnabled;
            this.eipBindMode = builder.eipBindMode;
            this.enableSessionLog = builder.enableSessionLog;
            this.expiredTime = builder.expiredTime;
            this.forwardTableIds = builder.forwardTableIds;
            this.fullNatTableIds = builder.fullNatTableIds;
            this.icmpReplyEnabled = builder.icmpReplyEnabled;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.ipLists = builder.ipLists;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayPrivateInfo = builder.natGatewayPrivateInfo;
            this.natType = builder.natType;
            this.networkType = builder.networkType;
            this.privateLinkEnabled = builder.privateLinkEnabled;
            this.privateLinkMode = builder.privateLinkMode;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityProtectionEnabled = builder.securityProtectionEnabled;
            this.snatTableIds = builder.snatTableIds;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateway create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public AccessMode getAccessMode() {
            return this.accessMode;
        }

        /**
         * @return autoPay
         */
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsMetricEnabled
         */
        public Boolean getEcsMetricEnabled() {
            return this.ecsMetricEnabled;
        }

        /**
         * @return eipBindMode
         */
        public String getEipBindMode() {
            return this.eipBindMode;
        }

        /**
         * @return enableSessionLog
         */
        public String getEnableSessionLog() {
            return this.enableSessionLog;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return forwardTableIds
         */
        public ForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
        }

        /**
         * @return fullNatTableIds
         */
        public FullNatTableIds getFullNatTableIds() {
            return this.fullNatTableIds;
        }

        /**
         * @return icmpReplyEnabled
         */
        public Boolean getIcmpReplyEnabled() {
            return this.icmpReplyEnabled;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipLists
         */
        public IpLists getIpLists() {
            return this.ipLists;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayPrivateInfo
         */
        public NatGatewayPrivateInfo getNatGatewayPrivateInfo() {
            return this.natGatewayPrivateInfo;
        }

        /**
         * @return natType
         */
        public String getNatType() {
            return this.natType;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return privateLinkEnabled
         */
        public Boolean getPrivateLinkEnabled() {
            return this.privateLinkEnabled;
        }

        /**
         * @return privateLinkMode
         */
        public String getPrivateLinkMode() {
            return this.privateLinkMode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityProtectionEnabled
         */
        public Boolean getSecurityProtectionEnabled() {
            return this.securityProtectionEnabled;
        }

        /**
         * @return snatTableIds
         */
        public SnatTableIds getSnatTableIds() {
            return this.snatTableIds;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
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
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private AccessMode accessMode; 
            private Boolean autoPay; 
            private String businessStatus; 
            private String creationTime; 
            private Boolean deletionProtection; 
            private String description; 
            private Boolean ecsMetricEnabled; 
            private String eipBindMode; 
            private String enableSessionLog; 
            private String expiredTime; 
            private ForwardTableIds forwardTableIds; 
            private FullNatTableIds fullNatTableIds; 
            private Boolean icmpReplyEnabled; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private IpLists ipLists; 
            private String name; 
            private String natGatewayId; 
            private NatGatewayPrivateInfo natGatewayPrivateInfo; 
            private String natType; 
            private String networkType; 
            private Boolean privateLinkEnabled; 
            private String privateLinkMode; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean securityProtectionEnabled; 
            private SnatTableIds snatTableIds; 
            private String spec; 
            private String status; 
            private Tags tags; 
            private String vpcId; 

            /**
             * AccessMode.
             */
            public Builder accessMode(AccessMode accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * <p>Indicates whether automatic payment is enabled. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: no</li>
             * <li><strong>true</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * <p>The status of the NAT gateway. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: normal</li>
             * <li><strong>FinancialLocked</strong>: locked due to overdue payments</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The time when the NAT gateway was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:20Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the deletion protection feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The description of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>NAT</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the traffic monitoring feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ecsMetricEnabled(Boolean ecsMetricEnabled) {
                this.ecsMetricEnabled = ecsMetricEnabled;
                return this;
            }

            /**
             * <p>The mode in which the NAT gateway is associated with an elastic IP address (EIP). Valid values:</p>
             * <ul>
             * <li><strong>MULTI_BINDED</strong>: multi-EIP-to-ENI mode</li>
             * <li><strong>NAT</strong>: NAT mode, which is compatible with IPv4 addresses.</li>
             * </ul>
             * <blockquote>
             * <p> Note: If you use the NAT mode, the EIP occupies one private IP address on the vSwitch of the NAT gateway. Make sure that the vSwitch has sufficient private IP addresses. Otherwise, the NAT gateway fails to be associated with the EIP. In NAT mode, you can associate a NAT gateway with up to 50 EIPs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MULTI_BINDED</p>
             */
            public Builder eipBindMode(String eipBindMode) {
                this.eipBindMode = eipBindMode;
                return this;
            }

            /**
             * EnableSessionLog.
             */
            public Builder enableSessionLog(String enableSessionLog) {
                this.enableSessionLog = enableSessionLog;
                return this;
            }

            /**
             * <p>The time when the NAT gateway expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-26T16:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The ID of the DNAT table.</p>
             */
            public Builder forwardTableIds(ForwardTableIds forwardTableIds) {
                this.forwardTableIds = forwardTableIds;
                return this;
            }

            /**
             * <p>The ID of the FULLNAT table.</p>
             */
            public Builder fullNatTableIds(FullNatTableIds fullNatTableIds) {
                this.fullNatTableIds = fullNatTableIds;
                return this;
            }

            /**
             * <p>Indicates whether the ICMP non-retrieval feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder icmpReplyEnabled(Boolean icmpReplyEnabled) {
                this.icmpReplyEnabled = icmpReplyEnabled;
                return this;
            }

            /**
             * <p>The billing method of the NAT gateway. The value is set to <strong>PostPaid</strong>, which indicates the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The metering method of the NAT gateway. Valid values:</p>
             * <ul>
             * <li><strong>PayBySpec</strong>: pay-by-specification</li>
             * <li><strong>PayByLcu</strong>: pay-by-CU</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByLcu</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The list of elastic IP addresses (EIPs) that are associated with the Internet NAT gateway.</p>
             */
            public Builder ipLists(IpLists ipLists) {
                this.ipLists = ipLists;
                return this;
            }

            /**
             * <p>The name of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1047e2d4z7kf2ki****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The private network information about the enhanced Internet NAT gateway.</p>
             * <blockquote>
             * <p> If <strong>NatType</strong> is set to <strong>Normal</strong>, all parameters returned in this list are empty.</p>
             * </blockquote>
             */
            public Builder natGatewayPrivateInfo(NatGatewayPrivateInfo natGatewayPrivateInfo) {
                this.natGatewayPrivateInfo = natGatewayPrivateInfo;
                return this;
            }

            /**
             * <p>The type of the NAT gateway. The value is set to <strong>Enhanced</strong> (enhanced NAT gateway).</p>
             * 
             * <strong>example:</strong>
             * <p>Enhanced</p>
             */
            public Builder natType(String natType) {
                this.natType = natType;
                return this;
            }

            /**
             * <p>The type of NAT gateway. Valid values:</p>
             * <ul>
             * <li><strong>internet</strong>: an Internet NAT gateway</li>
             * <li><strong>intranet</strong>: a VPC NAT gateway</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>Indicates whether the NAT gateway supports PrivateLink. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder privateLinkEnabled(Boolean privateLinkEnabled) {
                this.privateLinkEnabled = privateLinkEnabled;
                return this;
            }

            /**
             * <p>The mode that is used by PrivateLink. Valid values:</p>
             * <ul>
             * <li><strong>FullNat</strong>: the FULLNAT mode</li>
             * <li><strong>Geneve</strong>: the GENEVE mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullNat</p>
             */
            public Builder privateLinkMode(String privateLinkMode) {
                this.privateLinkMode = privateLinkMode;
                return this;
            }

            /**
             * <p>The ID of the region where the NAT gateway is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the contiguous EIP group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the firewall feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: no</li>
             * <li><strong>true</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder securityProtectionEnabled(Boolean securityProtectionEnabled) {
                this.securityProtectionEnabled = securityProtectionEnabled;
                return this;
            }

            /**
             * <p>The ID of the SNAT table of the NAT gateway.</p>
             */
            public Builder snatTableIds(SnatTableIds snatTableIds) {
                this.snatTableIds = snatTableIds;
                return this;
            }

            /**
             * <p>The size of the NAT gateway. An empty value is returned for the parameter.</p>
             * <p>If <strong>InternetChargeType</strong> is set to <strong>PayByLcu</strong>, an empty value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the NAT gateway. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: After you send a request to create a NAT gateway, the system creates the NAT gateway in the background. The NAT gateway remains in the Creating state until the operation is completed.</li>
             * <li><strong>Available</strong>: The NAT gateway remains in a stable state after the NAT gateway is created.</li>
             * <li><strong>Modifying</strong>: After you send a request to modify a NAT gateway, the system modifies the NAT gateway in the background. The NAT gateway remains in the Modifying state until the operation is completed.</li>
             * <li><strong>Deleting</strong>: After you send a request to delete a NAT gateway, the system deletes the NAT gateway in the background. The NAT gateway remains in the Deleting state until the operation is completed.</li>
             * <li><strong>Converting</strong>: After you send a request to upgrade a standard NAT gateway to an enhanced NAT gateway, the system upgrades the NAT gateway in the background. The NAT gateway remains in the Converting state until the operation is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are added to the resource group.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC where the NAT gateway is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp15zckdt37pq72z****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NatGateway build() {
                return new NatGateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class NatGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NatGateway")
        private java.util.List<NatGateway> natGateway;

        private NatGateways(Builder builder) {
            this.natGateway = builder.natGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return natGateway
         */
        public java.util.List<NatGateway> getNatGateway() {
            return this.natGateway;
        }

        public static final class Builder {
            private java.util.List<NatGateway> natGateway; 

            /**
             * NatGateway.
             */
            public Builder natGateway(java.util.List<NatGateway> natGateway) {
                this.natGateway = natGateway;
                return this;
            }

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
}
