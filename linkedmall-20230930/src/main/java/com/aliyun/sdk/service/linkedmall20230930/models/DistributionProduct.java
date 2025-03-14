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
 * {@link DistributionProduct} extends {@link TeaModel}
 *
 * <p>DistributionProduct</p>
 */
public class DistributionProduct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("categoryChain")
    private String categoryChain;

    @com.aliyun.core.annotation.NameInMap("categoryLeafId")
    private Long categoryLeafId;

    @com.aliyun.core.annotation.NameInMap("categoryLeafName")
    private String categoryLeafName;

    @com.aliyun.core.annotation.NameInMap("channelCode")
    private String channelCode;

    @com.aliyun.core.annotation.NameInMap("distributeStatus")
    private String distributeStatus;

    @com.aliyun.core.annotation.NameInMap("picUrl")
    private String picUrl;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("sellerId")
    private String sellerId;

    @com.aliyun.core.annotation.NameInMap("shortTitle")
    private String shortTitle;

    @com.aliyun.core.annotation.NameInMap("skus")
    private java.util.List<DistributionSku> skus;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("whiteBackgroundPicUrl")
    private String whiteBackgroundPicUrl;

    private DistributionProduct(Builder builder) {
        this.categoryChain = builder.categoryChain;
        this.categoryLeafId = builder.categoryLeafId;
        this.categoryLeafName = builder.categoryLeafName;
        this.channelCode = builder.channelCode;
        this.distributeStatus = builder.distributeStatus;
        this.picUrl = builder.picUrl;
        this.productId = builder.productId;
        this.sellerId = builder.sellerId;
        this.shortTitle = builder.shortTitle;
        this.skus = builder.skus;
        this.title = builder.title;
        this.whiteBackgroundPicUrl = builder.whiteBackgroundPicUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistributionProduct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryChain
     */
    public String getCategoryChain() {
        return this.categoryChain;
    }

    /**
     * @return categoryLeafId
     */
    public Long getCategoryLeafId() {
        return this.categoryLeafId;
    }

    /**
     * @return categoryLeafName
     */
    public String getCategoryLeafName() {
        return this.categoryLeafName;
    }

    /**
     * @return channelCode
     */
    public String getChannelCode() {
        return this.channelCode;
    }

    /**
     * @return distributeStatus
     */
    public String getDistributeStatus() {
        return this.distributeStatus;
    }

    /**
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return sellerId
     */
    public String getSellerId() {
        return this.sellerId;
    }

    /**
     * @return shortTitle
     */
    public String getShortTitle() {
        return this.shortTitle;
    }

    /**
     * @return skus
     */
    public java.util.List<DistributionSku> getSkus() {
        return this.skus;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return whiteBackgroundPicUrl
     */
    public String getWhiteBackgroundPicUrl() {
        return this.whiteBackgroundPicUrl;
    }

    public static final class Builder {
        private String categoryChain; 
        private Long categoryLeafId; 
        private String categoryLeafName; 
        private String channelCode; 
        private String distributeStatus; 
        private String picUrl; 
        private String productId; 
        private String sellerId; 
        private String shortTitle; 
        private java.util.List<DistributionSku> skus; 
        private String title; 
        private String whiteBackgroundPicUrl; 

        private Builder() {
        } 

        private Builder(DistributionProduct model) {
            this.categoryChain = model.categoryChain;
            this.categoryLeafId = model.categoryLeafId;
            this.categoryLeafName = model.categoryLeafName;
            this.channelCode = model.channelCode;
            this.distributeStatus = model.distributeStatus;
            this.picUrl = model.picUrl;
            this.productId = model.productId;
            this.sellerId = model.sellerId;
            this.shortTitle = model.shortTitle;
            this.skus = model.skus;
            this.title = model.title;
            this.whiteBackgroundPicUrl = model.whiteBackgroundPicUrl;
        } 

        /**
         * categoryChain.
         */
        public Builder categoryChain(String categoryChain) {
            this.categoryChain = categoryChain;
            return this;
        }

        /**
         * categoryLeafId.
         */
        public Builder categoryLeafId(Long categoryLeafId) {
            this.categoryLeafId = categoryLeafId;
            return this;
        }

        /**
         * categoryLeafName.
         */
        public Builder categoryLeafName(String categoryLeafName) {
            this.categoryLeafName = categoryLeafName;
            return this;
        }

        /**
         * channelCode.
         */
        public Builder channelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }

        /**
         * distributeStatus.
         */
        public Builder distributeStatus(String distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }

        /**
         * picUrl.
         */
        public Builder picUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * sellerId.
         */
        public Builder sellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }

        /**
         * shortTitle.
         */
        public Builder shortTitle(String shortTitle) {
            this.shortTitle = shortTitle;
            return this;
        }

        /**
         * skus.
         */
        public Builder skus(java.util.List<DistributionSku> skus) {
            this.skus = skus;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * whiteBackgroundPicUrl.
         */
        public Builder whiteBackgroundPicUrl(String whiteBackgroundPicUrl) {
            this.whiteBackgroundPicUrl = whiteBackgroundPicUrl;
            return this;
        }

        public DistributionProduct build() {
            return new DistributionProduct(this);
        } 

    } 

}
