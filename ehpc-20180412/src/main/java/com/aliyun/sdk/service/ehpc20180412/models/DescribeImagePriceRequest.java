// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeImagePriceRequest</p>
 */
public class DescribeImagePriceRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(required = true)
    private Integer amount;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Query
    @NameInMap("PriceUnit")
    @Validation(required = true)
    private String priceUnit;

    @Query
    @NameInMap("SkuCode")
    @Validation(required = true)
    private String skuCode;

    private DescribeImagePriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.imageId = builder.imageId;
        this.orderType = builder.orderType;
        this.period = builder.period;
        this.priceUnit = builder.priceUnit;
        this.skuCode = builder.skuCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagePriceRequest create() {
        return builder().build();
    }

    @Override
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
    }

    /**
     * @return skuCode
     */
    public String getSkuCode() {
        return this.skuCode;
    }

    public static final class Builder extends Request.Builder<DescribeImagePriceRequest, Builder> {
        private Integer amount; 
        private String imageId; 
        private String orderType; 
        private Integer period; 
        private String priceUnit; 
        private String skuCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImagePriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.imageId = request.imageId;
            this.orderType = request.orderType;
            this.period = request.period;
            this.priceUnit = request.priceUnit;
            this.skuCode = request.skuCode;
        } 

        /**
         * The number of images that you want to purchase. Valid values: 1 to 1000.
         * <p>
         * 
         * Default value: 1
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the order. The order can be set only as a purchase order. Valid value: INSTANCE-BUY.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The subscription duration. Valid values:
         * <p>
         * 
         * *   If PriceUnit is set to Day, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, and 30.
         * *   If PriceUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.
         * *   If PriceUnit is set to Year, the valid values of the Period parameter are 1, 2, and 3.
         * 
         * Default value: 1
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values:
         * <p>
         * 
         * *   Day
         * *   Month
         * *   Year
         * 
         * Default value: Day
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * The stock keeping unit (SKU) of the image. Valid value: package.
         */
        public Builder skuCode(String skuCode) {
            this.putQueryParameter("SkuCode", skuCode);
            this.skuCode = skuCode;
            return this;
        }

        @Override
        public DescribeImagePriceRequest build() {
            return new DescribeImagePriceRequest(this);
        } 

    } 

}
