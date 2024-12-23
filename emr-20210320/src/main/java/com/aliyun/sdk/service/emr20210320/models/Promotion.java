// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link Promotion} extends {@link TeaModel}
 *
 * <p>Promotion</p>
 */
public class Promotion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("PromotionDesc")
    private String promotionDesc;

    @com.aliyun.core.annotation.NameInMap("PromotionName")
    private String promotionName;

    @com.aliyun.core.annotation.NameInMap("PromotionOptionCode")
    private String promotionOptionCode;

    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>产品码。</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>优惠券描述。</p>
         * 
         * <strong>example:</strong>
         * <p>5元优惠券（有效期至23年8月11日）</p>
         */
        public Builder promotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }

        /**
         * <p>优惠券名称。</p>
         * 
         * <strong>example:</strong>
         * <p>5元优惠券</p>
         */
        public Builder promotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }

        /**
         * <p>优惠券码。</p>
         * 
         * <strong>example:</strong>
         * <p>youhui_quan</p>
         */
        public Builder promotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }

        /**
         * <p>优惠券号。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ABC123</p>
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
