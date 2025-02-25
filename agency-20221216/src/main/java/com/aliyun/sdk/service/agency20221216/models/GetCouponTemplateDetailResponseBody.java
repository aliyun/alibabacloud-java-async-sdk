// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetCouponTemplateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCouponTemplateDetailResponseBody</p>
 */
public class GetCouponTemplateDetailResponseBody extends TeaModel {
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

    private GetCouponTemplateDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCouponTemplateDetailResponseBody create() {
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
         * RequestId.
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

        public GetCouponTemplateDetailResponseBody build() {
            return new GetCouponTemplateDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCouponTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCouponTemplateDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableProducts")
        private String applicableProducts;

        @com.aliyun.core.annotation.NameInMap("CostBearer")
        private String costBearer;

        @com.aliyun.core.annotation.NameInMap("CouponDescription")
        private String couponDescription;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Denomination")
        private Double denomination;

        @com.aliyun.core.annotation.NameInMap("LimitPerPerson")
        private Integer limitPerPerson;

        @com.aliyun.core.annotation.NameInMap("PurchaseType")
        private String purchaseType;

        @com.aliyun.core.annotation.NameInMap("ReasonForApplication")
        private String reasonForApplication;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("ValidUntil")
        private String validUntil;

        @com.aliyun.core.annotation.NameInMap("ValidUntilType")
        private String validUntilType;

        private Data(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.costBearer = builder.costBearer;
            this.couponDescription = builder.couponDescription;
            this.createdTime = builder.createdTime;
            this.denomination = builder.denomination;
            this.limitPerPerson = builder.limitPerPerson;
            this.purchaseType = builder.purchaseType;
            this.reasonForApplication = builder.reasonForApplication;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.validUntil = builder.validUntil;
            this.validUntilType = builder.validUntilType;
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
         * @return couponDescription
         */
        public String getCouponDescription() {
            return this.couponDescription;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return denomination
         */
        public Double getDenomination() {
            return this.denomination;
        }

        /**
         * @return limitPerPerson
         */
        public Integer getLimitPerPerson() {
            return this.limitPerPerson;
        }

        /**
         * @return purchaseType
         */
        public String getPurchaseType() {
            return this.purchaseType;
        }

        /**
         * @return reasonForApplication
         */
        public String getReasonForApplication() {
            return this.reasonForApplication;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return validUntil
         */
        public String getValidUntil() {
            return this.validUntil;
        }

        /**
         * @return validUntilType
         */
        public String getValidUntilType() {
            return this.validUntilType;
        }

        public static final class Builder {
            private String applicableProducts; 
            private String costBearer; 
            private String couponDescription; 
            private String createdTime; 
            private Double denomination; 
            private Integer limitPerPerson; 
            private String purchaseType; 
            private String reasonForApplication; 
            private String status; 
            private Long templateId; 
            private String templateName; 
            private String validUntil; 
            private String validUntilType; 

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
             * CouponDescription.
             */
            public Builder couponDescription(String couponDescription) {
                this.couponDescription = couponDescription;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Denomination.
             */
            public Builder denomination(Double denomination) {
                this.denomination = denomination;
                return this;
            }

            /**
             * LimitPerPerson.
             */
            public Builder limitPerPerson(Integer limitPerPerson) {
                this.limitPerPerson = limitPerPerson;
                return this;
            }

            /**
             * PurchaseType.
             */
            public Builder purchaseType(String purchaseType) {
                this.purchaseType = purchaseType;
                return this;
            }

            /**
             * ReasonForApplication.
             */
            public Builder reasonForApplication(String reasonForApplication) {
                this.reasonForApplication = reasonForApplication;
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
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
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
             * ValidUntil.
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            /**
             * ValidUntilType.
             */
            public Builder validUntilType(String validUntilType) {
                this.validUntilType = validUntilType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
