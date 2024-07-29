// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValuateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ValuateTemplateResponseBody</p>
 */
public class ValuateTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The HTTP status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The result of the inquiry.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * The discount amount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * The error message that is returned.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The original price.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * The pricing unit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * The discount information.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The price at which the transaction is made.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            /**
             * Indicates whether the instance is newly created. Valid values:\
             * <p>
             * 1: The instance is newly created.\
             * 2: The instance already exists.\
             * 0: The price of the instance is not included.
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
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Double discountAmount;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Double originalPrice;

        @com.aliyun.core.annotation.NameInMap("PriceList")
        private java.util.List < PriceList> priceList;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
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
             * The discount amount.
             */
            public Builder discountAmount(Double discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * The error message that is returned.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The original price.
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * The information about the price.
             */
            public Builder priceList(java.util.List < PriceList> priceList) {
                this.priceList = priceList;
                return this;
            }

            /**
             * The pricing unit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * The discount information.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * The price at which the transaction is made.
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
        @com.aliyun.core.annotation.NameInMap("ResourceList")
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
             * The result set of the inquiry.
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
