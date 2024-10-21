// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
    private java.util.List < String > destinationRegionIds;

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
        this.destinationRegionIds = builder.destinationRegionIds;
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
     * @return destinationRegionIds
     */
    public java.util.List < String > getDestinationRegionIds() {
        return this.destinationRegionIds;
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
        private java.util.List < String > destinationRegionIds; 
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
            this.destinationRegionIds = request.destinationRegionIds;
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
         * <p>The match method that is used to match routes based on the AS path. Valid values:</p>
         * <ul>
         * <li><strong>Include</strong>: fuzzy match. A route is a match if the AS path of the route overlaps with the AS path in the match conditions.</li>
         * <li><strong>Complete</strong>: exact match. A route is a match only if the AS path of the route matches the AS path in the match conditions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        public Builder asPathMatchMode(String asPathMatchMode) {
            this.putQueryParameter("AsPathMatchMode", asPathMatchMode);
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }

        /**
         * <p>The ID of the CEN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-7qthudw0ll6jmc****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The ID of the region in which the routing policy is applied.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder cenRegionId(String cenRegionId) {
            this.putQueryParameter("CenRegionId", cenRegionId);
            this.cenRegionId = cenRegionId;
            return this;
        }

        /**
         * <p>The match method that is used to match routes against the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>Include</strong>: fuzzy match. A route is a match if the route prefix is included in the match conditions.</li>
         * </ul>
         * <p>For example, if you set the match condition to 1.1.0.0/16 and fuzzy match is applied, the route whose prefix is 1.1.1.0/24 meets the match condition.</p>
         * <ul>
         * <li><strong>Complete</strong>: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.</li>
         * </ul>
         * <p>For example, if you set the match condition to 1.1.0.0/16 and exact match is applied, only the route whose prefix is 1.1.0.0/16 meets the match condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        public Builder cidrMatchMode(String cidrMatchMode) {
            this.putQueryParameter("CidrMatchMode", cidrMatchMode);
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }

        /**
         * <p>The match method that is used to match routes based on the community. Valid values:</p>
         * <ul>
         * <li><strong>Include</strong>: fuzzy match. A route is a match if the community of the route overlaps with the community in the match conditions.</li>
         * <li><strong>Complete</strong>: exact match. A route is a match only if the community of the route matches the community in the match conditions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        public Builder communityMatchMode(String communityMatchMode) {
            this.putQueryParameter("CommunityMatchMode", communityMatchMode);
            this.communityMatchMode = communityMatchMode;
            return this;
        }

        /**
         * <p>The action to be performed on the community. Valid values:</p>
         * <ul>
         * <li><strong>Additive</strong>: adds the community to the route.</li>
         * <li><strong>Replace</strong>: replaces the original community of the route.</li>
         * </ul>
         * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Additive</p>
         */
        public Builder communityOperateMode(String communityOperateMode) {
            this.putQueryParameter("CommunityOperateMode", communityOperateMode);
            this.communityOperateMode = communityOperateMode;
            return this;
        }

        /**
         * <p>The description of the routing policy.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The types of destination network instance to which the routes belong. The following types of network instances are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC</p>
         * </li>
         * <li><p><strong>VBR</strong>: VBR</p>
         * </li>
         * <li><p><strong>CCN</strong>: CCN instance</p>
         * </li>
         * <li><p><strong>VPN</strong>: IPsec connection</p>
         * <blockquote>
         * <p>This parameter does not take effect if the IPsec-VPN connection or SSL client is associated with a transit router through a VPN gateway and a VPC. This parameter takes effect only if the IPsec connection is directly connected to the transit router.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>You can specify one or more network instance types.</p>
         * <blockquote>
         * <p>The destination network instance types are valid only if the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder destinationChildInstanceTypes(java.util.List < String > destinationChildInstanceTypes) {
            this.putQueryParameter("DestinationChildInstanceTypes", destinationChildInstanceTypes);
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }

        /**
         * <p>The prefix list against which routes are matched.</p>
         * <p>You must specify the IP addresses in CIDR notation. You can enter at most 32 CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        public Builder destinationCidrBlocks(java.util.List < String > destinationCidrBlocks) {
            this.putQueryParameter("DestinationCidrBlocks", destinationCidrBlocks);
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }

        /**
         * <p>The IDs of the destination network instances to which the routes belong. The following network instance types are supported:</p>
         * <ul>
         * <li>VPC</li>
         * <li>VBR</li>
         * <li>CCN instance</li>
         * <li>SAG instance</li>
         * <li>The ID of the IPsec-VPN connection.</li>
         * </ul>
         * <p>You can enter at most 32 IDs.</p>
         * <blockquote>
         * <p>The destination instance IDs take effect only when Direction is set to Export from Regional Gateway and the destination instances are deployed in the current region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-afrfs434465fdf****</p>
         */
        public Builder destinationInstanceIds(java.util.List < String > destinationInstanceIds) {
            this.putQueryParameter("DestinationInstanceIds", destinationInstanceIds);
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to exclude destination instance IDs. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): A route is a match if the destination instance ID is included in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
         * <li><strong>true</strong>: A route is a match if the destination network instance ID is not in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder destinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.putQueryParameter("DestinationInstanceIdsReverseMatch", destinationInstanceIdsReverseMatch);
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }

        /**
         * DestinationRegionIds.
         */
        public Builder destinationRegionIds(java.util.List < String > destinationRegionIds) {
            this.putQueryParameter("DestinationRegionIds", destinationRegionIds);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * <p>The IDs of the destination route tables to which routes are evaluated. You can enter at most 32 route table IDs.</p>
         * <blockquote>
         * <p>The destination route table IDs take effect only when Direction is set to Export from Regional Gateway and the destination route tables belong to network instances deployed in the current region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vtb-adefrgtr144vf****</p>
         */
        public Builder destinationRouteTableIds(java.util.List < String > destinationRouteTableIds) {
            this.putQueryParameter("DestinationRouteTableIds", destinationRouteTableIds);
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }

        /**
         * <p>The action to be performed on a route that meets all the match conditions. Valid values:</p>
         * <ul>
         * <li><strong>Permit</strong>: the route is permitted.</li>
         * <li><strong>Deny</strong>: the route is denied.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Permit</p>
         */
        public Builder mapResult(String mapResult) {
            this.putQueryParameter("MapResult", mapResult);
            this.mapResult = mapResult;
            return this;
        }

        /**
         * <p>The type of IP address in the match condition. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: IPv4 address</li>
         * <li><strong>IPv6</strong>: IPv6 address</li>
         * </ul>
         * <p>This parameter can be empty. If no value is specified, all types of IP address are a match.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder matchAddressType(String matchAddressType) {
            this.putQueryParameter("MatchAddressType", matchAddressType);
            this.matchAddressType = matchAddressType;
            return this;
        }

        /**
         * <p>The AS paths based on which routes are compared.</p>
         * <p>You can specify at most 32 AS numbers.</p>
         * <blockquote>
         * <p>Only the AS-SEQUENCE parameter is supported. The AS-SET, AS-CONFED-SEQUENCE, and AS-CONFED-SET parameters are not supported. In other words, only the AS number list is supported. Sets and sub-lists are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65501</p>
         */
        public Builder matchAsns(java.util.List < Long > matchAsns) {
            this.putQueryParameter("MatchAsns", matchAsns);
            this.matchAsns = matchAsns;
            return this;
        }

        /**
         * <p>The community set based on which routes are compared.</p>
         * <p>Specify the community in the format of n:m. Valid values of n and m: <strong>1</strong> to <strong>65535</strong>. Each community must comply with the RFC 1997 standard. The RFC 8092 standard that defines Border Gateway Protocol (BGP) large communities is not supported.</p>
         * <p>You can specify at most 32 communities.</p>
         * <blockquote>
         * <p>If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65501:1</p>
         */
        public Builder matchCommunitySet(java.util.List < String > matchCommunitySet) {
            this.putQueryParameter("MatchCommunitySet", matchCommunitySet);
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }

        /**
         * <p>The priority of the routing policy that you want to associate with the current one.</p>
         * <ul>
         * <li>This parameter takes effect only when the <strong>MapResult</strong> parameter is set to <strong>Permit</strong>. This way, the permitted route is matched against the next routing policy.</li>
         * <li>The region and direction of the routing policy to be associated must be the same as those of the current routing policy.</li>
         * <li>The priority of the next routing policy must be lower than the priority of the current routing policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder nextPriority(Integer nextPriority) {
            this.putQueryParameter("NextPriority", nextPriority);
            this.nextPriority = nextPriority;
            return this;
        }

        /**
         * <p>The community set on which actions are performed.</p>
         * <p>Specify the community in the format of n:m. Valid values of n and m: <strong>1</strong> to <strong>65535</strong>. Each community must comply with RFC 1997. The RFC 8092 standard that defines BGP large communities is not supported.</p>
         * <p>You can specify at most 32 communities.</p>
         * <blockquote>
         * <p>If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65501:1</p>
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
         * <p>The new priority of the route.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. The default priority is <strong>50</strong>. A smaller value indicates a higher priority.</p>
         * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder preference(Integer preference) {
            this.putQueryParameter("Preference", preference);
            this.preference = preference;
            return this;
        }

        /**
         * <p>The AS paths that are prepended by using an action statement when regional gateways receive or advertise routes.</p>
         * <p>The AS paths vary based on the direction in which the routing policy is applied:</p>
         * <ul>
         * <li>If AS paths are prepended to a routing policy that is applied in the inbound direction, you must specify source network instance IDs and the source region in the match condition. In addition, the source region must be the same as the region where the routing policy is applied.</li>
         * <li>If AS paths are prepended to a routing policy that is applied in the outbound direction, you must specify destination network instance IDs in the match condition.</li>
         * </ul>
         * <p>This parameter specifies the action to be performed when a route meets the match condition. You can specify at most 32 AS numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>65501</p>
         */
        public Builder prependAsPath(java.util.List < Long > prependAsPath) {
            this.putQueryParameter("PrependAsPath", prependAsPath);
            this.prependAsPath = prependAsPath;
            return this;
        }

        /**
         * <p>The priority of the routing policy. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
         * <blockquote>
         * <p>You cannot specify the same priority for routing policies that apply in the same region and direction. The system matches routes against the match conditions of routing policies in descending order of priority. A smaller value indicates a higher priority. You must set the priorities to proper values.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The type of route to be compared. Valid values: The following route types are supported:</p>
         * <ul>
         * <li><strong>System</strong>: system routes that are automatically generated by the system.</li>
         * <li><strong>Custom</strong>: custom routes that are manually added.</li>
         * <li><strong>BGP</strong>: routes that are advertised over BGP.</li>
         * </ul>
         * <p>You can specify multiple route types.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder routeTypes(java.util.List < String > routeTypes) {
            this.putQueryParameter("RouteTypes", routeTypes);
            this.routeTypes = routeTypes;
            return this;
        }

        /**
         * <p>The types of source network instance to which the routes belong. The following types of network instances are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC</p>
         * </li>
         * <li><p><strong>VBR</strong>: VBR</p>
         * </li>
         * <li><p><strong>CCN</strong>: CCN instance</p>
         * </li>
         * <li><p><strong>VPN</strong>: VPN gateway or IPsec connection</p>
         * <ul>
         * <li>If the IPsec-VPN connection or SSL client is associated with a VPN gateway, the VPC associated with the VPN gateway must be connected to a transit router, and the VPN gateway must use BGP dynamic routing. Otherwise, this parameter cannot take effect.</li>
         * <li>This parameter takes effect if the IPsec connection is directly connected to a transit router.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>You can specify one or more network instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder sourceChildInstanceTypes(java.util.List < String > sourceChildInstanceTypes) {
            this.putQueryParameter("SourceChildInstanceTypes", sourceChildInstanceTypes);
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }

        /**
         * <p>The IDs of the source network instances to which the routes belong. The following network instance types are supported:</p>
         * <ul>
         * <li>Virtual private cloud (VPC)</li>
         * <li>Virtual border router (VBR)</li>
         * <li>Cloud Connect Network (CCN) instance</li>
         * <li>Smart Access Gateway (SAG) instance</li>
         * <li>The ID of the IPsec-VPN connection.</li>
         * </ul>
         * <p>You can enter at most 32 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-adeg3544fdf34vf****</p>
         */
        public Builder sourceInstanceIds(java.util.List < String > sourceInstanceIds) {
            this.putQueryParameter("SourceInstanceIds", sourceInstanceIds);
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to exclude source instance IDs. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): A route is a match if the source instance ID is included in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
         * <li><strong>true</strong>: A route is a match if the source network instance ID is not in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.putQueryParameter("SourceInstanceIdsReverseMatch", sourceInstanceIdsReverseMatch);
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }

        /**
         * <p>The IDs of the source regions from which routes are evaluated. You can enter at most 32 region IDs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder sourceRegionIds(java.util.List < String > sourceRegionIds) {
            this.putQueryParameter("SourceRegionIds", sourceRegionIds);
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }

        /**
         * <p>The IDs of the source route tables from which routes are evaluated. You can enter at most 32 route table IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-adfr233vf34rvd4****</p>
         */
        public Builder sourceRouteTableIds(java.util.List < String > sourceRouteTableIds) {
            this.putQueryParameter("SourceRouteTableIds", sourceRouteTableIds);
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }

        /**
         * <p>The ID of the route table of the transit router.</p>
         * <p>If you do not specify a route table ID, the routing policy is automatically associated with the default route table of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-gw8nx3515m1mbd1z1****</p>
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * <p>The direction in which the routing policy is applied. Valid values:</p>
         * <ul>
         * <li><strong>RegionIn</strong>: Routes are advertised to the gateways in the regions that are connected by the CEN instance.</li>
         * </ul>
         * <p>For example, routes are advertised from network instances deployed in the current region or other regions to the gateway deployed in the current region.</p>
         * <ul>
         * <li><strong>RegionOut</strong>: Routes are advertised from the gateways in the regions that are connected by the CEN instance.</li>
         * </ul>
         * <p>For example, routes are advertised from the gateway deployed in the current region to network instances deployed in the same region, or to gateways deployed in other regions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionIn</p>
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
