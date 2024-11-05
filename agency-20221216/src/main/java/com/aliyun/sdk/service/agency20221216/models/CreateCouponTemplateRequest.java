// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCouponTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCouponTemplateRequest</p>
 */
public class CreateCouponTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicableProducts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicableProducts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostBearer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String costBearer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String couponDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expireddate")
    private String expireddate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitPerPerson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String limitPerPerson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private java.util.List < String > productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PurchaseType")
    private String purchaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReasonForApplication")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String reasonForApplication;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vailddate")
    private String vailddate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vaildperioddays")
    private String vaildperioddays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidUntil")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validUntil;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private CreateCouponTemplateRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.applicableProducts = builder.applicableProducts;
        this.costBearer = builder.costBearer;
        this.couponDescription = builder.couponDescription;
        this.expireddate = builder.expireddate;
        this.limitPerPerson = builder.limitPerPerson;
        this.productType = builder.productType;
        this.purchaseType = builder.purchaseType;
        this.reasonForApplication = builder.reasonForApplication;
        this.templateName = builder.templateName;
        this.vailddate = builder.vailddate;
        this.vaildperioddays = builder.vaildperioddays;
        this.validUntil = builder.validUntil;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCouponTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
     * @return expireddate
     */
    public String getExpireddate() {
        return this.expireddate;
    }

    /**
     * @return limitPerPerson
     */
    public String getLimitPerPerson() {
        return this.limitPerPerson;
    }

    /**
     * @return productType
     */
    public java.util.List < String > getProductType() {
        return this.productType;
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

    public static final class Builder extends Request.Builder<CreateCouponTemplateRequest, Builder> {
        private String acceptLanguage; 
        private String applicableProducts; 
        private String costBearer; 
        private String couponDescription; 
        private String expireddate; 
        private String limitPerPerson; 
        private java.util.List < String > productType; 
        private String purchaseType; 
        private String reasonForApplication; 
        private String templateName; 
        private String vailddate; 
        private String vaildperioddays; 
        private String validUntil; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateCouponTemplateRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.applicableProducts = request.applicableProducts;
            this.costBearer = request.costBearer;
            this.couponDescription = request.couponDescription;
            this.expireddate = request.expireddate;
            this.limitPerPerson = request.limitPerPerson;
            this.productType = request.productType;
            this.purchaseType = request.purchaseType;
            this.reasonForApplication = request.reasonForApplication;
            this.templateName = request.templateName;
            this.vailddate = request.vailddate;
            this.vaildperioddays = request.vaildperioddays;
            this.validUntil = request.validUntil;
            this.value = request.value;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>All Products</p>
         */
        public Builder applicableProducts(String applicableProducts) {
            this.putQueryParameter("ApplicableProducts", applicableProducts);
            this.applicableProducts = applicableProducts;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Partner</p>
         */
        public Builder costBearer(String costBearer) {
            this.putQueryParameter("CostBearer", costBearer);
            this.costBearer = costBearer;
            return this;
        }

        /**
         * CouponDescription.
         */
        public Builder couponDescription(String couponDescription) {
            this.putQueryParameter("CouponDescription", couponDescription);
            this.couponDescription = couponDescription;
            return this;
        }

        /**
         * Expireddate.
         */
        public Builder expireddate(String expireddate) {
            this.putQueryParameter("Expireddate", expireddate);
            this.expireddate = expireddate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlimited</p>
         */
        public Builder limitPerPerson(String limitPerPerson) {
            this.putQueryParameter("LimitPerPerson", limitPerPerson);
            this.limitPerPerson = limitPerPerson;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(java.util.List < String > productType) {
            String productTypeShrink = shrink(productType, "ProductType", "json");
            this.putQueryParameter("ProductType", productTypeShrink);
            this.productType = productType;
            return this;
        }

        /**
         * PurchaseType.
         */
        public Builder purchaseType(String purchaseType) {
            this.putQueryParameter("PurchaseType", purchaseType);
            this.purchaseType = purchaseType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder reasonForApplication(String reasonForApplication) {
            this.putQueryParameter("ReasonForApplication", reasonForApplication);
            this.reasonForApplication = reasonForApplication;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * Vailddate.
         */
        public Builder vailddate(String vailddate) {
            this.putQueryParameter("Vailddate", vailddate);
            this.vailddate = vailddate;
            return this;
        }

        /**
         * Vaildperioddays.
         */
        public Builder vaildperioddays(String vaildperioddays) {
            this.putQueryParameter("Vaildperioddays", vaildperioddays);
            this.vaildperioddays = vaildperioddays;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Validity Duration</p>
         */
        public Builder validUntil(String validUntil) {
            this.putQueryParameter("ValidUntil", validUntil);
            this.validUntil = validUntil;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateCouponTemplateRequest build() {
            return new CreateCouponTemplateRequest(this);
        } 

    } 

}
