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
 * {@link GetNetworkInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkInterfaceResponseBody</p>
 */
public class GetNetworkInterfaceResponseBody extends TeaModel {
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

    private GetNetworkInterfaceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkInterfaceResponseBody create() {
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
         * <p>The response data. (If a resource has dependent resources, the existing dependent resources are returned.)</p>
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
         * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkInterfaceResponseBody build() {
            return new GetNetworkInterfaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkInterfaceResponseBody</p>
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
             * <p>Secondary private MAC address</p>
             * 
             * <strong>example:</strong>
             * <p>01-00-5e-00-00-16</p>
             */
            public Builder ipAddressMac(String ipAddressMac) {
                this.ipAddressMac = ipAddressMac;
                return this;
            }

            /**
             * <p>IP unique identifier</p>
             * 
             * <strong>example:</strong>
             * <p>sip-xxxx</p>
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
             * <p>Secondary private IP address</p>
             * 
             * <strong>example:</strong>
             * <p>172.23.161.57</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The state of the rule.</p>
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
     * {@link GetNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkInterfaceResponseBody</p>
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

            /**
             * <p>Network address segment</p>
             * 
             * <strong>example:</strong>
             * <p>116.233.21.57/32</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Subnet instance.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-urb01blo</p>
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
     * {@link GetNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkInterfaceResponseBody</p>
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
             * <p>The network segment of the Lingjun subnet.</p>
             * <ul>
             * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
             * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
             * </ul>
             * <p>For more information about CIDR blocks, see the <a href="https://www.alibabacloud.com/help/doc-detail/40637.htm#title-gu4-uzk-12r">What is CIDR?</a> section in the &quot;Network FAQ&quot; topic.</p>
             * <p>This parameter is left empty by default.</p>
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
             * <p>1678273219000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the VPD instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-ppdunxzc</p>
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
     * {@link GetNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkInterfaceResponseBody</p>
     */
    public static class Content extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ServiceMac")
        private String serviceMac;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubnetBaseInfo")
        private SubnetBaseInfo subnetBaseInfo;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Content(Builder builder) {
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
            this.serviceMac = builder.serviceMac;
            this.status = builder.status;
            this.subnetBaseInfo = builder.subnetBaseInfo;
            this.tenantId = builder.tenantId;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
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
            private String serviceMac; 
            private String status; 
            private SubnetBaseInfo subnetBaseInfo; 
            private String tenantId; 
            private VpdBaseInfo vpdBaseInfo; 
            private String zoneId; 

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Port</p>
             */
            public Builder ethernet(java.util.List<String> ethernet) {
                this.ethernet = ethernet;
                return this;
            }

            /**
             * <p>Gateway</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.20.254</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The IP address of the BE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>203.107.60.69</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>NC Type</p>
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
             * <p>DEFAULT</p>
             */
            public Builder ncType(String ncType) {
                this.ncType = ncType;
                return this;
            }

            /**
             * <p>Lingjun network interface controller ID</p>
             * 
             * <strong>example:</strong>
             * <p>lni-f8z4scmfh0u4ewv6vdd8</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>ENI Name</p>
             * 
             * <strong>example:</strong>
             * <p>bond0</p>
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>masterintranett2fdth5fkoocg</p>
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
             * <p>network interface controller private secondary IP limit</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>Service network interface controller address</p>
             * 
             * <strong>example:</strong>
             * <p>01-00-5e-00-00-16</p>
             */
            public Builder serviceMac(String serviceMac) {
                this.serviceMac = serviceMac;
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
             * <p>Lingjun subnet (Subnet) basic information</p>
             */
            public Builder subnetBaseInfo(SubnetBaseInfo subnetBaseInfo) {
                this.subnetBaseInfo = subnetBaseInfo;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1655449505171</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Basic information of Lingjun network segment (VPD)</p>
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

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
