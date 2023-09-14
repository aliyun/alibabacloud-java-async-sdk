// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Promotion} extends {@link TeaModel}
 *
 * <p>Promotion</p>
 */
public class Promotion extends TeaModel {
    @NameInMap("ProductCode")
    private String productCode;

    @NameInMap("PromotionDesc")
    private String promotionDesc;

    @NameInMap("PromotionName")
    private String promotionName;

    @NameInMap("PromotionOptionCode")
    private String promotionOptionCode;

    @NameInMap("PromotionOptionNo")
    @Validation(required = true)
    private String promotionOptionNo;

    private Promotion(Builder builder) {
        this.productCode = builder.productCode;
        this.promotionDesc = builder.promotionDesc;
        this.promotionName = builder.promotionName;
        this.promotionOptionCode = builder.promotionOptionCode;
        this.promotionOptionNo = builder.promotionOptionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Promotion create() {
        return builder().build();
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return promotionDesc
     */
    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    /**
     * @return promotionName
     */
    public String getPromotionName() {
        return this.promotionName;
    }

    /**
     * @return promotionOptionCode
     */
    public String getPromotionOptionCode() {
        return this.promotionOptionCode;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public static final class Builder {
        private String productCode; 
        private String promotionDesc; 
        private String promotionName; 
        private String promotionOptionCode; 
        private String promotionOptionNo; 

        /**
         * 产品码。
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * 优惠券描述。
         */
        public Builder promotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }

        /**
         * 优惠券名称。
         */
        public Builder promotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }

        /**
         * 优惠券码。
         */
        public Builder promotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }

        /**
         * 优惠券号。
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        public Promotion build() {
            return new Promotion(this);
        } 

    } 

}
