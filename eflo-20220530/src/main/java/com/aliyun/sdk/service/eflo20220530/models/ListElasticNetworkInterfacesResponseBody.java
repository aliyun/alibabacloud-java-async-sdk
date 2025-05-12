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
 * {@link ListElasticNetworkInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListElasticNetworkInterfacesResponseBody</p>
 */
public class ListElasticNetworkInterfacesResponseBody extends TeaModel {
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

    private ListElasticNetworkInterfacesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListElasticNetworkInterfacesResponseBody create() {
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

        private Builder(ListElasticNetworkInterfacesResponseBody model) {
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
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListElasticNetworkInterfacesResponseBody build() {
            return new ListElasticNetworkInterfacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListElasticNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListElasticNetworkInterfacesResponseBody</p>
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
     * {@link ListElasticNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListElasticNetworkInterfacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
        private String elasticNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

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

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
            this.gateway = builder.gateway;
            this.gmtModified = builder.gmtModified;
            this.ip = builder.ip;
            this.mac = builder.mac;
            this.mask = builder.mask;
            this.message = builder.message;
            this.nodeId = builder.nodeId;
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
            private String gateway; 
            private String gmtModified; 
            private String ip; 
            private String mac; 
            private String mask; 
            private String message; 
            private String nodeId; 
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

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.elasticNetworkInterfaceId = model.elasticNetworkInterfaceId;
                this.gateway = model.gateway;
                this.gmtModified = model.gmtModified;
                this.ip = model.ip;
                this.mac = model.mac;
                this.mask = model.mask;
                this.message = model.message;
                this.nodeId = model.nodeId;
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
             * <p>1601176751000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>No description</p>
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
             * <p>1640187007000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The IP address of the BE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.13</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>mac address</p>
             * 
             * <strong>example:</strong>
             * <p>E0:01:A6:4A:6A:D0</p>
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
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-uax37m1****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
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
             * <p>sg-f8z4wr1b41x3qsc9****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
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
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>network interface controller type, the default type DEFAULT cannot be manually released</p>
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
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-f8ziirfl9k25h2qn7****</p>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListElasticNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListElasticNetworkInterfacesResponseBody</p>
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
             * <p>lingjun Elastic Network Interface information list</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
