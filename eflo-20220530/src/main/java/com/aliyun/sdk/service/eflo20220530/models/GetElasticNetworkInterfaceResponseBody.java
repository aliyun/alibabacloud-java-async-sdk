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
 * {@link GetElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetElasticNetworkInterfaceResponseBody</p>
 */
public class GetElasticNetworkInterfaceResponseBody extends TeaModel {
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

    private GetElasticNetworkInterfaceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetElasticNetworkInterfaceResponseBody create() {
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

        private Builder(GetElasticNetworkInterfaceResponseBody model) {
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
         * <p>{}</p>
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
         * <p>The return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0901F411-28FA-5B9C-BAEE-7776463FF0DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetElasticNetworkInterfaceResponseBody build() {
            return new GetElasticNetworkInterfaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetElasticNetworkInterfaceResponseBody</p>
     */
    public static class Ipv6Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
        private String elasticNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IpName")
        private String ipName;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Ipv6Addresses(Builder builder) {
            this.description = builder.description;
            this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ipName = builder.ipName;
            this.ipv6Address = builder.ipv6Address;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Addresses create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticNetworkInterfaceId
         */
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
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
         * @return ipName
         */
        public String getIpName() {
            return this.ipName;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String elasticNetworkInterfaceId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String ipName; 
            private String ipv6Address; 
            private String message; 
            private String regionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Ipv6Addresses model) {
                this.description = model.description;
                this.elasticNetworkInterfaceId = model.elasticNetworkInterfaceId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ipName = model.ipName;
                this.ipv6Address = model.ipv6Address;
                this.message = model.message;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Lingjun Elastic Network Interface ID</p>
             * 
             * <strong>example:</strong>
             * <p>leni-1234****</p>
             */
            public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
                this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1585816811000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the cluster was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1549012834000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>IPV6 unique identifier</p>
             * 
             * <strong>example:</strong>
             * <p>sip-sg3xabeq</p>
             */
            public Builder ipName(String ipName) {
                this.ipName = ipName;
                return this;
            }

            /**
             * <p>IPV6 address</p>
             * 
             * <strong>example:</strong>
             * <p>2408:4005:3aa:1000:470d:66fb:56a5:****</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
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
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Ipv6Addresses build() {
                return new Ipv6Addresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetElasticNetworkInterfaceResponseBody</p>
     */
    public static class PrivateIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
        private String elasticNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IpName")
        private String ipName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PrivateIpAddresses(Builder builder) {
            this.description = builder.description;
            this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ipName = builder.ipName;
            this.message = builder.message;
            this.privateIpAddress = builder.privateIpAddress;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddresses create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticNetworkInterfaceId
         */
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String elasticNetworkInterfaceId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String ipName; 
            private String message; 
            private String privateIpAddress; 
            private String regionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(PrivateIpAddresses model) {
                this.description = model.description;
                this.elasticNetworkInterfaceId = model.elasticNetworkInterfaceId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ipName = model.ipName;
                this.message = model.message;
                this.privateIpAddress = model.privateIpAddress;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Lingjun Elastic Network Interface ID</p>
             * 
             * <strong>example:</strong>
             * <p>leni-1234****</p>
             */
            public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
                this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1672971789000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the cluster was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1672971789000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Lingjun Elastic Network Interface Secondary Private IP Unique Identifier</p>
             * 
             * <strong>example:</strong>
             * <p>sip-ywz****</p>
             */
            public Builder ipName(String ipName) {
                this.ipName = ipName;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Lingjun Elastic Network Interface secondary private IP address</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.****</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
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
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrivateIpAddresses build() {
                return new PrivateIpAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetElasticNetworkInterfaceResponseBody</p>
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
     * {@link GetElasticNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetElasticNetworkInterfaceResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
        private String elasticNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("EnableJumboFrame")
        private Boolean enableJumboFrame;

        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Ipv6Addresses")
        private java.util.List<Ipv6Addresses> ipv6Addresses;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddresses")
        private java.util.List<PrivateIpAddresses> privateIpAddresses;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Content(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
            this.enableJumboFrame = builder.enableJumboFrame;
            this.gateway = builder.gateway;
            this.gmtModified = builder.gmtModified;
            this.ip = builder.ip;
            this.ipv6Addresses = builder.ipv6Addresses;
            this.mac = builder.mac;
            this.mask = builder.mask;
            this.message = builder.message;
            this.nodeId = builder.nodeId;
            this.privateIpAddresses = builder.privateIpAddresses;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticNetworkInterfaceId
         */
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        /**
         * @return enableJumboFrame
         */
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipv6Addresses
         */
        public java.util.List<Ipv6Addresses> getIpv6Addresses() {
            return this.ipv6Addresses;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return privateIpAddresses
         */
        public java.util.List<PrivateIpAddresses> getPrivateIpAddresses() {
            return this.privateIpAddresses;
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
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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
            private String createTime; 
            private String description; 
            private String elasticNetworkInterfaceId; 
            private Boolean enableJumboFrame; 
            private String gateway; 
            private String gmtModified; 
            private String ip; 
            private java.util.List<Ipv6Addresses> ipv6Addresses; 
            private String mac; 
            private String mask; 
            private String message; 
            private String nodeId; 
            private java.util.List<PrivateIpAddresses> privateIpAddresses; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String type; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.elasticNetworkInterfaceId = model.elasticNetworkInterfaceId;
                this.enableJumboFrame = model.enableJumboFrame;
                this.gateway = model.gateway;
                this.gmtModified = model.gmtModified;
                this.ip = model.ip;
                this.ipv6Addresses = model.ipv6Addresses;
                this.mac = model.mac;
                this.mask = model.mask;
                this.message = model.message;
                this.nodeId = model.nodeId;
                this.privateIpAddresses = model.privateIpAddresses;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroupId = model.securityGroupId;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-13 12:51:41</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>terraform-example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Lingjun Elastic Network Interface ID</p>
             * 
             * <strong>example:</strong>
             * <p>leni-1234****</p>
             */
            public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
                this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
                return this;
            }

            /**
             * <p>Whether to enable the jumboFrame capability</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enableJumboFrame(Boolean enableJumboFrame) {
                this.enableJumboFrame = enableJumboFrame;
                return this;
            }

            /**
             * <p>vswitch gateway address</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.****</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-13 12:51:41</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Elastic Network Interface IP</p>
             * 
             * <strong>example:</strong>
             * <p>203.107.****</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>IPV6 address</p>
             */
            public Builder ipv6Addresses(java.util.List<Ipv6Addresses> ipv6Addresses) {
                this.ipv6Addresses = ipv6Addresses;
                return this;
            }

            /**
             * <p>mac address</p>
             * 
             * <strong>example:</strong>
             * <p>00:22:6D:97:<strong>:</strong></p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>vswitch mask bits</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Lingjun Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-lbj3aej****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Secondary private IP address</p>
             */
            public Builder privateIpAddresses(java.util.List<PrivateIpAddresses> privateIpAddresses) {
                this.privateIpAddresses = privateIpAddresses;
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
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-0jl5s4p4laalruk7****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The state of the private gateway.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Create Failed: the creation failure.</li>
             * <li>Delete Failed: the that failed to be deleted.</li>
             * <li>Executing</li>
             * <li>Available</li>
             * <li>Deleting</li>
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
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>NIC Type</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>CUSTOM: custom type.</li>
             * <li>DEFAULT: system type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6u8473r84e9****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-j6ctp4n75306****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
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
