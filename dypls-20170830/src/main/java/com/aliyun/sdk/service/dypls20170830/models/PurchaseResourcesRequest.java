// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseResourcesRequest} extends {@link RequestModel}
 *
 * <p>PurchaseResourcesRequest</p>
 */
public class PurchaseResourcesRequest extends Request {
    @Query
    @NameInMap("BillId")
    private String billId;

    @Query
    @NameInMap("BuyNumber")
    @Validation(required = true)
    private Integer buyNumber;

    @Query
    @NameInMap("IsDisplayPool")
    private Boolean isDisplayPool;

    @Query
    @NameInMap("NoLike")
    private String noLike;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("RegionName")
    @Validation(required = true)
    private String regionName;

    @Query
    @NameInMap("ResType")
    @Validation(required = true)
    private Integer resType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SpecId")
    private Long specId;

    @Query
    @NameInMap("UsageScenarios")
    private String usageScenarios;

    private PurchaseResourcesRequest(Builder builder) {
        super(builder);
        this.billId = builder.billId;
        this.buyNumber = builder.buyNumber;
        this.isDisplayPool = builder.isDisplayPool;
        this.noLike = builder.noLike;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.regionName = builder.regionName;
        this.resType = builder.resType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.specId = builder.specId;
        this.usageScenarios = builder.usageScenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return buyNumber
     */
    public Integer getBuyNumber() {
        return this.buyNumber;
    }

    /**
     * @return isDisplayPool
     */
    public Boolean getIsDisplayPool() {
        return this.isDisplayPool;
    }

    /**
     * @return noLike
     */
    public String getNoLike() {
        return this.noLike;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * @return resType
     */
    public Integer getResType() {
        return this.resType;
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
     * @return specId
     */
    public Long getSpecId() {
        return this.specId;
    }

    /**
     * @return usageScenarios
     */
    public String getUsageScenarios() {
        return this.usageScenarios;
    }

    public static final class Builder extends Request.Builder<PurchaseResourcesRequest, Builder> {
        private String billId; 
        private Integer buyNumber; 
        private Boolean isDisplayPool; 
        private String noLike; 
        private Long ownerId; 
        private String prodCode; 
        private String regionName; 
        private Integer resType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long specId; 
        private String usageScenarios; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseResourcesRequest request) {
            super(request);
            this.billId = request.billId;
            this.buyNumber = request.buyNumber;
            this.isDisplayPool = request.isDisplayPool;
            this.noLike = request.noLike;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.regionName = request.regionName;
            this.resType = request.resType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.specId = request.specId;
            this.usageScenarios = request.usageScenarios;
        } 

        /**
         * BillId.
         */
        public Builder billId(String billId) {
            this.putQueryParameter("BillId", billId);
            this.billId = billId;
            return this;
        }

        /**
         * BuyNumber.
         */
        public Builder buyNumber(Integer buyNumber) {
            this.putQueryParameter("BuyNumber", buyNumber);
            this.buyNumber = buyNumber;
            return this;
        }

        /**
         * IsDisplayPool.
         */
        public Builder isDisplayPool(Boolean isDisplayPool) {
            this.putQueryParameter("IsDisplayPool", isDisplayPool);
            this.isDisplayPool = isDisplayPool;
            return this;
        }

        /**
         * NoLike.
         */
        public Builder noLike(String noLike) {
            this.putQueryParameter("NoLike", noLike);
            this.noLike = noLike;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * RegionName.
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        /**
         * ResType.
         */
        public Builder resType(Integer resType) {
            this.putQueryParameter("ResType", resType);
            this.resType = resType;
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
         * SpecId.
         */
        public Builder specId(Long specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        /**
         * UsageScenarios.
         */
        public Builder usageScenarios(String usageScenarios) {
            this.putQueryParameter("UsageScenarios", usageScenarios);
            this.usageScenarios = usageScenarios;
            return this;
        }

        @Override
        public PurchaseResourcesRequest build() {
            return new PurchaseResourcesRequest(this);
        } 

    } 

}
