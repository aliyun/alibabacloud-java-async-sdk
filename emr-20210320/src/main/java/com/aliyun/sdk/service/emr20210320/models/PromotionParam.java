// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PromotionParam} extends {@link TeaModel}
 *
 * <p>PromotionParam</p>
 */
public class PromotionParam extends TeaModel {
    @NameInMap("ProductCode")
    private String productCode;

    @NameInMap("PromotionOptionCode")
    private String promotionOptionCode;

    @NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    private PromotionParam(Builder builder) {
        this.productCode = builder.productCode;
        this.promotionOptionCode = builder.promotionOptionCode;
        this.promotionOptionNo = builder.promotionOptionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromotionParam create() {
        return builder().build();
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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
        private String promotionOptionCode; 
        private String promotionOptionNo; 

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * PromotionOptionCode.
         */
        public Builder promotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }

        /**
         * PromotionOptionNo.
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        public PromotionParam build() {
            return new PromotionParam(this);
        } 

    } 

}
