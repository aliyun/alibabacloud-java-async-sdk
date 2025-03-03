// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the inquiry.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>847C9D0A-BABD-589C-8A9C-6464409EDED9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ValuateTemplateResponseBody build() {
            return new ValuateTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ValuateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ValuateTemplateResponseBody</p>
     */
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
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>82.99</p>
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>ServiceUnavailable : The request has failed due to a temporary failure of the server.\r\nRequestId : 4AA302DB-3286-5589-8637-FF6D8507B7A9.</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>eip</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>83.0</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The pricing unit.</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * <p>The discount information.</p>
             * 
             * <strong>example:</strong>
             * <p>The discount information.</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1687225092</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The price at which the transaction is made.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            /**
             * <p>Indicates whether the instance is newly created. Valid values:<br>1: The instance is newly created.<br>2: The instance already exists.<br>0: The price of the instance is not included.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;1&quot;</p>
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
    /**
     * 
     * {@link ValuateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ValuateTemplateResponseBody</p>
     */
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
        private java.util.List<PriceList> priceList;

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
        public java.util.List<PriceList> getPriceList() {
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
            private java.util.List<PriceList> priceList; 
            private String priceUnit; 
            private String promotionName; 
            private Double tradePrice; 

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder discountAmount(Double discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidSaleComponentFault : The request not refer to the correct order sale component.</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>83.0</p>
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The information about the price.</p>
             */
            public Builder priceList(java.util.List<PriceList> priceList) {
                this.priceList = priceList;
                return this;
            }

            /**
             * <p>The pricing unit.</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * <p>The discount information.</p>
             * 
             * <strong>example:</strong>
             * <p>The discount information.</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>The price at which the transaction is made.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
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
    /**
     * 
     * {@link ValuateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ValuateTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private java.util.List<ResourceList> resourceList;

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
        public java.util.List<ResourceList> getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private java.util.List<ResourceList> resourceList; 

            /**
             * <p>The result set of the inquiry.</p>
             */
            public Builder resourceList(java.util.List<ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
