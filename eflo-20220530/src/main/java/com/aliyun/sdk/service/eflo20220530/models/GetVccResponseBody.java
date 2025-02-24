// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetVccResponseBody} extends {@link TeaModel}
 *
 * <p>GetVccResponseBody</p>
 */
public class GetVccResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVccResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>CAD09E47-B651-5206-B2DC-3AB78C8EB446</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVccResponseBody build() {
            return new GetVccResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class AliyunRouterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("PcId")
        private String pcId;

        @com.aliyun.core.annotation.NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @com.aliyun.core.annotation.NameInMap("VbrId")
        private String vbrId;

        @com.aliyun.core.annotation.NameInMap("VlanId")
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
             * <p>IPv4 address of Alibaba Cloud-side interconnection</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.248.30</p>
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * <p>Masking</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.248</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>Express Connect circuit ID</p>
             * 
             * <strong>example:</strong>
             * <p>pc-0jlof4bphlsnxbdztkvad</p>
             */
            public Builder pcId(String pcId) {
                this.pcId = pcId;
                return this;
            }

            /**
             * <p>Lingjun Side Interconnection IPv4 Address</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.248.28</p>
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * <p>The ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-2ze4i85p6vb9nwcan5xt0</p>
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * <p>VLAN ID of the VBR</p>
             * 
             * <strong>example:</strong>
             * <p>1042</p>
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
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class CcInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CcId")
        private String ccId;

        @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @com.aliyun.core.annotation.NameInMap("RemoteGatewayIp")
        private String remoteGatewayIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubnetMask")
        private String subnetMask;

        @com.aliyun.core.annotation.NameInMap("VlanId")
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
             * <p>Leased Line ID</p>
             * 
             * <strong>example:</strong>
             * <p>cc-73aeex5o</p>
             */
            public Builder ccId(String ccId) {
                this.ccId = ccId;
                return this;
            }

            /**
             * <p>Lingjun Side Interconnection IPv4 Address</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.248.26</p>
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * <p>Lingjun Side Interconnection IPv4 Address</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.248.30</p>
             */
            public Builder remoteGatewayIp(String remoteGatewayIp) {
                this.remoteGatewayIp = remoteGatewayIp;
                return this;
            }

            /**
             * <p>The state of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Established</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Subnet mask</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.248</p>
             */
            public Builder subnetMask(String subnetMask) {
                this.subnetMask = subnetMask;
                return this;
            }

            /**
             * <p>Vlan ID of the leased line</p>
             * 
             * <strong>example:</strong>
             * <p>Ethernet1042</p>
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
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class CisRouterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CcInfos")
        private java.util.List<CcInfos> ccInfos;

        @com.aliyun.core.annotation.NameInMap("CcrId")
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
        public java.util.List<CcInfos> getCcInfos() {
            return this.ccInfos;
        }

        /**
         * @return ccrId
         */
        public String getCcrId() {
            return this.ccrId;
        }

        public static final class Builder {
            private java.util.List<CcInfos> ccInfos; 
            private String ccrId; 

            /**
             * <p>Leased Line Information List</p>
             */
            public Builder ccInfos(java.util.List<CcInfos> ccInfos) {
                this.ccInfos = ccInfos;
                return this;
            }

