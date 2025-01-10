// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link GetSubscriptionPriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionPriceResponseBody</p>
 */
public class GetSubscriptionPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSubscriptionPriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionPriceResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidConfigCod</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the service price.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>30E7066E-AE6F-4E59-AFE6-11386CE3AFA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSubscriptionPriceResponseBody build() {
            return new GetSubscriptionPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubscriptionPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionPriceResponseBody</p>
     */
    public static class ModuleDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostAfterDiscount")
        private Float costAfterDiscount;

        @com.aliyun.core.annotation.NameInMap("InvoiceDiscount")
        private Float invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("OriginalCost")
        private Float originalCost;

        @com.aliyun.core.annotation.NameInMap("UnitPrice")
        private Float unitPrice;

        private ModuleDetail(Builder builder) {
            this.costAfterDiscount = builder.costAfterDiscount;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.moduleCode = builder.moduleCode;
            this.originalCost = builder.originalCost;
            this.unitPrice = builder.unitPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleDetail create() {
            return builder().build();
        }

        /**
         * @return costAfterDiscount
         */
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        /**
         * @return invoiceDiscount
         */
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return originalCost
         */
        public Float getOriginalCost() {
            return this.originalCost;
        }

        /**
         * @return unitPrice
         */
        public Float getUnitPrice() {
            return this.unitPrice;
        }

        public static final class Builder {
            private Float costAfterDiscount; 
            private Float invoiceDiscount; 
            private String moduleCode; 
            private Float originalCost; 
            private Float unitPrice; 

            /**
             * <p>The discount price.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder costAfterDiscount(Float costAfterDiscount) {
                this.costAfterDiscount = costAfterDiscount;
                return this;
            }

            /**
             * <p>The discount that was applied.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * <p>The identifier of the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>PackageCode</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The original price of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder originalCost(Float originalCost) {
                this.originalCost = originalCost;
                return this;
            }

            /**
             * <p>The unit price.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder unitPrice(Float unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            public ModuleDetail build() {
                return new ModuleDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionPriceResponseBody</p>
     */
    public static class ModuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleDetail")
        private java.util.List<ModuleDetail> moduleDetail;

        private ModuleDetails(Builder builder) {
            this.moduleDetail = builder.moduleDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleDetails create() {
            return builder().build();
        }

        /**
         * @return moduleDetail
         */
        public java.util.List<ModuleDetail> getModuleDetail() {
            return this.moduleDetail;
        }

        public static final class Builder {
            private java.util.List<ModuleDetail> moduleDetail; 

            /**
             * ModuleDetail.
             */
            public Builder moduleDetail(java.util.List<ModuleDetail> moduleDetail) {
                this.moduleDetail = moduleDetail;
                return this;
            }

            public ModuleDetails build() {
                return new ModuleDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionPriceResponseBody</p>
     */
    public static class PromotionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private Long promotionId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        private PromotionDetail(Builder builder) {
            this.promotionDesc = builder.promotionDesc;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionDetail create() {
            return builder().build();
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        /**
         * @return promotionId
         */
        public Long getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        public static final class Builder {
            private String promotionDesc; 
            private Long promotionId; 
            private String promotionName; 

            /**
             * <p>The description of the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The ID of the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>1021199213</p>
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            public PromotionDetail build() {
                return new PromotionDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionPriceResponseBody</p>
     */
    public static class PromotionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromotionDetail")
        private java.util.List<PromotionDetail> promotionDetail;

        private PromotionDetails(Builder builder) {
            this.promotionDetail = builder.promotionDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionDetails create() {
            return builder().build();
        }

        /**
         * @return promotionDetail
         */
        public java.util.List<PromotionDetail> getPromotionDetail() {
            return this.promotionDetail;
        }

        public static final class Builder {
            private java.util.List<PromotionDetail> promotionDetail; 

            /**
             * PromotionDetail.
             */
            public Builder promotionDetail(java.util.List<PromotionDetail> promotionDetail) {
                this.promotionDetail = promotionDetail;
                return this;
            }

            public PromotionDetails build() {
                return new PromotionDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionPriceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("ModuleDetails")
        private ModuleDetails moduleDetails;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("PromotionDetails")
        private PromotionDetails promotionDetails;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.moduleDetails = builder.moduleDetails;
            this.originalPrice = builder.originalPrice;
            this.promotionDetails = builder.promotionDetails;
            this.quantity = builder.quantity;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return moduleDetails
         */
        public ModuleDetails getModuleDetails() {
            return this.moduleDetails;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return promotionDetails
         */
        public PromotionDetails getPromotionDetails() {
            return this.promotionDetails;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private ModuleDetails moduleDetails; 
            private Float originalPrice; 
            private PromotionDetails promotionDetails; 
            private Integer quantity; 
            private Float tradePrice; 

            /**
             * <p>The type of currency. Valid values:</p>
             * <ul>
             * <li>CNY: Chinese Yuan</li>
             * <li>USD: US dollar</li>
             * <li>JPY: Japanese Yen</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discount that was applied.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The price details of the pricing module.</p>
             */
            public Builder moduleDetails(ModuleDetails moduleDetails) {
                this.moduleDetails = moduleDetails;
                return this;
            }

            /**
             * <p>The original price of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The details of the discount.</p>
             */
            public Builder promotionDetails(PromotionDetails promotionDetails) {
                this.promotionDetails = promotionDetails;
                return this;
            }

            /**
             * <p>The quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The discount price.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
