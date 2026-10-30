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
    private java.util.List<String> destinationChildInstanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlocks")
    private java.util.List<String> destinationCidrBlocks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationInstanceIds")
    private java.util.List<String> destinationInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationInstanceIdsReverseMatch")
    private Boolean destinationInstanceIdsReverseMatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
    private java.util.List<String> destinationRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRouteTableIds")
    private java.util.List<String> destinationRouteTableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MapResult")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mapResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchAddressType")
    private String matchAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchAsns")
    private java.util.List<Long> matchAsns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchCommunitySet")
    private java.util.List<String> matchCommunitySet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPriority")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer nextPriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateCommunitySet")
    private java.util.List<String> operateCommunitySet;

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
    private java.util.List<Long> prependAsPath;

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
    private java.util.List<String> routeTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceChildInstanceTypes")
    private java.util.List<String> sourceChildInstanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceIds")
    private java.util.List<String> sourceInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceIdsReverseMatch")
    private Boolean sourceInstanceIdsReverseMatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionIds")
    private java.util.List<String> sourceRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRouteTableIds")
    private java.util.List<String> sourceRouteTableIds;

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
    public java.util.List<String> getDestinationChildInstanceTypes() {
        return this.destinationChildInstanceTypes;
    }

    /**
     * @return destinationCidrBlocks
     */
    public java.util.List<String> getDestinationCidrBlocks() {
        return this.destinationCidrBlocks;
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
    public java.util.List<Long> getMatchAsns() {
        return this.matchAsns;
    }

    /**
     * @return matchCommunitySet
     */
    public java.util.List<String> getMatchCommunitySet() {
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
    public java.util.List<String> getOperateCommunitySet() {
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
    public java.util.List<Long> getPrependAsPath() {
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
    public java.util.List<String> getRouteTypes() {
        return this.routeTypes;
    }

    /**
     * @return sourceChildInstanceTypes
     */
    public java.util.List<String> getSourceChildInstanceTypes() {
        return this.sourceChildInstanceTypes;
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
        private java.util.List<String> destinationChildInstanceTypes; 
        private java.util.List<String> destinationCidrBlocks; 
        private java.util.List<String> destinationInstanceIds; 
        private Boolean destinationInstanceIdsReverseMatch; 
        private java.util.List<String> destinationRegionIds; 
        private java.util.List<String> destinationRouteTableIds; 
        private String mapResult; 
        private String matchAddressType; 
        private java.util.List<Long> matchAsns; 
        private java.util.List<String> matchCommunitySet; 
        private Integer nextPriority; 
        private java.util.List<String> operateCommunitySet; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer preference; 
        private java.util.List<Long> prependAsPath; 
        private Integer priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> routeTypes; 
        private java.util.List<String> sourceChildInstanceTypes; 
        private java.util.List<String> sourceInstanceIds; 
        private Boolean sourceInstanceIdsReverseMatch; 
        private java.util.List<String> sourceRegionIds; 
        private java.util.List<String> sourceRouteTableIds; 
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
         * <p>The match mode of the AS path list. Valid values:</p>
         * <ul>
         * <li><p><strong>Include</strong>: fuzzy match. A route meets the match condition if the AS path in the match condition overlaps with the AS path of the route. </p>
         * </li>
         * <li><p><strong>Complete</strong>: exact match. A route meets the match condition only if the AS path in the match condition is exactly the same as the AS path of the route.</p>
         * </li>
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
         * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
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
         * <p>The ID of the region where the route map is applied.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
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
         * <p>The match mode of the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>Include</strong>: fuzzy match. A route meets the match condition if the route prefix in the match condition contains the prefix of the route.</li>
         * </ul>
         * <p> For example, if the match condition is 10.10.0.0/16, a route with the prefix 10.10.1.0/24 meets the condition.</p>
         * <ul>
         * <li><strong>Complete</strong>: exact match. A route meets the match condition only if the route prefix in the match condition is exactly the same as the prefix of the route.</li>
         * </ul>
         * <p> For example, if the match condition is 10.10.0.0/16, only a route with the prefix 10.10.0.0/16 meets the condition.</p>
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
         * <p>The match mode of the community. Valid values:</p>
         * <ul>
         * <li><p><strong>Include</strong>: fuzzy match. A route meets the match condition if the community in the match condition overlaps with the community of the route. </p>
         * </li>
         * <li><p><strong>Complete</strong>: exact match. A route meets the match condition only if the community in the match condition is exactly the same as the community of the route.</p>
         * </li>
         * <li><p><strong>Contain</strong>: contain match. A route meets the match condition only if the community of the route contains all communities specified in the match condition.</p>
         * </li>
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
         * <p>The action mode of the community. Valid values:</p>
         * <ul>
         * <li><p><strong>Additive</strong>: adds a community to the route.</p>
         * </li>
         * <li><p><strong>Replace</strong>: replaces the existing community of the route.</p>
         * </li>
         * </ul>
         * <p>This parameter specifies the action to be performed after a route meets the match conditions.</p>
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
         * <p>The description of the route map. The description must be 1 to 256 characters in length, and cannot start with http:// or https://. The description can be left empty.</p>
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
         * <p>The list of destination instance types to be matched. The following instance types are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC instance.</p>
         * </li>
         * <li><p><strong>VBR</strong>: VBR instance.</p>
         * </li>
         * <li><p><strong>CCN</strong>: CCN instance.</p>
         * </li>
         * <li><p><strong>VPN</strong>: IPsec connection.</p>
         * <blockquote>
         * <p>If an IPsec connection or SSL server is associated with a VPN gateway instance and connected to a transit router instance through the VPC associated with the VPN gateway instance, this parameter does not take effect. This parameter takes effect only when an IPsec connection is directly associated with a transit router instance.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>You can enter multiple instance types.</p>
         * <blockquote>
         * <p>The destination instance type list takes effect only when the application direction of the route map is set to RegionOut and the destination instance types are the types of instances in the local region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder destinationChildInstanceTypes(java.util.List<String> destinationChildInstanceTypes) {
            this.putQueryParameter("DestinationChildInstanceTypes", destinationChildInstanceTypes);
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }

        /**
         * <p>The prefix list to be matched.</p>
         * <p>The CIDR blocks in the prefix list must be in CIDR format. You can enter up to 64 CIDR blocks.</p>
         * <p>Both IPv4 and IPv6 formats are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        public Builder destinationCidrBlocks(java.util.List<String> destinationCidrBlocks) {
            this.putQueryParameter("DestinationCidrBlocks", destinationCidrBlocks);
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }

        /**
         * <p>The list of destination instance IDs to be matched. You can enter the IDs of the following types of instances:</p>
         * <ul>
         * <li>Virtual Private Cloud (VPC) instance IDs</li>
         * <li>Virtual Border Router (VBR) instance IDs</li>
         * <li>Cloud Connect Network (CCN) instance IDs</li>
         * <li>Smart Access Gateway (SAG) instance IDs</li>
         * <li>IPsec connection IDs</li>
         * </ul>
         * <p>You can enter up to 64 instance IDs.</p>
         * <blockquote>
         * <p>The destination instance ID list takes effect only when the application direction of the route map is set to RegionOut and the destination instance IDs are the IDs of instances in the local region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-afrfs434465fdf****</p>
         */
        public Builder destinationInstanceIds(java.util.List<String> destinationInstanceIds) {
            this.putQueryParameter("DestinationInstanceIds", destinationInstanceIds);
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to use the exclude match mode for the destination instance ID list. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): no. A route meets the match condition if the destination instance ID of the route is in <strong>DestinationInstanceIds.N</strong>.</p>
         * </li>
         * <li><p><strong>true</strong>: yes. A route meets the match condition if the destination instance ID of the route is not in <strong>DestinationInstanceIds.N</strong>.</p>
         * </li>
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
         * <p>The list of destination region IDs to be matched. You can enter up to 64 region IDs.</p>
         */
        public Builder destinationRegionIds(java.util.List<String> destinationRegionIds) {
            this.putQueryParameter("DestinationRegionIds", destinationRegionIds);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * <p>The list of destination route table IDs to be matched. You can enter up to 64 route table IDs.</p>
         * <blockquote>
         * <p>The destination route table ID list takes effect only when the application direction of the route map is set to RegionOut and the destination route table IDs are the IDs of route tables of network instances in the local region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vtb-adefrgtr144vf****</p>
         */
        public Builder destinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
            this.putQueryParameter("DestinationRouteTableIds", destinationRouteTableIds);
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }

        /**
         * <p>The action to be performed when a route meets all match conditions. Valid values:</p>
         * <ul>
         * <li><p><strong>Permit</strong>: permits the matched route.</p>
         * </li>
         * <li><p><strong>Deny</strong>: denies the matched route.</p>
         * </li>
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
         * <p>The IP address type of the routes to be matched. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: matches only IPv4 routes.</li>
         * <li><strong>IPv6</strong>: matches only IPv6 routes.</li>
         * </ul>
         * <p>If this parameter is left empty, all types of routes are matched.</p>
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
         * <p>The AS path list to be matched.</p>
         * <p>You can enter up to 64 AS numbers.</p>
         * <blockquote>
         * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only AS number lists are supported, and sets and sub-lists are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65501</p>
         */
        public Builder matchAsns(java.util.List<Long> matchAsns) {
            this.putQueryParameter("MatchAsns", matchAsns);
            this.matchAsns = matchAsns;
            return this;
        }

        /**
         * <p>The community set to be matched.</p>
         * <p>Each community must be in the format of n:m, where n and m are integers from <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>You can enter up to 64 communities.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65501:1</p>
         */
        public Builder matchCommunitySet(java.util.List<String> matchCommunitySet) {
            this.putQueryParameter("MatchCommunitySet", matchCommunitySet);
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }

        /**
         * <p>Policy priority of the next route map to be associated.</p>
         * <ul>
         * <li>You can set this parameter only when <strong>MapResult</strong> is set to <strong>Permit</strong>. Only permitted routes are matched against the next associated route map.</li>
         * <li>The next route map to be associated must be applied to the same region and in the same direction as the current route map.</li>
         * <li>Policy priority of the next route map to be associated must be lower than that of the current route map.</li>
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
         * <p>The community set to be operated.</p>
         * <p>Each community must be in the format of n:m, where n and m are integers from <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>You can enter up to 32 communities.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65501:1</p>
         */
        public Builder operateCommunitySet(java.util.List<String> operateCommunitySet) {
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
         * <p>The priority of the route to be modified.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. The default priority of a route is <strong>50</strong>. A smaller value indicates a higher priority.</p>
         * <p>This parameter specifies the action to be performed after a route meets the match conditions.</p>
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
         * <p>The AS path to be prepended when the regional gateway receives or performs publish route entry.</p>
         * <p>The requirements for configuring the prepended AS path vary based on the application direction of the policy:</p>
         * <ul>
         * <li><p>If the application direction is RegionIn, you must configure the source instance ID list and source region in the match conditions, and the source region must be the same as the region where the policy is applied.</p>
         * </li>
         * <li><p>If the application direction is RegionOut, you must configure the destination instance ID list in the match conditions.</p>
         * </li>
         * </ul>
         * <p>This parameter specifies the action to be executed after routing meets the match conditions. You can enter up to 32 AS numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>65501</p>
         */
        public Builder prependAsPath(java.util.List<Long> prependAsPath) {
            this.putQueryParameter("PrependAsPath", prependAsPath);
            this.prependAsPath = prependAsPath;
            return this;
        }

        /**
         * <p>The policy priority of the route map. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
         * <blockquote>
         * <p>The policy priority of each route map applied to the same region in the same direction must be unique. When the policy is executed, the system matches routing against the conditional statements of the policy with the smallest priority value first. Therefore, specify the policy priority based on the expected match order.</p>
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
         * <p>The list of route types to be matched. The following route types are supported:</p>
         * <ul>
         * <li><p><strong>System</strong>: system routing, which is automatically generated by the system.</p>
         * </li>
         * <li><p><strong>Custom</strong>: custom routing, which is manually added by a user.</p>
         * </li>
         * <li><p><strong>BGP</strong>: BGP routing, which is propagated through the BGP routable protocol.</p>
         * </li>
         * </ul>
         * <p>You can enter multiple route types.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder routeTypes(java.util.List<String> routeTypes) {
            this.putQueryParameter("RouteTypes", routeTypes);
            this.routeTypes = routeTypes;
            return this;
        }

        /**
         * <p>The list of source instance types to be matched. The following instance types are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC instance.</p>
         * </li>
         * <li><p><strong>VBR</strong>: border router instance.</p>
         * </li>
         * <li><p><strong>CCN</strong>: CCN instance.</p>
         * </li>
         * <li><p><strong>VPN</strong>: VPN gateway instance or IPsec connection.</p>
         * <ul>
         * <li>If an IPsec connection or SSL server is attached to a VPN gateway instance, the VPC associated with the VPN gateway instance must be connected to a forward router instance, and the VPN gateway instance must run the BGP dynamic routing routable protocol for this parameter to take effect.</li>
         * <li>If an IPsec connection is directly attached to a forward router instance, this parameter takes effect.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>You can enter multiple instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder sourceChildInstanceTypes(java.util.List<String> sourceChildInstanceTypes) {
            this.putQueryParameter("SourceChildInstanceTypes", sourceChildInstanceTypes);
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }

        /**
         * <p>The list of source instance IDs to be matched. You can enter the IDs of the following types of instances:</p>
         * <ul>
         * <li>Virtual Private Cloud (VPC) instance IDs</li>
         * <li>Virtual Border Router (VBR) instance IDs</li>
         * <li>Cloud Connect Network (CCN) instance IDs</li>
         * <li>Smart Access Gateway (SAG) instance IDs</li>
         * <li>IPsec connection IDs</li>
         * </ul>
         * <p>You can enter up to 64 instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-adeg3544fdf34vf****</p>
         */
        public Builder sourceInstanceIds(java.util.List<String> sourceInstanceIds) {
            this.putQueryParameter("SourceInstanceIds", sourceInstanceIds);
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to use the exclude match mode for the source instance ID list. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): no. A route meets the match condition if the source instance ID of the route is in <strong>SourceInstanceIds.N</strong>.</p>
         * </li>
         * <li><p><strong>true</strong>: yes. A route meets the match condition if the source instance ID of the route is not in <strong>SourceInstanceIds.N</strong>.</p>
         * </li>
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
         * <p>The list of source region IDs to be matched. You can enter up to 64 region IDs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder sourceRegionIds(java.util.List<String> sourceRegionIds) {
            this.putQueryParameter("SourceRegionIds", sourceRegionIds);
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }

        /**
         * <p>The list of source route table IDs to be matched. You can enter up to 64 route table IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-adfr233vf34rvd4****</p>
         */
        public Builder sourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
            this.putQueryParameter("SourceRouteTableIds", sourceRouteTableIds);
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }

        /**
         * <p>The ID of the route table of the transit router.</p>
         * <p>If you do not specify a route table ID, the route map is automatically associated with the default route table of the transit router.</p>
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
         * <p>The application direction of the route map. Valid values:</p>
         * <ul>
         * <li><p><strong>RegionIn</strong>: the direction in which routes are transmitted to the regional gateway of the CEN instance. For example, routes are advertised from a network instance in a region to the regional gateway in the same region, or routes are advertised from another region to the regional gateway.</p>
         * </li>
         * <li><p><strong>RegionOut</strong>: the direction in which routes are transmitted from the regional gateway of the CEN instance. For example, routes are advertised from the regional gateway to a network instance in the same region, or to a regional gateway in another region.</p>
         * </li>
         * </ul>
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
