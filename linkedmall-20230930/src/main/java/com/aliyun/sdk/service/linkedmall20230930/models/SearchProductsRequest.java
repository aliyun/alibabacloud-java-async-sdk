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
 * {@link SearchProductsRequest} extends {@link RequestModel}
 *
 * <p>SearchProductsRequest</p>
 */
public class SearchProductsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("brandName")
    private String brandName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("categoryIds")
    private java.util.List<String> categoryIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createEndTime")
    private String createEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createStartTime")
    private String createStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("distributionHighPrice")
    private Long distributionHighPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("distributionHighPriceRatio")
    private Long distributionHighPriceRatio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("distributionLowPrice")
    private Long distributionLowPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("distributionLowPriceRatio")
    private Long distributionLowPriceRatio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("highMarkPrice")
    private Long highMarkPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("highPrice")
    private Long highPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inGroup")
    private Boolean inGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inGroupEndTime")
    private String inGroupEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inGroupStartTime")
    private String inGroupStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inventoryRiskLevel")
    private String inventoryRiskLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("lmItemId")
    private String lmItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("lowMarkPrice")
    private Long lowMarkPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("lowPrice")
    private Long lowPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modifyEndTime")
    private String modifyEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modifyStartTime")
    private String modifyStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productStatus")
    private String productStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("purchaserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String purchaserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taxRate")
    private String taxRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tradeModeAndCredit")
    private String tradeModeAndCredit;

    private SearchProductsRequest(Builder builder) {
        super(builder);
        this.brandName = builder.brandName;
        this.categoryIds = builder.categoryIds;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.cursor = builder.cursor;
        this.distributionHighPrice = builder.distributionHighPrice;
        this.distributionHighPriceRatio = builder.distributionHighPriceRatio;
        this.distributionLowPrice = builder.distributionLowPrice;
        this.distributionLowPriceRatio = builder.distributionLowPriceRatio;
        this.highMarkPrice = builder.highMarkPrice;
        this.highPrice = builder.highPrice;
        this.inGroup = builder.inGroup;
        this.inGroupEndTime = builder.inGroupEndTime;
        this.inGroupStartTime = builder.inGroupStartTime;
        this.inventoryRiskLevel = builder.inventoryRiskLevel;
        this.lmItemId = builder.lmItemId;
        this.lowMarkPrice = builder.lowMarkPrice;
        this.lowPrice = builder.lowPrice;
        this.modifyEndTime = builder.modifyEndTime;
        this.modifyStartTime = builder.modifyStartTime;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.platform = builder.platform;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.productStatus = builder.productStatus;
        this.purchaserId = builder.purchaserId;
        this.taxRate = builder.taxRate;
        this.tradeModeAndCredit = builder.tradeModeAndCredit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return categoryIds
     */
    public java.util.List<String> getCategoryIds() {
        return this.categoryIds;
    }

    /**
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return distributionHighPrice
     */
    public Long getDistributionHighPrice() {
        return this.distributionHighPrice;
    }

    /**
     * @return distributionHighPriceRatio
     */
    public Long getDistributionHighPriceRatio() {
        return this.distributionHighPriceRatio;
    }

    /**
     * @return distributionLowPrice
     */
    public Long getDistributionLowPrice() {
        return this.distributionLowPrice;
    }

    /**
     * @return distributionLowPriceRatio
     */
    public Long getDistributionLowPriceRatio() {
        return this.distributionLowPriceRatio;
    }

    /**
     * @return highMarkPrice
     */
    public Long getHighMarkPrice() {
        return this.highMarkPrice;
    }

    /**
     * @return highPrice
     */
    public Long getHighPrice() {
        return this.highPrice;
    }

    /**
     * @return inGroup
     */
    public Boolean getInGroup() {
        return this.inGroup;
    }

    /**
     * @return inGroupEndTime
     */
    public String getInGroupEndTime() {
        return this.inGroupEndTime;
    }

    /**
     * @return inGroupStartTime
     */
    public String getInGroupStartTime() {
        return this.inGroupStartTime;
    }

    /**
     * @return inventoryRiskLevel
     */
    public String getInventoryRiskLevel() {
        return this.inventoryRiskLevel;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return lowMarkPrice
     */
    public Long getLowMarkPrice() {
        return this.lowMarkPrice;
    }

    /**
     * @return lowPrice
     */
    public Long getLowPrice() {
        return this.lowPrice;
    }

    /**
     * @return modifyEndTime
     */
    public String getModifyEndTime() {
        return this.modifyEndTime;
    }

    /**
     * @return modifyStartTime
     */
    public String getModifyStartTime() {
        return this.modifyStartTime;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
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
     * @return productStatus
     */
    public String getProductStatus() {
        return this.productStatus;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    /**
     * @return taxRate
     */
    public String getTaxRate() {
        return this.taxRate;
    }

    /**
     * @return tradeModeAndCredit
     */
    public String getTradeModeAndCredit() {
        return this.tradeModeAndCredit;
    }

    public static final class Builder extends Request.Builder<SearchProductsRequest, Builder> {
        private String brandName; 
        private java.util.List<String> categoryIds; 
        private String createEndTime; 
        private String createStartTime; 
        private String cursor; 
        private Long distributionHighPrice; 
        private Long distributionHighPriceRatio; 
        private Long distributionLowPrice; 
        private Long distributionLowPriceRatio; 
        private Long highMarkPrice; 
        private Long highPrice; 
        private Boolean inGroup; 
        private String inGroupEndTime; 
        private String inGroupStartTime; 
        private String inventoryRiskLevel; 
        private String lmItemId; 
        private Long lowMarkPrice; 
        private Long lowPrice; 
        private String modifyEndTime; 
        private String modifyStartTime; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String platform; 
        private String productId; 
        private String productName; 
        private String productStatus; 
        private String purchaserId; 
        private String taxRate; 
        private String tradeModeAndCredit; 

        private Builder() {
            super();
        } 

        private Builder(SearchProductsRequest request) {
            super(request);
            this.brandName = request.brandName;
            this.categoryIds = request.categoryIds;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.cursor = request.cursor;
            this.distributionHighPrice = request.distributionHighPrice;
            this.distributionHighPriceRatio = request.distributionHighPriceRatio;
            this.distributionLowPrice = request.distributionLowPrice;
            this.distributionLowPriceRatio = request.distributionLowPriceRatio;
            this.highMarkPrice = request.highMarkPrice;
            this.highPrice = request.highPrice;
            this.inGroup = request.inGroup;
            this.inGroupEndTime = request.inGroupEndTime;
            this.inGroupStartTime = request.inGroupStartTime;
            this.inventoryRiskLevel = request.inventoryRiskLevel;
            this.lmItemId = request.lmItemId;
            this.lowMarkPrice = request.lowMarkPrice;
            this.lowPrice = request.lowPrice;
            this.modifyEndTime = request.modifyEndTime;
            this.modifyStartTime = request.modifyStartTime;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.platform = request.platform;
            this.productId = request.productId;
            this.productName = request.productName;
            this.productStatus = request.productStatus;
            this.purchaserId = request.purchaserId;
            this.taxRate = request.taxRate;
            this.tradeModeAndCredit = request.tradeModeAndCredit;
        } 

        /**
         * <p>The brand name.</p>
         * 
         * <strong>example:</strong>
         * <p>Plants</p>
         */
        public Builder brandName(String brandName) {
            this.putBodyParameter("brandName", brandName);
            this.brandName = brandName;
            return this;
        }

        /**
         * <p>The list of category IDs.</p>
         */
        public Builder categoryIds(java.util.List<String> categoryIds) {
            this.putBodyParameter("categoryIds", categoryIds);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * <p>The end time of the creation. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        public Builder createEndTime(String createEndTime) {
            this.putBodyParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * <p>The start time of the creation. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        public Builder createStartTime(String createStartTime) {
            this.putBodyParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * <p>The cursor.</p>
         * 
         * <strong>example:</strong>
         * <p>899192313AB192938441CCW</p>
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>The maximum distribution purchase price, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder distributionHighPrice(Long distributionHighPrice) {
            this.putBodyParameter("distributionHighPrice", distributionHighPrice);
            this.distributionHighPrice = distributionHighPrice;
            return this;
        }

        /**
         * <p>The maximum distribution premium rate. A value of 244 indicates 2.44%.</p>
         * 
         * <strong>example:</strong>
         * <p>244</p>
         */
        public Builder distributionHighPriceRatio(Long distributionHighPriceRatio) {
            this.putBodyParameter("distributionHighPriceRatio", distributionHighPriceRatio);
            this.distributionHighPriceRatio = distributionHighPriceRatio;
            return this;
        }

        /**
         * <p>The minimum distribution purchase price, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder distributionLowPrice(Long distributionLowPrice) {
            this.putBodyParameter("distributionLowPrice", distributionLowPrice);
            this.distributionLowPrice = distributionLowPrice;
            return this;
        }

        /**
         * <p>The minimum distribution premium rate. A value of 133 indicates 1.33%.</p>
         * 
         * <strong>example:</strong>
         * <p>133</p>
         */
        public Builder distributionLowPriceRatio(Long distributionLowPriceRatio) {
            this.putBodyParameter("distributionLowPriceRatio", distributionLowPriceRatio);
            this.distributionLowPriceRatio = distributionLowPriceRatio;
            return this;
        }

        /**
         * <p>The maximum strikethrough price, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder highMarkPrice(Long highMarkPrice) {
            this.putBodyParameter("highMarkPrice", highMarkPrice);
            this.highMarkPrice = highMarkPrice;
            return this;
        }

        /**
         * <p>The maximum suggested retail price, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder highPrice(Long highPrice) {
            this.putBodyParameter("highPrice", highPrice);
            this.highPrice = highPrice;
            return this;
        }

        /**
         * <p>Specifies whether the product is added to the inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder inGroup(Boolean inGroup) {
            this.putBodyParameter("inGroup", inGroup);
            this.inGroup = inGroup;
            return this;
        }

        /**
         * <p>The end time when the product was added to the inventory. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        public Builder inGroupEndTime(String inGroupEndTime) {
            this.putBodyParameter("inGroupEndTime", inGroupEndTime);
            this.inGroupEndTime = inGroupEndTime;
            return this;
        }

        /**
         * <p>The start time when the product was added to the inventory. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        public Builder inGroupStartTime(String inGroupStartTime) {
            this.putBodyParameter("inGroupStartTime", inGroupStartTime);
            this.inGroupStartTime = inGroupStartTime;
            return this;
        }

        /**
         * <p>The inventory risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>Low</p>
         */
        public Builder inventoryRiskLevel(String inventoryRiskLevel) {
            this.putBodyParameter("inventoryRiskLevel", inventoryRiskLevel);
            this.inventoryRiskLevel = inventoryRiskLevel;
            return this;
        }

        /**
         * <p>The LM product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxxxx</p>
         */
        public Builder lmItemId(String lmItemId) {
            this.putBodyParameter("lmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * <p>The minimum strikethrough price, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder lowMarkPrice(Long lowMarkPrice) {
            this.putBodyParameter("lowMarkPrice", lowMarkPrice);
            this.lowMarkPrice = lowMarkPrice;
            return this;
        }

        /**
         * <p>The minimum suggested retail price, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder lowPrice(Long lowPrice) {
            this.putBodyParameter("lowPrice", lowPrice);
            this.lowPrice = lowPrice;
            return this;
        }

        /**
         * <p>The end time of the modification. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        public Builder modifyEndTime(String modifyEndTime) {
            this.putBodyParameter("modifyEndTime", modifyEndTime);
            this.modifyEndTime = modifyEndTime;
            return this;
        }

        /**
         * <p>The start time of the modification. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        public Builder modifyStartTime(String modifyStartTime) {
            this.putBodyParameter("modifyStartTime", modifyStartTime);
            this.modifyStartTime = modifyStartTime;
            return this;
        }

        /**
         * <p>The sort field.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter must be used in combination with the sort direction parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>soldQuantity (sorts by sales volume. If not specified, the default is descending order of creation time)</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort direction.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter must be used in combination with the sort field parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of items per page.</p>
         * <blockquote>
         * <ul>
         * <li>Maximum value: 20.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("productId", productId);
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
            this.putBodyParameter("productName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>The product status.</p>
         * 
         * <strong>example:</strong>
         * <p>Sellable</p>
         */
        public Builder productStatus(String productStatus) {
            this.putBodyParameter("productStatus", productStatus);
            this.productStatus = productStatus;
            return this;
        }

        /**
         * <p>The ID of the purchaser.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PIDxxxx</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.putBodyParameter("purchaserId", purchaserId);
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * <p>The tax rate.</p>
         * <blockquote>
         * <ul>
         * <li>You can combine multiple tax rate enum values. Separate the values with commas (,). Example: Rate0,Rate1.</li>
         * <li>HasRate cannot be combined with other enum values.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Rate0</p>
         */
        public Builder taxRate(String taxRate) {
            this.putBodyParameter("taxRate", taxRate);
            this.taxRate = taxRate;
            return this;
        }

        /**
         * <p>The sales mode.</p>
         * 
         * <strong>example:</strong>
         * <p>JingXiao</p>
         */
        public Builder tradeModeAndCredit(String tradeModeAndCredit) {
            this.putBodyParameter("tradeModeAndCredit", tradeModeAndCredit);
            this.tradeModeAndCredit = tradeModeAndCredit;
            return this;
        }

        @Override
        public SearchProductsRequest build() {
            return new SearchProductsRequest(this);
        } 

    } 

}
