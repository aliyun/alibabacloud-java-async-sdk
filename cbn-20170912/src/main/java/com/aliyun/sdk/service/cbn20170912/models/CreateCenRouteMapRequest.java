// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenRouteMapRequest} extends {@link RequestModel}
 *
 * <p>CreateCenRouteMapRequest</p>
 */
public class CreateCenRouteMapRequest extends Request {
    @Query
    @NameInMap("AsPathMatchMode")
    private String asPathMatchMode;

    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("CenRegionId")
    @Validation(required = true)
    private String cenRegionId;

    @Query
    @NameInMap("CidrMatchMode")
    private String cidrMatchMode;

    @Query
    @NameInMap("CommunityMatchMode")
    private String communityMatchMode;

    @Query
    @NameInMap("CommunityOperateMode")
    private String communityOperateMode;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestinationChildInstanceTypes")
    private java.util.List < String > destinationChildInstanceTypes;

    @Query
    @NameInMap("DestinationCidrBlocks")
    private java.util.List < String > destinationCidrBlocks;

    @Query
    @NameInMap("DestinationInstanceIds")
    private java.util.List < String > destinationInstanceIds;

    @Query
    @NameInMap("DestinationInstanceIdsReverseMatch")
    private Boolean destinationInstanceIdsReverseMatch;

    @Query
    @NameInMap("DestinationRouteTableIds")
    private java.util.List < String > destinationRouteTableIds;

    @Query
    @NameInMap("MapResult")
    @Validation(required = true)
    private String mapResult;

    @Query
    @NameInMap("MatchAddressType")
    private String matchAddressType;

    @Query
    @NameInMap("MatchAsns")
    private java.util.List < Long > matchAsns;

    @Query
    @NameInMap("MatchCommunitySet")
    private java.util.List < String > matchCommunitySet;

    @Query
    @NameInMap("NextPriority")
    @Validation(maximum = 1000, minimum = 1)
    private Integer nextPriority;

    @Query
    @NameInMap("OperateCommunitySet")
    private java.util.List < String > operateCommunitySet;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Preference")
    @Validation(maximum = 100, minimum = 1)
    private Integer preference;

    @Query
    @NameInMap("PrependAsPath")
    private java.util.List < Long > prependAsPath;

