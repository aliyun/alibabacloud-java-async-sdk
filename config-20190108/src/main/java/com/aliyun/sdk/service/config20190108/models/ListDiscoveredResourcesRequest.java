// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiscoveredResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDiscoveredResourcesRequest</p>
 */
public class ListDiscoveredResourcesRequest extends Request {
    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Regions")
    private String regions;

    @Query
    @NameInMap("ResourceDeleted")
    private Integer resourceDeleted;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceTypes")
    private String resourceTypes;

    private ListDiscoveredResourcesRequest(Builder builder) {
        super(builder);
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regions = builder.regions;
        this.resourceDeleted = builder.resourceDeleted;
        this.resourceId = builder.resourceId;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiscoveredResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberId
     */
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * @return multiAccount
     */
    public Boolean getMultiAccount() {
        return this.multiAccount;
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
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return resourceDeleted
     */
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<ListDiscoveredResourcesRequest, Builder> {
        private Long memberId; 
        private Boolean multiAccount; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regions; 
        private Integer resourceDeleted; 
        private String resourceId; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListDiscoveredResourcesRequest response) {
            super(response);
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regions = response.regions;
            this.resourceDeleted = response.resourceDeleted;
            this.resourceId = response.resourceId;
            this.resourceTypes = response.resourceTypes;
        } 

        /**
         * MemberId.
         */
        public Builder memberId(Long memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MultiAccount.
         */
        public Builder multiAccount(Boolean multiAccount) {
            this.putQueryParameter("MultiAccount", multiAccount);
            this.multiAccount = multiAccount;
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
         * Regions.
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * ResourceDeleted.
         */
        public Builder resourceDeleted(Integer resourceDeleted) {
            this.putQueryParameter("ResourceDeleted", resourceDeleted);
            this.resourceDeleted = resourceDeleted;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public ListDiscoveredResourcesRequest build() {
            return new ListDiscoveredResourcesRequest(this);
        } 

    } 

}
