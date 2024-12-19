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
 * {@link RenderOrderResponseBody} extends {@link TeaModel}
 *
 * <p>RenderOrderResponseBody</p>
 */
public class RenderOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private RenderOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public RenderOrderResponseBody build() {
            return new RenderOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RenderOrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderResponseBody</p>
     */
    public static class DeliveryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PostFee")
        private Long postFee;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private Long serviceType;

        private DeliveryInfos(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.postFee = builder.postFee;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryInfos create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return postFee
         */
        public Long getPostFee() {
            return this.postFee;
        }

        /**
         * @return serviceType
         */
        public Long getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String displayName; 
            private String id; 
            private Long postFee; 
            private Long serviceType; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * PostFee.
             */
            public Builder postFee(Long postFee) {
                this.postFee = postFee;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(Long serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public DeliveryInfos build() {
                return new DeliveryInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderResponseBody</p>
     */
    public static class RenderOrderInfosDeliveryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryInfos")
        private java.util.List<DeliveryInfos> deliveryInfos;

        private RenderOrderInfosDeliveryInfos(Builder builder) {
            this.deliveryInfos = builder.deliveryInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderOrderInfosDeliveryInfos create() {
            return builder().build();
        }

        /**
         * @return deliveryInfos
         */
        public java.util.List<DeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        public static final class Builder {
            private java.util.List<DeliveryInfos> deliveryInfos; 

            /**
             * DeliveryInfos.
             */
            public Builder deliveryInfos(java.util.List<DeliveryInfos> deliveryInfos) {
                this.deliveryInfos = deliveryInfos;
                return this;
            }

            public RenderOrderInfosDeliveryInfos build() {
                return new RenderOrderInfosDeliveryInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderResponseBody</p>
     */
    public static class LmItemInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualPrice")
        private Long actualPrice;

        @com.aliyun.core.annotation.NameInMap("CanSell")
        private Boolean canSell;

        @com.aliyun.core.annotation.NameInMap("Cash")
        private Long cash;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemPicUrl")
        private String itemPicUrl;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("SellerNick")
        private String sellerNick;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        private LmItemInfos(Builder builder) {
            this.actualPrice = builder.actualPrice;
            this.canSell = builder.canSell;
            this.cash = builder.cash;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.itemPicUrl = builder.itemPicUrl;
            this.lmItemId = builder.lmItemId;
            this.message = builder.message;
            this.points = builder.points;
            this.quantity = builder.quantity;
            this.sellerId = builder.sellerId;
            this.sellerNick = builder.sellerNick;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmItemInfos create() {
            return builder().build();
        }

        /**
         * @return actualPrice
         */
        public Long getActualPrice() {
            return this.actualPrice;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return cash
         */
        public Long getCash() {
            return this.cash;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemPicUrl
         */
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return sellerId
         */
        public Long getSellerId() {
            return this.sellerId;
        }

        /**
         * @return sellerNick
         */
        public String getSellerNick() {
            return this.sellerNick;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        public static final class Builder {
            private Long actualPrice; 
            private Boolean canSell; 
            private Long cash; 
            private Long itemId; 
            private String itemName; 
            private String itemPicUrl; 
            private String lmItemId; 
            private String message; 
            private Long points; 
            private Integer quantity; 
            private Long sellerId; 
            private String sellerNick; 
            private Long skuId; 
            private String skuName; 

            /**
             * ActualPrice.
             */
            public Builder actualPrice(Long actualPrice) {
                this.actualPrice = actualPrice;
                return this;
            }

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * Cash.
             */
            public Builder cash(Long cash) {
                this.cash = cash;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ItemPicUrl.
             */
            public Builder itemPicUrl(String itemPicUrl) {
                this.itemPicUrl = itemPicUrl;
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
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * SellerId.
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * SellerNick.
             */
            public Builder sellerNick(String sellerNick) {
                this.sellerNick = sellerNick;
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
             * SkuName.
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            public LmItemInfos build() {
                return new LmItemInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderResponseBody</p>
     */
    public static class RenderOrderInfosLmItemInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmItemInfos")
        private java.util.List<LmItemInfos> lmItemInfos;

        private RenderOrderInfosLmItemInfos(Builder builder) {
            this.lmItemInfos = builder.lmItemInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderOrderInfosLmItemInfos create() {
            return builder().build();
        }

        /**
         * @return lmItemInfos
         */
        public java.util.List<LmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

        public static final class Builder {
            private java.util.List<LmItemInfos> lmItemInfos; 

            /**
             * LmItemInfos.
             */
            public Builder lmItemInfos(java.util.List<LmItemInfos> lmItemInfos) {
                this.lmItemInfos = lmItemInfos;
                return this;
            }

            public RenderOrderInfosLmItemInfos build() {
                return new RenderOrderInfosLmItemInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderResponseBody</p>
     */
    public static class RenderOrderInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryInfos")
        private RenderOrderInfosDeliveryInfos deliveryInfos;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, ?> extInfo;

        @com.aliyun.core.annotation.NameInMap("LmItemInfos")
        private RenderOrderInfosLmItemInfos lmItemInfos;

        private RenderOrderInfos(Builder builder) {
            this.deliveryInfos = builder.deliveryInfos;
            this.extInfo = builder.extInfo;
            this.lmItemInfos = builder.lmItemInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderOrderInfos create() {
            return builder().build();
        }

        /**
         * @return deliveryInfos
         */
        public RenderOrderInfosDeliveryInfos getDeliveryInfos() {
            return this.deliveryInfos;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return lmItemInfos
         */
        public RenderOrderInfosLmItemInfos getLmItemInfos() {
            return this.lmItemInfos;
        }

        public static final class Builder {
            private RenderOrderInfosDeliveryInfos deliveryInfos; 
            private java.util.Map<String, ?> extInfo; 
            private RenderOrderInfosLmItemInfos lmItemInfos; 

            /**
             * DeliveryInfos.
             */
            public Builder deliveryInfos(RenderOrderInfosDeliveryInfos deliveryInfos) {
                this.deliveryInfos = deliveryInfos;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map<String, ?> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * LmItemInfos.
             */
            public Builder lmItemInfos(RenderOrderInfosLmItemInfos lmItemInfos) {
                this.lmItemInfos = lmItemInfos;
                return this;
            }

            public RenderOrderInfos build() {
                return new RenderOrderInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderResponseBody</p>
     */
    public static class ModelRenderOrderInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderOrderInfos")
        private java.util.List<RenderOrderInfos> renderOrderInfos;

        private ModelRenderOrderInfos(Builder builder) {
            this.renderOrderInfos = builder.renderOrderInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelRenderOrderInfos create() {
            return builder().build();
        }

        /**
         * @return renderOrderInfos
         */
        public java.util.List<RenderOrderInfos> getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

        public static final class Builder {
            private java.util.List<RenderOrderInfos> renderOrderInfos; 

            /**
             * RenderOrderInfos.
             */
            public Builder renderOrderInfos(java.util.List<RenderOrderInfos> renderOrderInfos) {
                this.renderOrderInfos = renderOrderInfos;
                return this;
            }

            public ModelRenderOrderInfos build() {
                return new ModelRenderOrderInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenderOrderResponseBody} extends {@link TeaModel}
     *
     * <p>RenderOrderResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderOrderInfos")
        private ModelRenderOrderInfos renderOrderInfos;

        private Model(Builder builder) {
            this.renderOrderInfos = builder.renderOrderInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return renderOrderInfos
         */
        public ModelRenderOrderInfos getRenderOrderInfos() {
            return this.renderOrderInfos;
        }

        public static final class Builder {
            private ModelRenderOrderInfos renderOrderInfos; 

            /**
             * RenderOrderInfos.
             */
            public Builder renderOrderInfos(ModelRenderOrderInfos renderOrderInfos) {
                this.renderOrderInfos = renderOrderInfos;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
