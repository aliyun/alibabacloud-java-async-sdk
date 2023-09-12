// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDistributionItemWithoutCacheRequest} extends {@link RequestModel}
 *
 * <p>ListDistributionItemWithoutCacheRequest</p>
 */
public class ListDistributionItemWithoutCacheRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributionMallId")
    private String distributionMallId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("ItemStatus")
    private Integer itemStatus;

    @Body
    @NameInMap("LmItemId")
    private String lmItemId;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private ListDistributionItemWithoutCacheRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributionMallId = builder.distributionMallId;
        this.distributorId = builder.distributorId;
        this.itemStatus = builder.itemStatus;
        this.lmItemId = builder.lmItemId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDistributionItemWithoutCacheRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return distributionMallId
     */
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return itemStatus
     */
    public Integer getItemStatus() {
        return this.itemStatus;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListDistributionItemWithoutCacheRequest, Builder> {
        private String regionId; 
        private String distributionMallId; 
        private String distributorId; 
        private Integer itemStatus; 
        private String lmItemId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListDistributionItemWithoutCacheRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributionMallId = request.distributionMallId;
            this.distributorId = request.distributorId;
            this.itemStatus = request.itemStatus;
            this.lmItemId = request.lmItemId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DistributionMallId.
         */
        public Builder distributionMallId(String distributionMallId) {
            this.putBodyParameter("DistributionMallId", distributionMallId);
            this.distributionMallId = distributionMallId;
            return this;
        }

        /**
         * DistributorId.
         */
        public Builder distributorId(String distributorId) {
            this.putBodyParameter("DistributorId", distributorId);
            this.distributorId = distributorId;
            return this;
        }

        /**
         * ItemStatus.
         */
        public Builder itemStatus(Integer itemStatus) {
            this.putBodyParameter("ItemStatus", itemStatus);
            this.itemStatus = itemStatus;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putBodyParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListDistributionItemWithoutCacheRequest build() {
            return new ListDistributionItemWithoutCacheRequest(this);
        } 

    } 

}
