// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCouponTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCouponTemplateResponseBody</p>
 */
public class CreateCouponTemplateResponseBody extends TeaModel {
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

    private CreateCouponTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCouponTemplateResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCouponTemplateResponseBody build() {
            return new CreateCouponTemplateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableProducts")
        private String applicableProducts;

        @com.aliyun.core.annotation.NameInMap("CostBearer")
        private String costBearer;

        @com.aliyun.core.annotation.NameInMap("CouponTemplateID")
        private Long couponTemplateID;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Expireddate")
        private String expireddate;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private java.util.List < String > productType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Vailddate")
        private String vailddate;

        @com.aliyun.core.annotation.NameInMap("Vaildperioddays")
        private String vaildperioddays;

        @com.aliyun.core.annotation.NameInMap("ValidUntil")
        private String validUntil;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Data(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.costBearer = builder.costBearer;
            this.couponTemplateID = builder.couponTemplateID;
            this.createTime = builder.createTime;
            this.expireddate = builder.expireddate;
            this.productType = builder.productType;
            this.status = builder.status;
            this.templateName = builder.templateName;
            this.vailddate = builder.vailddate;
            this.vaildperioddays = builder.vaildperioddays;
            this.validUntil = builder.validUntil;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicableProducts
         */
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        /**
         * @return costBearer
         */
        public String getCostBearer() {
            return this.costBearer;
        }

        /**
         * @return couponTemplateID
         */
        public Long getCouponTemplateID() {
            return this.couponTemplateID;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireddate
         */
        public String getExpireddate() {
            return this.expireddate;
        }

        /**
         * @return productType
         */
        public java.util.List < String > getProductType() {
            return this.productType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return vailddate
         */
        public String getVailddate() {
            return this.vailddate;
        }

        /**
         * @return vaildperioddays
         */
        public String getVaildperioddays() {
            return this.vaildperioddays;
        }

        /**
         * @return validUntil
         */
        public String getValidUntil() {
            return this.validUntil;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String applicableProducts; 
            private String costBearer; 
            private Long couponTemplateID; 
            private String createTime; 
            private String expireddate; 
            private java.util.List < String > productType; 
            private String status; 
            private String templateName; 
            private String vailddate; 
            private String vaildperioddays; 
            private String validUntil; 
            private String value; 

            /**
             * ApplicableProducts.
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * CostBearer.
             */
            public Builder costBearer(String costBearer) {
                this.costBearer = costBearer;
                return this;
            }

            /**
             * CouponTemplateID.
             */
            public Builder couponTemplateID(Long couponTemplateID) {
                this.couponTemplateID = couponTemplateID;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Expireddate.
             */
            public Builder expireddate(String expireddate) {
                this.expireddate = expireddate;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(java.util.List < String > productType) {
                this.productType = productType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * Vailddate.
             */
            public Builder vailddate(String vailddate) {
                this.vailddate = vailddate;
                return this;
            }

            /**
             * Vaildperioddays.
             */
            public Builder vaildperioddays(String vaildperioddays) {
                this.vaildperioddays = vaildperioddays;
                return this;
            }

            /**
             * ValidUntil.
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
