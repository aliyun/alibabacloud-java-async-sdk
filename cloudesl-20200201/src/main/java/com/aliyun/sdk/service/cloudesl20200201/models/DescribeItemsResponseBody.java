// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeItemsResponseBody</p>
 */
public class DescribeItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TemplateSceneId")
    private String templateSceneId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.templateSceneId = builder.templateSceneId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return templateSceneId
     */
    public String getTemplateSceneId() {
        return this.templateSceneId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < Items> items; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private String templateSceneId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TemplateSceneId.
         */
        public Builder templateSceneId(String templateSceneId) {
            this.templateSceneId = templateSceneId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeItemsResponseBody build() {
            return new DescribeItemsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("ActionPrice")
        private Integer actionPrice;

        @NameInMap("BeClearance")
        private Boolean beClearance;

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

        @NameInMap("CustomizeFeatureP")
        private String customizeFeatureP;

        @NameInMap("CustomizeFeatureQ")
        private String customizeFeatureQ;

        @NameInMap("CustomizeFeatureR")
        private String customizeFeatureR;

        @NameInMap("CustomizeFeatureS")
        private String customizeFeatureS;

        @NameInMap("CustomizeFeatureT")
        private String customizeFeatureT;

        @NameInMap("CustomizeFeatureU")
        private String customizeFeatureU;

        @NameInMap("CustomizeFeatureV")
        private String customizeFeatureV;

        @NameInMap("CustomizeFeatureW")
        private String customizeFeatureW;

        @NameInMap("CustomizeFeatureX")
        private String customizeFeatureX;

        @NameInMap("CustomizeFeatureY")
        private String customizeFeatureY;

        @NameInMap("CustomizeFeatureZ")
        private String customizeFeatureZ;

        @NameInMap("EnergyEfficiency")
        private String energyEfficiency;

        @NameInMap("ForestFirstId")
        private String forestFirstId;

        @NameInMap("ForestSecondId")
        private String forestSecondId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InventoryStatus")
        private String inventoryStatus;

        @NameInMap("ItemBarCode")
        private String itemBarCode;

        @NameInMap("ItemId")
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

        private Items(Builder builder) {
            this.actionPrice = builder.actionPrice;
            this.beClearance = builder.beClearance;
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
            this.customizeFeatureP = builder.customizeFeatureP;
            this.customizeFeatureQ = builder.customizeFeatureQ;
            this.customizeFeatureR = builder.customizeFeatureR;
            this.customizeFeatureS = builder.customizeFeatureS;
            this.customizeFeatureT = builder.customizeFeatureT;
            this.customizeFeatureU = builder.customizeFeatureU;
            this.customizeFeatureV = builder.customizeFeatureV;
            this.customizeFeatureW = builder.customizeFeatureW;
            this.customizeFeatureX = builder.customizeFeatureX;
            this.customizeFeatureY = builder.customizeFeatureY;
            this.customizeFeatureZ = builder.customizeFeatureZ;
            this.energyEfficiency = builder.energyEfficiency;
            this.forestFirstId = builder.forestFirstId;
            this.forestSecondId = builder.forestSecondId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
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

        public static Items create() {
            return builder().build();
        }

        /**
         * @return actionPrice
         */
        public Integer getActionPrice() {
            return this.actionPrice;
        }

        /**
         * @return beClearance
         */
        public Boolean getBeClearance() {
            return this.beClearance;
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
         * @return customizeFeatureP
         */
        public String getCustomizeFeatureP() {
            return this.customizeFeatureP;
        }

        /**
         * @return customizeFeatureQ
         */
        public String getCustomizeFeatureQ() {
            return this.customizeFeatureQ;
        }

        /**
         * @return customizeFeatureR
         */
        public String getCustomizeFeatureR() {
            return this.customizeFeatureR;
        }

        /**
         * @return customizeFeatureS
         */
        public String getCustomizeFeatureS() {
            return this.customizeFeatureS;
        }

        /**
         * @return customizeFeatureT
         */
        public String getCustomizeFeatureT() {
            return this.customizeFeatureT;
        }

        /**
         * @return customizeFeatureU
         */
        public String getCustomizeFeatureU() {
            return this.customizeFeatureU;
        }

        /**
         * @return customizeFeatureV
         */
        public String getCustomizeFeatureV() {
            return this.customizeFeatureV;
        }

        /**
         * @return customizeFeatureW
         */
        public String getCustomizeFeatureW() {
            return this.customizeFeatureW;
        }

        /**
         * @return customizeFeatureX
         */
        public String getCustomizeFeatureX() {
            return this.customizeFeatureX;
        }

        /**
         * @return customizeFeatureY
         */
        public String getCustomizeFeatureY() {
            return this.customizeFeatureY;
        }

        /**
         * @return customizeFeatureZ
         */
        public String getCustomizeFeatureZ() {
            return this.customizeFeatureZ;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
            private Boolean beClearance; 
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
            private String customizeFeatureP; 
            private String customizeFeatureQ; 
            private String customizeFeatureR; 
            private String customizeFeatureS; 
            private String customizeFeatureT; 
            private String customizeFeatureU; 
            private String customizeFeatureV; 
            private String customizeFeatureW; 
            private String customizeFeatureX; 
            private String customizeFeatureY; 
            private String customizeFeatureZ; 
            private String energyEfficiency; 
            private String forestFirstId; 
            private String forestSecondId; 
            private String gmtCreate; 
            private String gmtModified; 
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
             * BeClearance.
             */
            public Builder beClearance(Boolean beClearance) {
                this.beClearance = beClearance;
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
             * CustomizeFeatureP.
             */
            public Builder customizeFeatureP(String customizeFeatureP) {
                this.customizeFeatureP = customizeFeatureP;
                return this;
            }

            /**
             * CustomizeFeatureQ.
             */
            public Builder customizeFeatureQ(String customizeFeatureQ) {
                this.customizeFeatureQ = customizeFeatureQ;
                return this;
            }

            /**
             * CustomizeFeatureR.
             */
            public Builder customizeFeatureR(String customizeFeatureR) {
                this.customizeFeatureR = customizeFeatureR;
                return this;
            }

            /**
             * CustomizeFeatureS.
             */
            public Builder customizeFeatureS(String customizeFeatureS) {
                this.customizeFeatureS = customizeFeatureS;
                return this;
            }

            /**
             * CustomizeFeatureT.
             */
            public Builder customizeFeatureT(String customizeFeatureT) {
                this.customizeFeatureT = customizeFeatureT;
                return this;
            }

            /**
             * CustomizeFeatureU.
             */
            public Builder customizeFeatureU(String customizeFeatureU) {
                this.customizeFeatureU = customizeFeatureU;
                return this;
            }

            /**
             * CustomizeFeatureV.
             */
            public Builder customizeFeatureV(String customizeFeatureV) {
                this.customizeFeatureV = customizeFeatureV;
                return this;
            }

            /**
             * CustomizeFeatureW.
             */
            public Builder customizeFeatureW(String customizeFeatureW) {
                this.customizeFeatureW = customizeFeatureW;
                return this;
            }

            /**
             * CustomizeFeatureX.
             */
            public Builder customizeFeatureX(String customizeFeatureX) {
                this.customizeFeatureX = customizeFeatureX;
                return this;
            }

            /**
             * CustomizeFeatureY.
             */
            public Builder customizeFeatureY(String customizeFeatureY) {
                this.customizeFeatureY = customizeFeatureY;
                return this;
            }

            /**
             * CustomizeFeatureZ.
             */
            public Builder customizeFeatureZ(String customizeFeatureZ) {
                this.customizeFeatureZ = customizeFeatureZ;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * SKuID。
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