    @Query
    @NameInMap("Priority")
    @Validation(required = true, maximum = 2999, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteTypes")
    private java.util.List < String > routeTypes;

    @Query
    @NameInMap("SourceChildInstanceTypes")
    private java.util.List < String > sourceChildInstanceTypes;

    @Query
    @NameInMap("SourceInstanceIds")
    private java.util.List < String > sourceInstanceIds;

    @Query
    @NameInMap("SourceInstanceIdsReverseMatch")
    private Boolean sourceInstanceIdsReverseMatch;

    @Query
    @NameInMap("SourceRegionIds")
    private java.util.List < String > sourceRegionIds;

    @Query
    @NameInMap("SourceRouteTableIds")
    private java.util.List < String > sourceRouteTableIds;

    @Query
    @NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;

    @Query
    @NameInMap("TransmitDirection")
    @Validation(required = true)
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
         * The ID of the CEN instance.
         */
        public Builder asPathMatchMode(String asPathMatchMode) {
            this.putQueryParameter("AsPathMatchMode", asPathMatchMode);
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }

        /**
         * The type of source network instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The ID of the source region.
         */
        public Builder cenRegionId(String cenRegionId) {
            this.putQueryParameter("CenRegionId", cenRegionId);
            this.cenRegionId = cenRegionId;
            return this;
        }

        /**
         * The ID of the source network instance.
         */
        public Builder cidrMatchMode(String cidrMatchMode) {
            this.putQueryParameter("CidrMatchMode", cidrMatchMode);
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }

        /**
         * The prefix list.
         */
        public Builder communityMatchMode(String communityMatchMode) {
            this.putQueryParameter("CommunityMatchMode", communityMatchMode);
            this.communityMatchMode = communityMatchMode;
            return this;
        }

        /**
         * The AS path.
         */
        public Builder communityOperateMode(String communityOperateMode) {
            this.putQueryParameter("CommunityOperateMode", communityOperateMode);
            this.communityOperateMode = communityOperateMode;
            return this;
        }

        /**
         * The priority of the routing policy. Valid values: **1** to **100**. A smaller value indicates a higher priority.
         * <p>
         * 
         * >  You cannot specify the same priority for routing policies that apply in the same region and direction. The system matches routes against the match conditions of routing policies in descending order of priority. A smaller value indicates a higher priority. You must set the priorities to proper values.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The action that is performed on the community. Valid values:
         * <p>
         * 
         * *   **Additive**: adds the community to the route.
         * *   **Replace**: replaces the original community of the route.
         * 
         * This parameter specifies the action to be performed when a route meets the match condition.
         */
        public Builder destinationChildInstanceTypes(java.util.List < String > destinationChildInstanceTypes) {
            this.putQueryParameter("DestinationChildInstanceTypes", destinationChildInstanceTypes);
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }

        /**
         * The ID of the destination route table.
         */
        public Builder destinationCidrBlocks(java.util.List < String > destinationCidrBlocks) {
            this.putQueryParameter("DestinationCidrBlocks", destinationCidrBlocks);
            this.destinationCidrBlocks = destinationCidrBlocks;
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
        public Builder destinationInstanceIds(java.util.List < String > destinationInstanceIds) {
            this.putQueryParameter("DestinationInstanceIds", destinationInstanceIds);
            this.destinationInstanceIds = destinationInstanceIds;
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
         *     **
         * 
         *     **Note** This parameter does not take effect if the IPsec-VPN connection or SSL client is associated with a transit router through a VPN gateway and a VPC. This parameter takes effect only if the IPsec connection is directly connected to the transit router.
         * 
         * You can specify one or more network instance types.
         * 
         * >  The destination network instance types are valid only if the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.
         */
        public Builder destinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.putQueryParameter("DestinationInstanceIdsReverseMatch", destinationInstanceIdsReverseMatch);
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }

        /**
         * The prefix list against which routes are matched.
         * <p>
         * 
         * You must specify the IP addresses in CIDR notation. You can enter at most 32 CIDR blocks.
         */
        public Builder destinationRouteTableIds(java.util.List < String > destinationRouteTableIds) {
            this.putQueryParameter("DestinationRouteTableIds", destinationRouteTableIds);
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }

        /**
         * The types of source network instance to which the routes belong. The following types of network instances are supported:
         * <p>
         * 
         * *   **VPC**: VPC
         * *   **VBR**: VBR
         * *   **CCN**: CCN instance
         * *   **VPN**: VPN gateway or IPsec connection
         *     *   If the IPsec-VPN connection or SSL client is associated with a VPN gateway, the VPC associated with the VPN gateway must be connected to a transit router, and the VPN gateway must use BGP dynamic routing. Otherwise, this parameter cannot take effect.
         *     *   This parameter takes effect if the IPsec connection is directly connected to a transit router.
         * 
         * You can specify one or more network instance types.
         */
        public Builder mapResult(String mapResult) {
            this.putQueryParameter("MapResult", mapResult);
            this.mapResult = mapResult;
            return this;
        }

        /**
         * Specifies whether to exclude the destination network instance IDs. Valid values:
         * <p>
         * 
         * *   **false** (default value): A route is a match if its destination network instance ID is in the list specified by **DestinationInstanceIds.N**.
         * *   **true**: A route meets the match condition if its destination network instance ID is not in the list specified by **DestinationInstanceIds.N**.
         */
        public Builder matchAddressType(String matchAddressType) {
            this.putQueryParameter("MatchAddressType", matchAddressType);
            this.matchAddressType = matchAddressType;
            return this;
        }

        /**
         * The IDs of the source network instances to which the routes belong. The following network instance types are supported:
         * <p>
         * 
         * *   VPC
         * *   VBR
         * *   CCN instance
         * *   SAG instance
         * *   The ID of the IPsec connection.
         * 
         * You can enter at most 32 IDs.
         */
        public Builder matchAsns(java.util.List < Long > matchAsns) {
            this.putQueryParameter("MatchAsns", matchAsns);
            this.matchAsns = matchAsns;
            return this;
        }

        /**
         * The community.
         */
        public Builder matchCommunitySet(java.util.List < String > matchCommunitySet) {
            this.putQueryParameter("MatchCommunitySet", matchCommunitySet);
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }

        /**
         * The action to be performed on a route that meets all match conditions. Valid values:
         * <p>
         * 
         * *   **Permit**: the route is permitted.
         * *   **Deny**: the route is denied.
         */
        public Builder nextPriority(Integer nextPriority) {
            this.putQueryParameter("NextPriority", nextPriority);
            this.nextPriority = nextPriority;
            return this;
        }

        /**
         * The type of route to be matched against the match condition. The following route types are supported:
         * <p>
         * 
         * *   **System**: system routes that are automatically generated by the system.
         * *   **Custom**: custom routes that are manually added.
         * *   **BGP**: routes that are advertised over BGP.
         * 
         * You can specify multiple route types.
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
         * The community against which routes are matched.
         * <p>
         * 
         * Specify the community in the format of n:m. Valid values of n and m: **1** to **65535**. Each community must comply with the RFC 1997 standard. The RFC 8092 standard that defines Border Gateway Protocol (BGP) large communities is not supported.
         * 
         * You can specify at most 32 communities.
         * 
         * >  If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.
         */
        public Builder preference(Integer preference) {
            this.putQueryParameter("Preference", preference);
            this.preference = preference;
            return this;
        }

        /**
         * The ID of the source route table.
         */
        public Builder prependAsPath(java.util.List < Long > prependAsPath) {
            this.putQueryParameter("PrependAsPath", prependAsPath);
            this.prependAsPath = prependAsPath;
            return this;
        }

        /**
         * The IDs of the source route tables from which routes are evaluated. You can enter at most 32 route table IDs.
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
         * The ID of the route table of the transit router.
         * <p>
         * 
         * If you do not specify a route table ID, the routing policy is automatically associated with the default route table of the transit router.
         */
        public Builder routeTypes(java.util.List < String > routeTypes) {
            this.putQueryParameter("RouteTypes", routeTypes);
            this.routeTypes = routeTypes;
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
         * *   The ID of the IPsec connection.
         * 
         * You can enter at most 32 IDs.
         * 
         * >  The destination network instance IDs are valid only if the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.
         */
        public Builder sourceChildInstanceTypes(java.util.List < String > sourceChildInstanceTypes) {
            this.putQueryParameter("SourceChildInstanceTypes", sourceChildInstanceTypes);
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }

        /**
         * The ID of the routing policy.
         */
        public Builder sourceInstanceIds(java.util.List < String > sourceInstanceIds) {
            this.putQueryParameter("SourceInstanceIds", sourceInstanceIds);
            this.sourceInstanceIds = sourceInstanceIds;
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
         * >  If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.
         */
        public Builder sourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.putQueryParameter("SourceInstanceIdsReverseMatch", sourceInstanceIdsReverseMatch);
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
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
        public Builder sourceRegionIds(java.util.List < String > sourceRegionIds) {
            this.putQueryParameter("SourceRegionIds", sourceRegionIds);
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }

        /**
         * The ID of the region where the routing policy is applied.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
         */
        public Builder sourceRouteTableIds(java.util.List < String > sourceRouteTableIds) {
            this.putQueryParameter("SourceRouteTableIds", sourceRouteTableIds);
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }

        /**
         * The type of destination network instance.
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **CreateCenRouteMap**.
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
