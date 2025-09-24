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
 * {@link GetPayAsYouGoPriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPayAsYouGoPriceResponseBody</p>
 */
public class GetPayAsYouGoPriceResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetPayAsYouGoPriceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
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
         * <p>1537A007-72D7-4165-8A26-8694A38E219A</p>
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

        public GetPayAsYouGoPriceResponseBody build() {
            return new GetPayAsYouGoPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPayAsYouGoPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPayAsYouGoPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ModuleDetail model) {
                this.costAfterDiscount = model.costAfterDiscount;
                this.invoiceDiscount = model.invoiceDiscount;
                this.moduleCode = model.moduleCode;
                this.originalCost = model.originalCost;
                this.unitPrice = model.unitPrice;
            } 

            /**
             * <p>The discount price.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder costAfterDiscount(Float costAfterDiscount) {
                this.costAfterDiscount = costAfterDiscount;
                return this;
            }

            /**
             * <p>The discount that was applied.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * <p>The code of the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceType</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>1.77</p>
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
     * {@link GetPayAsYouGoPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPayAsYouGoPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ModuleDetails model) {
                this.moduleDetail = model.moduleDetail;
            } 

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
     * {@link GetPayAsYouGoPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPayAsYouGoPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PromotionDetail model) {
                this.promotionDesc = model.promotionDesc;
                this.promotionId = model.promotionId;
                this.promotionName = model.promotionName;
            } 

            /**
             * <p>The description of the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>This discount allows you to use a service at the minimum price and is provided for testing purposes only.</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The ID of the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>10200210</p>
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>This discount allows you to use a service at the minimum price and is provided for testing purposes only.</p>
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
     * {@link GetPayAsYouGoPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPayAsYouGoPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PromotionDetails model) {
                this.promotionDetail = model.promotionDetail;
            } 

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
     * {@link GetPayAsYouGoPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPayAsYouGoPriceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("ModuleDetails")
        private ModuleDetails moduleDetails;

        @com.aliyun.core.annotation.NameInMap("PromotionDetails")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.currency = model.currency;
                this.moduleDetails = model.moduleDetails;
                this.promotionDetails = model.promotionDetails;
            } 

            /**
             * <p>The type of the currency. Valid values:</p>
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
             * <p>The price details of the pricing module.</p>
             */
            public Builder moduleDetails(ModuleDetails moduleDetails) {
                this.moduleDetails = moduleDetails;
                return this;
            }

            /**
             * <p>The details of the discount.</p>
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
