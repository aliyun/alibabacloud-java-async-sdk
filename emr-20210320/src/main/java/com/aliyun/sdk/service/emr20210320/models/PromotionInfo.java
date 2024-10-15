// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PromotionInfo} extends {@link TeaModel}
 *
 * <p>PromotionInfo</p>
 */
public class PromotionInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanPromFee")
    private String canPromFee;

    @com.aliyun.core.annotation.NameInMap("IsSelected")
    private String isSelected;

    @com.aliyun.core.annotation.NameInMap("PromotionDesc")
    private String promotionDesc;

    @com.aliyun.core.annotation.NameInMap("PromotionName")
    private String promotionName;

    @com.aliyun.core.annotation.NameInMap("PromotionOptionCode")
    private String promotionOptionCode;

    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    private PromotionInfo(Builder builder) {
        this.canPromFee = builder.canPromFee;
        this.isSelected = builder.isSelected;
        this.promotionDesc = builder.promotionDesc;
        this.promotionName = builder.promotionName;
        this.promotionOptionCode = builder.promotionOptionCode;
        this.promotionOptionNo = builder.promotionOptionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromotionInfo create() {
        return builder().build();
    }

    /**
     * @return canPromFee
     */
    public String getCanPromFee() {
        return this.canPromFee;
    }

    /**
     * @return isSelected
     */
    public String getIsSelected() {
        return this.isSelected;
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
        private String canPromFee; 
        private String isSelected; 
        private String promotionDesc; 
        private String promotionName; 
        private String promotionOptionCode; 
        private String promotionOptionNo; 

        /**
         * CanPromFee.
         */
        public Builder canPromFee(String canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }

        /**
         * IsSelected.
         */
        public Builder isSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }

        /**
         * PromotionDesc.
         */
        public Builder promotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }

        /**
         * PromotionName.
         */
        public Builder promotionName(String promotionName) {
            this.promotionName = promotionName;
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

        public PromotionInfo build() {
            return new PromotionInfo(this);
        } 

    } 

}
