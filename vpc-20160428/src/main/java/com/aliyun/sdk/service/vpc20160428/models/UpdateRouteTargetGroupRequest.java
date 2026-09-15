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
 * {@link UpdateRouteTargetGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateRouteTargetGroupRequest</p>
 */
public class UpdateRouteTargetGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTargetGroupDescription")
    private String routeTargetGroupDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTargetGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeTargetGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTargetGroupName")
    private String routeTargetGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTargetMemberList")
    private java.util.List<RouteTargetMemberList> routeTargetMemberList;

    private UpdateRouteTargetGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.routeTargetGroupDescription = builder.routeTargetGroupDescription;
        this.routeTargetGroupId = builder.routeTargetGroupId;
        this.routeTargetGroupName = builder.routeTargetGroupName;
        this.routeTargetMemberList = builder.routeTargetMemberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRouteTargetGroupRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateRouteTargetGroupRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String routeTargetGroupDescription; 
        private String routeTargetGroupId; 
        private String routeTargetGroupName; 
        private java.util.List<RouteTargetMemberList> routeTargetMemberList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRouteTargetGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.routeTargetGroupDescription = request.routeTargetGroupDescription;
            this.routeTargetGroupId = request.routeTargetGroupId;
            this.routeTargetGroupName = request.routeTargetGroupName;
            this.routeTargetMemberList = request.routeTargetMemberList;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters. If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region ID of the route target group instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The description of the route target group. </p>
         * <p>The description must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The routing target group instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtg-xxx</p>
         */
        public Builder routeTargetGroupId(String routeTargetGroupId) {
            this.putQueryParameter("RouteTargetGroupId", routeTargetGroupId);
            this.routeTargetGroupId = routeTargetGroupId;
            return this;
        }

        /**
         * <p>The name of the route target group.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
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
         * <p>In active/standby mode, the following limits apply to route target group members:</p>
         * <ol>
         * <li>The number of route target group members must be 2.</li>
         * <li>The route target group members must belong to different zones.</li>
         * </ol>
         */
        public Builder routeTargetMemberList(java.util.List<RouteTargetMemberList> routeTargetMemberList) {
            this.putQueryParameter("RouteTargetMemberList", routeTargetMemberList);
            this.routeTargetMemberList = routeTargetMemberList;
            return this;
        }

        @Override
        public UpdateRouteTargetGroupRequest build() {
            return new UpdateRouteTargetGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRouteTargetGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateRouteTargetGroupRequest</p>
     */
    public static class RouteTargetMemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberType")
        private String memberType;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
             * 
             * <strong>example:</strong>
             * <p>ep-xxxx</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The member type of the route target group.</p>
             * <p>Currently supported type:</p>
             * <ul>
             * <li><strong>GatewayLoadBalancerEndpoint</strong></li>
             * </ul>
             * <p>In active/standby mode, all members of the route target group must be of the same type.</p>
             * 
             * <strong>example:</strong>
             * <p>GatewayLoadBalancerEndpoint</p>
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            /**
             * <p>The weight of the route target group member. Valid values:</p>
             * <ul>
             * <li>100: The member is the active instance.</li>
             * <li>0: The member is the standby instance.</li>
             * </ul>
             * <p>The weight can only be set during creation and cannot be modified.</p>
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
}
