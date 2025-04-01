// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link CreateSupplierRegistrationRequest} extends {@link RequestModel}
 *
 * <p>CreateSupplierRegistrationRequest</p>
 */
public class CreateSupplierRegistrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactPerson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactPerson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactPersonTitle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactPersonTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableResellerMode")
    private Boolean enableResellerMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductAnnualRevenue")
    private String productAnnualRevenue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductBusiness")
    private String productBusiness;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductDeliveryTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> productDeliveryTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductPublishTime")
    private String productPublishTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductSellTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> productSellTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellBusinessDesc")
    private String resellBusinessDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Suggestion")
    private String suggestion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierDesc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String supplierDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierLogo")
    private String supplierLogo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String supplierName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierNameEn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String supplierNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String supplierUrl;

    private CreateSupplierRegistrationRequest(Builder builder) {
        super(builder);
        this.contactEmail = builder.contactEmail;
        this.contactNumber = builder.contactNumber;
        this.contactPerson = builder.contactPerson;
        this.contactPersonTitle = builder.contactPersonTitle;
        this.enableResellerMode = builder.enableResellerMode;
        this.productAnnualRevenue = builder.productAnnualRevenue;
        this.productBusiness = builder.productBusiness;
        this.productDeliveryTypes = builder.productDeliveryTypes;
        this.productPublishTime = builder.productPublishTime;
        this.productSellTypes = builder.productSellTypes;
        this.regionId = builder.regionId;
        this.resellBusinessDesc = builder.resellBusinessDesc;
        this.suggestion = builder.suggestion;
        this.supplierDesc = builder.supplierDesc;
        this.supplierLogo = builder.supplierLogo;
        this.supplierName = builder.supplierName;
        this.supplierNameEn = builder.supplierNameEn;
        this.supplierUrl = builder.supplierUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSupplierRegistrationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactEmail
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * @return contactNumber
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * @return contactPerson
     */
    public String getContactPerson() {
        return this.contactPerson;
    }

    /**
     * @return contactPersonTitle
     */
    public String getContactPersonTitle() {
        return this.contactPersonTitle;
    }

    /**
     * @return enableResellerMode
     */
    public Boolean getEnableResellerMode() {
        return this.enableResellerMode;
    }

    /**
     * @return productAnnualRevenue
     */
    public String getProductAnnualRevenue() {
        return this.productAnnualRevenue;
    }

    /**
     * @return productBusiness
     */
    public String getProductBusiness() {
        return this.productBusiness;
    }

    /**
     * @return productDeliveryTypes
     */
    public java.util.List<String> getProductDeliveryTypes() {
        return this.productDeliveryTypes;
    }

    /**
     * @return productPublishTime
     */
    public String getProductPublishTime() {
        return this.productPublishTime;
    }

    /**
     * @return productSellTypes
     */
    public java.util.List<String> getProductSellTypes() {
        return this.productSellTypes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellBusinessDesc
     */
    public String getResellBusinessDesc() {
        return this.resellBusinessDesc;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    /**
     * @return supplierDesc
     */
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    /**
     * @return supplierLogo
     */
    public String getSupplierLogo() {
        return this.supplierLogo;
    }

    /**
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    /**
     * @return supplierNameEn
     */
    public String getSupplierNameEn() {
        return this.supplierNameEn;
    }

    /**
     * @return supplierUrl
     */
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public static final class Builder extends Request.Builder<CreateSupplierRegistrationRequest, Builder> {
        private String contactEmail; 
        private String contactNumber; 
        private String contactPerson; 
        private String contactPersonTitle; 
        private Boolean enableResellerMode; 
        private String productAnnualRevenue; 
        private String productBusiness; 
        private java.util.List<String> productDeliveryTypes; 
        private String productPublishTime; 
        private java.util.List<String> productSellTypes; 
        private String regionId; 
        private String resellBusinessDesc; 
        private String suggestion; 
        private String supplierDesc; 
        private String supplierLogo; 
        private String supplierName; 
        private String supplierNameEn; 
        private String supplierUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateSupplierRegistrationRequest request) {
            super(request);
            this.contactEmail = request.contactEmail;
            this.contactNumber = request.contactNumber;
            this.contactPerson = request.contactPerson;
            this.contactPersonTitle = request.contactPersonTitle;
            this.enableResellerMode = request.enableResellerMode;
            this.productAnnualRevenue = request.productAnnualRevenue;
            this.productBusiness = request.productBusiness;
            this.productDeliveryTypes = request.productDeliveryTypes;
            this.productPublishTime = request.productPublishTime;
            this.productSellTypes = request.productSellTypes;
            this.regionId = request.regionId;
            this.resellBusinessDesc = request.resellBusinessDesc;
            this.suggestion = request.suggestion;
            this.supplierDesc = request.supplierDesc;
            this.supplierLogo = request.supplierLogo;
            this.supplierName = request.supplierName;
            this.supplierNameEn = request.supplierNameEn;
            this.supplierUrl = request.supplierUrl;
        } 

        /**
         * <p>Contact email</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxx@xxx.com">xxxx@xxx.com</a></p>
         */
        public Builder contactEmail(String contactEmail) {
            this.putQueryParameter("ContactEmail", contactEmail);
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * <p>Contact number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>186xxxxxxxxx</p>
         */
        public Builder contactNumber(String contactNumber) {
            this.putQueryParameter("ContactNumber", contactNumber);
            this.contactNumber = contactNumber;
            return this;
        }

        /**
         * <p>Contact person</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mike</p>
         */
        public Builder contactPerson(String contactPerson) {
            this.putQueryParameter("ContactPerson", contactPerson);
            this.contactPerson = contactPerson;
            return this;
        }

        /**
         * <p>Contact person tiltle</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CTO</p>
         */
        public Builder contactPersonTitle(String contactPersonTitle) {
            this.putQueryParameter("ContactPersonTitle", contactPersonTitle);
            this.contactPersonTitle = contactPersonTitle;
            return this;
        }

        /**
         * <p>Whether to enable the resell mode</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableResellerMode(Boolean enableResellerMode) {
            this.putQueryParameter("EnableResellerMode", enableResellerMode);
            this.enableResellerMode = enableResellerMode;
            return this;
        }

        /**
         * <p>Annual product revenue</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder productAnnualRevenue(String productAnnualRevenue) {
            this.putQueryParameter("ProductAnnualRevenue", productAnnualRevenue);
            this.productAnnualRevenue = productAnnualRevenue;
            return this;
        }

        /**
         * <p>The business of product</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder productBusiness(String productBusiness) {
            this.putQueryParameter("ProductBusiness", productBusiness);
            this.productBusiness = productBusiness;
            return this;
        }

        /**
         * <p>Product delivery type</p>
         * <p>This parameter is required.</p>
         */
        public Builder productDeliveryTypes(java.util.List<String> productDeliveryTypes) {
            this.putQueryParameter("ProductDeliveryTypes", productDeliveryTypes);
            this.productDeliveryTypes = productDeliveryTypes;
            return this;
        }

        /**
         * <p>The publish time of product</p>
         * 
         * <strong>example:</strong>
         * <p>2020.10.10</p>
         */
        public Builder productPublishTime(String productPublishTime) {
            this.putQueryParameter("ProductPublishTime", productPublishTime);
            this.productPublishTime = productPublishTime;
            return this;
        }

        /**
         * <p>Product sell type</p>
         * <p>This parameter is required.</p>
         */
        public Builder productSellTypes(java.util.List<String> productSellTypes) {
            this.putQueryParameter("ProductSellTypes", productSellTypes);
            this.productSellTypes = productSellTypes;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of resell business.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        public Builder resellBusinessDesc(String resellBusinessDesc) {
            this.putQueryParameter("ResellBusinessDesc", resellBusinessDesc);
            this.resellBusinessDesc = resellBusinessDesc;
            return this;
        }

        /**
         * <p>The demands of service providers.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        public Builder suggestion(String suggestion) {
            this.putQueryParameter("Suggestion", suggestion);
            this.suggestion = suggestion;
            return this;
        }

        /**
         * <p>The description of service provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test supplier</p>
         */
        public Builder supplierDesc(String supplierDesc) {
            this.putQueryParameter("SupplierDesc", supplierDesc);
            this.supplierDesc = supplierDesc;
            return this;
        }

        /**
         * <p>The Logo of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png</a></p>
         */
        public Builder supplierLogo(String supplierLogo) {
            this.putQueryParameter("SupplierLogo", supplierLogo);
            this.supplierLogo = supplierLogo;
            return this;
        }

        /**
         * <p>The name of the service provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        public Builder supplierName(String supplierName) {
            this.putQueryParameter("SupplierName", supplierName);
            this.supplierName = supplierName;
            return this;
        }

        /**
         * <p>The english name of the service provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        public Builder supplierNameEn(String supplierNameEn) {
            this.putQueryParameter("SupplierNameEn", supplierNameEn);
            this.supplierNameEn = supplierNameEn;
            return this;
        }

        /**
         * <p>The URL of the service provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
         */
        public Builder supplierUrl(String supplierUrl) {
            this.putQueryParameter("SupplierUrl", supplierUrl);
            this.supplierUrl = supplierUrl;
            return this;
        }

        @Override
        public CreateSupplierRegistrationRequest build() {
            return new CreateSupplierRegistrationRequest(this);
        } 

    } 

}
