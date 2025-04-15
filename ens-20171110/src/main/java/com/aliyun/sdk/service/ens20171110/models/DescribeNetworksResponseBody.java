// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworksResponseBody</p>
 */
public class DescribeNetworksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Networks")
    private Networks networks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNetworksResponseBody(Builder builder) {
        this.networks = builder.networks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networks
     */
    public Networks getNetworks() {
        return this.networks;
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
        private Networks networks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNetworksResponseBody model) {
            this.networks = model.networks;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The VPCs.</p>
         */
        public Builder networks(Networks networks) {
            this.networks = networks;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworksResponseBody build() {
            return new DescribeNetworksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworksResponseBody</p>
     */
    public static class RouteTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private java.util.List<String> routeTableId;

        private RouteTableIds(Builder builder) {
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTableIds create() {
            return builder().build();
        }

        /**
         * @return routeTableId
         */
        public java.util.List<String> getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List<String> routeTableId; 

            private Builder() {
            } 

            private Builder(RouteTableIds model) {
                this.routeTableId = model.routeTableId;
            } 

            /**
             * RouteTableId.
             */
            public Builder routeTableId(java.util.List<String> routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteTableIds build() {
                return new RouteTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworksResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        @Deprecated
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        @Deprecated
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String tagKey; 
            private String tagValue; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
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

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworksResponseBody</p>
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
     * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworksResponseBody</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private java.util.List<String> vSwitchId;

        private VSwitchIds(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchId; 

            private Builder() {
            } 

            private Builder(VSwitchIds model) {
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List<String> vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworksResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("GatewayRouteTableId")
        private String gatewayRouteTableId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclId")
        private String networkAclId;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("NetworkName")
        private String networkName;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("RouteTableIds")
        private RouteTableIds routeTableIds;

        @com.aliyun.core.annotation.NameInMap("RouterTableId")
        private String routerTableId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        private Network(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.gatewayRouteTableId = builder.gatewayRouteTableId;
            this.networkAclId = builder.networkAclId;
            this.networkId = builder.networkId;
            this.networkName = builder.networkName;
            this.routeTableId = builder.routeTableId;
            this.routeTableIds = builder.routeTableIds;
            this.routerTableId = builder.routerTableId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return gatewayRouteTableId
         */
        public String getGatewayRouteTableId() {
            return this.gatewayRouteTableId;
        }

        /**
         * @return networkAclId
         */
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return networkName
         */
        public String getNetworkName() {
            return this.networkName;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return routeTableIds
         */
        public RouteTableIds getRouteTableIds() {
            return this.routeTableIds;
        }

        /**
         * @return routerTableId
         */
        public String getRouterTableId() {
            return this.routerTableId;
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
         * @return vSwitchIds
         */
        public VSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String createdTime; 
            private String description; 
            private String ensRegionId; 
            private String gatewayRouteTableId; 
            private String networkAclId; 
            private String networkId; 
            private String networkName; 
            private String routeTableId; 
            private RouteTableIds routeTableIds; 
            private String routerTableId; 
            private String status; 
            private Tags tags; 
            private VSwitchIds vSwitchIds; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.cidrBlock = model.cidrBlock;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.ensRegionId = model.ensRegionId;
                this.gatewayRouteTableId = model.gatewayRouteTableId;
                this.networkAclId = model.networkAclId;
                this.networkId = model.networkId;
                this.networkName = model.networkName;
                this.routeTableId = model.routeTableId;
                this.routeTableIds = model.routeTableIds;
                this.routerTableId = model.routerTableId;
                this.status = model.status;
                this.tags = model.tags;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The IPv4 CIDR block of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.xx.xx/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The timestamp when the instance was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-16T06:33:15Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The description of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the gateway route table associated with the IPv6 gateway.</p>
             * <blockquote>
             * <p> This parameter is available only when the IPv6 gateway is associated with a gateway route table.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rt-5*****tbs</p>
             */
            public Builder gatewayRouteTableId(String gatewayRouteTableId) {
                this.gatewayRouteTableId = gatewayRouteTableId;
                return this;
            }

            /**
             * <p>The ID of the network access control list (ACL).</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-a2do9e413e0spxscd****</p>
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5***</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The name of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder networkName(String networkName) {
                this.networkName = networkName;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>rt-5*****pks</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The IDs of the route tables.</p>
             */
            public Builder routeTableIds(RouteTableIds routeTableIds) {
                this.routeTableIds = routeTableIds;
                return this;
            }

            /**
             * <p>The route table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rtb-5**</p>
             */
            public Builder routerTableId(String routerTableId) {
                this.routerTableId = routerTableId;
                return this;
            }

            /**
             * <p>The status of the network. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>Available</li>
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
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The list of vSwitches in the network.</p>
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworksResponseBody</p>
     */
    public static class Networks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Network")
        private java.util.List<Network> network;

        private Networks(Builder builder) {
            this.network = builder.network;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return network
         */
        public java.util.List<Network> getNetwork() {
            return this.network;
        }

        public static final class Builder {
            private java.util.List<Network> network; 

            private Builder() {
            } 

            private Builder(Networks model) {
                this.network = model.network;
            } 

            /**
             * Network.
             */
            public Builder network(java.util.List<Network> network) {
                this.network = network;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
}
