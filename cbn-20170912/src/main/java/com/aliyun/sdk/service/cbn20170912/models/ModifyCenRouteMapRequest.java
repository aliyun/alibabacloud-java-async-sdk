// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCenRouteMapRequest} extends {@link RequestModel}
 *
 * <p>ModifyCenRouteMapRequest</p>
 */
public class ModifyCenRouteMapRequest extends Request {
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
    @NameInMap("MatchAsns")
    private java.util.List < Integer > matchAsns;

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
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteMapId")
    @Validation(required = true)
    private String routeMapId;

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

    private ModifyCenRouteMapRequest(Builder builder) {
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
        this.routeMapId = builder.routeMapId;
        this.routeTypes = builder.routeTypes;
        this.sourceChildInstanceTypes = builder.sourceChildInstanceTypes;
        this.sourceInstanceIds = builder.sourceInstanceIds;
        this.sourceInstanceIdsReverseMatch = builder.sourceInstanceIdsReverseMatch;
        this.sourceRegionIds = builder.sourceRegionIds;
        this.sourceRouteTableIds = builder.sourceRouteTableIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCenRouteMapRequest create() {
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
     * @return matchAsns
     */
    public java.util.List < Integer > getMatchAsns() {
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
     * @return routeMapId
     */
    public String getRouteMapId() {
        return this.routeMapId;
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

    public static final class Builder extends Request.Builder<ModifyCenRouteMapRequest, Builder> {
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
        private java.util.List < Integer > matchAsns; 
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
        private String routeMapId; 
        private java.util.List < String > routeTypes; 
        private java.util.List < String > sourceChildInstanceTypes; 
        private java.util.List < String > sourceInstanceIds; 
        private Boolean sourceInstanceIdsReverseMatch; 
        private java.util.List < String > sourceRegionIds; 
        private java.util.List < String > sourceRouteTableIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCenRouteMapRequest response) {
            super(response);
            this.asPathMatchMode = response.asPathMatchMode;
            this.cenId = response.cenId;
            this.cenRegionId = response.cenRegionId;
            this.cidrMatchMode = response.cidrMatchMode;
            this.communityMatchMode = response.communityMatchMode;
            this.communityOperateMode = response.communityOperateMode;
            this.description = response.description;
            this.destinationChildInstanceTypes = response.destinationChildInstanceTypes;
            this.destinationCidrBlocks = response.destinationCidrBlocks;
            this.destinationInstanceIds = response.destinationInstanceIds;
            this.destinationInstanceIdsReverseMatch = response.destinationInstanceIdsReverseMatch;
            this.destinationRouteTableIds = response.destinationRouteTableIds;
            this.mapResult = response.mapResult;
            this.matchAsns = response.matchAsns;
            this.matchCommunitySet = response.matchCommunitySet;
            this.nextPriority = response.nextPriority;
            this.operateCommunitySet = response.operateCommunitySet;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.preference = response.preference;
            this.prependAsPath = response.prependAsPath;
            this.priority = response.priority;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.routeMapId = response.routeMapId;
            this.routeTypes = response.routeTypes;
            this.sourceChildInstanceTypes = response.sourceChildInstanceTypes;
            this.sourceInstanceIds = response.sourceInstanceIds;
            this.sourceInstanceIdsReverseMatch = response.sourceInstanceIdsReverseMatch;
            this.sourceRegionIds = response.sourceRegionIds;
            this.sourceRouteTableIds = response.sourceRouteTableIds;
        } 

        /**
         * AsPathMatchMode.
         */
        public Builder asPathMatchMode(String asPathMatchMode) {
            this.putQueryParameter("AsPathMatchMode", asPathMatchMode);
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * CenRegionId.
         */
        public Builder cenRegionId(String cenRegionId) {
            this.putQueryParameter("CenRegionId", cenRegionId);
            this.cenRegionId = cenRegionId;
            return this;
        }

        /**
         * CidrMatchMode.
         */
        public Builder cidrMatchMode(String cidrMatchMode) {
            this.putQueryParameter("CidrMatchMode", cidrMatchMode);
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }

        /**
         * CommunityMatchMode.
         */
        public Builder communityMatchMode(String communityMatchMode) {
            this.putQueryParameter("CommunityMatchMode", communityMatchMode);
            this.communityMatchMode = communityMatchMode;
            return this;
        }

        /**
         * CommunityOperateMode.
         */
        public Builder communityOperateMode(String communityOperateMode) {
            this.putQueryParameter("CommunityOperateMode", communityOperateMode);
            this.communityOperateMode = communityOperateMode;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DestinationChildInstanceTypes.
         */
        public Builder destinationChildInstanceTypes(java.util.List < String > destinationChildInstanceTypes) {
            this.putQueryParameter("DestinationChildInstanceTypes", destinationChildInstanceTypes);
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }

        /**
         * DestinationCidrBlocks.
         */
        public Builder destinationCidrBlocks(java.util.List < String > destinationCidrBlocks) {
            this.putQueryParameter("DestinationCidrBlocks", destinationCidrBlocks);
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }

        /**
         * DestinationInstanceIds.
         */
        public Builder destinationInstanceIds(java.util.List < String > destinationInstanceIds) {
            this.putQueryParameter("DestinationInstanceIds", destinationInstanceIds);
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }

        /**
         * DestinationInstanceIdsReverseMatch.
         */
        public Builder destinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.putQueryParameter("DestinationInstanceIdsReverseMatch", destinationInstanceIdsReverseMatch);
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }

        /**
         * DestinationRouteTableIds.
         */
        public Builder destinationRouteTableIds(java.util.List < String > destinationRouteTableIds) {
            this.putQueryParameter("DestinationRouteTableIds", destinationRouteTableIds);
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }

        /**
         * MapResult.
         */
        public Builder mapResult(String mapResult) {
            this.putQueryParameter("MapResult", mapResult);
            this.mapResult = mapResult;
            return this;
        }

        /**
         * MatchAsns.
         */
        public Builder matchAsns(java.util.List < Integer > matchAsns) {
            this.putQueryParameter("MatchAsns", matchAsns);
            this.matchAsns = matchAsns;
            return this;
        }

        /**
         * MatchCommunitySet.
         */
        public Builder matchCommunitySet(java.util.List < String > matchCommunitySet) {
            this.putQueryParameter("MatchCommunitySet", matchCommunitySet);
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }

        /**
         * NextPriority.
         */
        public Builder nextPriority(Integer nextPriority) {
            this.putQueryParameter("NextPriority", nextPriority);
            this.nextPriority = nextPriority;
            return this;
        }

        /**
         * OperateCommunitySet.
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
         * Preference.
         */
        public Builder preference(Integer preference) {
            this.putQueryParameter("Preference", preference);
            this.preference = preference;
            return this;
        }

        /**
         * PrependAsPath.
         */
        public Builder prependAsPath(java.util.List < Long > prependAsPath) {
            this.putQueryParameter("PrependAsPath", prependAsPath);
            this.prependAsPath = prependAsPath;
            return this;
        }

        /**
         * Priority.
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
         * RouteMapId.
         */
        public Builder routeMapId(String routeMapId) {
            this.putQueryParameter("RouteMapId", routeMapId);
            this.routeMapId = routeMapId;
            return this;
        }

        /**
         * RouteTypes.
         */
        public Builder routeTypes(java.util.List < String > routeTypes) {
            this.putQueryParameter("RouteTypes", routeTypes);
            this.routeTypes = routeTypes;
            return this;
        }

        /**
         * SourceChildInstanceTypes.
         */
        public Builder sourceChildInstanceTypes(java.util.List < String > sourceChildInstanceTypes) {
            this.putQueryParameter("SourceChildInstanceTypes", sourceChildInstanceTypes);
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }

        /**
         * SourceInstanceIds.
         */
        public Builder sourceInstanceIds(java.util.List < String > sourceInstanceIds) {
            this.putQueryParameter("SourceInstanceIds", sourceInstanceIds);
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }

        /**
         * SourceInstanceIdsReverseMatch.
         */
        public Builder sourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.putQueryParameter("SourceInstanceIdsReverseMatch", sourceInstanceIdsReverseMatch);
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }

        /**
         * SourceRegionIds.
         */
        public Builder sourceRegionIds(java.util.List < String > sourceRegionIds) {
            this.putQueryParameter("SourceRegionIds", sourceRegionIds);
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }

        /**
         * SourceRouteTableIds.
         */
        public Builder sourceRouteTableIds(java.util.List < String > sourceRouteTableIds) {
            this.putQueryParameter("SourceRouteTableIds", sourceRouteTableIds);
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }

        @Override
        public ModifyCenRouteMapRequest build() {
            return new ModifyCenRouteMapRequest(this);
        } 

    } 

}
