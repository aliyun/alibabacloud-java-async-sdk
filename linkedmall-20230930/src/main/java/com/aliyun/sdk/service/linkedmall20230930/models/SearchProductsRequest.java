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
         * brandName.
         */
        public Builder brandName(String brandName) {
            this.putBodyParameter("brandName", brandName);
            this.brandName = brandName;
            return this;
        }

        /**
         * categoryIds.
         */
        public Builder categoryIds(java.util.List<String> categoryIds) {
            this.putBodyParameter("categoryIds", categoryIds);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * createEndTime.
         */
        public Builder createEndTime(String createEndTime) {
            this.putBodyParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * createStartTime.
         */
        public Builder createStartTime(String createStartTime) {
            this.putBodyParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * distributionHighPrice.
         */
        public Builder distributionHighPrice(Long distributionHighPrice) {
            this.putBodyParameter("distributionHighPrice", distributionHighPrice);
            this.distributionHighPrice = distributionHighPrice;
            return this;
        }

        /**
         * distributionHighPriceRatio.
         */
        public Builder distributionHighPriceRatio(Long distributionHighPriceRatio) {
            this.putBodyParameter("distributionHighPriceRatio", distributionHighPriceRatio);
            this.distributionHighPriceRatio = distributionHighPriceRatio;
            return this;
        }

        /**
         * distributionLowPrice.
         */
        public Builder distributionLowPrice(Long distributionLowPrice) {
            this.putBodyParameter("distributionLowPrice", distributionLowPrice);
            this.distributionLowPrice = distributionLowPrice;
            return this;
        }

        /**
         * distributionLowPriceRatio.
         */
        public Builder distributionLowPriceRatio(Long distributionLowPriceRatio) {
            this.putBodyParameter("distributionLowPriceRatio", distributionLowPriceRatio);
            this.distributionLowPriceRatio = distributionLowPriceRatio;
            return this;
        }

        /**
         * highMarkPrice.
         */
        public Builder highMarkPrice(Long highMarkPrice) {
            this.putBodyParameter("highMarkPrice", highMarkPrice);
            this.highMarkPrice = highMarkPrice;
            return this;
        }

        /**
         * highPrice.
         */
        public Builder highPrice(Long highPrice) {
            this.putBodyParameter("highPrice", highPrice);
            this.highPrice = highPrice;
            return this;
        }

        /**
         * inGroup.
         */
        public Builder inGroup(Boolean inGroup) {
            this.putBodyParameter("inGroup", inGroup);
            this.inGroup = inGroup;
            return this;
        }

        /**
         * inGroupEndTime.
         */
        public Builder inGroupEndTime(String inGroupEndTime) {
            this.putBodyParameter("inGroupEndTime", inGroupEndTime);
            this.inGroupEndTime = inGroupEndTime;
            return this;
        }

        /**
         * inGroupStartTime.
         */
        public Builder inGroupStartTime(String inGroupStartTime) {
            this.putBodyParameter("inGroupStartTime", inGroupStartTime);
            this.inGroupStartTime = inGroupStartTime;
            return this;
        }

        /**
         * inventoryRiskLevel.
         */
        public Builder inventoryRiskLevel(String inventoryRiskLevel) {
            this.putBodyParameter("inventoryRiskLevel", inventoryRiskLevel);
            this.inventoryRiskLevel = inventoryRiskLevel;
            return this;
        }

        /**
         * lmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putBodyParameter("lmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * lowMarkPrice.
         */
        public Builder lowMarkPrice(Long lowMarkPrice) {
            this.putBodyParameter("lowMarkPrice", lowMarkPrice);
            this.lowMarkPrice = lowMarkPrice;
            return this;
        }

        /**
         * lowPrice.
         */
        public Builder lowPrice(Long lowPrice) {
            this.putBodyParameter("lowPrice", lowPrice);
            this.lowPrice = lowPrice;
            return this;
        }

        /**
         * modifyEndTime.
         */
        public Builder modifyEndTime(String modifyEndTime) {
            this.putBodyParameter("modifyEndTime", modifyEndTime);
            this.modifyEndTime = modifyEndTime;
            return this;
        }

        /**
         * modifyStartTime.
         */
        public Builder modifyStartTime(String modifyStartTime) {
            this.putBodyParameter("modifyStartTime", modifyStartTime);
            this.modifyStartTime = modifyStartTime;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
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
         * platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.putBodyParameter("productName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * productStatus.
         */
        public Builder productStatus(String productStatus) {
            this.putBodyParameter("productStatus", productStatus);
            this.productStatus = productStatus;
            return this;
        }

        /**
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
         * taxRate.
         */
        public Builder taxRate(String taxRate) {
            this.putBodyParameter("taxRate", taxRate);
            this.taxRate = taxRate;
            return this;
        }

        /**
         * tradeModeAndCredit.
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
