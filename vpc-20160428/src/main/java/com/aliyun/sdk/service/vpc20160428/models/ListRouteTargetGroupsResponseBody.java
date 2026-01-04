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
 * {@link ListRouteTargetGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRouteTargetGroupsResponseBody</p>
 */
public class ListRouteTargetGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTargetGroups")
    private java.util.List<RouteTargetGroups> routeTargetGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRouteTargetGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeTargetGroups = builder.routeTargetGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteTargetGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeTargetGroups
     */
    public java.util.List<RouteTargetGroups> getRouteTargetGroups() {
        return this.routeTargetGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<RouteTargetGroups> routeTargetGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRouteTargetGroupsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.routeTargetGroups = model.routeTargetGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Token for the next query. Value: If NextToken is empty, it indicates there is no next query. If NextToken has a return value, it indicates the token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of route target groups.</p>
         */
        public Builder routeTargetGroups(java.util.List<RouteTargetGroups> routeTargetGroups) {
            this.routeTargetGroups = routeTargetGroups;
            return this;
        }

        /**
         * <p>Number of items in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRouteTargetGroupsResponseBody build() {
            return new ListRouteTargetGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRouteTargetGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteTargetGroupsResponseBody</p>
     */
    public static class RouteTargetMemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("HealthCheckStatus")
        private String healthCheckStatus;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberType")
        private String memberType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private RouteTargetMemberList(Builder builder) {
            this.enableStatus = builder.enableStatus;
            this.healthCheckStatus = builder.healthCheckStatus;
            this.memberId = builder.memberId;
            this.memberType = builder.memberType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTargetMemberList create() {
            return builder().build();
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return healthCheckStatus
         */
        public String getHealthCheckStatus() {
            return this.healthCheckStatus;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberType
         */
        public String getMemberType() {
            return this.memberType;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String enableStatus; 
            private String healthCheckStatus; 
            private String memberId; 
            private String memberType; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(RouteTargetMemberList model) {
                this.enableStatus = model.enableStatus;
                this.healthCheckStatus = model.healthCheckStatus;
                this.memberId = model.memberId;
                this.memberType = model.memberType;
                this.weight = model.weight;
            } 

            /**
             * <p>The enable status of the route target group member. Values:</p>
             * <ul>
             * <li><strong>Enable</strong>: Enabled.</li>
             * <li><strong>Disable</strong>: Disabled.</li>
             * </ul>
             * <p>Only disabled route target group members can be modified to other instances. Enabled route target group members cannot be modified.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The health check status of the route target group member. Values:</p>
             * <ul>
             * <li><strong>Normal</strong>: Normal</li>
             * <li><strong>Abnormal</strong>: Abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder healthCheckStatus(String healthCheckStatus) {
                this.healthCheckStatus = healthCheckStatus;
                return this;
            }

            /**
             * <p>The ID of the route target group member instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-xxxx</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The type of the route target group member.</p>
             * <p>Currently supported types:</p>
             * <ul>
             * <li><strong>GatewayLoadBalancerEndpoint</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GatewayLoadBalancerEndpoint</p>
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            /**
             * <p>The weight value of the route target group member. Values:</p>
             * <ul>
             * <li><strong>100</strong>: Indicates that the member is the primary instance.</li>
             * <li><strong>0</strong>: Indicates that the member is the backup instance.</li>
             * </ul>
             * <p>The weight value can only be set during creation and cannot be modified.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public RouteTargetMemberList build() {
                return new RouteTargetMemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRouteTargetGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteTargetGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>image/upload/cbbec42e0be33abb27babefcbe0397f0</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the resource tag. Up to 20 tag values are supported. If you need to pass this value, you can input an empty string. A maximum of 128 characters is allowed. The value cannot start with <code>aliyun</code> or <code>acs:</code>, and it must not contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRouteTargetGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteTargetGroupsResponseBody</p>
     */
    public static class RouteTargetGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMode")
        private String configMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteTargetGroupDescription")
        private String routeTargetGroupDescription;

        @com.aliyun.core.annotation.NameInMap("RouteTargetGroupId")
        private String routeTargetGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteTargetGroupName")
        private String routeTargetGroupName;

        @com.aliyun.core.annotation.NameInMap("RouteTargetMemberList")
        private java.util.List<RouteTargetMemberList> routeTargetMemberList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private RouteTargetGroups(Builder builder) {
            this.configMode = builder.configMode;
            this.createTime = builder.createTime;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeTargetGroupDescription = builder.routeTargetGroupDescription;
            this.routeTargetGroupId = builder.routeTargetGroupId;
            this.routeTargetGroupName = builder.routeTargetGroupName;
            this.routeTargetMemberList = builder.routeTargetMemberList;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTargetGroups create() {
            return builder().build();
        }

        /**
         * @return configMode
         */
        public String getConfigMode() {
            return this.configMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return routeTargetGroupDescription
         */
        public String getRouteTargetGroupDescription() {
            return this.routeTargetGroupDescription;
        }

        /**
         * @return routeTargetGroupId
         */
        public String getRouteTargetGroupId() {
            return this.routeTargetGroupId;
        }

        /**
         * @return routeTargetGroupName
         */
        public String getRouteTargetGroupName() {
            return this.routeTargetGroupName;
        }

        /**
         * @return routeTargetMemberList
         */
        public java.util.List<RouteTargetMemberList> getRouteTargetMemberList() {
            return this.routeTargetMemberList;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String configMode; 
            private String createTime; 
            private String regionId; 
            private String resourceGroupId; 
            private String routeTargetGroupDescription; 
            private String routeTargetGroupId; 
            private String routeTargetGroupName; 
            private java.util.List<RouteTargetMemberList> routeTargetMemberList; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(RouteTargetGroups model) {
                this.configMode = model.configMode;
                this.createTime = model.createTime;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.routeTargetGroupDescription = model.routeTargetGroupDescription;
                this.routeTargetGroupId = model.routeTargetGroupId;
                this.routeTargetGroupName = model.routeTargetGroupName;
                this.routeTargetMemberList = model.routeTargetMemberList;
                this.status = model.status;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The configuration mode of the route target group. Supported modes are as follows:</p>
             * <ul>
             * <li><strong>Active-Standby</strong>: Active-standby mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active-Standby</p>
             */
            public Builder configMode(String configMode) {
                this.configMode = configMode;
                return this;
            }

            /**
             * <p>The time when the route target group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-30T06:40:50Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The region ID of the VPC to which the route target group belongs.</p>
             * <p>You can obtain the region ID by calling the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> interface.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the route target group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm3swh6ta56ri</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Description of the route target group.</p>
             * 
             * <strong>example:</strong>
             * <p>myRouteTargetGroupDescription</p>
             */
            public Builder routeTargetGroupDescription(String routeTargetGroupDescription) {
                this.routeTargetGroupDescription = routeTargetGroupDescription;
                return this;
            }

            /**
             * <p>The ID of the route target group instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rtg-xxxx</p>
             */
            public Builder routeTargetGroupId(String routeTargetGroupId) {
                this.routeTargetGroupId = routeTargetGroupId;
                return this;
            }

            /**
             * <p>The name of the route target group.</p>
             * 
             * <strong>example:</strong>
             * <p>myRouteTargetGroupName</p>
             */
            public Builder routeTargetGroupName(String routeTargetGroupName) {
                this.routeTargetGroupName = routeTargetGroupName;
                return this;
            }

            /**
             * <p>The list of route target group members.</p>
             */
            public Builder routeTargetMemberList(java.util.List<RouteTargetMemberList> routeTargetMemberList) {
                this.routeTargetMemberList = routeTargetMemberList;
                return this;
            }

            /**
             * <p>Status of the route target group. Values:</p>
             * <ul>
             * <li><strong>Recovering</strong>: Active-Standby rollback in progress</li>
             * <li><strong>Switched</strong>: Active-Standby switched</li>
             * <li><strong>Available</strong>: Available</li>
             * <li><strong>Abnormal</strong>: Standby instance abnormal</li>
             * <li><strong>Pending</strong>: Creating</li>
             * <li><strong>Switching</strong>: Active-Standby switching in progress</li>
             * <li><strong>Deleting</strong>: Deleting</li>
             * <li><strong>Unavailable</strong>: Both primary and standby instances are abnormal</li>
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
             * <p>The tag values. A maximum of 20 tag values are supported. If you need to pass this value, you can input an empty string.</p>
             * <p>A maximum of 128 characters are supported. The value cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the route target group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf60y8uzhsvbhmuh3l654</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public RouteTargetGroups build() {
                return new RouteTargetGroups(this);
            } 

        } 

    }
}
