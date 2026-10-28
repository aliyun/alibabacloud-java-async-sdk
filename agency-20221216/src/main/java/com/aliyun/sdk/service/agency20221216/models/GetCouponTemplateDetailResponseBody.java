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

        private Builder(GetCouponTemplateDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The operation result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The prompt message.</p>
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
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicableProducts = model.applicableProducts;
                this.costBearer = model.costBearer;
                this.couponDescription = model.couponDescription;
                this.createdTime = model.createdTime;
                this.denomination = model.denomination;
                this.limitPerPerson = model.limitPerPerson;
                this.purchaseType = model.purchaseType;
                this.reasonForApplication = model.reasonForApplication;
                this.status = model.status;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.validUntil = model.validUntil;
                this.validUntilType = model.validUntilType;
            } 

            /**
             * <p>The applicable products. Valid values:</p>
             * <ul>
             * <li><p>UNIVERSAL: all products</p>
             * </li>
             * <li><p>a specific commodity code</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UNIVERSAL</p>
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * <p>The party that bears the coupon cost. Valid values:
             * ● cost_by_self: The cost is borne by the caller.
             * ● aliyun_poc: The cost is borne by Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_poc</p>
             */
            public Builder costBearer(String costBearer) {
                this.costBearer = costBearer;
                return this;
            }

            /**
             * <p>The remarks of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>For testing</p>
             */
            public Builder couponDescription(String couponDescription) {
                this.couponDescription = couponDescription;
                return this;
            }

            /**
             * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-21 18:18:22</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The face value.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder denomination(Double denomination) {
                this.denomination = denomination;
                return this;
            }

            /**
             * <p>The maximum number of coupons that each person can claim. Valid values:</p>
             * <ul>
             * <li><p>1: Each person can claim one coupon.</p>
             * </li>
             * <li><p>0: No limit applies.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder limitPerPerson(Integer limitPerPerson) {
                this.limitPerPerson = limitPerPerson;
                return this;
            }

            /**
             * <p>The order type. Valid values:</p>
             * <ul>
             * <li>ALL: Alibaba Cloud upfront order</li>
             * <li>BILLING: Alibaba Cloud pay-as-you-go bill</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL,BILLING</p>
             */
            public Builder purchaseType(String purchaseType) {
                this.purchaseType = purchaseType;
                return this;
            }

            /**
             * <p>The reason for the template application.</p>
             * 
             * <strong>example:</strong>
             * <p>For testing</p>
             */
            public Builder reasonForApplication(String reasonForApplication) {
                this.reasonForApplication = reasonForApplication;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>APPROVED: approved</li>
             * <li>ABANDONED: voided</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1576</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the coupon template.</p>
             * 
             * <strong>example:</strong>
             * <p>Template name</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The validity period. This parameter is used together with the validity period type.</p>
             * <ul>
             * <li><p>If the validity period type is relative time, the validity period is the number of valid days.</p>
             * </li>
             * <li><p>If the validity period type is absolute time, the validity period is a time period.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            /**
             * <p>The type of the validity period. Valid values:</p>
             * <ul>
             * <li>0: relative time</li>
             * <li>1: absolute time</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
