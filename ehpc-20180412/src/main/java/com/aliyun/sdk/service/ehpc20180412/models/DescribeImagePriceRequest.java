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

        private Builder(DescribeImagePriceRequest response) {
            super(response);
            this.amount = response.amount;
            this.imageId = response.imageId;
            this.orderType = response.orderType;
            this.period = response.period;
            this.priceUnit = response.priceUnit;
            this.skuCode = response.skuCode;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PriceUnit.
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * SkuCode.
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
