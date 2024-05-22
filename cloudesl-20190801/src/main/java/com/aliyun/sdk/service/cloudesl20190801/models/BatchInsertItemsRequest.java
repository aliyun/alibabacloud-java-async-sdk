// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchInsertItemsRequest} extends {@link RequestModel}
 *
 * <p>BatchInsertItemsRequest</p>
 */
public class BatchInsertItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ItemInfo> itemInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private BatchInsertItemsRequest(Builder builder) {
        super(builder);
        this.itemInfo = builder.itemInfo;
        this.storeId = builder.storeId;
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

    public static final class Builder extends Request.Builder<BatchInsertItemsRequest, Builder> {
        private java.util.List < ItemInfo> itemInfo; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(BatchInsertItemsRequest request) {
            super(request);
            this.itemInfo = request.itemInfo;
            this.storeId = request.storeId;
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

        @Override
        public BatchInsertItemsRequest build() {
            return new BatchInsertItemsRequest(this);
        } 

    } 

    public static class ItemInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionPrice")
        private Integer actionPrice;

        @com.aliyun.core.annotation.NameInMap("BePromotion")
        private Boolean bePromotion;

        @com.aliyun.core.annotation.NameInMap("BeSourceCode")
        private Boolean beSourceCode;

        @com.aliyun.core.annotation.NameInMap("BrandName")
        private String brandName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CompanyId")
        private String companyId;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureA")
        private String customizeFeatureA;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureB")
        private String customizeFeatureB;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureC")
        private String customizeFeatureC;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureD")
        private String customizeFeatureD;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureE")
        private String customizeFeatureE;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureF")
        private String customizeFeatureF;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureG")
        private String customizeFeatureG;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureH")
        private String customizeFeatureH;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureI")
        private String customizeFeatureI;

        @com.aliyun.core.annotation.NameInMap("CustomizeFeatureJ")
        private String customizeFeatureJ;

        @com.aliyun.core.annotation.NameInMap("EnergyEfficiency")
        private String energyEfficiency;

        @com.aliyun.core.annotation.NameInMap("ExtraAttribute")
        private String extraAttribute;

        @com.aliyun.core.annotation.NameInMap("ForestFirstId")
        private String forestFirstId;

        @com.aliyun.core.annotation.NameInMap("ForestSecondId")
        private String forestSecondId;

        @com.aliyun.core.annotation.NameInMap("ItemBarCode")
        private String itemBarCode;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemInfoIndex")
        private Integer itemInfoIndex;

        @com.aliyun.core.annotation.NameInMap("ItemQrCode")
        private String itemQrCode;

        @com.aliyun.core.annotation.NameInMap("ItemShortTitle")
        private String itemShortTitle;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("MemberPrice")
        private Integer memberPrice;

        @com.aliyun.core.annotation.NameInMap("ModelNumber")
        private String modelNumber;

        @com.aliyun.core.annotation.NameInMap("OptionGroups")
        private String optionGroups;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Integer originalPrice;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("ProductionPlace")
        private String productionPlace;

        @com.aliyun.core.annotation.NameInMap("PromotionEnd")
        private String promotionEnd;

        @com.aliyun.core.annotation.NameInMap("PromotionReason")
        private String promotionReason;

        @com.aliyun.core.annotation.NameInMap("PromotionStart")
        private String promotionStart;

        @com.aliyun.core.annotation.NameInMap("PromotionText")
        private String promotionText;

        @com.aliyun.core.annotation.NameInMap("Rank")
        private String rank;

        @com.aliyun.core.annotation.NameInMap("SaleSpec")
        private String saleSpec;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        @com.aliyun.core.annotation.NameInMap("SourceCode")
        private String sourceCode;

        @com.aliyun.core.annotation.NameInMap("StoreId")
        private String storeId;

        @com.aliyun.core.annotation.NameInMap("SuggestPrice")
        private Integer suggestPrice;

