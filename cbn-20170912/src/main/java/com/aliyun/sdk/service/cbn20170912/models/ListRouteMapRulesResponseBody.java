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
 * {@link ListRouteMapRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRouteMapRulesResponseBody</p>
 */
public class ListRouteMapRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteMapRules")
    private java.util.List<RouteMapRules> routeMapRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRouteMapRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeMapRules = builder.routeMapRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteMapRulesResponseBody create() {
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
     * @return routeMapRules
     */
    public java.util.List<RouteMapRules> getRouteMapRules() {
        return this.routeMapRules;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<RouteMapRules> routeMapRules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRouteMapRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.routeMapRules = model.routeMapRules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on each page in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
         * <li>If <strong>NextToken</strong> has a return value, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EF44D7B7-6248-5A60-8A4C-A92388605A57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of route map rules.</p>
         */
        public Builder routeMapRules(java.util.List<RouteMapRules> routeMapRules) {
            this.routeMapRules = routeMapRules;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRouteMapRulesResponseBody build() {
            return new ListRouteMapRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRouteMapRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteMapRulesResponseBody</p>
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
             * <p>The route prefix list for fuzzy matching.</p>
             * <p>A match succeeds if the route prefix in the match condition contains the route prefix of the matched route.</p>
             * <p>For example, a policy defined with 10.0.0.0/8 can fuzzy match a route with 10.10.10.0/24.</p>
             * <p>IP address ranges use the CIDR format. Both IPv4 and IPv6 are supported.</p>
             * <p>This parameter and <strong>AddressPrefixesMatch</strong> are mutually exclusive and cannot be specified at the same time.</p>
             */
            public Builder addressPrefixesInclude(java.util.List<String> addressPrefixesInclude) {
                this.addressPrefixesInclude = addressPrefixesInclude;
                return this;
            }

            /**
             * <p>The route prefix list for exact matching.</p>
             * <p>A match succeeds only when the route prefix in the match condition is exactly the same as the route prefix of the matched route.</p>
             * <p>For example, a policy defined with 10.0.0.0/8 can only exactly match a route with 10.0.0.0/8.</p>
             * <p>IP address ranges use the CIDR format. Both IPv4 and IPv6 are supported.</p>
             * <p>This parameter and <strong>AddressPrefixesInclude</strong> are mutually exclusive and cannot be specified at the same time.</p>
             */
            public Builder addressPrefixesMatch(java.util.List<String> addressPrefixesMatch) {
                this.addressPrefixesMatch = addressPrefixesMatch;
                return this;
            }

            /**
             * <p>The list of AS paths for fuzzy matching.</p>
             * <p>A match succeeds if the AS path in the match condition overlaps with the AS path of the matched route.</p>
             * <p>This parameter and <strong>AsPathsMatch</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only a list of AS numbers is supported, and sets and sub-lists are not supported.</p>
             * </blockquote>
             */
            public Builder asPathsInclude(java.util.List<Long> asPathsInclude) {
                this.asPathsInclude = asPathsInclude;
                return this;
            }

            /**
             * <p>The list of AS paths for exact matching.</p>
             * <p>A match succeeds only when the AS path in the match condition is exactly the same as the AS path of the matched route.</p>
             * <p>This parameter and <strong>AsPathsInclude</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only a list of AS numbers is supported, and sets and sub-lists are not supported.</p>
             * </blockquote>
             */
            public Builder asPathsMatch(java.util.List<Long> asPathsMatch) {
                this.asPathsMatch = asPathsMatch;
                return this;
            }

            /**
             * <p>The community set for fuzzy matching.</p>
             * <p>A match succeeds if the community in the match condition overlaps with the community of the matched route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter and <strong>CommunitySetMatch</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
             * </blockquote>
             */
            public Builder communitySetInclude(java.util.List<String> communitySetInclude) {
                this.communitySetInclude = communitySetInclude;
                return this;
            }

            /**
             * <p>The community set for exact matching.</p>
             * <p>A match succeeds only when the community in the match condition is exactly the same as the community of the matched route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter and <strong>CommunitySetInclude</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <blockquote>
             * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
             * </blockquote>
             */
            public Builder communitySetMatch(java.util.List<String> communitySetMatch) {
                this.communitySetMatch = communitySetMatch;
                return this;
            }

            /**
             * <p>The list of destination instance IDs to match. The following instance types are supported:</p>
             * <ul>
             * <li>Virtual private cloud (VPC) instance IDs</li>
             * <li>Virtual border router (VBR) instance IDs</li>
             * </ul>
             * <blockquote>
             * <p>The list of destination instance IDs takes effect only when the direction of the route map is outbound.</p>
             * </blockquote>
             */
            public Builder destinationInstanceIds(java.util.List<String> destinationInstanceIds) {
                this.destinationInstanceIds = destinationInstanceIds;
                return this;
            }

            /**
             * <p>Specifies whether to use the exclude matching mode for the list of destination instance IDs. Valid values:</p>
             * <ul>
             * <li><strong>false</strong> (default): no. A match succeeds when the destination instance ID of the route is in <strong>DestinationInstanceIds.N</strong>.</li>
             * <li><strong>true</strong>: yes. A match succeeds when the destination instance ID of the route is not in <strong>DestinationInstanceIds.N</strong>.</li>
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
             * <p>The list of destination instance types to match. The following instance types are supported:</p>
             * <ul>
             * <li><strong>VPC</strong>: VPC instance.</li>
             * <li><strong>VBR</strong>: VBR instance.</li>
             * </ul>
             * <blockquote>
             * <p>The list of destination instance types takes effect only when the direction of the route map is outbound.</p>
             * </blockquote>
             */
            public Builder destinationInstanceTypes(java.util.List<String> destinationInstanceTypes) {
                this.destinationInstanceTypes = destinationInstanceTypes;
                return this;
            }

            /**
             * <p>The list of destination region IDs to match.</p>
             */
            public Builder destinationRegionIds(java.util.List<String> destinationRegionIds) {
                this.destinationRegionIds = destinationRegionIds;
                return this;
            }

            /**
             * <p>The list of destination route table IDs to match.</p>
             * <blockquote>
             * <p>The list of destination route table IDs takes effect only when the direction of the route map is outbound.</p>
             * </blockquote>
             */
            public Builder destinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
                this.destinationRouteTableIds = destinationRouteTableIds;
                return this;
            }

            /**
             * <p>The IP address type to match. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong>: matches only IPv4 routes.</li>
             * <li><strong>IPv6</strong>: matches only IPv6 routes.</li>
             * </ul>
             * <p>You can leave this parameter empty to match routes of all types.</p>
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
             * <li><strong>System</strong>: system route, which is automatically generated by the system.</li>
             * <li><strong>Custom</strong>: custom route, which is manually added by a user.</li>
             * <li><strong>BGP</strong>: BGP route, which is propagated through the BGP routable protocol.</li>
             * </ul>
             * <p>You can specify multiple route types.</p>
             */
            public Builder routeTypes(java.util.List<String> routeTypes) {
                this.routeTypes = routeTypes;
                return this;
            }

            /**
             * <p>The list of source instance IDs to match. The following instance types are supported:</p>
             * <ul>
             * <li>Virtual private cloud (VPC) instance IDs</li>
             * <li>Virtual border router (VBR) instance IDs</li>
             * </ul>
             */
            public Builder sourceInstanceIds(java.util.List<String> sourceInstanceIds) {
                this.sourceInstanceIds = sourceInstanceIds;
                return this;
            }

            /**
             * <p>Specifies whether to use the exclude matching mode for the list of source instance IDs. Valid values:</p>
             * <ul>
             * <li><strong>false</strong> (default): no. A match succeeds when the source instance ID of the route is in <strong>SourceInstanceIds.N</strong>.</li>
             * <li><strong>true</strong>: yes. A match succeeds when the source instance ID of the route is not in <strong>SourceInstanceIds.N</strong>.</li>
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
             * <p>The list of source instance types to match. The following instance types are supported:</p>
             * <ul>
             * <li><strong>VPC</strong>: VPC instance.</li>
             * <li><strong>VBR</strong>: VBR instance.</li>
             * </ul>
             */
            public Builder sourceInstanceTypes(java.util.List<String> sourceInstanceTypes) {
                this.sourceInstanceTypes = sourceInstanceTypes;
                return this;
            }

            /**
             * <p>The list of source region IDs to match.</p>
             */
            public Builder sourceRegionIds(java.util.List<String> sourceRegionIds) {
                this.sourceRegionIds = sourceRegionIds;
                return this;
            }

            /**
             * <p>The list of source route table IDs to match.</p>
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
     * {@link ListRouteMapRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteMapRulesResponseBody</p>
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
             * <p>The AS path to prepend when the regional gateway receives or advertises routes.</p>
             * <p>This parameter and <strong>AsPathReplace</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
             */
            public Builder asPathPrepend(java.util.List<Long> asPathPrepend) {
                this.asPathPrepend = asPathPrepend;
                return this;
            }

            /**
             * <p>The AS path to replace when the regional gateway receives or advertises routes. The original AS path of the route is replaced with the list of AS numbers specified in this parameter.</p>
             * <p>This parameter and <strong>AsPathPrepend</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
             */
            public Builder asPathReplace(java.util.List<Long> asPathReplace) {
                this.asPathReplace = asPathReplace;
                return this;
            }

            /**
             * <p>The community set to add to the route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter and <strong>CommunityReplace</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
             * <blockquote>
             * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
             * </blockquote>
             */
            public Builder communityAdd(java.util.List<String> communityAdd) {
                this.communityAdd = communityAdd;
                return this;
            }

            /**
             * <p>The community set to replace the original community of the route.</p>
             * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
             * <p>This parameter and <strong>CommunityAdd</strong> are mutually exclusive and cannot be specified at the same time.</p>
             * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
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
             * <li>Policy priority of the associated next route map rule must be lower than policy priority of the current route map rule.</li>
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
             * <p>The policy action after all conditions are met. Valid values:</p>
             * <ul>
             * <li><strong>Permit</strong>: permits the matched routes.</li>
             * <li><strong>Deny</strong>: denies the matched routes.</li>
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
    /**
     * 
     * {@link ListRouteMapRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteMapRulesResponseBody</p>
     */
    public static class RouteMapRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MatchConditions")
        private MatchConditions matchConditions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RouteMapId")
        private String routeMapId;

        @com.aliyun.core.annotation.NameInMap("RouteMapRuleId")
        private String routeMapRuleId;

        @com.aliyun.core.annotation.NameInMap("SetActions")
        private SetActions setActions;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RouteMapRules(Builder builder) {
            this.description = builder.description;
            this.matchConditions = builder.matchConditions;
            this.name = builder.name;
            this.priority = builder.priority;
            this.routeMapId = builder.routeMapId;
            this.routeMapRuleId = builder.routeMapRuleId;
            this.setActions = builder.setActions;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteMapRules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return routeMapId
         */
        public String getRouteMapId() {
            return this.routeMapId;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private MatchConditions matchConditions; 
            private String name; 
            private Integer priority; 
            private String routeMapId; 
            private String routeMapRuleId; 
            private SetActions setActions; 
            private String status; 

            private Builder() {
            } 

            private Builder(RouteMapRules model) {
                this.description = model.description;
                this.matchConditions = model.matchConditions;
                this.name = model.name;
                this.priority = model.priority;
                this.routeMapId = model.routeMapId;
                this.routeMapRuleId = model.routeMapRuleId;
                this.setActions = model.setActions;
                this.status = model.status;
            } 

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Matches production prefixes from on-prem and sets a higher local preference.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The match conditions of the route map rule. The system executes the actions defined in <strong>SetActions</strong> only when a route meets all the match conditions defined in this parameter.</p>
             */
            public Builder matchConditions(MatchConditions matchConditions) {
                this.matchConditions = matchConditions;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Permit-Prod-Prefixes-Set-LP</p>
             */
            public Builder name(String name) {
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
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the route map.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-0a1b2c3d4e5f6a7b8</p>
             */
            public Builder routeMapId(String routeMapId) {
                this.routeMapId = routeMapId;
                return this;
            }

            /**
             * <p>The ID of the route map rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rmr-3dm13f66wtctcnydup</p>
             */
            public Builder routeMapRuleId(String routeMapRuleId) {
                this.routeMapRuleId = routeMapRuleId;
                return this;
            }

            /**
             * <p>The actions to execute for the route map rule. After a route meets all the match conditions defined in <strong>MatchConditions</strong>, the system processes the route based on the actions defined in this parameter.</p>
             */
            public Builder setActions(SetActions setActions) {
                this.setActions = setActions;
                return this;
            }

            /**
             * <p>The status of the route map rule. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The rule is being created.</li>
             * <li><strong>Updating</strong>: The rule is being updated.</li>
             * <li><strong>Active</strong>: The rule is available.</li>
             * <li><strong>Deleting</strong>: The rule is being deleted.</li>
             * <li><strong>Deleted</strong>: The rule is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RouteMapRules build() {
                return new RouteMapRules(this);
            } 

        } 

    }
}
