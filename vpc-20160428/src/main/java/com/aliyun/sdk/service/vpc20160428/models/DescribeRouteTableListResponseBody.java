// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteTableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteTableListResponseBody</p>
 */
public class DescribeRouteTableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouterTableList")
    private RouterTableList routerTableList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouteTableListResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routerTableList = builder.routerTableList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteTableListResponseBody create() {
        return builder().build();
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
     * @return routerTableList
     */
    public RouterTableList getRouterTableList() {
        return this.routerTableList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private RouterTableList routerTableList; 
        private Integer totalCount; 

        /**
         * The ID of the route table.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The type of the cloud resource with which the route table is associated. Valid values:
         * <p>
         * 
         * *   **VSwitch**: vSwitch
         * *   **Gateway**: IPv4 gateway
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the vRouter to which the route table belongs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The description of the route table.
         */
        public Builder routerTableList(RouterTableList routerTableList) {
            this.routerTableList = routerTableList;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the route table belongs.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteTableListResponseBody build() {
            return new DescribeRouteTableListResponseBody(this);
        } 

    } 

    public static class GatewayIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayIds")
        private java.util.List < String > gatewayIds;

        private GatewayIds(Builder builder) {
            this.gatewayIds = builder.gatewayIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayIds create() {
            return builder().build();
        }

        /**
         * @return gatewayIds
         */
        public java.util.List < String > getGatewayIds() {
            return this.gatewayIds;
        }

        public static final class Builder {
            private java.util.List < String > gatewayIds; 

            /**
             * GatewayIds.
             */
            public Builder gatewayIds(java.util.List < String > gatewayIds) {
                this.gatewayIds = gatewayIds;
                return this;
            }

            public GatewayIds build() {
                return new GatewayIds(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private java.util.List < String > vSwitchId;

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
        public java.util.List < String > getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List < String > vSwitchId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List < String > vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
    public static class RouterTableListType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociateType")
        private String associateType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GatewayIds")
        private GatewayIds gatewayIds;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RoutePropagationEnable")
        private Boolean routePropagationEnable;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("RouteTableName")
        private String routeTableName;

        @com.aliyun.core.annotation.NameInMap("RouteTableType")
        private String routeTableType;

        @com.aliyun.core.annotation.NameInMap("RouterId")
        private String routerId;

        @com.aliyun.core.annotation.NameInMap("RouterType")
        private String routerType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private RouterTableListType(Builder builder) {
            this.associateType = builder.associateType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.gatewayIds = builder.gatewayIds;
            this.ownerId = builder.ownerId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routePropagationEnable = builder.routePropagationEnable;
            this.routeTableId = builder.routeTableId;
            this.routeTableName = builder.routeTableName;
            this.routeTableType = builder.routeTableType;
            this.routerId = builder.routerId;
            this.routerType = builder.routerType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterTableListType create() {
            return builder().build();
        }

        /**
         * @return associateType
         */
        public String getAssociateType() {
            return this.associateType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gatewayIds
         */
        public GatewayIds getGatewayIds() {
            return this.gatewayIds;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routePropagationEnable
         */
        public Boolean getRoutePropagationEnable() {
            return this.routePropagationEnable;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return routeTableName
         */
        public String getRouteTableName() {
            return this.routeTableName;
        }

        /**
         * @return routeTableType
         */
        public String getRouteTableType() {
            return this.routeTableType;
        }

        /**
         * @return routerId
         */
        public String getRouterId() {
            return this.routerId;
        }

        /**
         * @return routerType
         */
        public String getRouterType() {
            return this.routerType;
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

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String associateType; 
            private String creationTime; 
            private String description; 
            private GatewayIds gatewayIds; 
            private Long ownerId; 
            private String resourceGroupId; 
            private Boolean routePropagationEnable; 
            private String routeTableId; 
            private String routeTableName; 
            private String routeTableType; 
            private String routerId; 
            private String routerType; 
            private String status; 
            private Tags tags; 
            private VSwitchIds vSwitchIds; 
            private String vpcId; 

            /**
             * The tags.
             */
            public Builder associateType(String associateType) {
                this.associateType = associateType;
                return this;
            }

            /**
             * The type of the router to which the route table belongs. Valid values:
             * <p>
             * 
             * *   **VRouter**
             * *   **VBR**
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The information about the vSwitches.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The detailed information about the IPv4 gateway.
             */
            public Builder gatewayIds(GatewayIds gatewayIds) {
                this.gatewayIds = gatewayIds;
                return this;
            }

            /**
             * The value of tag N added to the resource.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The detailed information about the IPv4 gateway.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Whether to receive the propagation routes. Valid Values:
             * <p>
             * 
             * *   **True**: The propagation route is received.
             * 
             * *   **False**: The propagation route is not received.
             */
            public Builder routePropagationEnable(Boolean routePropagationEnable) {
                this.routePropagationEnable = routePropagationEnable;
                return this;
            }

            /**
             * The key of tag N added to the resource.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * The name of the route table.
             */
            public Builder routeTableName(String routeTableName) {
                this.routeTableName = routeTableName;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder routeTableType(String routeTableType) {
                this.routeTableType = routeTableType;
                return this;
            }

            /**
             * The tag added to the route table.
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * The detailed information about the IPv4 gateway.
             */
            public Builder routerType(String routerType) {
                this.routerType = routerType;
                return this;
            }

            /**
             * The name of the route table.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The vSwitch IDs.
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The ID of the resource group to which the route table belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public RouterTableListType build() {
                return new RouterTableListType(this);
            } 

        } 

    }
    public static class RouterTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouterTableListType")
        private java.util.List < RouterTableListType> routerTableListType;

        private RouterTableList(Builder builder) {
            this.routerTableListType = builder.routerTableListType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterTableList create() {
            return builder().build();
        }

        /**
         * @return routerTableListType
         */
        public java.util.List < RouterTableListType> getRouterTableListType() {
            return this.routerTableListType;
        }

        public static final class Builder {
            private java.util.List < RouterTableListType> routerTableListType; 

            /**
             * RouterTableListType.
             */
            public Builder routerTableListType(java.util.List < RouterTableListType> routerTableListType) {
                this.routerTableListType = routerTableListType;
                return this;
            }

            public RouterTableList build() {
                return new RouterTableList(this);
            } 

        } 

    }
}