            /**
             * <p>The ID of the on-cloud router instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ccr-1ms84am0</p>
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
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class ErInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("ErName")
        private String erName;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MasterZoneId")
        private String masterZoneId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteMaps")
        private Long routeMaps;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private ErInfos(Builder builder) {
            this.connections = builder.connections;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.erId = builder.erId;
            this.erName = builder.erName;
            this.gmtModified = builder.gmtModified;
            this.masterZoneId = builder.masterZoneId;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.routeMaps = builder.routeMaps;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErInfos create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public Long getConnections() {
            return this.connections;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return erName
         */
        public String getErName() {
            return this.erName;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return masterZoneId
         */
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeMaps
         */
        public Long getRouteMaps() {
            return this.routeMaps;
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

        public static final class Builder {
            private Long connections; 
            private String createTime; 
            private String description; 
            private String erId; 
            private String erName; 
            private String gmtModified; 
            private String masterZoneId; 
            private String message; 
            private String regionId; 
            private Long routeMaps; 
            private String status; 
            private String tenantId; 

            /**
             * <p>Connections</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1678379917000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>this is test.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Lingjun HUB ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-p68b0jwn</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>Lingjun HUB Instance Name</p>
             * 
             * <strong>example:</strong>
             * <p>er-1</p>
             */
            public Builder erName(String erName) {
                this.erName = erName;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1678379917000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Primary Zone</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder masterZoneId(String masterZoneId) {
                this.masterZoneId = masterZoneId;
                return this;
            }

            /**
             * <p>The message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>test message</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Lingjun HUB Region Information</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Number of routing policy</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder routeMaps(Long routeMaps) {
                this.routeMaps = routeMaps;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ErInfos build() {
                return new ErInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * <p>The tag key.</p>
             * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-vcc</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag that is added to the resource.</p>
             * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-group-1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class VbrBgpPeers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgpGroupId")
        private String bgpGroupId;

        @com.aliyun.core.annotation.NameInMap("BgpPeerId")
        private String bgpPeerId;

        @com.aliyun.core.annotation.NameInMap("PeerAsn")
        private String peerAsn;

        @com.aliyun.core.annotation.NameInMap("PeerIpAddress")
        private String peerIpAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private VbrBgpPeers(Builder builder) {
            this.bgpGroupId = builder.bgpGroupId;
            this.bgpPeerId = builder.bgpPeerId;
            this.peerAsn = builder.peerAsn;
            this.peerIpAddress = builder.peerIpAddress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VbrBgpPeers create() {
            return builder().build();
        }

        /**
         * @return bgpGroupId
         */
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        /**
         * @return bgpPeerId
         */
        public String getBgpPeerId() {
            return this.bgpPeerId;
        }

        /**
         * @return peerAsn
         */
        public String getPeerAsn() {
            return this.peerAsn;
        }

        /**
         * @return peerIpAddress
         */
        public String getPeerIpAddress() {
            return this.peerIpAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bgpGroupId; 
            private String bgpPeerId; 
            private String peerAsn; 
            private String peerIpAddress; 
            private String status; 

            /**
             * <p>BGP Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>bgpg-2ze2sit2vakrkapvy****</p>
             */
            public Builder bgpGroupId(String bgpGroupId) {
                this.bgpGroupId = bgpGroupId;
                return this;
            }

            /**
             * <p>BGP peer ID</p>
             * 
             * <strong>example:</strong>
             * <p>bgp-uf6heugif9enu48rj****</p>
             */
            public Builder bgpPeerId(String bgpPeerId) {
                this.bgpPeerId = bgpPeerId;
                return this;
            }

            /**
             * <p>Peer AS No.</p>
             * 
             * <strong>example:</strong>
             * <p>98765****</p>
             */
            public Builder peerAsn(String peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * <p>BGP peer IP address</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.****</p>
             */
            public Builder peerIpAddress(String peerIpAddress) {
                this.peerIpAddress = peerIpAddress;
                return this;
            }

            /**
             * <p>The status of the BGP peer. Valid values:</p>
             * <ul>
             * <li>Pending: pending</li>
             * <li>Available: The route is available.</li>
             * <li>Modifying: being modified</li>
             * <li>Deleting: The IPv4 gateway is being deleted.</li>
             * <li>Deleted</li>
             * <li>Not Available</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public VbrBgpPeers build() {
                return new VbrBgpPeers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class VbrInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VbrBgpPeers")
        private java.util.List<VbrBgpPeers> vbrBgpPeers;

        @com.aliyun.core.annotation.NameInMap("VbrId")
        private String vbrId;

        private VbrInfos(Builder builder) {
            this.cenId = builder.cenId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.status = builder.status;
            this.vbrBgpPeers = builder.vbrBgpPeers;
            this.vbrId = builder.vbrId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VbrInfos create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vbrBgpPeers
         */
        public java.util.List<VbrBgpPeers> getVbrBgpPeers() {
            return this.vbrBgpPeers;
        }

        /**
         * @return vbrId
         */
        public String getVbrId() {
            return this.vbrId;
        }

        public static final class Builder {
            private String cenId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String status; 
            private java.util.List<VbrBgpPeers> vbrBgpPeers; 
            private String vbrId; 

            /**
             * <p>CEN ID</p>
             * 
             * <strong>example:</strong>
             * <p>cen-cx0qua8q6cm4z9****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1683250981000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1673578603000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The status of the VBR. Valid values:</p>
             * <ul>
             * <li>unconfirmed</li>
             * <li>active: The VPN gateway is in a normal state.</li>
             * <li>terminating: The connection is being terminated.</li>
             * <li>terminated: The connection is terminated.</li>
             * <li>recovering: The task is being recovered.</li>
             * <li>deleting: The GDN is being deleted.</li>
             * <li>Available: The service is available.</li>
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
             * <p>BGP neighbor information list</p>
             */
            public Builder vbrBgpPeers(java.util.List<VbrBgpPeers> vbrBgpPeers) {
                this.vbrBgpPeers = vbrBgpPeers;
                return this;
            }

            /**
             * <p>The ID of the border router.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-wz96agu9h3d50z****</p>
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            public VbrInfos build() {
                return new VbrInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class VpdBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("VpdName")
        private String vpdName;

        private VpdBaseInfo(Builder builder) {
            this.cidr = builder.cidr;
            this.createTime = builder.createTime;
            this.vpdId = builder.vpdId;
            this.vpdName = builder.vpdName;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return vpdName
         */
        public String getVpdName() {
            return this.vpdName;
        }

        public static final class Builder {
            private String cidr; 
            private String createTime; 
            private String vpdId; 
            private String vpdName; 

            /**
             * <p>Network address segment</p>
             * 
             * <strong>example:</strong>
             * <p>172.18.0.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1678379917000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-ppdunxzc</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance name</p>
             * 
             * <strong>example:</strong>
             * <p>yzp-rg-test3</p>
             */
            public Builder vpdName(String vpdName) {
                this.vpdName = vpdName;
                return this;
            }

            public VpdBaseInfo build() {
                return new VpdBaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVccResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AliyunRouterInfo")
        private java.util.List<AliyunRouterInfo> aliyunRouterInfo;

        @com.aliyun.core.annotation.NameInMap("AttachErStatus")
        private Boolean attachErStatus;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthStr")
        private String bandwidthStr;

        @com.aliyun.core.annotation.NameInMap("BgpAsn")
        private String bgpAsn;

        @com.aliyun.core.annotation.NameInMap("BgpCidr")
        private String bgpCidr;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenOwnerId")
        private String cenOwnerId;

        @com.aliyun.core.annotation.NameInMap("CisRouterInfo")
        private java.util.List<CisRouterInfo> cisRouterInfo;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ConnectionType")
        private String connectionType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentNode")
        private String currentNode;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ErInfos")
        private java.util.List<ErInfos> erInfos;

        @com.aliyun.core.annotation.NameInMap("ExpirationDate")
        private String expirationDate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("LineOperator")
        private String lineOperator;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PortType")
        private String portType;

        @com.aliyun.core.annotation.NameInMap("PricingCycle")
        private String pricingCycle;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VbrInfos")
        private java.util.List<VbrInfos> vbrInfos;

        @com.aliyun.core.annotation.NameInMap("VccId")
        private String vccId;

        @com.aliyun.core.annotation.NameInMap("VccName")
        private String vccName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Content(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.aliyunRouterInfo = builder.aliyunRouterInfo;
            this.attachErStatus = builder.attachErStatus;
            this.bandwidth = builder.bandwidth;
            this.bandwidthStr = builder.bandwidthStr;
            this.bgpAsn = builder.bgpAsn;
            this.bgpCidr = builder.bgpCidr;
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.cisRouterInfo = builder.cisRouterInfo;
            this.commodityCode = builder.commodityCode;
            this.connectionType = builder.connectionType;
            this.createTime = builder.createTime;
            this.currentNode = builder.currentNode;
            this.duration = builder.duration;
            this.erInfos = builder.erInfos;
            this.expirationDate = builder.expirationDate;
            this.gmtModified = builder.gmtModified;
            this.internetChargeType = builder.internetChargeType;
            this.lineOperator = builder.lineOperator;
            this.message = builder.message;
            this.payType = builder.payType;
            this.portType = builder.portType;
            this.pricingCycle = builder.pricingCycle;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
            this.vSwitchId = builder.vSwitchId;
            this.vbrInfos = builder.vbrInfos;
            this.vccId = builder.vccId;
            this.vccName = builder.vccName;
            this.vpcId = builder.vpcId;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.vpdId = builder.vpdId;
            this.zoneId = builder.zoneId;
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
        public java.util.List<AliyunRouterInfo> getAliyunRouterInfo() {
            return this.aliyunRouterInfo;
        }

        /**
         * @return attachErStatus
         */
        public Boolean getAttachErStatus() {
            return this.attachErStatus;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthStr
         */
        public String getBandwidthStr() {
            return this.bandwidthStr;
        }

        /**
         * @return bgpAsn
         */
        public String getBgpAsn() {
            return this.bgpAsn;
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
         * @return cenOwnerId
         */
        public String getCenOwnerId() {
            return this.cenOwnerId;
        }

        /**
         * @return cisRouterInfo
         */
        public java.util.List<CisRouterInfo> getCisRouterInfo() {
            return this.cisRouterInfo;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return connectionType
         */
        public String getConnectionType() {
            return this.connectionType;
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
         * @return erInfos
         */
        public java.util.List<ErInfos> getErInfos() {
            return this.erInfos;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
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
         * @return vbrInfos
         */
        public java.util.List<VbrInfos> getVbrInfos() {
            return this.vbrInfos;
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

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accessPointId; 
            private java.util.List<AliyunRouterInfo> aliyunRouterInfo; 
            private Boolean attachErStatus; 
            private Integer bandwidth; 
            private String bandwidthStr; 
            private String bgpAsn; 
            private String bgpCidr; 
            private String cenId; 
            private String cenOwnerId; 
            private java.util.List<CisRouterInfo> cisRouterInfo; 
            private String commodityCode; 
            private String connectionType; 
            private String createTime; 
            private String currentNode; 
            private String duration; 
            private java.util.List<ErInfos> erInfos; 
            private String expirationDate; 
            private String gmtModified; 
            private String internetChargeType; 
            private String lineOperator; 
            private String message; 
            private String payType; 
            private String portType; 
            private String pricingCycle; 
            private String regionId; 
            private String resourceGroupId; 
            private String spec; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String tenantId; 
            private String vSwitchId; 
            private java.util.List<VbrInfos> vbrInfos; 
            private String vccId; 
            private String vccName; 
            private String vpcId; 
            private VpdBaseInfo vpdBaseInfo; 
            private String vpdId; 
            private String zoneId; 

            /**
             * <p>Express Connect circuit access point ID:</p>
             * <ul>
             * <li><strong>ap-cn-wulanchabu-jn-ts-A</strong>: Ulanqab-Jining-A</li>
             * <li><strong>ap-cn-heyuan-yc-ts-SA127</strong>: Heyuan-Yuancheng-A</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-wulanchabu-jn-ts-A</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>Alibaba Cloud route information list</p>
             */
            public Builder aliyunRouterInfo(java.util.List<AliyunRouterInfo> aliyunRouterInfo) {
                this.aliyunRouterInfo = aliyunRouterInfo;
                return this;
            }

            /**
             * <p>Whether Lingjun HUB has been bound to a network instance</p>
             * <ul>
             * <li><strong>true</strong>: Bound</li>
             * <li><strong>false</strong>: unbound</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder attachErStatus(Boolean attachErStatus) {
                this.attachErStatus = attachErStatus;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The bandwidth of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>1G</p>
             */
            public Builder bandwidthStr(String bandwidthStr) {
                this.bandwidthStr = bandwidthStr;
                return this;
            }

            /**
             * <p>BGP AS number</p>
             * 
             * <strong>example:</strong>
             * <p>45644</p>
             */
            public Builder bgpAsn(String bgpAsn) {
                this.bgpAsn = bgpAsn;
                return this;
            }

            /**
             * <p>BGP CIDR block</p>
             * 
             * <strong>example:</strong>
             * <p>10.4.0.0/24</p>
             */
            public Builder bgpCidr(String bgpCidr) {
                this.bgpCidr = bgpCidr;
                return this;
            }

            /**
             * <p>The ID of the CEN instance; <a href="https://help.aliyun.com/document_detail/181681.html">What is the CEN?</a></p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/468215.htm">DescribeCens</a> to query the information of CEN instances under the current Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-m2iskbojlvda5w65fp</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>Account to which the CEN belongs</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166279</p>
             */
            public Builder cenOwnerId(String cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>Lingjun Network Routing Information List</p>
             */
            public Builder cisRouterInfo(java.util.List<CisRouterInfo> cisRouterInfo) {
                this.cisRouterInfo = cisRouterInfo;
                return this;
            }

            /**
             * <p>Commodity code</p>
             * 
             * <strong>example:</strong>
             * <p>bccluster_cloudconnectionpre_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The connection mode. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>CENTR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CENTR</p>
             */
            public Builder connectionType(String connectionType) {
                this.connectionType = connectionType;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1648085472000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Current Node</p>
             * 
             * <strong>example:</strong>
             * <p>task-xxx-node-x</p>
             */
            public Builder currentNode(String currentNode) {
                this.currentNode = currentNode;
                return this;
            }

            /**
             * <p>Cycle</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>List of bound Lingjun HUB information</p>
             */
            public Builder erInfos(java.util.List<ErInfos> erInfos) {
                this.erInfos = erInfos;
                return this;
            }

            /**
             * <p>The time when the application expired.</p>
             * 
             * <strong>example:</strong>
             * <p>1678379917000</p>
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1648085472000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The billing method for network usage.</p>
             * <ul>
             * <li><strong>PayByTraffic</strong>: pay-by-traffic</li>
             * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CO</p>
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
             * 
             * <strong>example:</strong>
             * <p>You don&quot;t have the permission of this operation, action=eflo:GetVcc, arn=acs:eflo:cn-heyuan:1263399219805497:vcc/vcc-cn-fhh3yxjwe01, resourceGroup=null</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PREPAY</strong>: subscription</li>
             * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePay</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The port type of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>100GBase-LR</strong>: 100,000 megabytes of single-mode optical port (10 km)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100GBase-LR</p>
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * <p>The billing cycle. Valid values:</p>
             * <ul>
             * <li><strong>Month</strong>: Billed on a monthly basis</li>
             * <li><strong>Year</strong>: Billed on an annual basis</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of your Alibaba Cloud resource group.</p>
             * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm">Resource groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2l4sq6l7unhi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Specification; value:</p>
             * <ul>
             * <li><strong>Large</strong>: Large</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the cache reserve instance. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong>: Normal.</li>
             * <li><strong>Not Available</strong>: Not available.</li>
             * <li><strong>Executing</strong>: The task is being executed.</li>
             * <li><strong>Deleting</strong>: The account is being deleted</li>
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
             * <p>The tag information.</p>
             * <p>You can specify up to 20 tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166279</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch. <a href="https://help.aliyun.com/document_detail/100380.html">Virtual Private Cloud VSwitch</a>.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query created vSwitches.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6u8473r84e6n1n19he5</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>Information list of border routers</p>
             */
            public Builder vbrInfos(java.util.List<VbrInfos> vbrInfos) {
                this.vbrInfos = vbrInfos;
                return this;
            }

            /**
             * <p>The ID of the Lingjun connection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-cn-cqf2xh40101</p>
             */
            public Builder vccId(String vccId) {
                this.vccId = vccId;
                return this;
            }

            /**
             * <p>The name of the Lingjun connection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-heyuan-backup</p>
             */
            public Builder vccName(String vccName) {
                this.vccName = vccName;
                return this;
            }

            /**
             * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-j6ctp4n75306phv5tmpsm</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Lingjun network segment information (applicable to the scene where the old version of Lingjun connection is directly bound to Lingjun network segment)</p>
             */
            public Builder vpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
                this.vpdBaseInfo = vpdBaseInfo;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-d3isyds4</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
