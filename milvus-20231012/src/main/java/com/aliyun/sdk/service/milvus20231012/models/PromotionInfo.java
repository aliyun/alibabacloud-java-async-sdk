// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link PromotionInfo} extends {@link TeaModel}
 *
 * <p>PromotionInfo</p>
 */
public class PromotionInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("canPromFee")
    private String canPromFee;

    @com.aliyun.core.annotation.NameInMap("isSelected")
    private Boolean isSelected;

    @com.aliyun.core.annotation.NameInMap("promotionDesc")
    private String promotionDesc;

    @com.aliyun.core.annotation.NameInMap("promotionName")
    private String promotionName;

    @com.aliyun.core.annotation.NameInMap("promotionOptionCode")
    private String promotionOptionCode;

    @com.aliyun.core.annotation.NameInMap("promotionOptionNo")
    private String promotionOptionNo;

    @com.aliyun.core.annotation.NameInMap("selected")
    private Boolean selected;

    private PromotionInfo(Builder builder) {
        this.canPromFee = builder.canPromFee;
        this.isSelected = builder.isSelected;
        this.promotionDesc = builder.promotionDesc;
        this.promotionName = builder.promotionName;
        this.promotionOptionCode = builder.promotionOptionCode;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.selected = builder.selected;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromotionInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Boolean getIsSelected() {
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

    /**
     * @return selected
     */
    public Boolean getSelected() {
        return this.selected;
    }

    public static final class Builder {
        private String canPromFee; 
        private Boolean isSelected; 
        private String promotionDesc; 
        private String promotionName; 
        private String promotionOptionCode; 
        private String promotionOptionNo; 
        private Boolean selected; 

        private Builder() {
        } 

        private Builder(PromotionInfo model) {
            this.canPromFee = model.canPromFee;
            this.isSelected = model.isSelected;
            this.promotionDesc = model.promotionDesc;
            this.promotionName = model.promotionName;
            this.promotionOptionCode = model.promotionOptionCode;
            this.promotionOptionNo = model.promotionOptionNo;
            this.selected = model.selected;
        } 

        /**
         * canPromFee.
         */
        public Builder canPromFee(String canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }

        /**
         * isSelected.
         */
        public Builder isSelected(Boolean isSelected) {
            this.isSelected = isSelected;
            return this;
        }

        /**
         * promotionDesc.
         */
        public Builder promotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }

        /**
         * promotionName.
         */
        public Builder promotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }

        /**
         * promotionOptionCode.
         */
        public Builder promotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }

        /**
         * promotionOptionNo.
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * selected.
         */
        public Builder selected(Boolean selected) {
            this.selected = selected;
            return this;
        }

        public PromotionInfo build() {
            return new PromotionInfo(this);
        } 

    } 

}
