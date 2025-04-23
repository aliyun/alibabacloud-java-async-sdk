// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link DescribeImagePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePriceResponseBody</p>
 */
public class DescribeImagePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.NameInMap("DiscountPrice")
    private Float discountPrice;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("OriginalPrice")
    private Float originalPrice;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TradePrice")
    private Float tradePrice;

    private DescribeImagePriceResponseBody(Builder builder) {
        this.amount = builder.amount;
        this.discountPrice = builder.discountPrice;
        this.imageId = builder.imageId;
        this.originalPrice = builder.originalPrice;
        this.requestId = builder.requestId;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagePriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return discountPrice
     */
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return originalPrice
     */
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private Integer amount; 
        private Float discountPrice; 
        private String imageId; 
        private Float originalPrice; 
        private String requestId; 
        private Float tradePrice; 

        private Builder() {
        } 

        private Builder(DescribeImagePriceResponseBody model) {
            this.amount = model.amount;
            this.discountPrice = model.discountPrice;
            this.imageId = model.imageId;
            this.originalPrice = model.originalPrice;
            this.requestId = model.requestId;
            this.tradePrice = model.tradePrice;
        } 

        /**
         * <p>The number of instances that are purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder discountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }

        /**
         * <p>The ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp198jigq7l1ga11****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The original price of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        public Builder originalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>47ca3ac4-2a03-48f1-8bf2-ba6de0f3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The final price of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public DescribeImagePriceResponseBody build() {
            return new DescribeImagePriceResponseBody(this);
        } 

    } 

}
