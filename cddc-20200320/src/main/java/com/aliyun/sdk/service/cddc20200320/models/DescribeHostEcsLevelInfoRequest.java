// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostEcsLevelInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeHostEcsLevelInfoRequest</p>
 */
public class DescribeHostEcsLevelInfoRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Query
    @NameInMap("DbType")
    @Validation(required = true)
    private String dbType;

    @Query
    @NameInMap("ImageCategory")
    private String imageCategory;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

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
    @NameInMap("StorageType")
    @Validation(required = true)
    private String storageType;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private DescribeHostEcsLevelInfoRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.dbType = builder.dbType;
        this.imageCategory = builder.imageCategory;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageType = builder.storageType;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostEcsLevelInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return imageCategory
     */
    public String getImageCategory() {
        return this.imageCategory;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeHostEcsLevelInfoRequest, Builder> {
        private String commodityCode; 
        private String dbType; 
        private String imageCategory; 
        private Long ownerId; 
        private String payType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHostEcsLevelInfoRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.dbType = request.dbType;
            this.imageCategory = request.imageCategory;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageType = request.storageType;
            this.zoneId = request.zoneId;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * ImageCategory.
         */
        public Builder imageCategory(String imageCategory) {
            this.putQueryParameter("ImageCategory", imageCategory);
            this.imageCategory = imageCategory;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeHostEcsLevelInfoRequest build() {
            return new DescribeHostEcsLevelInfoRequest(this);
        } 

    } 

}
