// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVccResponseBody} extends {@link TeaModel}
 *
 * <p>GetVccResponseBody</p>
 */
public class GetVccResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Content")
    private Content content;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetVccResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVccResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVccResponseBody build() {
            return new GetVccResponseBody(this);
        } 

    } 

    public static class AliyunRouterInfo extends TeaModel {
        @NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @NameInMap("Mask")
        private String mask;

        @NameInMap("PcId")
        private String pcId;

        @NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @NameInMap("VbrId")
        private String vbrId;

        @NameInMap("VlanId")
        private String vlanId;

        private AliyunRouterInfo(Builder builder) {
            this.localGatewayIp = builder.localGatewayIp;
            this.mask = builder.mask;
            this.pcId = builder.pcId;
            this.peerGatewayIp = builder.peerGatewayIp;
            this.vbrId = builder.vbrId;
            this.vlanId = builder.vlanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunRouterInfo create() {
            return builder().build();
        }

        /**
         * @return localGatewayIp
         */
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return pcId
         */
        public String getPcId() {
            return this.pcId;
        }

        /**
         * @return peerGatewayIp
         */
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        /**
         * @return vbrId
         */
        public String getVbrId() {
            return this.vbrId;
        }

        /**
         * @return vlanId
         */
        public String getVlanId() {
            return this.vlanId;
        }

        public static final class Builder {
            private String localGatewayIp; 
            private String mask; 
            private String pcId; 
            private String peerGatewayIp; 
            private String vbrId; 
            private String vlanId; 

            /**
             * LocalGatewayIp.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * Mask.
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * PcId.
             */
            public Builder pcId(String pcId) {
                this.pcId = pcId;
                return this;
            }

            /**
             * PeerGatewayIp.
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * VbrId.
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * VlanId.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            public AliyunRouterInfo build() {
                return new AliyunRouterInfo(this);
            } 

        } 

    }
    public static class CcInfos extends TeaModel {
        @NameInMap("CcId")
        private String ccId;

        @NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @NameInMap("RemoteGatewayIp")
        private String remoteGatewayIp;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubnetMask")
        private String subnetMask;

        @NameInMap("VlanId")
        private String vlanId;

        private CcInfos(Builder builder) {
            this.ccId = builder.ccId;
            this.localGatewayIp = builder.localGatewayIp;
            this.remoteGatewayIp = builder.remoteGatewayIp;
            this.status = builder.status;
            this.subnetMask = builder.subnetMask;
            this.vlanId = builder.vlanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CcInfos create() {
            return builder().build();
        }

        /**
         * @return ccId
         */
        public String getCcId() {
            return this.ccId;
        }

        /**
         * @return localGatewayIp
         */
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        /**
         * @return remoteGatewayIp
         */
        public String getRemoteGatewayIp() {
            return this.remoteGatewayIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetMask
         */
        public String getSubnetMask() {
            return this.subnetMask;
        }

        /**
         * @return vlanId
         */
        public String getVlanId() {
            return this.vlanId;
        }

        public static final class Builder {
            private String ccId; 
            private String localGatewayIp; 
            private String remoteGatewayIp; 
            private String status; 
            private String subnetMask; 
            private String vlanId; 

            /**
             * CcId.
             */
            public Builder ccId(String ccId) {
                this.ccId = ccId;
                return this;
            }

            /**
             * LocalGatewayIp.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * RemoteGatewayIp.
             */
            public Builder remoteGatewayIp(String remoteGatewayIp) {
                this.remoteGatewayIp = remoteGatewayIp;
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
             * SubnetMask.
             */
            public Builder subnetMask(String subnetMask) {
                this.subnetMask = subnetMask;
                return this;
            }

            /**
             * vlanid
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            public CcInfos build() {
                return new CcInfos(this);
            } 

        } 

    }
    public static class CisRouterInfo extends TeaModel {
        @NameInMap("CcInfos")
        private java.util.List < CcInfos> ccInfos;

        @NameInMap("CcrId")
        private String ccrId;

        private CisRouterInfo(Builder builder) {
            this.ccInfos = builder.ccInfos;
            this.ccrId = builder.ccrId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CisRouterInfo create() {
            return builder().build();
        }

        /**
         * @return ccInfos
         */
        public java.util.List < CcInfos> getCcInfos() {
            return this.ccInfos;
        }

        /**
         * @return ccrId
         */
        public String getCcrId() {
            return this.ccrId;
        }

        public static final class Builder {
            private java.util.List < CcInfos> ccInfos; 
            private String ccrId; 

            /**
             * CcInfos.
             */
            public Builder ccInfos(java.util.List < CcInfos> ccInfos) {
                this.ccInfos = ccInfos;
                return this;
            }

            /**
             * CcrId.
             */
            public Builder ccrId(String ccrId) {
                this.ccrId = ccrId;
                return this;
            }

            public CisRouterInfo build() {
                return new CisRouterInfo(this);
            } 

        } 

    }
    public static class VpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("Name")
        private String name;

        @NameInMap("VpdId")
        private String vpdId;

        private VpdBaseInfo(Builder builder) {
            this.cidr = builder.cidr;
            this.gmtCreate = builder.gmtCreate;
            this.name = builder.name;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdBaseInfo create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String cidr; 
            private String gmtCreate; 
            private String name; 
            private String vpdId; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public VpdBaseInfo build() {
                return new VpdBaseInfo(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("AliyunRouterInfo")
        private java.util.List < AliyunRouterInfo> aliyunRouterInfo;

        @NameInMap("BandwidthStr")
        private String bandwidthStr;

        @NameInMap("BgpCidr")
        private String bgpCidr;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CisRouterInfo")
        private java.util.List < CisRouterInfo> cisRouterInfo;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CurrentNode")
        private String currentNode;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("LineOperator")
        private String lineOperator;

        @NameInMap("Message")
        private String message;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("PortType")
        private String portType;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VccId")
        private String vccId;

        @NameInMap("VccName")
        private String vccName;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        private String vpdId;

        private Content(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.aliyunRouterInfo = builder.aliyunRouterInfo;
            this.bandwidthStr = builder.bandwidthStr;
            this.bgpCidr = builder.bgpCidr;
            this.cenId = builder.cenId;
            this.cisRouterInfo = builder.cisRouterInfo;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.currentNode = builder.currentNode;
            this.duration = builder.duration;
            this.gmtModified = builder.gmtModified;
            this.internetChargeType = builder.internetChargeType;
            this.lineOperator = builder.lineOperator;
            this.message = builder.message;
            this.payType = builder.payType;
            this.portType = builder.portType;
            this.pricingCycle = builder.pricingCycle;
            this.regionId = builder.regionId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.vSwitchId = builder.vSwitchId;
            this.vccId = builder.vccId;
            this.vccName = builder.vccName;
            this.vpcId = builder.vpcId;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return aliyunRouterInfo
         */
        public java.util.List < AliyunRouterInfo> getAliyunRouterInfo() {
            return this.aliyunRouterInfo;
        }

        /**
         * @return bandwidthStr
         */
        public String getBandwidthStr() {
            return this.bandwidthStr;
        }

        /**
         * @return bgpCidr
         */
        public String getBgpCidr() {
            return this.bgpCidr;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cisRouterInfo
         */
        public java.util.List < CisRouterInfo> getCisRouterInfo() {
            return this.cisRouterInfo;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentNode
         */
        public String getCurrentNode() {
            return this.currentNode;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return lineOperator
         */
        public String getLineOperator() {
            return this.lineOperator;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return portType
         */
        public String getPortType() {
            return this.portType;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vccId
         */
        public String getVccId() {
            return this.vccId;
        }

        /**
         * @return vccName
         */
        public String getVccName() {
            return this.vccName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpdBaseInfo
         */
        public VpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String accessPointId; 
            private java.util.List < AliyunRouterInfo> aliyunRouterInfo; 
            private String bandwidthStr; 
            private String bgpCidr; 
            private String cenId; 
            private java.util.List < CisRouterInfo> cisRouterInfo; 
            private String commodityCode; 
            private String createTime; 
            private String currentNode; 
            private String duration; 
            private String gmtModified; 
            private String internetChargeType; 
            private String lineOperator; 
            private String message; 
            private String payType; 
            private String portType; 
            private String pricingCycle; 
            private String regionId; 
            private String spec; 
            private String status; 
            private String tenantId; 
            private String vSwitchId; 
            private String vccId; 
            private String vccName; 
            private String vpcId; 
            private VpdBaseInfo vpdBaseInfo; 
            private String vpdId; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * AliyunRouterInfo.
             */
            public Builder aliyunRouterInfo(java.util.List < AliyunRouterInfo> aliyunRouterInfo) {
                this.aliyunRouterInfo = aliyunRouterInfo;
                return this;
            }

            /**
             * BandwidthStr.
             */
            public Builder bandwidthStr(String bandwidthStr) {
                this.bandwidthStr = bandwidthStr;
                return this;
            }

            /**
             * BgpCidr.
             */
            public Builder bgpCidr(String bgpCidr) {
                this.bgpCidr = bgpCidr;
                return this;
            }

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * CisRouterInfo.
             */
            public Builder cisRouterInfo(java.util.List < CisRouterInfo> cisRouterInfo) {
                this.cisRouterInfo = cisRouterInfo;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentNode.
             */
            public Builder currentNode(String currentNode) {
                this.currentNode = currentNode;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * LineOperator.
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * PortType.
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
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
             * VccId.
             */
            public Builder vccId(String vccId) {
                this.vccId = vccId;
                return this;
            }

            /**
             * VccName.
             */
            public Builder vccName(String vccName) {
                this.vccName = vccName;
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
             * VpdBaseInfo.
             */
            public Builder vpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
                this.vpdBaseInfo = vpdBaseInfo;
                return this;
            }

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
