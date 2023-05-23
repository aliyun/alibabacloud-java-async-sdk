// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenGeographicSpanRemainingBandwidthRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenGeographicSpanRemainingBandwidthRequest</p>
 */
public class DescribeCenGeographicSpanRemainingBandwidthRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("GeographicRegionAId")
    @Validation(required = true)
    private String geographicRegionAId;

    @Query
    @NameInMap("GeographicRegionBId")
    @Validation(required = true)
    private String geographicRegionBId;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeCenGeographicSpanRemainingBandwidthRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.geographicRegionAId = builder.geographicRegionAId;
        this.geographicRegionBId = builder.geographicRegionBId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenGeographicSpanRemainingBandwidthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return geographicRegionAId
     */
    public String getGeographicRegionAId() {
        return this.geographicRegionAId;
    }

    /**
     * @return geographicRegionBId
     */
    public String getGeographicRegionBId() {
        return this.geographicRegionBId;
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

    public static final class Builder extends Request.Builder<DescribeCenGeographicSpanRemainingBandwidthRequest, Builder> {
        private String cenId; 
        private String geographicRegionAId; 
        private String geographicRegionBId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCenGeographicSpanRemainingBandwidthRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.geographicRegionAId = request.geographicRegionAId;
            this.geographicRegionBId = request.geographicRegionBId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the Cloud Enterprise Network (CEN) instance to which the bandwidth plan is associated.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The ID of one of the connected areas of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **China**: Chinese mainland
         * *   **North-America**: North America
         * *   **Asia-Pacific**: Asia Pacific
         * *   **Europe**: Europe
         * *   **Australia**: Australia
         */
        public Builder geographicRegionAId(String geographicRegionAId) {
            this.putQueryParameter("GeographicRegionAId", geographicRegionAId);
            this.geographicRegionAId = geographicRegionAId;
            return this;
        }

        /**
         * The ID of the other area connected by the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **China**: Chinese mainland
         * *   **North-America**: North America
         * *   **Asia-Pacific**: Asia Pacific
         * *   **Europe**: Europe
         * *   **Australia**: Australia
         */
        public Builder geographicRegionBId(String geographicRegionBId) {
            this.putQueryParameter("GeographicRegionBId", geographicRegionBId);
            this.geographicRegionBId = geographicRegionBId;
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
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**. Valid values: **1** to **50**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public DescribeCenGeographicSpanRemainingBandwidthRequest build() {
            return new DescribeCenGeographicSpanRemainingBandwidthRequest(this);
        } 

    } 

}
