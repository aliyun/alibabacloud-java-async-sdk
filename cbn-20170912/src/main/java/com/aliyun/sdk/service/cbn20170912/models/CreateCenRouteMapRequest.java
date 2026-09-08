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
         * <li><p><strong>Include</strong>: fuzzy match. A match is successful if the AS path in the match condition overlaps with the AS path of the route being matched. </p>
         * </li>
         * <li><p><strong>Complete</strong>: exact match. A match is successful only if the AS path in the match condition is the same as the AS path of the route being matched.</p>
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
         * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
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
         * <p>The ID of the region to which the routing policy is applied.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> to query region IDs.</p>
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
         * <li><strong>Include</strong>: fuzzy match. A match is successful if the route prefix in the match condition contains the route prefix of the route being matched.</li>
         * </ul>
         * <p> For example, a policy that defines 10.10.0.0/16 can fuzzy match the route 10.10.1.0/24.</p>
         * <ul>
         * <li><strong>Complete</strong>: exact match. A match is successful only if the route prefix in the match condition is the same as the route prefix of the route being matched.</li>
         * </ul>
         * <p> For example, a policy that defines 10.10.0.0/16 can only exact match the route 10.10.0.0/16.</p>
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
         * <p>The match mode of the Community. Valid values:</p>
         * <ul>
         * <li><p><strong>Include</strong>: fuzzy match. A match is successful if the Community in the match condition overlaps with the Community of the route being matched. </p>
         * </li>
         * <li><p><strong>Complete</strong>: exact match. A match is successful only if the Community in the match condition is the same as the Community of the route being matched.</p>
         * </li>
         * <li><p><strong>Contain</strong>: inclusive match. A match is successful only if the Community of the route being matched contains all the Communities specified in the match condition.</p>
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
         * <p>The action to perform on the Community. Valid values:</p>
         * <ul>
         * <li><p><strong>Additive</strong>: adds a Community to the route.</p>
         * </li>
         * <li><p><strong>Replace</strong>: replaces the existing Community of the route.</p>
         * </li>
         * </ul>
         * <p>This parameter specifies the action to perform after a route matches the condition.</p>
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
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The list of destination instance types that the route must match. The following instance types are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC instance.</p>
         * </li>
         * <li><p><strong>VBR</strong>: VBR instance.</p>
         * </li>
         * <li><p><strong>CCN</strong>: CCN instance.</p>
         * </li>
         * <li><p><strong>VPN</strong>: IPsec connection.</p>
         * <blockquote>
         * <p>If an IPsec connection or SSL server is bound to a VPN gateway instance and is connected to a transit router instance through the VPC associated with the VPN gateway instance, this parameter does not take effect. This parameter takes effect only when an IPsec connection is directly bound to a transit router instance.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>You can specify multiple instance types.</p>
         * <blockquote>
         * <p>The destination instance type list takes effect only when the routing policy direction is outbound from the regional gateway and the destination instance types are instance types in the local region.</p>
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
         * <p>The prefix list that the route must match.</p>
         * <p>IP address ranges in the prefix list are in CIDR format. You can specify up to 64 IP address ranges.</p>
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
         * <p>The list of destination instance IDs that the route must match. The following types of instance IDs are supported:</p>
         * <ul>
         * <li>Virtual Private Cloud (VPC) instance ID</li>
         * <li>Virtual Border Router (VBR) instance ID</li>
         * <li>Cloud Connect Network (CCN) instance ID</li>
         * <li>Smart Access Gateway instance ID</li>
         * <li>IPsec connection ID</li>
         * </ul>
         * <p>You can specify up to 64 instance IDs.</p>
         * <blockquote>
         * <p>The destination instance ID list takes effect only when the routing policy direction is outbound from the regional gateway and the destination instance IDs are instance IDs in the local region.</p>
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
         * <p>Specifies whether to use the exclude matching mode for the destination instance ID list. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): no. A match is successful if the destination instance ID of the route is in the <strong>DestinationInstanceIds.N</strong> list.</p>
         * </li>
         * <li><p><strong>true</strong>: yes. A match is successful if the destination instance ID of the route is not in the <strong>DestinationInstanceIds.N</strong> list.</p>
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
         * <p>The list of destination region IDs that the route must match. You can specify up to 64 region IDs.</p>
         */
        public Builder destinationRegionIds(java.util.List<String> destinationRegionIds) {
            this.putQueryParameter("DestinationRegionIds", destinationRegionIds);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * <p>The list of destination route table IDs that the route must match. You can specify up to 64 route table IDs.</p>
         * <blockquote>
         * <p>The destination route table ID list takes effect only when the routing policy direction is outbound from the regional gateway and the destination route table IDs are route table IDs of network instances in the local region.</p>
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
         * <p>The action to perform after all conditions are matched. Valid values:</p>
         * <ul>
         * <li><p><strong>Permit</strong>: permits the matched routes.</p>
         * </li>
         * <li><p><strong>Deny</strong>: denies the matched routes.</p>
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
         * <p>The IP address type that the route must match. Valid values:</p>
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
            this.putQueryParameter("MatchAddressType", matchAddressType);
            this.matchAddressType = matchAddressType;
            return this;
        }

        /**
         * <p>The AS path list that the route must match.</p>
         * <p>You can specify up to 64 AS numbers.</p>
         * <blockquote>
         * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means that only AS number lists are supported, not sets or sublists.</p>
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
         * <p>The Community set that the route must match.</p>
         * <p>Each Community is in the n:m format, where the value ranges of n and m are <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large Communities (RFC 8092) are not supported.</p>
         * <p>You can specify up to 64 Communities.</p>
         * <blockquote>
         * <p>Incorrect Community configurations may cause routes to fail to be advertised to on-premises data centers.</p>
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
         * <p>Policy priority of the next associated routing policy.</p>
         * <ul>
         * <li>You can set policy priority of the next associated routing policy only when <strong>MapResult</strong> is set to <strong>Permit</strong>. Only routes that are permitted continue to match the next associated routing policy.</li>
         * <li>The next associated routing policy must have the same region and direction as the current routing policy.</li>
         * <li>Policy priority of the next associated routing policy must be lower than policy priority of the current routing policy.</li>
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
         * <p>The Community set to be executed.</p>
         * <p>Each Community is in the n:m format, where the value ranges of n and m are <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large Communities (RFC 8092) are not supported.</p>
         * <p>You can specify up to 32 Communities.</p>
         * <blockquote>
         * <p>Incorrect Community configurations may cause routes to fail to be advertised to on-premises data centers.</p>
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
         * <p>The modified priority of the route.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. The default priority of a route is <strong>50</strong>. A smaller value indicates a higher priority.</p>
         * <p>This parameter specifies the action to perform after a route matches the condition.</p>
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
         * <p>The AS path that is prepended when the regional gateway receives or publishes route entries.</p>
         * <p>The requirements for configuring the prepended AS path vary based on the routing policy direction:</p>
         * <ul>
         * <li><p>When the direction is inbound to the regional gateway, the match condition must include the source instance ID list and source region, and the source region must be the same as the region to which the routing policy is applied.</p>
         * </li>
         * <li><p>When the direction is outbound from the regional gateway, the match condition must include the destination instance ID list.</p>
         * </li>
         * </ul>
         * <p>This parameter specifies the action to execute after a route matches the condition. You can specify up to 32 AS numbers.</p>
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
         * <p>Policy priority of the routing policy. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
         * <blockquote>
         * <p>Policy priority of routing policies in the same region and with the same direction must be unique. When a routing policy is executed, the system starts matching conditional statements from the routing policy with the smallest priority value. Specify policy priority based on the expected matching order.</p>
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
         * <p>The list of routing types that the route must match. The following routing types are supported:</p>
         * <ul>
         * <li><p><strong>System</strong>: system routes that are automatically generated by the system.</p>
         * </li>
         * <li><p><strong>Custom</strong>: custom routes that are manually added by users.</p>
         * </li>
         * <li><p><strong>BGP</strong>: BGP routes that are propagated through the BGP routing protocol.</p>
         * </li>
         * </ul>
         * <p>You can specify multiple routing types.</p>
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
         * <p>The list of source instance types that the route must match. The following instance types are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC instance.</p>
         * </li>
         * <li><p><strong>VBR</strong>: virtual border router instance.</p>
         * </li>
         * <li><p><strong>CCN</strong>: CCN instance.</p>
         * </li>
         * <li><p><strong>VPN</strong>: VPN gateway instance or IPsec connection.</p>
         * <ul>
         * <li>If an IPsec connection or SSL server is attached to a VPN gateway instance, the VPC associated with the VPN gateway instance must be connected to a transit router instance, and the VPN gateway instance must run the BGP dynamic routing protocol for this parameter to take effect.</li>
         * <li>If an IPsec connection is directly attached to a transit router instance, this parameter takes effect.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>You can specify multiple instance types.</p>
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
         * <p>The list of source instance IDs that the route must match. The following types of instance IDs are supported:</p>
         * <ul>
         * <li>Virtual Private Cloud (VPC) instance ID</li>
         * <li>Virtual Border Router (VBR) instance ID</li>
         * <li>Cloud Connect Network (CCN) instance ID</li>
         * <li>Smart Access Gateway instance ID</li>
         * <li>IPsec connection ID</li>
         * </ul>
         * <p>You can specify up to 64 instance IDs.</p>
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
         * <p>Specifies whether to use the exclude matching mode for the source instance ID list. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): no. A match is successful if the source instance ID of the route is in the <strong>SourceInstanceIds.N</strong> list.</p>
         * </li>
         * <li><p><strong>true</strong>: yes. A match is successful if the source instance ID of the route is not in the <strong>SourceInstanceIds.N</strong> list.</p>
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
         * <p>The list of source region IDs that the route must match. You can specify up to 64 region IDs.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> to query region IDs.</p>
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
         * <p>The list of source route table IDs that the route must match. You can specify up to 64 route table IDs.</p>
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
         * <p>The route table ID of the transit router.</p>
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
         * <li><strong>RegionIn</strong>: the inbound direction of the regional gateway. Routes are transmitted to the CEN regional gateway.</li>
         * </ul>
         * <p> For example, a route is advertised from a network instance in the local region to the local regional gateway, or a route is advertised from another region to the local regional gateway.</p>
         * <ul>
         * <li><strong>RegionOut</strong>: the outbound direction of the regional gateway. Routes are transmitted from the CEN regional gateway.</li>
         * </ul>
         * <p> For example, a route is advertised from the local regional gateway to a network instance in the local region, or to a regional gateway in another region.</p>
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
