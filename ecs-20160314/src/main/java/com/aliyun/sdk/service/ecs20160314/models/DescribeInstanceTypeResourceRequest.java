// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypeResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypeResourceRequest</p>
 */
public class DescribeInstanceTypeResourceRequest extends Request {
    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("InstanceTypeFamilies")
    private java.util.List < String > instanceTypeFamilies;

    @Query
    @NameInMap("InstanceTypeMatchMode")
    private String instanceTypeMatchMode;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("Memories")
    private java.util.List < Double > memories;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SearchTypes")
    private java.util.List < String > searchTypes;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ZoneIds")
    private java.util.List < String > zoneIds;

    private DescribeInstanceTypeResourceRequest(Builder builder) {
        super(builder);
        this.cores = builder.cores;
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.instanceTypeMatchMode = builder.instanceTypeMatchMode;
        this.instanceTypes = builder.instanceTypes;
        this.memories = builder.memories;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.searchTypes = builder.searchTypes;
        this.sourceRegionId = builder.sourceRegionId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypeResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return instanceTypeFamilies
     */
    public java.util.List < String > getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    /**
     * @return instanceTypeMatchMode
     */
    public String getInstanceTypeMatchMode() {
        return this.instanceTypeMatchMode;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return memories
     */
    public java.util.List < Double > getMemories() {
        return this.memories;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return searchTypes
     */
    public java.util.List < String > getSearchTypes() {
        return this.searchTypes;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return zoneIds
     */
    public java.util.List < String > getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceTypeResourceRequest, Builder> {
        private Integer cores; 
        private java.util.List < String > instanceTypeFamilies; 
        private String instanceTypeMatchMode; 
        private java.util.List < String > instanceTypes; 
        private java.util.List < Double > memories; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > searchTypes; 
        private String sourceRegionId; 
        private java.util.List < String > zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypeResourceRequest response) {
            super(response);
            this.cores = response.cores;
            this.instanceTypeFamilies = response.instanceTypeFamilies;
            this.instanceTypeMatchMode = response.instanceTypeMatchMode;
            this.instanceTypes = response.instanceTypes;
            this.memories = response.memories;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.searchTypes = response.searchTypes;
            this.sourceRegionId = response.sourceRegionId;
            this.zoneIds = response.zoneIds;
        } 

        /**
         * Cores.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * InstanceTypeFamilies.
         */
        public Builder instanceTypeFamilies(java.util.List < String > instanceTypeFamilies) {
            this.putQueryParameter("InstanceTypeFamilies", instanceTypeFamilies);
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * InstanceTypeMatchMode.
         */
        public Builder instanceTypeMatchMode(String instanceTypeMatchMode) {
            this.putQueryParameter("InstanceTypeMatchMode", instanceTypeMatchMode);
            this.instanceTypeMatchMode = instanceTypeMatchMode;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * Memories.
         */
        public Builder memories(java.util.List < Double > memories) {
            this.putQueryParameter("Memories", memories);
            this.memories = memories;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * SearchTypes.
         */
        public Builder searchTypes(java.util.List < String > searchTypes) {
            this.putQueryParameter("SearchTypes", searchTypes);
            this.searchTypes = searchTypes;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ZoneIds.
         */
        public Builder zoneIds(java.util.List < String > zoneIds) {
            this.putQueryParameter("ZoneIds", zoneIds);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public DescribeInstanceTypeResourceRequest build() {
            return new DescribeInstanceTypeResourceRequest(this);
        } 

    } 

}
