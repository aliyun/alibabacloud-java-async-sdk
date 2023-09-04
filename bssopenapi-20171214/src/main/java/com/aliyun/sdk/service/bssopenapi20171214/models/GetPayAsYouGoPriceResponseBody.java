// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPayAsYouGoPriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPayAsYouGoPriceResponseBody</p>
 */
public class GetPayAsYouGoPriceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPayAsYouGoPriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPayAsYouGoPriceResponseBody create() {
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
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPayAsYouGoPriceResponseBody build() {
            return new GetPayAsYouGoPriceResponseBody(this);
        } 

    } 

    public static class ModuleDetail extends TeaModel {
        @NameInMap("CostAfterDiscount")
        private Float costAfterDiscount;

        @NameInMap("InvoiceDiscount")
        private Float invoiceDiscount;

        @NameInMap("ModuleCode")
        private String moduleCode;

        @NameInMap("OriginalCost")
        private Float originalCost;

        @NameInMap("UnitPrice")
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
             * The discount price.
             */
            public Builder costAfterDiscount(Float costAfterDiscount) {
                this.costAfterDiscount = costAfterDiscount;
                return this;
            }

            /**
             * The discount that was applied.
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * The code of the pricing module.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * The original price.
             */
            public Builder originalCost(Float originalCost) {
                this.originalCost = originalCost;
                return this;
            }

            /**
             * The unit price.
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
    public static class ModuleDetails extends TeaModel {
        @NameInMap("ModuleDetail")
        private java.util.List < ModuleDetail> moduleDetail;

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
        public java.util.List < ModuleDetail> getModuleDetail() {
            return this.moduleDetail;
        }

        public static final class Builder {
            private java.util.List < ModuleDetail> moduleDetail; 

            /**
             * ModuleDetail.
             */
            public Builder moduleDetail(java.util.List < ModuleDetail> moduleDetail) {
                this.moduleDetail = moduleDetail;
                return this;
            }

            public ModuleDetails build() {
                return new ModuleDetails(this);
            } 

        } 

    }
    public static class PromotionDetail extends TeaModel {
        @NameInMap("PromotionDesc")
        private String promotionDesc;

        @NameInMap("PromotionId")
        private Long promotionId;

        @NameInMap("PromotionName")
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
             * The description of the discount.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * The ID of the discount.
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * The name of the discount.
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
    public static class PromotionDetails extends TeaModel {
        @NameInMap("PromotionDetail")
        private java.util.List < PromotionDetail> promotionDetail;

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
        public java.util.List < PromotionDetail> getPromotionDetail() {
            return this.promotionDetail;
        }

        public static final class Builder {
            private java.util.List < PromotionDetail> promotionDetail; 

            /**
             * PromotionDetail.
             */
            public Builder promotionDetail(java.util.List < PromotionDetail> promotionDetail) {
                this.promotionDetail = promotionDetail;
                return this;
            }

            public PromotionDetails build() {
                return new PromotionDetails(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("ModuleDetails")
        private ModuleDetails moduleDetails;

        @NameInMap("PromotionDetails")
        private PromotionDetails promotionDetails;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.moduleDetails = builder.moduleDetails;
            this.promotionDetails = builder.promotionDetails;
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
         * @return moduleDetails
         */
        public ModuleDetails getModuleDetails() {
            return this.moduleDetails;
        }

        /**
         * @return promotionDetails
         */
        public PromotionDetails getPromotionDetails() {
            return this.promotionDetails;
        }

        public static final class Builder {
            private String currency; 
            private ModuleDetails moduleDetails; 
            private PromotionDetails promotionDetails; 

            /**
             * The type of the currency. Valid values:
             * <p>
             * 
             * *   CNY: Chinese Yuan
             * *   USD: US dollar
             * *   JPY: Japanese Yen
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The price details of the pricing module.
             */
            public Builder moduleDetails(ModuleDetails moduleDetails) {
                this.moduleDetails = moduleDetails;
                return this;
            }

            /**
             * The details of the discount.
             */
            public Builder promotionDetails(PromotionDetails promotionDetails) {
                this.promotionDetails = promotionDetails;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
