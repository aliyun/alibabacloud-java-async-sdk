// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValuateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ValuateTemplateResponseBody</p>
 */
public class ValuateTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ValuateTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValuateTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ValuateTemplateResponseBody build() {
            return new ValuateTemplateResponseBody(this);
        } 

    } 

    public static class PriceList extends TeaModel {
        @NameInMap("DiscountAmount")
        private Float discountAmount;

        @NameInMap("Error")
        private String error;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("PriceUnit")
        private String priceUnit;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("TradePrice")
        private Float tradePrice;

        @NameInMap("Type")
        private String type;

        private PriceList(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.error = builder.error;
            this.nodeType = builder.nodeType;
            this.originalPrice = builder.originalPrice;
            this.priceUnit = builder.priceUnit;
            this.promotionName = builder.promotionName;
            this.resourceId = builder.resourceId;
            this.tradePrice = builder.tradePrice;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceList create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Float discountAmount; 
            private String error; 
            private String nodeType; 
            private Float originalPrice; 
            private String priceUnit; 
            private String promotionName; 
            private String resourceId; 
            private Float tradePrice; 
            private String type; 

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PriceList build() {
                return new PriceList(this);
            } 

        } 

    }
    public static class ResourceList extends TeaModel {
        @NameInMap("DiscountAmount")
        private Double discountAmount;

        @NameInMap("Error")
        private String error;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("OriginalPrice")
        private Double originalPrice;

        @NameInMap("PriceList")
        private java.util.List < PriceList> priceList;

        @NameInMap("PriceUnit")
        private String priceUnit;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("TradePrice")
        private Double tradePrice;

        private ResourceList(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.error = builder.error;
            this.nodeType = builder.nodeType;
            this.originalPrice = builder.originalPrice;
            this.priceList = builder.priceList;
            this.priceUnit = builder.priceUnit;
            this.promotionName = builder.promotionName;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return originalPrice
         */
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return priceList
         */
        public java.util.List < PriceList> getPriceList() {
            return this.priceList;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return tradePrice
         */
        public Double getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private Double discountAmount; 
            private String error; 
            private String nodeType; 
            private Double originalPrice; 
            private java.util.List < PriceList> priceList; 
            private String priceUnit; 
            private String promotionName; 
            private Double tradePrice; 

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Double discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * PriceList.
             */
            public Builder priceList(java.util.List < PriceList> priceList) {
                this.priceList = priceList;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
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
             * TradePrice.
             */
            public Builder tradePrice(Double tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ResourceList")
        private java.util.List < ResourceList> resourceList;

        private Data(Builder builder) {
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resourceList
         */
        public java.util.List < ResourceList> getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private java.util.List < ResourceList> resourceList; 

            /**
             * ResourceList.
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
