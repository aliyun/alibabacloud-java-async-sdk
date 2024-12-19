// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link CreateVirtualProductOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualProductOrderRequest</p>
 */
public class CreateVirtualProductOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
    private String deliveryAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private Long itemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemList")
    private java.util.List<ItemList> itemList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmItemId")
    private String lmItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderExpireTime")
    private Long orderExpireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutTradeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outTradeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Long quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalAmount")
    private Long totalAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private CreateVirtualProductOrderRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.deliveryAddress = builder.deliveryAddress;
        this.extJson = builder.extJson;
        this.itemId = builder.itemId;
        this.itemList = builder.itemList;
        this.lmItemId = builder.lmItemId;
        this.orderExpireTime = builder.orderExpireTime;
        this.outTradeId = builder.outTradeId;
        this.quantity = builder.quantity;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.totalAmount = builder.totalAmount;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualProductOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return itemList
     */
    public java.util.List<ItemList> getItemList() {
        return this.itemList;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return orderExpireTime
     */
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    /**
     * @return outTradeId
     */
    public String getOutTradeId() {
        return this.outTradeId;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return totalAmount
     */
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<CreateVirtualProductOrderRequest, Builder> {
        private String accountType; 
        private String bizId; 
        private String bizUid; 
        private String deliveryAddress; 
        private String extJson; 
        private Long itemId; 
        private java.util.List<ItemList> itemList; 
        private String lmItemId; 
        private Long orderExpireTime; 
        private String outTradeId; 
        private Long quantity; 
        private String thirdPartyUserId; 
        private Long totalAmount; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualProductOrderRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.deliveryAddress = request.deliveryAddress;
            this.extJson = request.extJson;
            this.itemId = request.itemId;
            this.itemList = request.itemList;
            this.lmItemId = request.lmItemId;
            this.orderExpireTime = request.orderExpireTime;
            this.outTradeId = request.outTradeId;
            this.quantity = request.quantity;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.totalAmount = request.totalAmount;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20210508****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>221122411****</p>
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * DeliveryAddress.
         */
        public Builder deliveryAddress(String deliveryAddress) {
            this.putQueryParameter("DeliveryAddress", deliveryAddress);
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * ItemList.
         */
        public Builder itemList(java.util.List<ItemList> itemList) {
            this.putQueryParameter("ItemList", itemList);
            this.itemList = itemList;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putQueryParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * OrderExpireTime.
         */
        public Builder orderExpireTime(Long orderExpireTime) {
            this.putQueryParameter("OrderExpireTime", orderExpireTime);
            this.orderExpireTime = orderExpireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>963****</p>
         */
        public Builder outTradeId(String outTradeId) {
            this.putQueryParameter("OutTradeId", outTradeId);
            this.outTradeId = outTradeId;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Long quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * TotalAmount.
         */
        public Builder totalAmount(Long totalAmount) {
            this.putQueryParameter("TotalAmount", totalAmount);
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public CreateVirtualProductOrderRequest build() {
            return new CreateVirtualProductOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVirtualProductOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateVirtualProductOrderRequest</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        private ItemList(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.quantity = builder.quantity;
            this.skuId = builder.skuId;
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

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private Integer quantity; 
            private Long skuId; 

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

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
