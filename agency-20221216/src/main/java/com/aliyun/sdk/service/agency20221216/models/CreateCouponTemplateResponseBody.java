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

        private Builder(CreateCouponTemplateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2103a30617045934095083027d88c5</p>
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

        public CreateCouponTemplateResponseBody build() {
            return new CreateCouponTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCouponTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCouponTemplateResponseBody</p>
     */
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
        private java.util.List<String> productType;

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
        public java.util.List<String> getProductType() {
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
            private java.util.List<String> productType; 
            private String status; 
            private String templateName; 
            private String vailddate; 
            private String vaildperioddays; 
            private String validUntil; 
            private String value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicableProducts = model.applicableProducts;
                this.costBearer = model.costBearer;
                this.couponTemplateID = model.couponTemplateID;
                this.createTime = model.createTime;
                this.expireddate = model.expireddate;
                this.productType = model.productType;
                this.status = model.status;
                this.templateName = model.templateName;
                this.vailddate = model.vailddate;
                this.vaildperioddays = model.vaildperioddays;
                this.validUntil = model.validUntil;
                this.value = model.value;
            } 

            /**
             * <p>The applicable products.</p>
             * <ul>
             * <li>All Products: All products.</li>
             * <li>Custom: Custom products.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * <p>The party that bears the coupon cost.</p>
             * <ul>
             * <li>Partner: Borne by the partner.</li>
             * <li>Alibaba Cloud: Borne by Alibaba Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Partner</p>
             */
            public Builder costBearer(String costBearer) {
                this.costBearer = costBearer;
                return this;
            }

            /**
             * <p>The ID of the coupon template.</p>
             * 
             * <strong>example:</strong>
             * <p>111111</p>
             */
            public Builder couponTemplateID(Long couponTemplateID) {
                this.couponTemplateID = couponTemplateID;
                return this;
            }

            /**
             * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-02 16:15:31</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time of the effective period.
             * Format: yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01</p>
             */
            public Builder expireddate(String expireddate) {
                this.expireddate = expireddate;
                return this;
            }

            /**
             * <p>The list of product codes.</p>
             */
            public Builder productType(java.util.List<String> productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The status of the coupon template. Valid values:</p>
             * <ul>
             * <li>CREATED: Created.</li>
             * <li>APPROVING: Under review.</li>
             * <li>APPROVED: Approved.</li>
             * <li>UNAPPROVED: Unapproved.</li>
             * <li>ABANDONED: Abandoned.</li>
             * <li>EXPIRED: Expired.</li>
             * <li>EXHAUSTED: Exhausted.</li>
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
             * <p>The start time of the effective period.
             * Format: yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01</p>
             */
            public Builder vailddate(String vailddate) {
                this.vailddate = vailddate;
                return this;
            }

            /**
             * <p>The duration of the relative time in days.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vaildperioddays(String vaildperioddays) {
                this.vaildperioddays = vaildperioddays;
                return this;
            }

            /**
             * <p>The validity period of the coupon.</p>
             * <ul>
             * <li>Validity Duration: From the date of issuance.</li>
             * <li>Custom Timeframe: Custom time period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Validity Duration</p>
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            /**
             * <p>The denomination.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
