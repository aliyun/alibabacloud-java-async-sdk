// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link UpdateRouteMapRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRouteMapRuleRequest</p>
 */
public class UpdateRouteMapRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchConditions")
    private MatchConditions matchConditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMapRuleId")
    private String routeMapRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SetActions")
    private SetActions setActions;

    private UpdateRouteMapRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.matchConditions = builder.matchConditions;
        this.name = builder.name;
        this.priority = builder.priority;
        this.routeMapRuleId = builder.routeMapRuleId;
        this.setActions = builder.setActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRouteMapRuleRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return matchConditions
     */
    public MatchConditions getMatchConditions() {
        return this.matchConditions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return routeMapRuleId
     */
    public String getRouteMapRuleId() {
        return this.routeMapRuleId;
    }

    /**
     * @return setActions
     */
    public SetActions getSetActions() {
        return this.setActions;
    }

    public static final class Builder extends Request.Builder<UpdateRouteMapRuleRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private MatchConditions matchConditions; 
        private String name; 
        private Integer priority; 
        private String routeMapRuleId; 
        private SetActions setActions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRouteMapRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.matchConditions = request.matchConditions;
            this.name = request.name;
            this.priority = request.priority;
            this.routeMapRuleId = request.routeMapRuleId;
            this.setActions = request.setActions;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The detailed description of the rule. The description can be empty or 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Matches production prefixes from on-prem and sets a higher local preference.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to precheck only this request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request without updating the route map rule. The system checks whether required parameters are set, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, the route map rule is updated.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The match conditions of the route map rule. The system performs the actions defined in <strong>SetActions</strong> only when a route meets all the match conditions defined in this parameter.</p>
         */
        public Builder matchConditions(MatchConditions matchConditions) {
            String matchConditionsShrink = shrink(matchConditions, "MatchConditions", "json");
            this.putQueryParameter("MatchConditions", matchConditionsShrink);
            this.matchConditions = matchConditions;
            return this;
        }

        /**
         * <p>The name of the rule for easy identification. The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Permit-Prod-Prefixes-Set-LP</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The priority of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the route map rule to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>rmr-0a1b2c3d4e5f6a7b8</p>
         */
        public Builder routeMapRuleId(String routeMapRuleId) {
            this.putQueryParameter("RouteMapRuleId", routeMapRuleId);
            this.routeMapRuleId = routeMapRuleId;
            return this;
        }

        /**
         * <p>The actions to be performed for the route map rule. After a route meets all the match conditions defined in <strong>MatchConditions</strong>, the system processes the route based on the actions defined in this parameter.</p>
         */
        public Builder setActions(SetActions setActions) {
            String setActionsShrink = shrink(setActions, "SetActions", "json");
            this.putQueryParameter("SetActions", setActionsShrink);
            this.setActions = setActions;
            return this;
        }

        @Override
        public UpdateRouteMapRuleRequest build() {
            return new UpdateRouteMapRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRouteMapRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateRouteMapRuleRequest</p>
     */
    public static class MatchConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPrefixesInclude")
        private java.util.List<String> addressPrefixesInclude;

        @com.aliyun.core.annotation.NameInMap("AddressPrefixesMatch")
        private java.util.List<String> addressPrefixesMatch;

        @com.aliyun.core.annotation.NameInMap("AsPathsInclude")
        private java.util.List<Long> asPathsInclude;

        @com.aliyun.core.annotation.NameInMap("AsPathsMatch")
        private java.util.List<Long> asPathsMatch;

        @com.aliyun.core.annotation.NameInMap("CommunitySetInclude")
        private java.util.List<String> communitySetInclude;

        @com.aliyun.core.annotation.NameInMap("CommunitySetMatch")
        private java.util.List<String> communitySetMatch;

        @com.aliyun.core.annotation.NameInMap("DestinationInstanceIds")
        private java.util.List<String> destinationInstanceIds;

        @com.aliyun.core.annotation.NameInMap("DestinationInstanceIdsReverseMatch")
        private Boolean destinationInstanceIdsReverseMatch;

        @com.aliyun.core.annotation.NameInMap("DestinationInstanceTypes")
        private java.util.List<String> destinationInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
        private java.util.List<String> destinationRegionIds;

        @com.aliyun.core.annotation.NameInMap("DestinationRouteTableIds")
        private java.util.List<String> destinationRouteTableIds;

        @com.aliyun.core.annotation.NameInMap("MatchAddressType")
        private String matchAddressType;

        @com.aliyun.core.annotation.NameInMap("RouteTypes")
        private java.util.List<String> routeTypes;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceIds")
        private java.util.List<String> sourceInstanceIds;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceIdsReverseMatch")
        private Boolean sourceInstanceIdsReverseMatch;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceTypes")
        private java.util.List<String> sourceInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("SourceRegionIds")
        private java.util.List<String> sourceRegionIds;

        @com.aliyun.core.annotation.NameInMap("SourceRouteTableIds")
        private java.util.List<String> sourceRouteTableIds;

        private MatchConditions(Builder builder) {
            this.addressPrefixesInclude = builder.addressPrefixesInclude;
            this.addressPrefixesMatch = builder.addressPrefixesMatch;
            this.asPathsInclude = builder.asPathsInclude;
            this.asPathsMatch = builder.asPathsMatch;
            this.communitySetInclude = builder.communitySetInclude;
            this.communitySetMatch = builder.communitySetMatch;
            this.destinationInstanceIds = builder.destinationInstanceIds;
            this.destinationInstanceIdsReverseMatch = builder.destinationInstanceIdsReverseMatch;
            this.destinationInstanceTypes = builder.destinationInstanceTypes;
            this.destinationRegionIds = builder.destinationRegionIds;
            this.destinationRouteTableIds = builder.destinationRouteTableIds;
            this.matchAddressType = builder.matchAddressType;
            this.routeTypes = builder.routeTypes;
            this.sourceInstanceIds = builder.sourceInstanceIds;
            this.sourceInstanceIdsReverseMatch = builder.sourceInstanceIdsReverseMatch;
            this.sourceInstanceTypes = builder.sourceInstanceTypes;
            this.sourceRegionIds = builder.sourceRegionIds;
            this.sourceRouteTableIds = builder.sourceRouteTableIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchConditions create() {
            return builder().build();
        }

        /**
         * @return addressPrefixesInclude
         */
        public java.util.List<String> getAddressPrefixesInclude() {
            return this.addressPrefixesInclude;
        }

        /**
         * @return addressPrefixesMatch
         */
        public java.util.List<String> getAddressPrefixesMatch() {
            return this.addressPrefixesMatch;
        }

        /**
         * @return asPathsInclude
         */
        public java.util.List<Long> getAsPathsInclude() {
            return this.asPathsInclude;
        }

        /**
         * @return asPathsMatch
         */
        public java.util.List<Long> getAsPathsMatch() {
            return this.asPathsMatch;
        }

        /**
         * @return communitySetInclude
         */
        public java.util.List<String> getCommunitySetInclude() {
            return this.communitySetInclude;
        }

        /**
         * @return communitySetMatch
         */
        public java.util.List<String> getCommunitySetMatch() {
            return this.communitySetMatch;
        }

        /**
         * @return destinationInstanceIds
         */
        public java.util.List<String> getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        /**
         * @return destinationInstanceIdsReverseMatch
         */
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        /**
         * @return destinationInstanceTypes
         */
        public java.util.List<String> getDestinationInstanceTypes() {
            return this.destinationInstanceTypes;
        }

        /**
         * @return destinationRegionIds
         */
        public java.util.List<String> getDestinationRegionIds() {
            return this.destinationRegionIds;
        }

        /**
         * @return destinationRouteTableIds
         */
        public java.util.List<String> getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        /**
         * @return matchAddressType
         */
        public String getMatchAddressType() {
            return this.matchAddressType;
        }

        /**
         * @return routeTypes
         */
        public java.util.List<String> getRouteTypes() {
            return this.routeTypes;
        }

        /**
         * @return sourceInstanceIds
         */
        public java.util.List<String> getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        /**
         * @return sourceInstanceIdsReverseMatch
         */
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        /**
         * @return sourceInstanceTypes
         */
        public java.util.List<String> getSourceInstanceTypes() {
            return this.sourceInstanceTypes;
        }

        /**
         * @return sourceRegionIds
         */
        public java.util.List<String> getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        /**
         * @return sourceRouteTableIds
         */
        public java.util.List<String> getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

        public static final class Builder {
            private java.util.List<String> addressPrefixesInclude; 
            private java.util.List<String> addressPrefixesMatch; 
            private java.util.List<Long> asPathsInclude; 
            private java.util.List<Long> asPathsMatch; 
            private java.util.List<String> communitySetInclude; 
            private java.util.List<String> communitySetMatch; 
            private java.util.List<String> destinationInstanceIds; 
            private Boolean destinationInstanceIdsReverseMatch; 
            private java.util.List<String> destinationInstanceTypes; 
            private java.util.List<String> destinationRegionIds; 
            private java.util.List<String> destinationRouteTableIds; 
            private String matchAddressType; 
            private java.util.List<String> routeTypes; 
            private java.util.List<String> sourceInstanceIds; 
            private Boolean sourceInstanceIdsReverseMatch; 
            private java.util.List<String> sourceInstanceTypes; 
            private java.util.List<String> sourceRegionIds; 
            private java.util.List<String> sourceRouteTableIds; 

            private Builder() {
            } 

            private Builder(MatchConditions model) {
                this.addressPrefixesInclude = model.addressPrefixesInclude;
                this.addressPrefixesMatch = model.addressPrefixesMatch;
                this.asPathsInclude = model.asPathsInclude;
                this.asPathsMatch = model.asPathsMatch;
                this.communitySetInclude = model.communitySetInclude;
                this.communitySetMatch = model.communitySetMatch;
                this.destinationInstanceIds = model.destinationInstanceIds;
                this.destinationInstanceIdsReverseMatch = model.destinationInstanceIdsReverseMatch;
                this.destinationInstanceTypes = model.destinationInstanceTypes;
                this.destinationRegionIds = model.destinationRegionIds;
                this.destinationRouteTableIds = model.destinationRouteTableIds;
                this.matchAddressType = model.matchAddressType;
                this.routeTypes = model.routeTypes;
                this.sourceInstanceIds = model.sourceInstanceIds;
                this.sourceInstanceIdsReverseMatch = model.sourceInstanceIdsReverseMatch;
                this.sourceInstanceTypes = model.sourceInstanceTypes;
                this.sourceRegionIds = model.sourceRegionIds;
                this.sourceRouteTableIds = model.sourceRouteTableIds;
            } 

            /**
             * <p>The route prefix list for fuzzy matching. You can specify up to 64 CIDR blocks.</p>
             * <p>A match is successful if the route prefix in the match condition contains the route prefix of the route being matched.</p>
             * <p>For example, a policy defined with 10.0.0.0/8 can fuzzy match the 10.10.10.0/24 route.</p>
             * <p>The CIDR blocks use the CIDR format and support both IPv4 and IPv6.</p>
             * <p>This parameter is mutually exclusive with <strong>AddressPrefixesMatch</strong>. You cannot specify both parameters at the same time.</p>
             */
            public Builder addressPrefixesInclude(java.util.List<String> addressPrefixesInclude) {
                this.addressPrefixesInclude = addressPrefixesInclude;
                return this;
            }

            /**
             * <p>The route prefix list for exact matching. You can specify up to 64 CIDR blocks.</p>
             * <p>A match is successful only if the route prefix in the match condition is identical to the route prefix of the route being matched.</p>
             * <p>For example, a policy defined with 10.0.0.0/8 can exactly match only the 10.0.0.0/8 route.</p>
             * <p>The CIDR blocks use the CIDR format and support both IPv4 and IPv6.</p>
             * <p>This parameter is mutually exclusive with <strong>AddressPrefixesInclude</strong>. You cannot specify both parameters at the same time.</p>
             */
            public Builder addressPrefixesMatch(java.util.List<String> addressPrefixesMatch) {
                this.addressPrefixesMatch = addressPrefixesMatch;
                return this;
            }

            /**
             * <p>The list of AS paths for fuzzy match. You can enter up to 64 AS numbers.</p>
             * <p>A route is considered a match if the AS path in the match condition overlaps with the AS path of the matched route.</p>
             * <p>This parameter is mutually exclusive with <strong>AsPathsMatch</strong> and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means that only a list of AS numbers is supported, and sets and sublists are not supported.</p>
             * </blockquote>
             */
            public Builder asPathsInclude(java.util.List<Long> asPathsInclude) {
                this.asPathsInclude = asPathsInclude;
                return this;
            }

            /**
             * <p>The list of AS paths for exact match. You can enter up to 64 AS numbers.</p>
             * <p>A route is considered a match only when the AS path in the match condition is exactly the same as the AS path of the matched route.</p>
             * <p>This parameter is mutually exclusive with <strong>AsPathsInclude</strong> and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means that only a list of AS numbers is supported, and sets and sublists are not supported.</p>
             * </blockquote>
             */
            public Builder asPathsMatch(java.util.List<Long> asPathsMatch) {
                this.asPathsMatch = asPathsMatch;
                return this;
            }

            /**
             * <p>The community set for fuzzy match. You can enter up to 64 communities.</p>
             * <p>A route is considered a match if the community in the match condition overlaps with the community of the matched route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter is mutually exclusive with <strong>CommunitySetMatch</strong> and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
             * </blockquote>
             */
            public Builder communitySetInclude(java.util.List<String> communitySetInclude) {
                this.communitySetInclude = communitySetInclude;
                return this;
            }

            /**
             * <p>The community set for exact match. You can enter up to 64 communities.</p>
             * <p>A route is considered a match only when the community in the match condition is exactly the same as the community of the matched route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter is mutually exclusive with <strong>CommunitySetInclude</strong> and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
             * </blockquote>
             */
            public Builder communitySetMatch(java.util.List<String> communitySetMatch) {
                this.communitySetMatch = communitySetMatch;
                return this;
            }

            /**
             * <p>The list of destination instance IDs to be matched. You can enter the following types of instance IDs:</p>
             * <ul>
             * <li>Virtual private cloud (VPC) instance IDs</li>
             * <li>Virtual border router (VBR) instance IDs</li>
             * </ul>
             * <p>You can enter up to 64 instance IDs.</p>
             * <blockquote>
             * <p>The list of destination instance IDs takes effect only when the direction of the route map is outbound.</p>
             * </blockquote>
             */
            public Builder destinationInstanceIds(java.util.List<String> destinationInstanceIds) {
                this.destinationInstanceIds = destinationInstanceIds;
                return this;
            }

            /**
             * <p>Specifies whether to use the exclusion match mode for the list of destination instance IDs. Valid values:</p>
             * <ul>
             * <li><p><strong>false</strong> (default): no. A route is considered a match if the destination instance ID of the route is in <strong>DestinationInstanceIds.N</strong>.</p>
             * </li>
             * <li><p><strong>true</strong>: yes. A route is considered a match if the destination instance ID of the route is not in <strong>DestinationInstanceIds.N</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder destinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
                this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
                return this;
            }

            /**
             * <p>The list of destination instance types to be matched. The following instance types are supported:</p>
             * <ul>
             * <li><p><strong>VPC</strong>: VPC instance.</p>
             * </li>
             * <li><p><strong>VBR</strong>: VBR instance.</p>
             * </li>
             * </ul>
             * <p>You can enter multiple instance types.</p>
             * <blockquote>
             * <p>The list of destination instance types takes effect only when the direction of the route map is outbound.</p>
             * </blockquote>
             */
            public Builder destinationInstanceTypes(java.util.List<String> destinationInstanceTypes) {
                this.destinationInstanceTypes = destinationInstanceTypes;
                return this;
            }

            /**
             * <p>The list of destination region IDs to be matched. You can enter up to 64 region IDs.</p>
             */
            public Builder destinationRegionIds(java.util.List<String> destinationRegionIds) {
                this.destinationRegionIds = destinationRegionIds;
                return this;
            }

            /**
             * <p>The list of destination route table IDs to be matched. You can enter up to 64 route table IDs.</p>
             * <blockquote>
             * <p>The list of destination route table IDs takes effect only when the direction of the route map is outbound.</p>
             * </blockquote>
             */
            public Builder destinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
                this.destinationRouteTableIds = destinationRouteTableIds;
                return this;
            }

            /**
             * <p>The IP address type of the routes to be matched. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong>: matches only IPv4 routes.</li>
             * <li><strong>IPv6</strong>: matches only IPv6 routes.</li>
             * </ul>
             * <p>This parameter can be left empty, which indicates that all types of routes are matched.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder matchAddressType(String matchAddressType) {
                this.matchAddressType = matchAddressType;
                return this;
            }

            /**
             * <p>The list of route types to match. The following route types are supported:</p>
             * <ul>
             * <li><p><strong>System</strong>: system route, which is automatically generated by the system.</p>
             * </li>
             * <li><p><strong>Custom</strong>: custom route, which is manually added by users.</p>
             * </li>
             * <li><p><strong>BGP</strong>: BGP route, which is propagated through the BGP routable protocol.</p>
             * </li>
             * </ul>
             * <p>You can specify multiple route types.</p>
             */
            public Builder routeTypes(java.util.List<String> routeTypes) {
                this.routeTypes = routeTypes;
                return this;
            }

            /**
             * <p>The list of source instance IDs to be matched. You can enter the following types of instance IDs:</p>
             * <ul>
             * <li>Virtual private cloud (VPC) instance IDs</li>
             * <li>Virtual border router (VBR) instance IDs</li>
             * </ul>
             * <p>You can enter up to 64 instance IDs.</p>
             */
            public Builder sourceInstanceIds(java.util.List<String> sourceInstanceIds) {
                this.sourceInstanceIds = sourceInstanceIds;
                return this;
            }

            /**
             * <p>Specifies whether to use the exclusion match mode for the list of source instance IDs. Valid values:</p>
             * <ul>
             * <li><p><strong>false</strong> (default): no. A route is considered a match if the source instance ID of the route is in <strong>SourceInstanceIds.N</strong>.</p>
             * </li>
             * <li><p><strong>true</strong>: yes. A route is considered a match if the source instance ID of the route is not in <strong>SourceInstanceIds.N</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
                this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
                return this;
            }

            /**
             * <p>The list of source instance types to be matched. The following instance types are supported:</p>
             * <ul>
             * <li><p><strong>VPC</strong>: VPC instance.</p>
             * </li>
             * <li><p><strong>VBR</strong>: VBR instance.</p>
             * </li>
             * </ul>
             * <p>You can enter multiple instance types.</p>
             */
            public Builder sourceInstanceTypes(java.util.List<String> sourceInstanceTypes) {
                this.sourceInstanceTypes = sourceInstanceTypes;
                return this;
            }

            /**
             * <p>The list of source region IDs to be matched. You can enter up to 64 region IDs.</p>
             */
            public Builder sourceRegionIds(java.util.List<String> sourceRegionIds) {
                this.sourceRegionIds = sourceRegionIds;
                return this;
            }

            /**
             * <p>The list of source route table IDs to be matched. You can enter up to 64 route table IDs.</p>
             */
            public Builder sourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
                this.sourceRouteTableIds = sourceRouteTableIds;
                return this;
            }

            public MatchConditions build() {
                return new MatchConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRouteMapRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateRouteMapRuleRequest</p>
     */
    public static class SetActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPathPrepend")
        private java.util.List<Long> asPathPrepend;

        @com.aliyun.core.annotation.NameInMap("AsPathReplace")
        private java.util.List<Long> asPathReplace;

        @com.aliyun.core.annotation.NameInMap("CommunityAdd")
        private java.util.List<String> communityAdd;

        @com.aliyun.core.annotation.NameInMap("CommunityReplace")
        private java.util.List<String> communityReplace;

        @com.aliyun.core.annotation.NameInMap("NextPriority")
        private Long nextPriority;

        @com.aliyun.core.annotation.NameInMap("RouteAction")
        private String routeAction;

        private SetActions(Builder builder) {
            this.asPathPrepend = builder.asPathPrepend;
            this.asPathReplace = builder.asPathReplace;
            this.communityAdd = builder.communityAdd;
            this.communityReplace = builder.communityReplace;
            this.nextPriority = builder.nextPriority;
            this.routeAction = builder.routeAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SetActions create() {
            return builder().build();
        }

        /**
         * @return asPathPrepend
         */
        public java.util.List<Long> getAsPathPrepend() {
            return this.asPathPrepend;
        }

        /**
         * @return asPathReplace
         */
        public java.util.List<Long> getAsPathReplace() {
            return this.asPathReplace;
        }

        /**
         * @return communityAdd
         */
        public java.util.List<String> getCommunityAdd() {
            return this.communityAdd;
        }

        /**
         * @return communityReplace
         */
        public java.util.List<String> getCommunityReplace() {
            return this.communityReplace;
        }

        /**
         * @return nextPriority
         */
        public Long getNextPriority() {
            return this.nextPriority;
        }

        /**
         * @return routeAction
         */
        public String getRouteAction() {
            return this.routeAction;
        }

        public static final class Builder {
            private java.util.List<Long> asPathPrepend; 
            private java.util.List<Long> asPathReplace; 
            private java.util.List<String> communityAdd; 
            private java.util.List<String> communityReplace; 
            private Long nextPriority; 
            private String routeAction; 

            private Builder() {
            } 

            private Builder(SetActions model) {
                this.asPathPrepend = model.asPathPrepend;
                this.asPathReplace = model.asPathReplace;
                this.communityAdd = model.communityAdd;
                this.communityReplace = model.communityReplace;
                this.nextPriority = model.nextPriority;
                this.routeAction = model.routeAction;
            } 

            /**
             * <p>The AS path to prepend when the regional gateway accepts or executes a publish route entry.</p>
             * <p>This parameter is mutually exclusive with <strong>AsPathReplace</strong>. You cannot specify both parameters at the same time.</p>
             * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
             */
            public Builder asPathPrepend(java.util.List<Long> asPathPrepend) {
                this.asPathPrepend = asPathPrepend;
                return this;
            }

            /**
             * <p>The AS path to use as a replacement when the regional gateway accepts or executes a publish route entry. The original AS path of the route is replaced with the list of AS numbers specified by this parameter.</p>
             * <p>This parameter is mutually exclusive with <strong>AsPathPrepend</strong>. You cannot specify both parameters at the same time.</p>
             * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
             */
            public Builder asPathReplace(java.util.List<Long> asPathReplace) {
                this.asPathReplace = asPathReplace;
                return this;
            }

            /**
             * <p>The community set to be added to the route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter is mutually exclusive with <strong>CommunityReplace</strong> and cannot be specified at the same time.</p>
             * <p>This parameter specifies the action to be performed after a route meets the match conditions.</p>
             * <blockquote>
             * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
             * </blockquote>
             */
            public Builder communityAdd(java.util.List<String> communityAdd) {
                this.communityAdd = communityAdd;
                return this;
            }

            /**
             * <p>The community set used to replace the original community of the route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter is mutually exclusive with <strong>CommunityAdd</strong> and cannot be specified at the same time.</p>
             * <p>This parameter specifies the action to be performed after a route meets the match conditions.</p>
             * <blockquote>
             * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
             * </blockquote>
             */
            public Builder communityReplace(java.util.List<String> communityReplace) {
                this.communityReplace = communityReplace;
                return this;
            }

            /**
             * <p>Policy priority of the associated next route map rule.</p>
             * <ul>
             * <li>You can set policy priority of the associated route map rule only when <strong>RouteAction</strong> is set to <strong>Permit</strong>. Only the permitted routes continue to match the associated next route map rule.</li>
             * <li>Policy priority of the associated next route map rule must be lower than that of the current route map rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nextPriority(Long nextPriority) {
                this.nextPriority = nextPriority;
                return this;
            }

            /**
             * <p>The action to be performed after all conditions are met. Valid values:</p>
             * <ul>
             * <li><p><strong>Permit</strong>: permits the matched route.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the matched route.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Permit</p>
             */
            public Builder routeAction(String routeAction) {
                this.routeAction = routeAction;
                return this;
            }

            public SetActions build() {
                return new SetActions(this);
            } 

        } 

    }
}