        private ItemInfo(Builder builder) {
            this.actionPrice = builder.actionPrice;
            this.bePromotion = builder.bePromotion;
            this.beSourceCode = builder.beSourceCode;
            this.brandName = builder.brandName;
            this.categoryName = builder.categoryName;
            this.companyId = builder.companyId;
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
            this.energyEfficiency = builder.energyEfficiency;
            this.extraAttribute = builder.extraAttribute;
            this.forestFirstId = builder.forestFirstId;
            this.forestSecondId = builder.forestSecondId;
            this.itemBarCode = builder.itemBarCode;
            this.itemId = builder.itemId;
            this.itemInfoIndex = builder.itemInfoIndex;
            this.itemQrCode = builder.itemQrCode;
            this.itemShortTitle = builder.itemShortTitle;
            this.itemTitle = builder.itemTitle;
            this.memberPrice = builder.memberPrice;
            this.modelNumber = builder.modelNumber;
            this.optionGroups = builder.optionGroups;
            this.originalPrice = builder.originalPrice;
            this.priceUnit = builder.priceUnit;
            this.productionPlace = builder.productionPlace;
            this.promotionEnd = builder.promotionEnd;
            this.promotionReason = builder.promotionReason;
            this.promotionStart = builder.promotionStart;
            this.promotionText = builder.promotionText;
            this.rank = builder.rank;
            this.saleSpec = builder.saleSpec;
            this.skuId = builder.skuId;
            this.sourceCode = builder.sourceCode;
            this.storeId = builder.storeId;
            this.suggestPrice = builder.suggestPrice;
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
         * @return companyId
         */
        public String getCompanyId() {
            return this.companyId;
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
         * @return energyEfficiency
         */
        public String getEnergyEfficiency() {
            return this.energyEfficiency;
        }

        /**
         * @return extraAttribute
         */
        public String getExtraAttribute() {
            return this.extraAttribute;
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
         * @return itemBarCode
         */
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemInfoIndex
         */
        public Integer getItemInfoIndex() {
            return this.itemInfoIndex;
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
         * @return optionGroups
         */
        public String getOptionGroups() {
            return this.optionGroups;
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
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        /**
         * @return suggestPrice
         */
        public Integer getSuggestPrice() {
            return this.suggestPrice;
        }

        public static final class Builder {
            private Integer actionPrice; 
            private Boolean bePromotion; 
            private Boolean beSourceCode; 
            private String brandName; 
            private String categoryName; 
            private String companyId; 
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
            private String energyEfficiency; 
            private String extraAttribute; 
            private String forestFirstId; 
            private String forestSecondId; 
            private String itemBarCode; 
            private Long itemId; 
            private Integer itemInfoIndex; 
            private String itemQrCode; 
            private String itemShortTitle; 
            private String itemTitle; 
            private Integer memberPrice; 
            private String modelNumber; 
            private String optionGroups; 
            private Integer originalPrice; 
            private String priceUnit; 
            private String productionPlace; 
            private String promotionEnd; 
            private String promotionReason; 
            private String promotionStart; 
            private String promotionText; 
            private String rank; 
            private String saleSpec; 
            private String skuId; 
            private String sourceCode; 
            private String storeId; 
            private Integer suggestPrice; 

            /**
             * ActionPrice.
             */
            public Builder actionPrice(Integer actionPrice) {
                this.actionPrice = actionPrice;
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
             * CompanyId.
             */
            public Builder companyId(String companyId) {
                this.companyId = companyId;
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
             * EnergyEfficiency.
             */
            public Builder energyEfficiency(String energyEfficiency) {
                this.energyEfficiency = energyEfficiency;
                return this;
            }

            /**
             * ExtraAttribute.
             */
            public Builder extraAttribute(String extraAttribute) {
                this.extraAttribute = extraAttribute;
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
             * ItemBarCode.
             */
            public Builder itemBarCode(String itemBarCode) {
                this.itemBarCode = itemBarCode;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
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
             * OptionGroups.
             */
            public Builder optionGroups(String optionGroups) {
                this.optionGroups = optionGroups;
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
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * SuggestPrice.
             */
            public Builder suggestPrice(Integer suggestPrice) {
                this.suggestPrice = suggestPrice;
                return this;
            }

            public ItemInfo build() {
                return new ItemInfo(this);
            } 

        } 

    }
}
