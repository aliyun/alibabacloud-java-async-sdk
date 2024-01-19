// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBasicAndBizItemsRequest} extends {@link RequestModel}
 *
 * <p>ModifyBasicAndBizItemsRequest</p>
 */
public class ModifyBasicAndBizItemsRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("ItemList")
    @Validation(required = true)
    private java.util.List < ItemList> itemList;

    @Query
    @NameInMap("SubBizId")
    private String subBizId;

    private ModifyBasicAndBizItemsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemList = builder.itemList;
        this.subBizId = builder.subBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBasicAndBizItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return itemList
     */
    public java.util.List < ItemList> getItemList() {
        return this.itemList;
    }

    /**
     * @return subBizId
     */
    public String getSubBizId() {
        return this.subBizId;
    }

    public static final class Builder extends Request.Builder<ModifyBasicAndBizItemsRequest, Builder> {
        private String bizId; 
        private java.util.List < ItemList> itemList; 
        private String subBizId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBasicAndBizItemsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemList = request.itemList;
            this.subBizId = request.subBizId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ItemList.
         */
        public Builder itemList(java.util.List < ItemList> itemList) {
            this.putBodyParameter("ItemList", itemList);
            this.itemList = itemList;
            return this;
        }

        /**
         * SubBizId.
         */
        public Builder subBizId(String subBizId) {
            this.putQueryParameter("SubBizId", subBizId);
            this.subBizId = subBizId;
            return this;
        }

        @Override
        public ModifyBasicAndBizItemsRequest build() {
            return new ModifyBasicAndBizItemsRequest(this);
        } 

    } 

    public static class SkuList extends TeaModel {
        @NameInMap("BenefitId")
        private String benefitId;

        @NameInMap("Points")
        private Long points;

        @NameInMap("PointsAmount")
        private Long pointsAmount;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("StatusAction")
        private Long statusAction;

        @NameInMap("SupplierPrice")
        private Long supplierPrice;

        private SkuList(Builder builder) {
            this.benefitId = builder.benefitId;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.priceCent = builder.priceCent;
            this.quantity = builder.quantity;
            this.skuId = builder.skuId;
            this.statusAction = builder.statusAction;
            this.supplierPrice = builder.supplierPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuList create() {
            return builder().build();
        }

        /**
         * @return benefitId
         */
        public String getBenefitId() {
            return this.benefitId;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return pointsAmount
         */
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return statusAction
         */
        public Long getStatusAction() {
            return this.statusAction;
        }

        /**
         * @return supplierPrice
         */
        public Long getSupplierPrice() {
            return this.supplierPrice;
        }

        public static final class Builder {
            private String benefitId; 
            private Long points; 
            private Long pointsAmount; 
            private Long priceCent; 
            private Integer quantity; 
            private Long skuId; 
            private Long statusAction; 
            private Long supplierPrice; 

            /**
             * BenefitId.
             */
            public Builder benefitId(String benefitId) {
                this.benefitId = benefitId;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(Long points) {
                this.points = points;
                return this;
            }

            /**
             * PointsAmount.
             */
            public Builder pointsAmount(Long pointsAmount) {
                this.pointsAmount = pointsAmount;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * StatusAction.
             */
            public Builder statusAction(Long statusAction) {
                this.statusAction = statusAction;
                return this;
            }

            /**
             * SupplierPrice.
             */
            public Builder supplierPrice(Long supplierPrice) {
                this.supplierPrice = supplierPrice;
                return this;
            }

            public SkuList build() {
                return new SkuList(this);
            } 

        } 

    }
    public static class ItemList extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("SkuList")
        private java.util.List < SkuList> skuList;

        private ItemList(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.skuList = builder.skuList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return skuList
         */
        public java.util.List < SkuList> getSkuList() {
            return this.skuList;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private java.util.List < SkuList> skuList; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * SkuList.
             */
            public Builder skuList(java.util.List < SkuList> skuList) {
                this.skuList = skuList;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
