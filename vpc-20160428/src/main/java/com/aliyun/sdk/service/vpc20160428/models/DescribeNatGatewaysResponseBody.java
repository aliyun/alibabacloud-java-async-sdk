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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeNatGatewaysResponseBody model) {
            this.natGateways = model.natGateways;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * NatGateways.
         */
        public Builder natGateways(NatGateways natGateways) {
            this.natGateways = natGateways;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of NAT gateway entries in the list.</p>
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

            private Builder() {
            } 

            private Builder(AccessMode model) {
                this.modeValue = model.modeValue;
                this.tunnelType = model.tunnelType;
            } 

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

            private Builder() {
            } 

            private Builder(ForwardTableIds model) {
                this.forwardTableId = model.forwardTableId;
            } 

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

            private Builder() {
            } 

            private Builder(FullNatTableIds model) {
                this.fullNatTableId = model.fullNatTableId;
            } 

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

            private Builder() {
            } 

            private Builder(IpList model) {
                this.allocationId = model.allocationId;
                this.ipAddress = model.ipAddress;
                this.privateIpAddress = model.privateIpAddress;
                this.snatEntryEnabled = model.snatEntryEnabled;
                this.usingStatus = model.usingStatus;
            } 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * SnatEntryEnabled.
             */
            public Builder snatEntryEnabled(Boolean snatEntryEnabled) {
                this.snatEntryEnabled = snatEntryEnabled;
                return this;
            }

            /**
             * UsingStatus.
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

            private Builder() {
            } 

            private Builder(IpLists model) {
                this.ipList = model.ipList;
            } 

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
    public static class IpPrefixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpPrefix")
        private String ipPrefix;

        private IpPrefixList(Builder builder) {
            this.ipPrefix = builder.ipPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpPrefixList create() {
            return builder().build();
        }

        /**
         * @return ipPrefix
         */
        public String getIpPrefix() {
            return this.ipPrefix;
        }

        public static final class Builder {
            private String ipPrefix; 

            private Builder() {
            } 

            private Builder(IpPrefixList model) {
                this.ipPrefix = model.ipPrefix;
            } 

            /**
             * IpPrefix.
             */
            public Builder ipPrefix(String ipPrefix) {
                this.ipPrefix = ipPrefix;
                return this;
            }

            public IpPrefixList build() {
                return new IpPrefixList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class NatGatewayIpPrefixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpPrefixList")
        private java.util.List<IpPrefixList> ipPrefixList;

        private NatGatewayIpPrefixList(Builder builder) {
            this.ipPrefixList = builder.ipPrefixList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayIpPrefixList create() {
            return builder().build();
        }

        /**
         * @return ipPrefixList
         */
        public java.util.List<IpPrefixList> getIpPrefixList() {
            return this.ipPrefixList;
        }

        public static final class Builder {
            private java.util.List<IpPrefixList> ipPrefixList; 

            private Builder() {
            } 

            private Builder(NatGatewayIpPrefixList model) {
                this.ipPrefixList = model.ipPrefixList;
            } 

            /**
             * IpPrefixList.
             */
            public Builder ipPrefixList(java.util.List<IpPrefixList> ipPrefixList) {
                this.ipPrefixList = ipPrefixList;
                return this;
            }

            public NatGatewayIpPrefixList build() {
                return new NatGatewayIpPrefixList(this);
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

            private Builder() {
            } 

            private Builder(NatGatewayPrivateInfo model) {
                this.eniInstanceId = model.eniInstanceId;
                this.eniType = model.eniType;
                this.izNo = model.izNo;
                this.maxBandwidth = model.maxBandwidth;
                this.maxSessionEstablishRate = model.maxSessionEstablishRate;
                this.maxSessionQuota = model.maxSessionQuota;
                this.privateIpAddress = model.privateIpAddress;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * EniType.
             */
            public Builder eniType(String eniType) {
                this.eniType = eniType;
                return this;
            }

            /**
             * IzNo.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * MaxBandwidth.
             */
            public Builder maxBandwidth(Integer maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * MaxSessionEstablishRate.
             */
            public Builder maxSessionEstablishRate(Integer maxSessionEstablishRate) {
                this.maxSessionEstablishRate = maxSessionEstablishRate;
                return this;
            }

            /**
             * MaxSessionQuota.
             */
            public Builder maxSessionQuota(Integer maxSessionQuota) {
                this.maxSessionQuota = maxSessionQuota;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * VswitchId.
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

            private Builder() {
            } 

            private Builder(SnatTableIds model) {
                this.snatTableId = model.snatTableId;
            } 

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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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

        @com.aliyun.core.annotation.NameInMap("AvailabilityMode")
        private String availabilityMode;

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

        @com.aliyun.core.annotation.NameInMap("IpPrefixList")
        private NatGatewayIpPrefixList ipPrefixList;

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
            this.availabilityMode = builder.availabilityMode;
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
            this.ipPrefixList = builder.ipPrefixList;
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
         * @return availabilityMode
         */
        public String getAvailabilityMode() {
            return this.availabilityMode;
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
         * @return ipPrefixList
         */
        public NatGatewayIpPrefixList getIpPrefixList() {
            return this.ipPrefixList;
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
            private String availabilityMode; 
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
            private NatGatewayIpPrefixList ipPrefixList; 
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

            private Builder() {
            } 

            private Builder(NatGateway model) {
                this.accessMode = model.accessMode;
                this.autoPay = model.autoPay;
                this.availabilityMode = model.availabilityMode;
                this.businessStatus = model.businessStatus;
                this.creationTime = model.creationTime;
                this.deletionProtection = model.deletionProtection;
                this.description = model.description;
                this.ecsMetricEnabled = model.ecsMetricEnabled;
                this.eipBindMode = model.eipBindMode;
                this.enableSessionLog = model.enableSessionLog;
                this.expiredTime = model.expiredTime;
                this.forwardTableIds = model.forwardTableIds;
                this.fullNatTableIds = model.fullNatTableIds;
                this.icmpReplyEnabled = model.icmpReplyEnabled;
                this.instanceChargeType = model.instanceChargeType;
                this.internetChargeType = model.internetChargeType;
                this.ipLists = model.ipLists;
                this.ipPrefixList = model.ipPrefixList;
                this.name = model.name;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayPrivateInfo = model.natGatewayPrivateInfo;
                this.natType = model.natType;
                this.networkType = model.networkType;
                this.privateLinkEnabled = model.privateLinkEnabled;
                this.privateLinkMode = model.privateLinkMode;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.securityProtectionEnabled = model.securityProtectionEnabled;
                this.snatTableIds = model.snatTableIds;
                this.spec = model.spec;
                this.status = model.status;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

            /**
             * AccessMode.
             */
            public Builder accessMode(AccessMode accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * AutoPay.
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * AvailabilityMode.
             */
            public Builder availabilityMode(String availabilityMode) {
                this.availabilityMode = availabilityMode;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EcsMetricEnabled.
             */
            public Builder ecsMetricEnabled(Boolean ecsMetricEnabled) {
                this.ecsMetricEnabled = ecsMetricEnabled;
                return this;
            }

            /**
             * EipBindMode.
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ForwardTableIds.
             */
            public Builder forwardTableIds(ForwardTableIds forwardTableIds) {
                this.forwardTableIds = forwardTableIds;
                return this;
            }

            /**
             * FullNatTableIds.
             */
            public Builder fullNatTableIds(FullNatTableIds fullNatTableIds) {
                this.fullNatTableIds = fullNatTableIds;
                return this;
            }

            /**
             * IcmpReplyEnabled.
             */
            public Builder icmpReplyEnabled(Boolean icmpReplyEnabled) {
                this.icmpReplyEnabled = icmpReplyEnabled;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * IpLists.
             */
            public Builder ipLists(IpLists ipLists) {
                this.ipLists = ipLists;
                return this;
            }

            /**
             * IpPrefixList.
             */
            public Builder ipPrefixList(NatGatewayIpPrefixList ipPrefixList) {
                this.ipPrefixList = ipPrefixList;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * NatGatewayPrivateInfo.
             */
            public Builder natGatewayPrivateInfo(NatGatewayPrivateInfo natGatewayPrivateInfo) {
                this.natGatewayPrivateInfo = natGatewayPrivateInfo;
                return this;
            }

            /**
             * NatType.
             */
            public Builder natType(String natType) {
                this.natType = natType;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * PrivateLinkEnabled.
             */
            public Builder privateLinkEnabled(Boolean privateLinkEnabled) {
                this.privateLinkEnabled = privateLinkEnabled;
                return this;
            }

            /**
             * PrivateLinkMode.
             */
            public Builder privateLinkMode(String privateLinkMode) {
                this.privateLinkMode = privateLinkMode;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * SecurityProtectionEnabled.
             */
            public Builder securityProtectionEnabled(Boolean securityProtectionEnabled) {
                this.securityProtectionEnabled = securityProtectionEnabled;
                return this;
            }

            /**
             * SnatTableIds.
             */
            public Builder snatTableIds(SnatTableIds snatTableIds) {
                this.snatTableIds = snatTableIds;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VpcId.
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

            private Builder() {
            } 

            private Builder(NatGateways model) {
                this.natGateway = model.natGateway;
            } 

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
