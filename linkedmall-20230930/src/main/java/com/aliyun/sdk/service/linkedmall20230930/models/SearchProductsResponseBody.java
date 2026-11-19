// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchProductsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchProductsResponseBody</p>
 */
public class SearchProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private String nextCursor;

    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<Products> products;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private SearchProductsResponseBody(Builder builder) {
        this.nextCursor = builder.nextCursor;
        this.products = builder.products;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextCursor
     */
    public String getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return products
     */
    public java.util.List<Products> getProducts() {
        return this.products;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String nextCursor; 
        private java.util.List<Products> products; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(SearchProductsResponseBody model) {
            this.nextCursor = model.nextCursor;
            this.products = model.products;
            this.total = model.total;
        } 

        /**
         * <p>The cursor for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>899192313AB192938441CCW</p>
         */
        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>The product collection.</p>
         */
        public Builder products(java.util.List<Products> products) {
            this.products = products;
            return this;
        }

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public SearchProductsResponseBody build() {
            return new SearchProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchProductsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchProductsResponseBody</p>
     */
    public static class CategoryChain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("categoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("isLeaf")
        private Boolean isLeaf;

        @com.aliyun.core.annotation.NameInMap("level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private Long parentId;

        private CategoryChain(Builder builder) {
            this.categoryId = builder.categoryId;
            this.isLeaf = builder.isLeaf;
            this.level = builder.level;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryChain create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return isLeaf
         */
        public Boolean getIsLeaf() {
            return this.isLeaf;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long categoryId; 
            private Boolean isLeaf; 
            private Integer level; 
            private String name; 
            private Long parentId; 

            private Builder() {
            } 

            private Builder(CategoryChain model) {
                this.categoryId = model.categoryId;
                this.isLeaf = model.isLeaf;
                this.level = model.level;
                this.name = model.name;
                this.parentId = model.parentId;
            } 

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>201792301</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>Indicates whether the node is a leaf node.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isLeaf(Boolean isLeaf) {
                this.isLeaf = isLeaf;
                return this;
            }

            /**
             * <p>The level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Name test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parent category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public CategoryChain build() {
                return new CategoryChain(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchProductsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchProductsResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bandName")
        private String bandName;

        @com.aliyun.core.annotation.NameInMap("canNotSellReason")
        private String canNotSellReason;

        @com.aliyun.core.annotation.NameInMap("canSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("categoryChain")
        private java.util.List<CategoryChain> categoryChain;

        @com.aliyun.core.annotation.NameInMap("credit")
        private java.util.List<String> credit;

        @com.aliyun.core.annotation.NameInMap("diffPrice")
        private String diffPrice;

        @com.aliyun.core.annotation.NameInMap("distributionPrice")
        private String distributionPrice;

        @com.aliyun.core.annotation.NameInMap("distributionPriceRatio")
        private String distributionPriceRatio;

        @com.aliyun.core.annotation.NameInMap("externalPlatformType")
        private String externalPlatformType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("inGroup")
        private Boolean inGroup;

        @com.aliyun.core.annotation.NameInMap("inGroupTime")
        private String inGroupTime;

        @com.aliyun.core.annotation.NameInMap("inventoryRiskLevel")
        private String inventoryRiskLevel;

        @com.aliyun.core.annotation.NameInMap("invoiceType")
        private String invoiceType;

        @com.aliyun.core.annotation.NameInMap("lmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("picUrl")
        private String picUrl;

        @com.aliyun.core.annotation.NameInMap("platformPrice")
        private String platformPrice;

        @com.aliyun.core.annotation.NameInMap("platformReservePrice")
        private String platformReservePrice;

        @com.aliyun.core.annotation.NameInMap("productId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("shopName")
        private String shopName;

        @com.aliyun.core.annotation.NameInMap("soldQuantity")
        private String soldQuantity;

        @com.aliyun.core.annotation.NameInMap("taxCode")
        private String taxCode;

        @com.aliyun.core.annotation.NameInMap("taxRate")
        private Long taxRate;

        @com.aliyun.core.annotation.NameInMap("tradeMode")
        private String tradeMode;

        private Products(Builder builder) {
            this.bandName = builder.bandName;
            this.canNotSellReason = builder.canNotSellReason;
            this.canSell = builder.canSell;
            this.categoryChain = builder.categoryChain;
            this.credit = builder.credit;
            this.diffPrice = builder.diffPrice;
            this.distributionPrice = builder.distributionPrice;
            this.distributionPriceRatio = builder.distributionPriceRatio;
            this.externalPlatformType = builder.externalPlatformType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.inGroup = builder.inGroup;
            this.inGroupTime = builder.inGroupTime;
            this.inventoryRiskLevel = builder.inventoryRiskLevel;
            this.invoiceType = builder.invoiceType;
            this.lmItemId = builder.lmItemId;
            this.picUrl = builder.picUrl;
            this.platformPrice = builder.platformPrice;
            this.platformReservePrice = builder.platformReservePrice;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.shopName = builder.shopName;
            this.soldQuantity = builder.soldQuantity;
            this.taxCode = builder.taxCode;
            this.taxRate = builder.taxRate;
            this.tradeMode = builder.tradeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return bandName
         */
        public String getBandName() {
            return this.bandName;
        }

        /**
         * @return canNotSellReason
         */
        public String getCanNotSellReason() {
            return this.canNotSellReason;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return categoryChain
         */
        public java.util.List<CategoryChain> getCategoryChain() {
            return this.categoryChain;
        }

        /**
         * @return credit
         */
        public java.util.List<String> getCredit() {
            return this.credit;
        }

        /**
         * @return diffPrice
         */
        public String getDiffPrice() {
            return this.diffPrice;
        }

        /**
         * @return distributionPrice
         */
        public String getDistributionPrice() {
            return this.distributionPrice;
        }

        /**
         * @return distributionPriceRatio
         */
        public String getDistributionPriceRatio() {
            return this.distributionPriceRatio;
        }

        /**
         * @return externalPlatformType
         */
        public String getExternalPlatformType() {
            return this.externalPlatformType;
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
         * @return inGroup
         */
        public Boolean getInGroup() {
            return this.inGroup;
        }

        /**
         * @return inGroupTime
         */
        public String getInGroupTime() {
            return this.inGroupTime;
        }

        /**
         * @return inventoryRiskLevel
         */
        public String getInventoryRiskLevel() {
            return this.inventoryRiskLevel;
        }

        /**
         * @return invoiceType
         */
        public String getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return platformPrice
         */
        public String getPlatformPrice() {
            return this.platformPrice;
        }

        /**
         * @return platformReservePrice
         */
        public String getPlatformReservePrice() {
            return this.platformReservePrice;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        /**
         * @return soldQuantity
         */
        public String getSoldQuantity() {
            return this.soldQuantity;
        }

        /**
         * @return taxCode
         */
        public String getTaxCode() {
            return this.taxCode;
        }

        /**
         * @return taxRate
         */
        public Long getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return tradeMode
         */
        public String getTradeMode() {
            return this.tradeMode;
        }

        public static final class Builder {
            private String bandName; 
            private String canNotSellReason; 
            private Boolean canSell; 
            private java.util.List<CategoryChain> categoryChain; 
            private java.util.List<String> credit; 
            private String diffPrice; 
            private String distributionPrice; 
            private String distributionPriceRatio; 
            private String externalPlatformType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean inGroup; 
            private String inGroupTime; 
            private String inventoryRiskLevel; 
            private String invoiceType; 
            private String lmItemId; 
            private String picUrl; 
            private String platformPrice; 
            private String platformReservePrice; 
            private String productId; 
            private String productName; 
            private String shopName; 
            private String soldQuantity; 
            private String taxCode; 
            private Long taxRate; 
            private String tradeMode; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.bandName = model.bandName;
                this.canNotSellReason = model.canNotSellReason;
                this.canSell = model.canSell;
                this.categoryChain = model.categoryChain;
                this.credit = model.credit;
                this.diffPrice = model.diffPrice;
                this.distributionPrice = model.distributionPrice;
                this.distributionPriceRatio = model.distributionPriceRatio;
                this.externalPlatformType = model.externalPlatformType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.inGroup = model.inGroup;
                this.inGroupTime = model.inGroupTime;
                this.inventoryRiskLevel = model.inventoryRiskLevel;
                this.invoiceType = model.invoiceType;
                this.lmItemId = model.lmItemId;
                this.picUrl = model.picUrl;
                this.platformPrice = model.platformPrice;
                this.platformReservePrice = model.platformReservePrice;
                this.productId = model.productId;
                this.productName = model.productName;
                this.shopName = model.shopName;
                this.soldQuantity = model.soldQuantity;
                this.taxCode = model.taxCode;
                this.taxRate = model.taxRate;
                this.tradeMode = model.tradeMode;
            } 

            /**
             * <p>The brand name.</p>
             * 
             * <strong>example:</strong>
             * <p>Plants</p>
             */
            public Builder bandName(String bandName) {
                this.bandName = bandName;
                return this;
            }

            /**
             * <p>The reason why the product is unavailable for sale.</p>
             * 
             * <strong>example:</strong>
             * <p>Insufficient inventory</p>
             */
            public Builder canNotSellReason(String canNotSellReason) {
                this.canNotSellReason = canNotSellReason;
                return this;
            }

            /**
             * <p>Indicates whether the product is available for sale. This is a calculated value.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * <p>The category chain.</p>
             */
            public Builder categoryChain(java.util.List<CategoryChain> categoryChain) {
                this.categoryChain = categoryChain;
                return this;
            }

            /**
             * <p>The billing cycle.</p>
             */
            public Builder credit(java.util.List<String> credit) {
                this.credit = credit;
                return this;
            }

            /**
             * <p>The price difference range.</p>
             * 
             * <strong>example:</strong>
             * <p>￥-9998.95 ~ ￥-9977.90</p>
             */
            public Builder diffPrice(String diffPrice) {
                this.diffPrice = diffPrice;
                return this;
            }

            /**
             * <p>The distribution purchase price range.</p>
             * 
             * <strong>example:</strong>
             * <p>￥0.05 ~ ￥21.10</p>
             */
            public Builder distributionPrice(String distributionPrice) {
                this.distributionPrice = distributionPrice;
                return this;
            }

            /**
             * <p>The distribution premium rate range.</p>
             * 
             * <strong>example:</strong>
             * <p>-100.00% ~ -99.79%</p>
             */
            public Builder distributionPriceRatio(String distributionPriceRatio) {
                this.distributionPriceRatio = distributionPriceRatio;
                return this;
            }

            /**
             * <p>The source platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Taobao (sourced from Taobao)
             * Tmall (sourced from Tmall)
             * Cbu (sourced from the 1688 distribution platform)</p>
             */
            public Builder externalPlatformType(String externalPlatformType) {
                this.externalPlatformType = externalPlatformType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-02 12:23:34
             * (yyyy-MM-dd HH:mm:ss)</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-02 12:23:34
             * (yyyy-MM-dd HH:mm:ss)</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Specifies whether the product is added to the inventory.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder inGroup(Boolean inGroup) {
                this.inGroup = inGroup;
                return this;
            }

            /**
             * <p>The time when the product was added to the inventory. The format is yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-02 12:23:34
             * (yyyy-MM-dd HH:mm:ss)</p>
             */
            public Builder inGroupTime(String inGroupTime) {
                this.inGroupTime = inGroupTime;
                return this;
            }

            /**
             * <p>The inventory risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>Low</p>
             */
            public Builder inventoryRiskLevel(String inventoryRiskLevel) {
                this.inventoryRiskLevel = inventoryRiskLevel;
                return this;
            }

            /**
             * <p>The invoice type.</p>
             * 
             * <strong>example:</strong>
             * <p>HasInvoice</p>
             */
            public Builder invoiceType(String invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * <p>The LM product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx-xxxxx</p>
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * <p>The main image URL of the product.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/xxx.jpg">https://img.alicdn.com/xxx.jpg</a></p>
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * <p>The suggested retail price range.</p>
             * 
             * <strong>example:</strong>
             * <p>￥9999.00 ~ ￥9999.00</p>
             */
            public Builder platformPrice(String platformPrice) {
                this.platformPrice = platformPrice;
                return this;
            }

            /**
             * <p>The strikethrough price range.</p>
             * 
             * <strong>example:</strong>
             * <p>￥9999.00 ~ ￥9999.00</p>
             */
            public Builder platformReservePrice(String platformReservePrice) {
                this.platformReservePrice = platformReservePrice;
                return this;
            }

            /**
             * <p>The product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>Plants</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The channel store name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder shopName(String shopName) {
                this.shopName = shopName;
                return this;
            }

            /**
             * <p>The cumulative sales volume.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder soldQuantity(String soldQuantity) {
                this.soldQuantity = soldQuantity;
                return this;
            }

            /**
             * <p>The tax code.</p>
             * 
             * <strong>example:</strong>
             * <p>3040203000000000000</p>
             */
            public Builder taxCode(String taxCode) {
                this.taxCode = taxCode;
                return this;
            }

            /**
             * <p>The tax rate.</p>
             * 
             * <strong>example:</strong>
             * <p>600 (6%)
             * -100 (Tax-exempt)</p>
             */
            public Builder taxRate(Long taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * <p>The sales mode.</p>
             * 
             * <strong>example:</strong>
             * <p>JingXiao</p>
             */
            public Builder tradeMode(String tradeMode) {
                this.tradeMode = tradeMode;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
