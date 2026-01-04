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
 * {@link CreateRouteTargetGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteTargetGroupRequest</p>
 */
public class CreateRouteTargetGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTargetGroupDescription")
    private String routeTargetGroupDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTargetGroupName")
    private String routeTargetGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTargetMemberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RouteTargetMemberList> routeTargetMemberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateRouteTargetGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configMode = builder.configMode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.routeTargetGroupDescription = builder.routeTargetGroupDescription;
        this.routeTargetGroupName = builder.routeTargetGroupName;
        this.routeTargetMemberList = builder.routeTargetMemberList;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteTargetGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configMode
     */
    public String getConfigMode() {
        return this.configMode;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateRouteTargetGroupRequest, Builder> {
        private String clientToken; 
        private String configMode; 
        private String regionId; 
        private String resourceGroupId; 
        private String routeTargetGroupDescription; 
        private String routeTargetGroupName; 
        private java.util.List<RouteTargetMemberList> routeTargetMemberList; 
        private java.util.List<Tag> tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteTargetGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configMode = request.configMode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.routeTargetGroupDescription = request.routeTargetGroupDescription;
            this.routeTargetGroupName = request.routeTargetGroupName;
            this.routeTargetMemberList = request.routeTargetMemberList;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>Client token used to ensure the idempotence of the request. Generate a parameter value from your client to ensure that it is unique across different requests. ClientToken supports only ASCII characters. Note: If you do not specify this, the system automatically uses the RequestId of the API request as the ClientToken identifier. Each API request has a different RequestId.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configuration mode of the route target group. Supported modes:</p>
         * <ul>
         * <li><strong>Active-Standby</strong>: Active-Standby mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Active-Standby</p>
         */
        public Builder configMode(String configMode) {
            this.putQueryParameter("ConfigMode", configMode);
            this.configMode = configMode;
            return this;
        }

        /**
         * <p>The region ID to which the route target group belongs. You can obtain the region ID by calling the DescribeRegions interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazffggds****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The description of the route target group.</p>
         * <p>The description length must be between 1 and 256 characters, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>myRouteTargetGroupDescription</p>
         */
        public Builder routeTargetGroupDescription(String routeTargetGroupDescription) {
            this.putQueryParameter("RouteTargetGroupDescription", routeTargetGroupDescription);
            this.routeTargetGroupDescription = routeTargetGroupDescription;
            return this;
        }

        /**
         * <p>The name of the route target group.</p>
         * <p>The name length must be between 1 and 128 characters, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>myRouteTargetGroupName</p>
         */
        public Builder routeTargetGroupName(String routeTargetGroupName) {
            this.putQueryParameter("RouteTargetGroupName", routeTargetGroupName);
            this.routeTargetGroupName = routeTargetGroupName;
            return this;
        }

        /**
         * <p>The member list of the route target group.</p>
         * <p>In Active-Standby mode, the following restrictions apply to the members of the route target group:</p>
         * <ol>
         * <li>The number of route target group members must be 2.</li>
         * <li>The route target group members must belong to different availability zones.</li>
         * </ol>
         * <p>This parameter is required.</p>
         */
        public Builder routeTargetMemberList(java.util.List<RouteTargetMemberList> routeTargetMemberList) {
            this.putQueryParameter("RouteTargetMemberList", routeTargetMemberList);
            this.routeTargetMemberList = routeTargetMemberList;
            return this;
        }

        /**
         * <p>The tags of the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the route target group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateRouteTargetGroupRequest build() {
            return new CreateRouteTargetGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRouteTargetGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateRouteTargetGroupRequest</p>
     */
    public static class RouteTargetMemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memberType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer weight;

        private RouteTargetMemberList(Builder builder) {
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
            private String memberId; 
            private String memberType; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(RouteTargetMemberList model) {
                this.memberId = model.memberId;
                this.memberType = model.memberType;
                this.weight = model.weight;
            } 

            /**
             * <p>The instance ID of the route target group member.</p>
             * <p>This parameter is required.</p>
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
             * <p>In Active-Standby mode, all members of the route target group must have the same type.</p>
             * <p>This parameter is required.</p>
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
             * <li><strong>100</strong>: Indicates the member is a primary instance.</li>
             * <li><strong>0</strong>: Indicates the member is a standby instance.</li>
             * </ul>
             * <p>The weight value can only be set during creation and cannot be modified.</p>
             * <p>This parameter is required.</p>
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
     * {@link CreateRouteTargetGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateRouteTargetGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. Up to 20 tag keys are supported. If you need to pass this value, you cannot input an empty string.</p>
             * <p>A tag key can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. Up to 20 tag values are supported. If you need to pass this value, you can input an empty string.</p>
             * <p>A tag value can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
}
