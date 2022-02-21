// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchInsertItemsRequest} extends {@link RequestModel}
 *
 * <p>BatchInsertItemsRequest</p>
 */
public class BatchInsertItemsRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("ItemInfo")
    @Validation(required = true)
    private java.util.List < ItemInfo> itemInfo;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    @Body
    @NameInMap("SyncByItemId")
    private Boolean syncByItemId;

    private BatchInsertItemsRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
        this.itemInfo = builder.itemInfo;
        this.storeId = builder.storeId;
        this.syncByItemId = builder.syncByItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchInsertItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return itemInfo
     */
    public java.util.List < ItemInfo> getItemInfo() {
        return this.itemInfo;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return syncByItemId
     */
    public Boolean getSyncByItemId() {
        return this.syncByItemId;
    }

    public static final class Builder extends Request.Builder<BatchInsertItemsRequest, Builder> {
        private String extraParams; 
        private java.util.List < ItemInfo> itemInfo; 
        private String storeId; 
        private Boolean syncByItemId; 

        private Builder() {
            super();
        } 

        private Builder(BatchInsertItemsRequest response) {
            super(response);
            this.extraParams = response.extraParams;
            this.itemInfo = response.itemInfo;
            this.storeId = response.storeId;
            this.syncByItemId = response.syncByItemId;
        } 

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * ItemInfo.
         */
        public Builder itemInfo(java.util.List < ItemInfo> itemInfo) {
            this.putBodyParameter("ItemInfo", itemInfo);
            this.itemInfo = itemInfo;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * SyncByItemId.
         */
        public Builder syncByItemId(Boolean syncByItemId) {
            this.putBodyParameter("SyncByItemId", syncByItemId);
            this.syncByItemId = syncByItemId;
            return this;
        }

        @Override
        public BatchInsertItemsRequest build() {
            return new BatchInsertItemsRequest(this);
        } 

    } 

    public static class ItemInfo extends TeaModel {
        @NameInMap("ActionPrice")
        @Validation(required = true)
        private Integer actionPrice;

        @NameInMap("BeMember")
        private Boolean beMember;

        @NameInMap("BePromotion")
        private Boolean bePromotion;

        @NameInMap("BeSourceCode")
        private Boolean beSourceCode;

        @NameInMap("BrandName")
        private String brandName;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("CustomizeFeatureA")
        private String customizeFeatureA;

        @NameInMap("CustomizeFeatureB")
        private String customizeFeatureB;

        @NameInMap("CustomizeFeatureC")
        private String customizeFeatureC;

        @NameInMap("CustomizeFeatureD")
        private String customizeFeatureD;

        @NameInMap("CustomizeFeatureE")
        private String customizeFeatureE;

        @NameInMap("CustomizeFeatureF")
        private String customizeFeatureF;

        @NameInMap("CustomizeFeatureG")
        private String customizeFeatureG;

        @NameInMap("CustomizeFeatureH")
        private String customizeFeatureH;

        @NameInMap("CustomizeFeatureI")
        private String customizeFeatureI;

        @NameInMap("CustomizeFeatureJ")
        private String customizeFeatureJ;

        @NameInMap("CustomizeFeatureK")
        private String customizeFeatureK;

        @NameInMap("CustomizeFeatureL")
        private String customizeFeatureL;

        @NameInMap("CustomizeFeatureM")
        private String customizeFeatureM;

        @NameInMap("CustomizeFeatureN")
        private String customizeFeatureN;

        @NameInMap("CustomizeFeatureO")
        private String customizeFeatureO;

        @NameInMap("EnergyEfficiency")
        private String energyEfficiency;

        @NameInMap("ForestFirstId")
        private String forestFirstId;

        @NameInMap("ForestSecondId")
        private String forestSecondId;

        @NameInMap("InventoryStatus")
        private String inventoryStatus;

        @NameInMap("ItemBarCode")
        @Validation(required = true)
        private String itemBarCode;

        @NameInMap("ItemId")
        @Validation(required = true)
        private String itemId;

        @NameInMap("ItemInfoIndex")
        private Integer itemInfoIndex;

        @NameInMap("ItemPicUrl")
        private String itemPicUrl;

        @NameInMap("ItemQrCode")
        private String itemQrCode;

        @NameInMap("ItemShortTitle")
        private String itemShortTitle;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        private String itemTitle;

        @NameInMap("Manufacturer")
        private String manufacturer;

        @NameInMap("Material")
        private String material;

        @NameInMap("MemberPrice")
        private Integer memberPrice;

        @NameInMap("ModelNumber")
        private String modelNumber;

        @NameInMap("OriginalPrice")
        private Integer originalPrice;

        @NameInMap("PriceUnit")
        @Validation(required = true)
        private String priceUnit;

        @NameInMap("ProductionPlace")
        private String productionPlace;

        @NameInMap("PromotionEnd")
        private String promotionEnd;

        @NameInMap("PromotionReason")
        private String promotionReason;

        @NameInMap("PromotionStart")
        private String promotionStart;

        @NameInMap("PromotionText")
        private String promotionText;

        @NameInMap("Rank")
        private String rank;

        @NameInMap("SaleSpec")
        private String saleSpec;

        @NameInMap("SalesPrice")
        private Integer salesPrice;

        @NameInMap("SkuId")
        private String skuId;

        @NameInMap("SourceCode")
        private String sourceCode;

        @NameInMap("SuggestPrice")
        private Integer suggestPrice;

        @NameInMap("SupplierName")
        private String supplierName;

        @NameInMap("TaxFee")
        private String taxFee;

        @NameInMap("TemplateSceneId")
        private String templateSceneId;

        private ItemInfo(Builder builder) {
            this.actionPrice = builder.actionPrice;
            this.beMember = builder.beMember;
            this.bePromotion = builder.bePromotion;
            this.beSourceCode = builder.beSourceCode;
            this.brandName = builder.brandName;
            this.categoryName = builder.categoryName;
            this.customizeFeatureA = builder.customizeFeatureA;
            this.customizeFeatureB = builder.customizeFeatureB;
            this.customizeFeatureC = builder.customizeFeatureC;
            this.customizeFeatureD = builder.customizeFeatureD;
            this.customizeFeatureE = builder.customizeFeatureE;
            this.customizeFeatureF = builder.customizeFeatureF;
            this.customizeFeatureG = builder.customizeFeatureG;
            this.customizeFeatureH = builder.customizeFeatureH;
            this.customizeFeatureI = builder.customizeFeatureI;
            this.customizeFeatureJ = builder.customizeFeatureJ;
            this.customizeFeatureK = builder.customizeFeatureK;
            this.customizeFeatureL = builder.customizeFeatureL;
            this.customizeFeatureM = builder.customizeFeatureM;
            this.customizeFeatureN = builder.customizeFeatureN;
            this.customizeFeatureO = builder.customizeFeatureO;
            this.energyEfficiency = builder.energyEfficiency;
            this.forestFirstId = builder.forestFirstId;
            this.forestSecondId = builder.forestSecondId;
            this.inventoryStatus = builder.inventoryStatus;
            this.itemBarCode = builder.itemBarCode;
            this.itemId = builder.itemId;
            this.itemInfoIndex = builder.itemInfoIndex;
            this.itemPicUrl = builder.itemPicUrl;
            this.itemQrCode = builder.itemQrCode;
            this.itemShortTitle = builder.itemShortTitle;
            this.itemTitle = builder.itemTitle;
            this.manufacturer = builder.manufacturer;
            this.material = builder.material;
            this.memberPrice = builder.memberPrice;
            this.modelNumber = builder.modelNumber;
            this.originalPrice = builder.originalPrice;
            this.priceUnit = builder.priceUnit;
            this.productionPlace = builder.productionPlace;
            this.promotionEnd = builder.promotionEnd;
            this.promotionReason = builder.promotionReason;
            this.promotionStart = builder.promotionStart;
            this.promotionText = builder.promotionText;
            this.rank = builder.rank;
            this.saleSpec = builder.saleSpec;
            this.salesPrice = builder.salesPrice;
            this.skuId = builder.skuId;
            this.sourceCode = builder.sourceCode;
            this.suggestPrice = builder.suggestPrice;
            this.supplierName = builder.supplierName;
            this.taxFee = builder.taxFee;
            this.templateSceneId = builder.templateSceneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemInfo create() {
            return builder().build();
        }

        /**
         * @return actionPrice
         */
        public Integer getActionPrice() {
            return this.actionPrice;
        }

        /**
         * @return beMember
         */
        public Boolean getBeMember() {
            return this.beMember;
        }

        /**
         * @return bePromotion
         */
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        /**
         * @return beSourceCode
         */
        public Boolean getBeSourceCode() {
            return this.beSourceCode;
        }

        /**
         * @return brandName
         */
        public String getBrandName() {
            return this.brandName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return customizeFeatureA
         */
        public String getCustomizeFeatureA() {
            return this.customizeFeatureA;
        }

        /**
         * @return customizeFeatureB
         */
        public String getCustomizeFeatureB() {
            return this.customizeFeatureB;
        }

        /**
         * @return customizeFeatureC
         */
        public String getCustomizeFeatureC() {
            return this.customizeFeatureC;
        }

        /**
         * @return customizeFeatureD
         */
        public String getCustomizeFeatureD() {
            return this.customizeFeatureD;
        }

        /**
         * @return customizeFeatureE
         */
        public String getCustomizeFeatureE() {
            return this.customizeFeatureE;
        }

        /**
         * @return customizeFeatureF
         */
        public String getCustomizeFeatureF() {
            return this.customizeFeatureF;
        }

        /**
         * @return customizeFeatureG
         */
        public String getCustomizeFeatureG() {
            return this.customizeFeatureG;
        }

        /**
         * @return customizeFeatureH
         */
        public String getCustomizeFeatureH() {
            return this.customizeFeatureH;
        }

        /**
         * @return customizeFeatureI
         */
        public String getCustomizeFeatureI() {
            return this.customizeFeatureI;
        }

        /**
         * @return customizeFeatureJ
         */
        public String getCustomizeFeatureJ() {
            return this.customizeFeatureJ;
        }

        /**
         * @return customizeFeatureK
         */
        public String getCustomizeFeatureK() {
            return this.customizeFeatureK;
        }

        /**
         * @return customizeFeatureL
         */
        public String getCustomizeFeatureL() {
            return this.customizeFeatureL;
        }

        /**
         * @return customizeFeatureM
         */
        public String getCustomizeFeatureM() {
            return this.customizeFeatureM;
        }

        /**
         * @return customizeFeatureN
         */
        public String getCustomizeFeatureN() {
            return this.customizeFeatureN;
        }

        /**
         * @return customizeFeatureO
         */
        public String getCustomizeFeatureO() {
            return this.customizeFeatureO;
        }

        /**
         * @return energyEfficiency
         */
        public String getEnergyEfficiency() {
            return this.energyEfficiency;
        }

        /**
         * @return forestFirstId
         */
        public String getForestFirstId() {
            return this.forestFirstId;
        }

        /**
         * @return forestSecondId
         */
        public String getForestSecondId() {
            return this.forestSecondId;
        }

        /**
         * @return inventoryStatus
         */
        public String getInventoryStatus() {
            return this.inventoryStatus;
        }

        /**
         * @return itemBarCode
         */
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemInfoIndex
         */
        public Integer getItemInfoIndex() {
            return this.itemInfoIndex;
        }

        /**
         * @return itemPicUrl
         */
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        /**
         * @return itemQrCode
         */
        public String getItemQrCode() {
            return this.itemQrCode;
        }

        /**
         * @return itemShortTitle
         */
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return material
         */
        public String getMaterial() {
            return this.material;
        }

        /**
         * @return memberPrice
         */
        public Integer getMemberPrice() {
            return this.memberPrice;
        }

        /**
         * @return modelNumber
         */
        public String getModelNumber() {
            return this.modelNumber;
        }

        /**
         * @return originalPrice
         */
        public Integer getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return productionPlace
         */
        public String getProductionPlace() {
            return this.productionPlace;
        }

        /**
         * @return promotionEnd
         */
        public String getPromotionEnd() {
            return this.promotionEnd;
        }

        /**
         * @return promotionReason
         */
        public String getPromotionReason() {
            return this.promotionReason;
        }

        /**
         * @return promotionStart
         */
        public String getPromotionStart() {
            return this.promotionStart;
        }

        /**
         * @return promotionText
         */
        public String getPromotionText() {
            return this.promotionText;
        }

        /**
         * @return rank
         */
        public String getRank() {
            return this.rank;
        }

        /**
         * @return saleSpec
         */
        public String getSaleSpec() {
            return this.saleSpec;
        }

        /**
         * @return salesPrice
         */
        public Integer getSalesPrice() {
            return this.salesPrice;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        /**
         * @return sourceCode
         */
        public String getSourceCode() {
            return this.sourceCode;
        }

        /**
         * @return suggestPrice
         */
        public Integer getSuggestPrice() {
            return this.suggestPrice;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return taxFee
         */
        public String getTaxFee() {
            return this.taxFee;
        }

        /**
         * @return templateSceneId
         */
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

        public static final class Builder {
            private Integer actionPrice; 
            private Boolean beMember; 
            private Boolean bePromotion; 
            private Boolean beSourceCode; 
            private String brandName; 
            private String categoryName; 
            private String customizeFeatureA; 
            private String customizeFeatureB; 
            private String customizeFeatureC; 
            private String customizeFeatureD; 
            private String customizeFeatureE; 
            private String customizeFeatureF; 
            private String customizeFeatureG; 
            private String customizeFeatureH; 
            private String customizeFeatureI; 
            private String customizeFeatureJ; 
            private String customizeFeatureK; 
            private String customizeFeatureL; 
            private String customizeFeatureM; 
            private String customizeFeatureN; 
            private String customizeFeatureO; 
            private String energyEfficiency; 
            private String forestFirstId; 
            private String forestSecondId; 
            private String inventoryStatus; 
            private String itemBarCode; 
            private String itemId; 
            private Integer itemInfoIndex; 
            private String itemPicUrl; 
            private String itemQrCode; 
            private String itemShortTitle; 
            private String itemTitle; 
            private String manufacturer; 
            private String material; 
            private Integer memberPrice; 
            private String modelNumber; 
            private Integer originalPrice; 
            private String priceUnit; 
            private String productionPlace; 
            private String promotionEnd; 
            private String promotionReason; 
            private String promotionStart; 
            private String promotionText; 
            private String rank; 
            private String saleSpec; 
            private Integer salesPrice; 
            private String skuId; 
            private String sourceCode; 
            private Integer suggestPrice; 
            private String supplierName; 
            private String taxFee; 
            private String templateSceneId; 

            /**
             * ActionPrice.
             */
            public Builder actionPrice(Integer actionPrice) {
                this.actionPrice = actionPrice;
                return this;
            }

            /**
             * BeMember.
             */
            public Builder beMember(Boolean beMember) {
                this.beMember = beMember;
                return this;
            }

            /**
             * BePromotion.
             */
            public Builder bePromotion(Boolean bePromotion) {
                this.bePromotion = bePromotion;
                return this;
            }

            /**
             * BeSourceCode.
             */
            public Builder beSourceCode(Boolean beSourceCode) {
                this.beSourceCode = beSourceCode;
                return this;
            }

            /**
             * BrandName.
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CustomizeFeatureA.
             */
            public Builder customizeFeatureA(String customizeFeatureA) {
                this.customizeFeatureA = customizeFeatureA;
                return this;
            }

            /**
             * CustomizeFeatureB.
             */
            public Builder customizeFeatureB(String customizeFeatureB) {
                this.customizeFeatureB = customizeFeatureB;
                return this;
            }

            /**
             * CustomizeFeatureC.
             */
            public Builder customizeFeatureC(String customizeFeatureC) {
                this.customizeFeatureC = customizeFeatureC;
                return this;
            }

            /**
             * CustomizeFeatureD.
             */
            public Builder customizeFeatureD(String customizeFeatureD) {
                this.customizeFeatureD = customizeFeatureD;
                return this;
            }

            /**
             * CustomizeFeatureE.
             */
            public Builder customizeFeatureE(String customizeFeatureE) {
                this.customizeFeatureE = customizeFeatureE;
                return this;
            }

            /**
             * CustomizeFeatureF.
             */
            public Builder customizeFeatureF(String customizeFeatureF) {
                this.customizeFeatureF = customizeFeatureF;
                return this;
            }

            /**
             * CustomizeFeatureG.
             */
            public Builder customizeFeatureG(String customizeFeatureG) {
                this.customizeFeatureG = customizeFeatureG;
                return this;
            }

            /**
             * CustomizeFeatureH.
             */
            public Builder customizeFeatureH(String customizeFeatureH) {
                this.customizeFeatureH = customizeFeatureH;
                return this;
            }

            /**
             * CustomizeFeatureI.
             */
            public Builder customizeFeatureI(String customizeFeatureI) {
                this.customizeFeatureI = customizeFeatureI;
                return this;
            }

            /**
             * CustomizeFeatureJ.
             */
            public Builder customizeFeatureJ(String customizeFeatureJ) {
                this.customizeFeatureJ = customizeFeatureJ;
                return this;
            }

            /**
             * CustomizeFeatureK.
             */
            public Builder customizeFeatureK(String customizeFeatureK) {
                this.customizeFeatureK = customizeFeatureK;
                return this;
            }

            /**
             * CustomizeFeatureL.
             */
            public Builder customizeFeatureL(String customizeFeatureL) {
                this.customizeFeatureL = customizeFeatureL;
                return this;
            }

            /**
             * CustomizeFeatureM.
             */
            public Builder customizeFeatureM(String customizeFeatureM) {
                this.customizeFeatureM = customizeFeatureM;
                return this;
            }

            /**
             * CustomizeFeatureN.
             */
            public Builder customizeFeatureN(String customizeFeatureN) {
                this.customizeFeatureN = customizeFeatureN;
                return this;
            }

            /**
             * CustomizeFeatureO.
             */
            public Builder customizeFeatureO(String customizeFeatureO) {
                this.customizeFeatureO = customizeFeatureO;
                return this;
            }

            /**
             * EnergyEfficiency.
             */
            public Builder energyEfficiency(String energyEfficiency) {
                this.energyEfficiency = energyEfficiency;
                return this;
            }

            /**
             * ForestFirstId.
             */
            public Builder forestFirstId(String forestFirstId) {
                this.forestFirstId = forestFirstId;
                return this;
            }

            /**
             * ForestSecondId.
             */
            public Builder forestSecondId(String forestSecondId) {
                this.forestSecondId = forestSecondId;
                return this;
            }

            /**
             * InventoryStatus.
             */
            public Builder inventoryStatus(String inventoryStatus) {
                this.inventoryStatus = inventoryStatus;
                return this;
            }

            /**
             * ItemBarCode.
             */
            public Builder itemBarCode(String itemBarCode) {
                this.itemBarCode = itemBarCode;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemInfoIndex.
             */
            public Builder itemInfoIndex(Integer itemInfoIndex) {
                this.itemInfoIndex = itemInfoIndex;
                return this;
            }

            /**
             * ItemPicUrl.
             */
            public Builder itemPicUrl(String itemPicUrl) {
                this.itemPicUrl = itemPicUrl;
                return this;
            }

            /**
             * ItemQrCode.
             */
            public Builder itemQrCode(String itemQrCode) {
                this.itemQrCode = itemQrCode;
                return this;
            }

            /**
             * ItemShortTitle.
             */
            public Builder itemShortTitle(String itemShortTitle) {
                this.itemShortTitle = itemShortTitle;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * Material.
             */
            public Builder material(String material) {
                this.material = material;
                return this;
            }

            /**
             * MemberPrice.
             */
            public Builder memberPrice(Integer memberPrice) {
                this.memberPrice = memberPrice;
                return this;
            }

            /**
             * ModelNumber.
             */
            public Builder modelNumber(String modelNumber) {
                this.modelNumber = modelNumber;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Integer originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * ProductionPlace.
             */
            public Builder productionPlace(String productionPlace) {
                this.productionPlace = productionPlace;
                return this;
            }

            /**
             * PromotionEnd.
             */
            public Builder promotionEnd(String promotionEnd) {
                this.promotionEnd = promotionEnd;
                return this;
            }

            /**
             * PromotionReason.
             */
            public Builder promotionReason(String promotionReason) {
                this.promotionReason = promotionReason;
                return this;
            }

            /**
             * PromotionStart.
             */
            public Builder promotionStart(String promotionStart) {
                this.promotionStart = promotionStart;
                return this;
            }

            /**
             * PromotionText.
             */
            public Builder promotionText(String promotionText) {
                this.promotionText = promotionText;
                return this;
            }

            /**
             * Rank.
             */
            public Builder rank(String rank) {
                this.rank = rank;
                return this;
            }

            /**
             * SaleSpec.
             */
            public Builder saleSpec(String saleSpec) {
                this.saleSpec = saleSpec;
                return this;
            }

            /**
             * SalesPrice.
             */
            public Builder salesPrice(Integer salesPrice) {
                this.salesPrice = salesPrice;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SourceCode.
             */
            public Builder sourceCode(String sourceCode) {
                this.sourceCode = sourceCode;
                return this;
            }

            /**
             * SuggestPrice.
             */
            public Builder suggestPrice(Integer suggestPrice) {
                this.suggestPrice = suggestPrice;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * TaxFee.
             */
            public Builder taxFee(String taxFee) {
                this.taxFee = taxFee;
                return this;
            }

            /**
             * TemplateSceneId.
             */
            public Builder templateSceneId(String templateSceneId) {
                this.templateSceneId = templateSceneId;
                return this;
            }

            public ItemInfo build() {
                return new ItemInfo(this);
            } 

        } 

    }
}
