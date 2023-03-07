// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePriceResponseBody</p>
 */
public class DescribeImagePriceResponseBody extends TeaModel {
    @NameInMap("Amount")
    private Integer amount;

    @NameInMap("DiscountPrice")
    private Float discountPrice;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("OriginalPrice")
    private Float originalPrice;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TradePrice")
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

        /**
         * The number of images that you want to purchase.
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * The discount that is applied.
         */
        public Builder discountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * The original price of the image.
         */
        public Builder originalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The final price of the image.
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
