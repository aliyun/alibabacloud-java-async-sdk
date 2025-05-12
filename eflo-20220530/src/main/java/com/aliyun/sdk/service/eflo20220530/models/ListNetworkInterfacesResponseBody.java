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
 * {@link ListNetworkInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkInterfacesResponseBody</p>
 */
public class ListNetworkInterfacesResponseBody extends TeaModel {
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

    private ListNetworkInterfacesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkInterfacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListNetworkInterfacesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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
         * <p>The response data.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>039C3C3A-3C37-5672-80D5-D8CD48C676D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNetworkInterfacesResponseBody build() {
            return new ListNetworkInterfacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkInterfacesResponseBody</p>
     */
    public static class PrivateIpAddressMacGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IpAddressMac")
        private String ipAddressMac;

        @com.aliyun.core.annotation.NameInMap("IpName")
        private String ipName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PrivateIpAddressMacGroup(Builder builder) {
            this.description = builder.description;
            this.ipAddressMac = builder.ipAddressMac;
            this.ipName = builder.ipName;
            this.message = builder.message;
            this.privateIpAddress = builder.privateIpAddress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddressMacGroup create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipAddressMac
         */
        public String getIpAddressMac() {
            return this.ipAddressMac;
        }

        /**
         * @return ipName
         */
        public String getIpName() {
            return this.ipName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String ipAddressMac; 
            private String ipName; 
            private String message; 
            private String privateIpAddress; 
            private String status; 

            private Builder() {
            } 

            private Builder(PrivateIpAddressMacGroup model) {
                this.description = model.description;
                this.ipAddressMac = model.ipAddressMac;
                this.ipName = model.ipName;
                this.message = model.message;
                this.privateIpAddress = model.privateIpAddress;
                this.status = model.status;
            } 

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Secondary private MAC address.</p>
             * 
             * <strong>example:</strong>
             * <p>00:25:9d:00:20:20</p>
             */
            public Builder ipAddressMac(String ipAddressMac) {
                this.ipAddressMac = ipAddressMac;
                return this;
            }

            /**
             * <p>The unique IP identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>sip-1asjd3xg</p>
             */
            public Builder ipName(String ipName) {
                this.ipName = ipName;
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
             * <p>The secondary private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.14</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The status of the cache reserve instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrivateIpAddressMacGroup build() {
                return new PrivateIpAddressMacGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkInterfacesResponseBody</p>
     */
    public static class SubnetBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("SubnetId")
        private String subnetId;

        @com.aliyun.core.annotation.NameInMap("SubnetName")
        private String subnetName;

        private SubnetBaseInfo(Builder builder) {
            this.cidr = builder.cidr;
            this.createTime = builder.createTime;
            this.subnetId = builder.subnetId;
            this.subnetName = builder.subnetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubnetBaseInfo create() {
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
         * @return subnetId
         */
        public String getSubnetId() {
            return this.subnetId;
        }

        /**
         * @return subnetName
         */
        public String getSubnetName() {
            return this.subnetName;
        }

        public static final class Builder {
            private String cidr; 
            private String createTime; 
            private String subnetId; 
            private String subnetName; 

            private Builder() {
            } 

            private Builder(SubnetBaseInfo model) {
                this.cidr = model.cidr;
                this.createTime = model.createTime;
                this.subnetId = model.subnetId;
                this.subnetName = model.subnetName;
            } 

            /**
             * <p>The network segment of the Subnet.</p>
             * <ul>
             * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
             * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
             * </ul>
             * <p>For more information about CIDR blocks, see the <a href="https://www.alibabacloud.com/help/doc-detail/40637.htm#title-gu4-uzk-12r">What is CIDR?</a> section in the &quot;Network FAQ&quot; topic.</p>
             * <p>This parameter is left empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the activation code was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1623656472000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Subnet instance.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-yjnqn5ef</p>
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * <p>The name of the Subnet instance.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-1</p>
             */
            public Builder subnetName(String subnetName) {
                this.subnetName = subnetName;
                return this;
            }

            public SubnetBaseInfo build() {
                return new SubnetBaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VpdBaseInfo model) {
                this.cidr = model.cidr;
                this.createTime = model.createTime;
                this.vpdId = model.vpdId;
                this.vpdName = model.vpdName;
            } 

            /**
             * <p>The network segment of Lingjun network segment (VPD).</p>
             * <ul>
             * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
             * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD. This parameter is left empty by default.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/16</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the activation code was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1668158213000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the VPD instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-d3isyds4</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>The name of the VPD instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-1</p>
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
     * {@link ListNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkInterfacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Ethernet")
        private java.util.List<String> ethernet;

        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NcType")
        private String ncType;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddressMacGroup")
        private java.util.List<PrivateIpAddressMacGroup> privateIpAddressMacGroup;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Integer quota;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceMac")
        private String serviceMac;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubnetBaseInfo")
        private SubnetBaseInfo subnetBaseInfo;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.ethernet = builder.ethernet;
            this.gateway = builder.gateway;
            this.ip = builder.ip;
            this.ncType = builder.ncType;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.nodeId = builder.nodeId;
            this.privateIpAddressMacGroup = builder.privateIpAddressMacGroup;
            this.quota = builder.quota;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceMac = builder.serviceMac;
            this.status = builder.status;
            this.subnetBaseInfo = builder.subnetBaseInfo;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ethernet
         */
        public java.util.List<String> getEthernet() {
            return this.ethernet;
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ncType
         */
        public String getNcType() {
            return this.ncType;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return privateIpAddressMacGroup
         */
        public java.util.List<PrivateIpAddressMacGroup> getPrivateIpAddressMacGroup() {
            return this.privateIpAddressMacGroup;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
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
         * @return serviceMac
         */
        public String getServiceMac() {
            return this.serviceMac;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetBaseInfo
         */
        public SubnetBaseInfo getSubnetBaseInfo() {
            return this.subnetBaseInfo;
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
         * @return vpdBaseInfo
         */
        public VpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<String> ethernet; 
            private String gateway; 
            private String ip; 
            private String ncType; 
            private String networkInterfaceId; 
            private String networkInterfaceName; 
            private String nodeId; 
            private java.util.List<PrivateIpAddressMacGroup> privateIpAddressMacGroup; 
            private Integer quota; 
            private String regionId; 
            private String resourceGroupId; 
            private String serviceMac; 
            private String status; 
            private SubnetBaseInfo subnetBaseInfo; 
            private java.util.List<Tags> tags; 
            private String tenantId; 
            private VpdBaseInfo vpdBaseInfo; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.ethernet = model.ethernet;
                this.gateway = model.gateway;
                this.ip = model.ip;
                this.ncType = model.ncType;
                this.networkInterfaceId = model.networkInterfaceId;
                this.networkInterfaceName = model.networkInterfaceName;
                this.nodeId = model.nodeId;
                this.privateIpAddressMacGroup = model.privateIpAddressMacGroup;
                this.quota = model.quota;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceMac = model.serviceMac;
                this.status = model.status;
                this.subnetBaseInfo = model.subnetBaseInfo;
                this.tags = model.tags;
                this.tenantId = model.tenantId;
                this.vpdBaseInfo = model.vpdBaseInfo;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The time when the activation code was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1669734207000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The port number of the AD server.</p>
             */
            public Builder ethernet(java.util.List<String> ethernet) {
                this.ethernet = ethernet;
                return this;
            }

            /**
             * <p>The gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.253</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.13</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The NC type.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>CUSTOM_LNI_INTEGRATION: two-network one-in-one architecture Lingjun hosting network interface controller.</li>
             * <li>CPU: CPU machine.</li>
             * <li>ELASTIC_6.2: Machine</li>
             * <li>GPU: GPU machine.</li>
             * <li>DEFAULT: the old CPU machine.</li>
             * <li>CUSTOM_LNI: two network separation architecture Lingjun hosting network interface controller.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GPU</p>
             */
            public Builder ncType(String ncType) {
                this.ncType = ncType;
                return this;
            }

            /**
             * <p>Lingjun network interface controller ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lni-2ze50voovmtswn328ogm</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The port name.</p>
             * 
             * <strong>example:</strong>
             * <p>bond0</p>
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * <p>The ID of the machine to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2d53f5c204e7476dae69177e7fa6f19c</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Secondary Private IP&amp;MAC Address Collection</p>
             */
            public Builder privateIpAddressMacGroup(java.util.List<PrivateIpAddressMacGroup> privateIpAddressMacGroup) {
                this.privateIpAddressMacGroup = privateIpAddressMacGroup;
                return this;
            }

            /**
             * <p>network interface controller private secondary IP quota.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The address of the service network interface controller.</p>
             * 
             * <strong>example:</strong>
             * <p>00-ff-84-15-ba-67</p>
             */
            public Builder serviceMac(String serviceMac) {
                this.serviceMac = serviceMac;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Lingjun subnet (Subnet) basic information.</p>
             */
            public Builder subnetBaseInfo(SubnetBaseInfo subnetBaseInfo) {
                this.subnetBaseInfo = subnetBaseInfo;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166279</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Lingjun network segment (VPD) basic information.</p>
             */
            public Builder vpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
                this.vpdBaseInfo = vpdBaseInfo;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkInterfacesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.data = model.data;
                this.total = model.total;
            } 

            /**
             * <p>The response parameters.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
