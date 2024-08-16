// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenRouteMapRequest} extends {@link RequestModel}
 *
 * <p>CreateCenRouteMapRequest</p>
 */
public class CreateCenRouteMapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsPathMatchMode")
    private String asPathMatchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrMatchMode")
    private String cidrMatchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommunityMatchMode")
    private String communityMatchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommunityOperateMode")
    private String communityOperateMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationChildInstanceTypes")
    private java.util.List < String > destinationChildInstanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlocks")
    private java.util.List < String > destinationCidrBlocks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationInstanceIds")
    private java.util.List < String > destinationInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationInstanceIdsReverseMatch")
    private Boolean destinationInstanceIdsReverseMatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRouteTableIds")
    private java.util.List < String > destinationRouteTableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MapResult")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mapResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchAddressType")
    private String matchAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchAsns")
    private java.util.List < Long > matchAsns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchCommunitySet")
    private java.util.List < String > matchCommunitySet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPriority")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer nextPriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateCommunitySet")
    private java.util.List < String > operateCommunitySet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Preference")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer preference;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrependAsPath")
    private java.util.List < Long > prependAsPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2999, minimum = 1)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTypes")
    private java.util.List < String > routeTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceChildInstanceTypes")
    private java.util.List < String > sourceChildInstanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceIds")
    private java.util.List < String > sourceInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceIdsReverseMatch")
    private Boolean sourceInstanceIdsReverseMatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionIds")
    private java.util.List < String > sourceRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRouteTableIds")
    private java.util.List < String > sourceRouteTableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransmitDirection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transmitDirection;

    private CreateCenRouteMapRequest(Builder builder) {
        super(builder);
        this.asPathMatchMode = builder.asPathMatchMode;
        this.cenId = builder.cenId;
        this.cenRegionId = builder.cenRegionId;
        this.cidrMatchMode = builder.cidrMatchMode;
        this.communityMatchMode = builder.communityMatchMode;
        this.communityOperateMode = builder.communityOperateMode;
        this.description = builder.description;
        this.destinationChildInstanceTypes = builder.destinationChildInstanceTypes;
        this.destinationCidrBlocks = builder.destinationCidrBlocks;
        this.destinationInstanceIds = builder.destinationInstanceIds;
        this.destinationInstanceIdsReverseMatch = builder.destinationInstanceIdsReverseMatch;
        this.destinationRouteTableIds = builder.destinationRouteTableIds;
        this.mapResult = builder.mapResult;
        this.matchAddressType = builder.matchAddressType;
        this.matchAsns = builder.matchAsns;
        this.matchCommunitySet = builder.matchCommunitySet;
        this.nextPriority = builder.nextPriority;
        this.operateCommunitySet = builder.operateCommunitySet;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.preference = builder.preference;
        this.prependAsPath = builder.prependAsPath;
        this.priority = builder.priority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeTypes = builder.routeTypes;
        this.sourceChildInstanceTypes = builder.sourceChildInstanceTypes;
        this.sourceInstanceIds = builder.sourceInstanceIds;
        this.sourceInstanceIdsReverseMatch = builder.sourceInstanceIdsReverseMatch;
        this.sourceRegionIds = builder.sourceRegionIds;
        this.sourceRouteTableIds = builder.sourceRouteTableIds;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
        this.transmitDirection = builder.transmitDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenRouteMapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asPathMatchMode
     */
    public String getAsPathMatchMode() {
        return this.asPathMatchMode;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cenRegionId
     */
    public String getCenRegionId() {
        return this.cenRegionId;
    }

    /**
     * @return cidrMatchMode
     */
    public String getCidrMatchMode() {
        return this.cidrMatchMode;
    }

    /**
     * @return communityMatchMode
     */
    public String getCommunityMatchMode() {
        return this.communityMatchMode;
    }

    /**
     * @return communityOperateMode
     */
    public String getCommunityOperateMode() {
        return this.communityOperateMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationChildInstanceTypes
     */
    public java.util.List < String > getDestinationChildInstanceTypes() {
        return this.destinationChildInstanceTypes;
    }

    /**
     * @return destinationCidrBlocks
     */
    public java.util.List < String > getDestinationCidrBlocks() {
        return this.destinationCidrBlocks;
    }

    /**
     * @return destinationInstanceIds
     */
    public java.util.List < String > getDestinationInstanceIds() {
        return this.destinationInstanceIds;
    }

    /**
     * @return destinationInstanceIdsReverseMatch
     */
    public Boolean getDestinationInstanceIdsReverseMatch() {
        return this.destinationInstanceIdsReverseMatch;
    }

    /**
     * @return destinationRouteTableIds
     */
    public java.util.List < String > getDestinationRouteTableIds() {
        return this.destinationRouteTableIds;
    }

    /**
     * @return mapResult
     */
    public String getMapResult() {
        return this.mapResult;
    }

    /**
     * @return matchAddressType
     */
    public String getMatchAddressType() {
        return this.matchAddressType;
    }

    /**
     * @return matchAsns
     */
    public java.util.List < Long > getMatchAsns() {
        return this.matchAsns;
    }

    /**
     * @return matchCommunitySet
     */
    public java.util.List < String > getMatchCommunitySet() {
        return this.matchCommunitySet;
    }

    /**
     * @return nextPriority
     */
    public Integer getNextPriority() {
        return this.nextPriority;
    }

    /**
     * @return operateCommunitySet
     */
    public java.util.List < String > getOperateCommunitySet() {
        return this.operateCommunitySet;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return preference
     */
    public Integer getPreference() {
        return this.preference;
    }

    /**
     * @return prependAsPath
     */
    public java.util.List < Long > getPrependAsPath() {
        return this.prependAsPath;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return routeTypes
     */
    public java.util.List < String > getRouteTypes() {
        return this.routeTypes;
    }

    /**
     * @return sourceChildInstanceTypes
     */
    public java.util.List < String > getSourceChildInstanceTypes() {
        return this.sourceChildInstanceTypes;
    }

    /**
     * @return sourceInstanceIds
     */
    public java.util.List < String > getSourceInstanceIds() {
        return this.sourceInstanceIds;
    }

    /**
     * @return sourceInstanceIdsReverseMatch
     */
    public Boolean getSourceInstanceIdsReverseMatch() {
        return this.sourceInstanceIdsReverseMatch;
    }

    /**
     * @return sourceRegionIds
     */
    public java.util.List < String > getSourceRegionIds() {
        return this.sourceRegionIds;
    }

    /**
     * @return sourceRouteTableIds
     */
    public java.util.List < String > getSourceRouteTableIds() {
        return this.sourceRouteTableIds;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    /**
     * @return transmitDirection
     */
    public String getTransmitDirection() {
        return this.transmitDirection;
    }

    public static final class Builder extends Request.Builder<CreateCenRouteMapRequest, Builder> {
        private String asPathMatchMode; 
        private String cenId; 
        private String cenRegionId; 
        private String cidrMatchMode; 
        private String communityMatchMode; 
        private String communityOperateMode; 
        private String description; 
        private java.util.List < String > destinationChildInstanceTypes; 
        private java.util.List < String > destinationCidrBlocks; 
        private java.util.List < String > destinationInstanceIds; 
        private Boolean destinationInstanceIdsReverseMatch; 
        private java.util.List < String > destinationRouteTableIds; 
        private String mapResult; 
        private String matchAddressType; 
        private java.util.List < Long > matchAsns; 
        private java.util.List < String > matchCommunitySet; 
        private Integer nextPriority; 
        private java.util.List < String > operateCommunitySet; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer preference; 
        private java.util.List < Long > prependAsPath; 
        private Integer priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > routeTypes; 
        private java.util.List < String > sourceChildInstanceTypes; 
        private java.util.List < String > sourceInstanceIds; 
        private Boolean sourceInstanceIdsReverseMatch; 
        private java.util.List < String > sourceRegionIds; 
        private java.util.List < String > sourceRouteTableIds; 
        private String transitRouterRouteTableId; 
        private String transmitDirection; 

        private Builder() {
            super();
        } 

        private Builder(CreateCenRouteMapRequest request) {
            super(request);
            this.asPathMatchMode = request.asPathMatchMode;
            this.cenId = request.cenId;
            this.cenRegionId = request.cenRegionId;
            this.cidrMatchMode = request.cidrMatchMode;
            this.communityMatchMode = request.communityMatchMode;
            this.communityOperateMode = request.communityOperateMode;
            this.description = request.description;
            this.destinationChildInstanceTypes = request.destinationChildInstanceTypes;
            this.destinationCidrBlocks = request.destinationCidrBlocks;
            this.destinationInstanceIds = request.destinationInstanceIds;
            this.destinationInstanceIdsReverseMatch = request.destinationInstanceIdsReverseMatch;
            this.destinationRouteTableIds = request.destinationRouteTableIds;
            this.mapResult = request.mapResult;
            this.matchAddressType = request.matchAddressType;
            this.matchAsns = request.matchAsns;
            this.matchCommunitySet = request.matchCommunitySet;
            this.nextPriority = request.nextPriority;
            this.operateCommunitySet = request.operateCommunitySet;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.preference = request.preference;
            this.prependAsPath = request.prependAsPath;
            this.priority = request.priority;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeTypes = request.routeTypes;
            this.sourceChildInstanceTypes = request.sourceChildInstanceTypes;
            this.sourceInstanceIds = request.sourceInstanceIds;
            this.sourceInstanceIdsReverseMatch = request.sourceInstanceIdsReverseMatch;
            this.sourceRegionIds = request.sourceRegionIds;
            this.sourceRouteTableIds = request.sourceRouteTableIds;
            this.transitRouterRouteTableId = request.transitRouterRouteTableId;
            this.transmitDirection = request.transmitDirection;
        } 

        /**
         * The match method that is used to match routes based on the AS path. Valid values:
         * <p>
         * 
         * *   **Include**: fuzzy match. A route is a match if the AS path of the route overlaps with the AS path in the match conditions.
         * *   **Complete**: exact match. A route is a match only if the AS path of the route matches the AS path in the match conditions.
         */
        public Builder asPathMatchMode(String asPathMatchMode) {
            this.putQueryParameter("AsPathMatchMode", asPathMatchMode);
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }

        /**
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The ID of the region in which the routing policy is applied.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
         */
        public Builder cenRegionId(String cenRegionId) {
            this.putQueryParameter("CenRegionId", cenRegionId);
            this.cenRegionId = cenRegionId;
            return this;
        }

        /**
         * The match method that is used to match routes against the prefix list. Valid values:
         * <p>
         * 
         * *   **Include**: fuzzy match. A route is a match if the route prefix is included in the match conditions.
         * 
         * For example, if you set the match condition to 1.1.0.0/16 and fuzzy match is applied, the route whose prefix is 1.1.1.0/24 meets the match condition.
         * 
         * *   **Complete**: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.
         * 
         * For example, if you set the match condition to 1.1.0.0/16 and exact match is applied, only the route whose prefix is 1.1.0.0/16 meets the match condition.
         */
        public Builder cidrMatchMode(String cidrMatchMode) {
            this.putQueryParameter("CidrMatchMode", cidrMatchMode);
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }

        /**
         * The match method that is used to match routes based on the community. Valid values:
         * <p>
         * 
         * *   **Include**: fuzzy match. A route is a match if the community of the route overlaps with the community in the match conditions.
         * *   **Complete**: exact match. A route is a match only if the community of the route matches the community in the match conditions.
         */
        public Builder communityMatchMode(String communityMatchMode) {
            this.putQueryParameter("CommunityMatchMode", communityMatchMode);
            this.communityMatchMode = communityMatchMode;
            return this;
        }

        /**
         * The action to be performed on the community. Valid values:
         * <p>
         * 
         * *   **Additive**: adds the community to the route.
         * *   **Replace**: replaces the original community of the route.
         * 
         * This parameter specifies the action to be performed when a route meets the match condition.
         */
        public Builder communityOperateMode(String communityOperateMode) {
            this.putQueryParameter("CommunityOperateMode", communityOperateMode);
            this.communityOperateMode = communityOperateMode;
            return this;
        }

        /**
         * The description of the routing policy.
         * <p>
         * 
         * This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The types of destination network instance to which the routes belong. The following types of network instances are supported:
         * <p>
         * 
         * *   **VPC**: VPC
         * 
         * *   **VBR**: VBR
         * 
         * *   **CCN**: CCN instance
         * 
         * *   **VPN**: IPsec connection
         * 
         *     >This parameter does not take effect if the IPsec-VPN connection or SSL client is associated with a transit router through a VPN gateway and a VPC. This parameter takes effect only if the IPsec connection is directly connected to the transit router.
         * 
         * You can specify one or more network instance types.
         * 
         * > The destination network instance types are valid only if the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.
         */
        public Builder destinationChildInstanceTypes(java.util.List < String > destinationChildInstanceTypes) {
            this.putQueryParameter("DestinationChildInstanceTypes", destinationChildInstanceTypes);
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }

        /**
         * The prefix list against which routes are matched.
         * <p>
         * 
         * You must specify the IP addresses in CIDR notation. You can enter at most 32 CIDR blocks.
         */
        public Builder destinationCidrBlocks(java.util.List < String > destinationCidrBlocks) {
            this.putQueryParameter("DestinationCidrBlocks", destinationCidrBlocks);
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }

        /**
         * The IDs of the destination network instances to which the routes belong. The following network instance types are supported:
         * <p>
         * 
         * *   VPC
         * *   VBR
         * *   CCN instance
         * *   SAG instance
         * *   The ID of the IPsec-VPN connection.
         * 
         * You can enter at most 32 IDs.
         * 
         * > The destination instance IDs take effect only when Direction is set to Export from Regional Gateway and the destination instances are deployed in the current region.
         */
        public Builder destinationInstanceIds(java.util.List < String > destinationInstanceIds) {
            this.putQueryParameter("DestinationInstanceIds", destinationInstanceIds);
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }

        /**
         * Specifies whether to exclude destination instance IDs. Valid values:
         * <p>
         * 
         * *   **false** (default): A route is a match if the destination instance ID is included in the list specified by **SourceInstanceIds.N**.
         * *   **true**: A route is a match if the destination network instance ID is not in the list specified by **SourceInstanceIds.N**.
         */
        public Builder destinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.putQueryParameter("DestinationInstanceIdsReverseMatch", destinationInstanceIdsReverseMatch);
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }

        /**
         * The IDs of the destination route tables to which routes are evaluated. You can enter at most 32 route table IDs.
         * <p>
         * 
         * > The destination route table IDs take effect only when Direction is set to Export from Regional Gateway and the destination route tables belong to network instances deployed in the current region.
         */
        public Builder destinationRouteTableIds(java.util.List < String > destinationRouteTableIds) {
            this.putQueryParameter("DestinationRouteTableIds", destinationRouteTableIds);
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }

        /**
         * The action to be performed on a route that meets all the match conditions. Valid values:
         * <p>
         * 
         * *   **Permit**: the route is permitted.
         * *   **Deny**: the route is denied.
         */
        public Builder mapResult(String mapResult) {
            this.putQueryParameter("MapResult", mapResult);
            this.mapResult = mapResult;
            return this;
        }

        /**
         * The type of IP address in the match condition. Valid values:
         * <p>
         * 
         * *   **IPv4**: IPv4 address
         * *   **IPv6**: IPv6 address
         * 
         * This parameter can be empty. If no value is specified, all types of IP address are a match.
         */
        public Builder matchAddressType(String matchAddressType) {
            this.putQueryParameter("MatchAddressType", matchAddressType);
            this.matchAddressType = matchAddressType;
            return this;
        }

        /**
         * The AS paths based on which routes are compared.
         * <p>
         * 
         * You can specify at most 32 AS numbers.
         * 
         * > Only the AS-SEQUENCE parameter is supported. The AS-SET, AS-CONFED-SEQUENCE, and AS-CONFED-SET parameters are not supported. In other words, only the AS number list is supported. Sets and sub-lists are not supported.
         */
        public Builder matchAsns(java.util.List < Long > matchAsns) {
            this.putQueryParameter("MatchAsns", matchAsns);
            this.matchAsns = matchAsns;
            return this;
        }

        /**
         * The community set based on which routes are compared.
         * <p>
         * 
         * Specify the community in the format of n:m. Valid values of n and m: **1** to **65535**. Each community must comply with the RFC 1997 standard. The RFC 8092 standard that defines Border Gateway Protocol (BGP) large communities is not supported.
         * 
         * You can specify at most 32 communities.
         * 
         * > If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.
         */
        public Builder matchCommunitySet(java.util.List < String > matchCommunitySet) {
            this.putQueryParameter("MatchCommunitySet", matchCommunitySet);
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }

        /**
         * The priority of the routing policy that you want to associate with the current one.
         * <p>
         * 
         * *   This parameter takes effect only when the **MapResult** parameter is set to **Permit**. This way, the permitted route is matched against the next routing policy.
         * *   The region and direction of the routing policy to be associated must be the same as those of the current routing policy.
         * *   The priority of the next routing policy must be lower than the priority of the current routing policy.
         */
        public Builder nextPriority(Integer nextPriority) {
            this.putQueryParameter("NextPriority", nextPriority);
            this.nextPriority = nextPriority;
            return this;
        }

        /**
         * The community set on which actions are performed.
         * <p>
         * 
         * Specify the community in the format of n:m. Valid values of n and m: **1** to **65535**. Each community must comply with RFC 1997. The RFC 8092 standard that defines BGP large communities is not supported.
         * 
         * You can specify at most 32 communities.
         * 
         * > If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.
         */
        public Builder operateCommunitySet(java.util.List < String > operateCommunitySet) {
            this.putQueryParameter("OperateCommunitySet", operateCommunitySet);
            this.operateCommunitySet = operateCommunitySet;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The new priority of the route.
         * <p>
         * 
         * Valid values: **1** to **100**. The default priority is **50**. A smaller value indicates a higher priority.
         * 
         * This parameter specifies the action to be performed when a route meets the match condition.
         */
        public Builder preference(Integer preference) {
            this.putQueryParameter("Preference", preference);
            this.preference = preference;
            return this;
        }

        /**
         * The AS paths that are prepended by using an action statement when regional gateways receive or advertise routes.
         * <p>
         * 
         * The AS paths vary based on the direction in which the routing policy is applied:
         * 
         * *   If AS paths are prepended to a routing policy that is applied in the inbound direction, you must specify source network instance IDs and the source region in the match condition. In addition, the source region must be the same as the region where the routing policy is applied.
         * *   If AS paths are prepended to a routing policy that is applied in the outbound direction, you must specify destination network instance IDs in the match condition.
         * 
         * This parameter specifies the action to be performed when a route meets the match condition. You can specify at most 32 AS numbers.
         */
        public Builder prependAsPath(java.util.List < Long > prependAsPath) {
            this.putQueryParameter("PrependAsPath", prependAsPath);
            this.prependAsPath = prependAsPath;
            return this;
        }

        /**
         * The priority of the routing policy. Valid values: **1** to **100**. A smaller value indicates a higher priority.
         * <p>
         * 
         * > You cannot specify the same priority for routing policies that apply in the same region and direction. The system matches routes against the match conditions of routing policies in descending order of priority. A smaller value indicates a higher priority. You must set the priorities to proper values.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The type of route to be compared. Valid values: The following route types are supported:
         * <p>
         * 
         * *   **System**: system routes that are automatically generated by the system.
         * *   **Custom**: custom routes that are manually added.
         * *   **BGP**: routes that are advertised over BGP.
         * 
         * You can specify multiple route types.
         */
        public Builder routeTypes(java.util.List < String > routeTypes) {
            this.putQueryParameter("RouteTypes", routeTypes);
            this.routeTypes = routeTypes;
            return this;
        }

        /**
         * The types of source network instance to which the routes belong. The following types of network instances are supported:
         * <p>
         * 
         * *   **VPC**: VPC
         * 
         * *   **VBR**: VBR
         * 
         * *   **CCN**: CCN instance
         * 
         * *   **VPN**: VPN gateway or IPsec connection
         * 
         *     *   If the IPsec-VPN connection or SSL client is associated with a VPN gateway, the VPC associated with the VPN gateway must be connected to a transit router, and the VPN gateway must use BGP dynamic routing. Otherwise, this parameter cannot take effect.
         *     *   This parameter takes effect if the IPsec connection is directly connected to a transit router.
         * 
         * You can specify one or more network instance types.
         */
        public Builder sourceChildInstanceTypes(java.util.List < String > sourceChildInstanceTypes) {
            this.putQueryParameter("SourceChildInstanceTypes", sourceChildInstanceTypes);
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }

        /**
         * The IDs of the source network instances to which the routes belong. The following network instance types are supported:
         * <p>
         * 
         * *   Virtual private cloud (VPC)
         * *   Virtual border router (VBR)
         * *   Cloud Connect Network (CCN) instance
         * *   Smart Access Gateway (SAG) instance
         * *   The ID of the IPsec-VPN connection.
         * 
         * You can enter at most 32 IDs.
         */
        public Builder sourceInstanceIds(java.util.List < String > sourceInstanceIds) {
            this.putQueryParameter("SourceInstanceIds", sourceInstanceIds);
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }

        /**
         * Specifies whether to exclude source instance IDs. Valid values:
         * <p>
         * 
         * *   **false** (default): A route is a match if the source instance ID is included in the list specified by **SourceInstanceIds.N**.
         * *   **true**: A route is a match if the source network instance ID is not in the list specified by **SourceInstanceIds.N**.
         */
        public Builder sourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.putQueryParameter("SourceInstanceIdsReverseMatch", sourceInstanceIdsReverseMatch);
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }

        /**
         * The IDs of the source regions from which routes are evaluated. You can enter at most 32 region IDs.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
         */
        public Builder sourceRegionIds(java.util.List < String > sourceRegionIds) {
            this.putQueryParameter("SourceRegionIds", sourceRegionIds);
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }

        /**
         * The IDs of the source route tables from which routes are evaluated. You can enter at most 32 route table IDs.
         */
        public Builder sourceRouteTableIds(java.util.List < String > sourceRouteTableIds) {
            this.putQueryParameter("SourceRouteTableIds", sourceRouteTableIds);
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }

        /**
         * The ID of the route table of the transit router.
         * <p>
         * 
         * If you do not specify a route table ID, the routing policy is automatically associated with the default route table of the transit router.
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * The direction in which the routing policy is applied. Valid values:
         * <p>
         * 
         * *   **RegionIn**: Routes are advertised to the gateways in the regions that are connected by the CEN instance.
         * 
         * For example, routes are advertised from network instances deployed in the current region or other regions to the gateway deployed in the current region.
         * 
         * *   **RegionOut**: Routes are advertised from the gateways in the regions that are connected by the CEN instance.
         * 
         * For example, routes are advertised from the gateway deployed in the current region to network instances deployed in the same region, or to gateways deployed in other regions.
         */
        public Builder transmitDirection(String transmitDirection) {
            this.putQueryParameter("TransmitDirection", transmitDirection);
            this.transmitDirection = transmitDirection;
            return this;
        }

        @Override
        public CreateCenRouteMapRequest build() {
            return new CreateCenRouteMapRequest(this);
        } 

    } 

}
