// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvoiceInfoByRequestNoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInvoiceInfoByRequestNoResponseBody</p>
 */
public class QueryInvoiceInfoByRequestNoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ReturnValue")
    private ReturnValue returnValue;

    private QueryInvoiceInfoByRequestNoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.isSuccess = builder.isSuccess;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInvoiceInfoByRequestNoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return returnValue
     */
    public ReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Boolean isSuccess; 
        private ReturnValue returnValue; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * ReturnValue.
         */
        public Builder returnValue(ReturnValue returnValue) {
            this.returnValue = returnValue;
            return this;
        }

        public QueryInvoiceInfoByRequestNoResponseBody build() {
            return new QueryInvoiceInfoByRequestNoResponseBody(this);
        } 

    } 

    public static class Customer extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CustomerId")
        private String customerId;

        @NameInMap("CustomerSite")
        private String customerSite;

        @NameInMap("CustomerSystem")
        private String customerSystem;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("Language")
        private String language;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Uuid")
        private String uuid;

        private Customer(Builder builder) {
            this.appCode = builder.appCode;
            this.customerId = builder.customerId;
            this.customerSite = builder.customerSite;
            this.customerSystem = builder.customerSystem;
            this.encryptProps = builder.encryptProps;
            this.language = builder.language;
            this.sign = builder.sign;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Customer create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerSite
         */
        public String getCustomerSite() {
            return this.customerSite;
        }

        /**
         * @return customerSystem
         */
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String appCode; 
            private String customerId; 
            private String customerSite; 
            private String customerSystem; 
            private java.util.Map < String, String > encryptProps; 
            private String language; 
            private String sign; 
            private String uuid; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * CustomerSite.
             */
            public Builder customerSite(String customerSite) {
                this.customerSite = customerSite;
                return this;
            }

            /**
             * CustomerSystem.
             */
            public Builder customerSystem(String customerSystem) {
                this.customerSystem = customerSystem;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Customer build() {
                return new Customer(this);
            } 

        } 

    }
    public static class SourceListCustomer extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CustomerId")
        private String customerId;

        @NameInMap("CustomerSite")
        private String customerSite;

        @NameInMap("CustomerSystem")
        private String customerSystem;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("Language")
        private String language;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Uuid")
        private String uuid;

        private SourceListCustomer(Builder builder) {
            this.appCode = builder.appCode;
            this.customerId = builder.customerId;
            this.customerSite = builder.customerSite;
            this.customerSystem = builder.customerSystem;
            this.encryptProps = builder.encryptProps;
            this.language = builder.language;
            this.sign = builder.sign;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceListCustomer create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerSite
         */
        public String getCustomerSite() {
            return this.customerSite;
        }

        /**
         * @return customerSystem
         */
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String appCode; 
            private String customerId; 
            private String customerSite; 
            private String customerSystem; 
            private java.util.Map < String, String > encryptProps; 
            private String language; 
            private String sign; 
            private String uuid; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * CustomerSite.
             */
            public Builder customerSite(String customerSite) {
                this.customerSite = customerSite;
                return this;
            }

            /**
             * CustomerSystem.
             */
            public Builder customerSystem(String customerSystem) {
                this.customerSystem = customerSystem;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SourceListCustomer build() {
                return new SourceListCustomer(this);
            } 

        } 

    }
    public static class SourceList extends TeaModel {
        @NameInMap("Amount")
        private Double amount;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("BillAmount")
        private Double billAmount;

        @NameInMap("BillDomain")
        private String billDomain;

        @NameInMap("BillNo")
        private String billNo;

        @NameInMap("BillType")
        private String billType;

        @NameInMap("BlueSourceId")
        private Long blueSourceId;

        @NameInMap("CanMerge")
        private Boolean canMerge;

        @NameInMap("CargoName")
        private String cargoName;

        @NameInMap("Category")
        private String category;

        @NameInMap("CompanyName")
        private String companyName;

        @NameInMap("CurrencyCode")
        private String currencyCode;

        @NameInMap("Customer")
        private SourceListCustomer customer;

        @NameInMap("DiscountAmount")
        private Double discountAmount;

        @NameInMap("DiscountTaxAmount")
        private Double discountTaxAmount;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("ExcludingTaxAmount")
        private Double excludingTaxAmount;

        @NameInMap("ExcludingTaxDiscountAmount")
        private Double excludingTaxDiscountAmount;

        @NameInMap("ExcludingTaxRedAmount")
        private Double excludingTaxRedAmount;

        @NameInMap("ExcludingTaxRemainAmount")
        private Double excludingTaxRemainAmount;

        @NameInMap("GmtBill")
        private String gmtBill;

        @NameInMap("GmtBillEnd")
        private String gmtBillEnd;

        @NameInMap("GmtBillStart")
        private String gmtBillStart;

        @NameInMap("GmtBuild")
        private String gmtBuild;

        @NameInMap("IsApply")
        private String isApply;

        @NameInMap("Language")
        private String language;

        @NameInMap("MajorBillNo")
        private String majorBillNo;

        @NameInMap("Model")
        private String model;

        @NameInMap("OuCode")
        private String ouCode;

        @NameInMap("ParentCategory")
        private String parentCategory;

        @NameInMap("ProductDomain")
        private String productDomain;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("Quantity")
        private Double quantity;

        @NameInMap("QuantityUnit")
        private String quantityUnit;

        @NameInMap("RedAmount")
        private Double redAmount;

        @NameInMap("RelatedId")
        private String relatedId;

        @NameInMap("RemainAmount")
        private Double remainAmount;

        @NameInMap("RevenueType")
        private String revenueType;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("SiteId")
        private String siteId;

        @NameInMap("SourceId")
        private Long sourceId;

        @NameInMap("TaxAmount")
        private Double taxAmount;

        @NameInMap("TaxRate")
        private Double taxRate;

        @NameInMap("UnitPrice")
        private Double unitPrice;

        @NameInMap("Uuid")
        private String uuid;

        private SourceList(Builder builder) {
            this.amount = builder.amount;
            this.appCode = builder.appCode;
            this.billAmount = builder.billAmount;
            this.billDomain = builder.billDomain;
            this.billNo = builder.billNo;
            this.billType = builder.billType;
            this.blueSourceId = builder.blueSourceId;
            this.canMerge = builder.canMerge;
            this.cargoName = builder.cargoName;
            this.category = builder.category;
            this.companyName = builder.companyName;
            this.currencyCode = builder.currencyCode;
            this.customer = builder.customer;
            this.discountAmount = builder.discountAmount;
            this.discountTaxAmount = builder.discountTaxAmount;
            this.encryptProps = builder.encryptProps;
            this.excludingTaxAmount = builder.excludingTaxAmount;
            this.excludingTaxDiscountAmount = builder.excludingTaxDiscountAmount;
            this.excludingTaxRedAmount = builder.excludingTaxRedAmount;
            this.excludingTaxRemainAmount = builder.excludingTaxRemainAmount;
            this.gmtBill = builder.gmtBill;
            this.gmtBillEnd = builder.gmtBillEnd;
            this.gmtBillStart = builder.gmtBillStart;
            this.gmtBuild = builder.gmtBuild;
            this.isApply = builder.isApply;
            this.language = builder.language;
            this.majorBillNo = builder.majorBillNo;
            this.model = builder.model;
            this.ouCode = builder.ouCode;
            this.parentCategory = builder.parentCategory;
            this.productDomain = builder.productDomain;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.quantity = builder.quantity;
            this.quantityUnit = builder.quantityUnit;
            this.redAmount = builder.redAmount;
            this.relatedId = builder.relatedId;
            this.remainAmount = builder.remainAmount;
            this.revenueType = builder.revenueType;
            this.serviceName = builder.serviceName;
            this.sign = builder.sign;
            this.siteId = builder.siteId;
            this.sourceId = builder.sourceId;
            this.taxAmount = builder.taxAmount;
            this.taxRate = builder.taxRate;
            this.unitPrice = builder.unitPrice;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceList create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return billAmount
         */
        public Double getBillAmount() {
            return this.billAmount;
        }

        /**
         * @return billDomain
         */
        public String getBillDomain() {
            return this.billDomain;
        }

        /**
         * @return billNo
         */
        public String getBillNo() {
            return this.billNo;
        }

        /**
         * @return billType
         */
        public String getBillType() {
            return this.billType;
        }

        /**
         * @return blueSourceId
         */
        public Long getBlueSourceId() {
            return this.blueSourceId;
        }

        /**
         * @return canMerge
         */
        public Boolean getCanMerge() {
            return this.canMerge;
        }

        /**
         * @return cargoName
         */
        public String getCargoName() {
            return this.cargoName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        /**
         * @return customer
         */
        public SourceListCustomer getCustomer() {
            return this.customer;
        }

        /**
         * @return discountAmount
         */
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return discountTaxAmount
         */
        public Double getDiscountTaxAmount() {
            return this.discountTaxAmount;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return excludingTaxAmount
         */
        public Double getExcludingTaxAmount() {
            return this.excludingTaxAmount;
        }

        /**
         * @return excludingTaxDiscountAmount
         */
        public Double getExcludingTaxDiscountAmount() {
            return this.excludingTaxDiscountAmount;
        }

        /**
         * @return excludingTaxRedAmount
         */
        public Double getExcludingTaxRedAmount() {
            return this.excludingTaxRedAmount;
        }

        /**
         * @return excludingTaxRemainAmount
         */
        public Double getExcludingTaxRemainAmount() {
            return this.excludingTaxRemainAmount;
        }

        /**
         * @return gmtBill
         */
        public String getGmtBill() {
            return this.gmtBill;
        }

        /**
         * @return gmtBillEnd
         */
        public String getGmtBillEnd() {
            return this.gmtBillEnd;
        }

        /**
         * @return gmtBillStart
         */
        public String getGmtBillStart() {
            return this.gmtBillStart;
        }

        /**
         * @return gmtBuild
         */
        public String getGmtBuild() {
            return this.gmtBuild;
        }

        /**
         * @return isApply
         */
        public String getIsApply() {
            return this.isApply;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return majorBillNo
         */
        public String getMajorBillNo() {
            return this.majorBillNo;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return ouCode
         */
        public String getOuCode() {
            return this.ouCode;
        }

        /**
         * @return parentCategory
         */
        public String getParentCategory() {
            return this.parentCategory;
        }

        /**
         * @return productDomain
         */
        public String getProductDomain() {
            return this.productDomain;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return quantity
         */
        public Double getQuantity() {
            return this.quantity;
        }

        /**
         * @return quantityUnit
         */
        public String getQuantityUnit() {
            return this.quantityUnit;
        }

        /**
         * @return redAmount
         */
        public Double getRedAmount() {
            return this.redAmount;
        }

        /**
         * @return relatedId
         */
        public String getRelatedId() {
            return this.relatedId;
        }

        /**
         * @return remainAmount
         */
        public Double getRemainAmount() {
            return this.remainAmount;
        }

        /**
         * @return revenueType
         */
        public String getRevenueType() {
            return this.revenueType;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return siteId
         */
        public String getSiteId() {
            return this.siteId;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return taxAmount
         */
        public Double getTaxAmount() {
            return this.taxAmount;
        }

        /**
         * @return taxRate
         */
        public Double getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return unitPrice
         */
        public Double getUnitPrice() {
            return this.unitPrice;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Double amount; 
            private String appCode; 
            private Double billAmount; 
            private String billDomain; 
            private String billNo; 
            private String billType; 
            private Long blueSourceId; 
            private Boolean canMerge; 
            private String cargoName; 
            private String category; 
            private String companyName; 
            private String currencyCode; 
            private SourceListCustomer customer; 
            private Double discountAmount; 
            private Double discountTaxAmount; 
            private java.util.Map < String, String > encryptProps; 
            private Double excludingTaxAmount; 
            private Double excludingTaxDiscountAmount; 
            private Double excludingTaxRedAmount; 
            private Double excludingTaxRemainAmount; 
            private String gmtBill; 
            private String gmtBillEnd; 
            private String gmtBillStart; 
            private String gmtBuild; 
            private String isApply; 
            private String language; 
            private String majorBillNo; 
            private String model; 
            private String ouCode; 
            private String parentCategory; 
            private String productDomain; 
            private String productId; 
            private String productName; 
            private Double quantity; 
            private String quantityUnit; 
            private Double redAmount; 
            private String relatedId; 
            private Double remainAmount; 
            private String revenueType; 
            private String serviceName; 
            private String sign; 
            private String siteId; 
            private Long sourceId; 
            private Double taxAmount; 
            private Double taxRate; 
            private Double unitPrice; 
            private String uuid; 

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * BillAmount.
             */
            public Builder billAmount(Double billAmount) {
                this.billAmount = billAmount;
                return this;
            }

            /**
             * BillDomain.
             */
            public Builder billDomain(String billDomain) {
                this.billDomain = billDomain;
                return this;
            }

            /**
             * BillNo.
             */
            public Builder billNo(String billNo) {
                this.billNo = billNo;
                return this;
            }

            /**
             * BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * BlueSourceId.
             */
            public Builder blueSourceId(Long blueSourceId) {
                this.blueSourceId = blueSourceId;
                return this;
            }

            /**
             * CanMerge.
             */
            public Builder canMerge(Boolean canMerge) {
                this.canMerge = canMerge;
                return this;
            }

            /**
             * CargoName.
             */
            public Builder cargoName(String cargoName) {
                this.cargoName = cargoName;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CompanyName.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            /**
             * Customer.
             */
            public Builder customer(SourceListCustomer customer) {
                this.customer = customer;
                return this;
            }

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Double discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * DiscountTaxAmount.
             */
            public Builder discountTaxAmount(Double discountTaxAmount) {
                this.discountTaxAmount = discountTaxAmount;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * ExcludingTaxAmount.
             */
            public Builder excludingTaxAmount(Double excludingTaxAmount) {
                this.excludingTaxAmount = excludingTaxAmount;
                return this;
            }

            /**
             * ExcludingTaxDiscountAmount.
             */
            public Builder excludingTaxDiscountAmount(Double excludingTaxDiscountAmount) {
                this.excludingTaxDiscountAmount = excludingTaxDiscountAmount;
                return this;
            }

            /**
             * ExcludingTaxRedAmount.
             */
            public Builder excludingTaxRedAmount(Double excludingTaxRedAmount) {
                this.excludingTaxRedAmount = excludingTaxRedAmount;
                return this;
            }

            /**
             * ExcludingTaxRemainAmount.
             */
            public Builder excludingTaxRemainAmount(Double excludingTaxRemainAmount) {
                this.excludingTaxRemainAmount = excludingTaxRemainAmount;
                return this;
            }

            /**
             * GmtBill.
             */
            public Builder gmtBill(String gmtBill) {
                this.gmtBill = gmtBill;
                return this;
            }

            /**
             * GmtBillEnd.
             */
            public Builder gmtBillEnd(String gmtBillEnd) {
                this.gmtBillEnd = gmtBillEnd;
                return this;
            }

            /**
             * GmtBillStart.
             */
            public Builder gmtBillStart(String gmtBillStart) {
                this.gmtBillStart = gmtBillStart;
                return this;
            }

            /**
             * GmtBuild.
             */
            public Builder gmtBuild(String gmtBuild) {
                this.gmtBuild = gmtBuild;
                return this;
            }

            /**
             * IsApply.
             */
            public Builder isApply(String isApply) {
                this.isApply = isApply;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * MajorBillNo.
             */
            public Builder majorBillNo(String majorBillNo) {
                this.majorBillNo = majorBillNo;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * OuCode.
             */
            public Builder ouCode(String ouCode) {
                this.ouCode = ouCode;
                return this;
            }

            /**
             * ParentCategory.
             */
            public Builder parentCategory(String parentCategory) {
                this.parentCategory = parentCategory;
                return this;
            }

            /**
             * ProductDomain.
             */
            public Builder productDomain(String productDomain) {
                this.productDomain = productDomain;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * QuantityUnit.
             */
            public Builder quantityUnit(String quantityUnit) {
                this.quantityUnit = quantityUnit;
                return this;
            }

            /**
             * RedAmount.
             */
            public Builder redAmount(Double redAmount) {
                this.redAmount = redAmount;
                return this;
            }

            /**
             * RelatedId.
             */
            public Builder relatedId(String relatedId) {
                this.relatedId = relatedId;
                return this;
            }

            /**
             * RemainAmount.
             */
            public Builder remainAmount(Double remainAmount) {
                this.remainAmount = remainAmount;
                return this;
            }

            /**
             * RevenueType.
             */
            public Builder revenueType(String revenueType) {
                this.revenueType = revenueType;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * SiteId.
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * TaxAmount.
             */
            public Builder taxAmount(Double taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * TaxRate.
             */
            public Builder taxRate(Double taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * UnitPrice.
             */
            public Builder unitPrice(Double unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SourceList build() {
                return new SourceList(this);
            } 

        } 

    }
    public static class DetailList extends TeaModel {
        @NameInMap("Amount")
        private Double amount;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CargoName")
        private String cargoName;

        @NameInMap("DiscountAmount")
        private Double discountAmount;

        @NameInMap("DiscountTaxAmount")
        private Double discountTaxAmount;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("ExcludingTaxAmount")
        private Double excludingTaxAmount;

        @NameInMap("ExcludingTaxDiscountAmount")
        private Double excludingTaxDiscountAmount;

        @NameInMap("ExcludingTaxRedAmount")
        private Double excludingTaxRedAmount;

        @NameInMap("ExcludingTaxRemainAmount")
        private Double excludingTaxRemainAmount;

        @NameInMap("ExcludingTaxUnitPrice")
        private Double excludingTaxUnitPrice;

        @NameInMap("InvoiceDetailId")
        private Long invoiceDetailId;

        @NameInMap("Language")
        private String language;

        @NameInMap("Model")
        private String model;

        @NameInMap("Quantity")
        private Double quantity;

        @NameInMap("QuantityUnit")
        private String quantityUnit;

        @NameInMap("RedAmount")
        private Double redAmount;

        @NameInMap("RelatedId")
        private String relatedId;

        @NameInMap("RemainAmount")
        private Double remainAmount;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("SourceList")
        private java.util.List < SourceList> sourceList;

        @NameInMap("TaxAmount")
        private Double taxAmount;

        @NameInMap("TaxRate")
        private Double taxRate;

        @NameInMap("UnitPrice")
        private Double unitPrice;

        @NameInMap("Uuid")
        private String uuid;

        private DetailList(Builder builder) {
            this.amount = builder.amount;
            this.appCode = builder.appCode;
            this.cargoName = builder.cargoName;
            this.discountAmount = builder.discountAmount;
            this.discountTaxAmount = builder.discountTaxAmount;
            this.encryptProps = builder.encryptProps;
            this.excludingTaxAmount = builder.excludingTaxAmount;
            this.excludingTaxDiscountAmount = builder.excludingTaxDiscountAmount;
            this.excludingTaxRedAmount = builder.excludingTaxRedAmount;
            this.excludingTaxRemainAmount = builder.excludingTaxRemainAmount;
            this.excludingTaxUnitPrice = builder.excludingTaxUnitPrice;
            this.invoiceDetailId = builder.invoiceDetailId;
            this.language = builder.language;
            this.model = builder.model;
            this.quantity = builder.quantity;
            this.quantityUnit = builder.quantityUnit;
            this.redAmount = builder.redAmount;
            this.relatedId = builder.relatedId;
            this.remainAmount = builder.remainAmount;
            this.sign = builder.sign;
            this.sourceList = builder.sourceList;
            this.taxAmount = builder.taxAmount;
            this.taxRate = builder.taxRate;
            this.unitPrice = builder.unitPrice;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailList create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return cargoName
         */
        public String getCargoName() {
            return this.cargoName;
        }

        /**
         * @return discountAmount
         */
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return discountTaxAmount
         */
        public Double getDiscountTaxAmount() {
            return this.discountTaxAmount;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return excludingTaxAmount
         */
        public Double getExcludingTaxAmount() {
            return this.excludingTaxAmount;
        }

        /**
         * @return excludingTaxDiscountAmount
         */
        public Double getExcludingTaxDiscountAmount() {
            return this.excludingTaxDiscountAmount;
        }

        /**
         * @return excludingTaxRedAmount
         */
        public Double getExcludingTaxRedAmount() {
            return this.excludingTaxRedAmount;
        }

        /**
         * @return excludingTaxRemainAmount
         */
        public Double getExcludingTaxRemainAmount() {
            return this.excludingTaxRemainAmount;
        }

        /**
         * @return excludingTaxUnitPrice
         */
        public Double getExcludingTaxUnitPrice() {
            return this.excludingTaxUnitPrice;
        }

        /**
         * @return invoiceDetailId
         */
        public Long getInvoiceDetailId() {
            return this.invoiceDetailId;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return quantity
         */
        public Double getQuantity() {
            return this.quantity;
        }

        /**
         * @return quantityUnit
         */
        public String getQuantityUnit() {
            return this.quantityUnit;
        }

        /**
         * @return redAmount
         */
        public Double getRedAmount() {
            return this.redAmount;
        }

        /**
         * @return relatedId
         */
        public String getRelatedId() {
            return this.relatedId;
        }

        /**
         * @return remainAmount
         */
        public Double getRemainAmount() {
            return this.remainAmount;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return sourceList
         */
        public java.util.List < SourceList> getSourceList() {
            return this.sourceList;
        }

        /**
         * @return taxAmount
         */
        public Double getTaxAmount() {
            return this.taxAmount;
        }

        /**
         * @return taxRate
         */
        public Double getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return unitPrice
         */
        public Double getUnitPrice() {
            return this.unitPrice;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Double amount; 
            private String appCode; 
            private String cargoName; 
            private Double discountAmount; 
            private Double discountTaxAmount; 
            private java.util.Map < String, String > encryptProps; 
            private Double excludingTaxAmount; 
            private Double excludingTaxDiscountAmount; 
            private Double excludingTaxRedAmount; 
            private Double excludingTaxRemainAmount; 
            private Double excludingTaxUnitPrice; 
            private Long invoiceDetailId; 
            private String language; 
            private String model; 
            private Double quantity; 
            private String quantityUnit; 
            private Double redAmount; 
            private String relatedId; 
            private Double remainAmount; 
            private String sign; 
            private java.util.List < SourceList> sourceList; 
            private Double taxAmount; 
            private Double taxRate; 
            private Double unitPrice; 
            private String uuid; 

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * CargoName.
             */
            public Builder cargoName(String cargoName) {
                this.cargoName = cargoName;
                return this;
            }

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Double discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * DiscountTaxAmount.
             */
            public Builder discountTaxAmount(Double discountTaxAmount) {
                this.discountTaxAmount = discountTaxAmount;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * ExcludingTaxAmount.
             */
            public Builder excludingTaxAmount(Double excludingTaxAmount) {
                this.excludingTaxAmount = excludingTaxAmount;
                return this;
            }

            /**
             * ExcludingTaxDiscountAmount.
             */
            public Builder excludingTaxDiscountAmount(Double excludingTaxDiscountAmount) {
                this.excludingTaxDiscountAmount = excludingTaxDiscountAmount;
                return this;
            }

            /**
             * ExcludingTaxRedAmount.
             */
            public Builder excludingTaxRedAmount(Double excludingTaxRedAmount) {
                this.excludingTaxRedAmount = excludingTaxRedAmount;
                return this;
            }

            /**
             * ExcludingTaxRemainAmount.
             */
            public Builder excludingTaxRemainAmount(Double excludingTaxRemainAmount) {
                this.excludingTaxRemainAmount = excludingTaxRemainAmount;
                return this;
            }

            /**
             * ExcludingTaxUnitPrice.
             */
            public Builder excludingTaxUnitPrice(Double excludingTaxUnitPrice) {
                this.excludingTaxUnitPrice = excludingTaxUnitPrice;
                return this;
            }

            /**
             * InvoiceDetailId.
             */
            public Builder invoiceDetailId(Long invoiceDetailId) {
                this.invoiceDetailId = invoiceDetailId;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * QuantityUnit.
             */
            public Builder quantityUnit(String quantityUnit) {
                this.quantityUnit = quantityUnit;
                return this;
            }

            /**
             * RedAmount.
             */
            public Builder redAmount(Double redAmount) {
                this.redAmount = redAmount;
                return this;
            }

            /**
             * RelatedId.
             */
            public Builder relatedId(String relatedId) {
                this.relatedId = relatedId;
                return this;
            }

            /**
             * RemainAmount.
             */
            public Builder remainAmount(Double remainAmount) {
                this.remainAmount = remainAmount;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * SourceList.
             */
            public Builder sourceList(java.util.List < SourceList> sourceList) {
                this.sourceList = sourceList;
                return this;
            }

            /**
             * TaxAmount.
             */
            public Builder taxAmount(Double taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * TaxRate.
             */
            public Builder taxRate(Double taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * UnitPrice.
             */
            public Builder unitPrice(Double unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public DetailList build() {
                return new DetailList(this);
            } 

        } 

    }
    public static class LogisticsInfoCustomer extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CustomerId")
        private String customerId;

        @NameInMap("CustomerSite")
        private String customerSite;

        @NameInMap("CustomerSystem")
        private String customerSystem;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("Language")
        private String language;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Uuid")
        private String uuid;

        private LogisticsInfoCustomer(Builder builder) {
            this.appCode = builder.appCode;
            this.customerId = builder.customerId;
            this.customerSite = builder.customerSite;
            this.customerSystem = builder.customerSystem;
            this.encryptProps = builder.encryptProps;
            this.language = builder.language;
            this.sign = builder.sign;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogisticsInfoCustomer create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerSite
         */
        public String getCustomerSite() {
            return this.customerSite;
        }

        /**
         * @return customerSystem
         */
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String appCode; 
            private String customerId; 
            private String customerSite; 
            private String customerSystem; 
            private java.util.Map < String, String > encryptProps; 
            private String language; 
            private String sign; 
            private String uuid; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * CustomerSite.
             */
            public Builder customerSite(String customerSite) {
                this.customerSite = customerSite;
                return this;
            }

            /**
             * CustomerSystem.
             */
            public Builder customerSystem(String customerSystem) {
                this.customerSystem = customerSystem;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public LogisticsInfoCustomer build() {
                return new LogisticsInfoCustomer(this);
            } 

        } 

    }
    public static class LogisticsInfo extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("Customer")
        private LogisticsInfoCustomer customer;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("GmtSend")
        private String gmtSend;

        @NameInMap("InvoiceCode")
        private String invoiceCode;

        @NameInMap("InvoiceDate")
        private String invoiceDate;

        @NameInMap("InvoiceId")
        private Long invoiceId;

        @NameInMap("InvoiceNo")
        private String invoiceNo;

        @NameInMap("InvoiceNos")
        private String invoiceNos;

        @NameInMap("Language")
        private String language;

        @NameInMap("LogisticsCompanies")
        private String logisticsCompanies;

        @NameInMap("RelatedId")
        private String relatedId;

        @NameInMap("Sender")
        private String sender;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("TrackingNumber")
        private String trackingNumber;

        @NameInMap("Uuid")
        private String uuid;

        private LogisticsInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.customer = builder.customer;
            this.encryptProps = builder.encryptProps;
            this.gmtSend = builder.gmtSend;
            this.invoiceCode = builder.invoiceCode;
            this.invoiceDate = builder.invoiceDate;
            this.invoiceId = builder.invoiceId;
            this.invoiceNo = builder.invoiceNo;
            this.invoiceNos = builder.invoiceNos;
            this.language = builder.language;
            this.logisticsCompanies = builder.logisticsCompanies;
            this.relatedId = builder.relatedId;
            this.sender = builder.sender;
            this.sign = builder.sign;
            this.timestamp = builder.timestamp;
            this.trackingNumber = builder.trackingNumber;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogisticsInfo create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return customer
         */
        public LogisticsInfoCustomer getCustomer() {
            return this.customer;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return gmtSend
         */
        public String getGmtSend() {
            return this.gmtSend;
        }

        /**
         * @return invoiceCode
         */
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        /**
         * @return invoiceDate
         */
        public String getInvoiceDate() {
            return this.invoiceDate;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceNo
         */
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        /**
         * @return invoiceNos
         */
        public String getInvoiceNos() {
            return this.invoiceNos;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return logisticsCompanies
         */
        public String getLogisticsCompanies() {
            return this.logisticsCompanies;
        }

        /**
         * @return relatedId
         */
        public String getRelatedId() {
            return this.relatedId;
        }

        /**
         * @return sender
         */
        public String getSender() {
            return this.sender;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return trackingNumber
         */
        public String getTrackingNumber() {
            return this.trackingNumber;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String appCode; 
            private LogisticsInfoCustomer customer; 
            private java.util.Map < String, String > encryptProps; 
            private String gmtSend; 
            private String invoiceCode; 
            private String invoiceDate; 
            private Long invoiceId; 
            private String invoiceNo; 
            private String invoiceNos; 
            private String language; 
            private String logisticsCompanies; 
            private String relatedId; 
            private String sender; 
            private String sign; 
            private Long timestamp; 
            private String trackingNumber; 
            private String uuid; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * Customer.
             */
            public Builder customer(LogisticsInfoCustomer customer) {
                this.customer = customer;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * GmtSend.
             */
            public Builder gmtSend(String gmtSend) {
                this.gmtSend = gmtSend;
                return this;
            }

            /**
             * InvoiceCode.
             */
            public Builder invoiceCode(String invoiceCode) {
                this.invoiceCode = invoiceCode;
                return this;
            }

            /**
             * InvoiceDate.
             */
            public Builder invoiceDate(String invoiceDate) {
                this.invoiceDate = invoiceDate;
                return this;
            }

            /**
             * InvoiceId.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * InvoiceNo.
             */
            public Builder invoiceNo(String invoiceNo) {
                this.invoiceNo = invoiceNo;
                return this;
            }

            /**
             * InvoiceNos.
             */
            public Builder invoiceNos(String invoiceNos) {
                this.invoiceNos = invoiceNos;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LogisticsCompanies.
             */
            public Builder logisticsCompanies(String logisticsCompanies) {
                this.logisticsCompanies = logisticsCompanies;
                return this;
            }

            /**
             * RelatedId.
             */
            public Builder relatedId(String relatedId) {
                this.relatedId = relatedId;
                return this;
            }

            /**
             * Sender.
             */
            public Builder sender(String sender) {
                this.sender = sender;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TrackingNumber.
             */
            public Builder trackingNumber(String trackingNumber) {
                this.trackingNumber = trackingNumber;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public LogisticsInfo build() {
                return new LogisticsInfo(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("Amount")
        private Double amount;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CurrencyCode")
        private String currencyCode;

        @NameInMap("Customer")
        private Customer customer;

        @NameInMap("DetailList")
        private java.util.List < DetailList> detailList;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("ExcludingTaxAmount")
        private Double excludingTaxAmount;

        @NameInMap("ExcludingTaxRedAmount")
        private Double excludingTaxRedAmount;

        @NameInMap("ExcludingTaxRemainAmount")
        private Double excludingTaxRemainAmount;

        @NameInMap("InvoiceCode")
        private String invoiceCode;

        @NameInMap("InvoiceDate")
        private String invoiceDate;

        @NameInMap("InvoiceId")
        private Long invoiceId;

        @NameInMap("InvoiceNo")
        private String invoiceNo;

        @NameInMap("InvoiceStatus")
        private String invoiceStatus;

        @NameInMap("InvoiceType")
        private String invoiceType;

        @NameInMap("IsRed")
        private Boolean isRed;

        @NameInMap("IsReissue")
        private Boolean isReissue;

        @NameInMap("Language")
        private String language;

        @NameInMap("LinkInvoiceCode")
        private String linkInvoiceCode;

        @NameInMap("LinkInvoiceNo")
        private String linkInvoiceNo;

        @NameInMap("LogisticsInfo")
        private LogisticsInfo logisticsInfo;

        @NameInMap("MaterialType")
        private String materialType;

        @NameInMap("Memo")
        private String memo;

        @NameInMap("OuCode")
        private String ouCode;

        @NameInMap("PurchaserBankInfo")
        private String purchaserBankInfo;

        @NameInMap("PurchaserContactInfo")
        private String purchaserContactInfo;

        @NameInMap("PurchaserName")
        private String purchaserName;

        @NameInMap("PurchaserTaxNo")
        private String purchaserTaxNo;

        @NameInMap("RedAmount")
        private Double redAmount;

        @NameInMap("RelatedId")
        private String relatedId;

        @NameInMap("RemainAmount")
        private Double remainAmount;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("SiteId")
        private String siteId;

        @NameInMap("TaxAmount")
        private Double taxAmount;

        @NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
            this.amount = builder.amount;
            this.appCode = builder.appCode;
            this.currencyCode = builder.currencyCode;
            this.customer = builder.customer;
            this.detailList = builder.detailList;
            this.encryptProps = builder.encryptProps;
            this.excludingTaxAmount = builder.excludingTaxAmount;
            this.excludingTaxRedAmount = builder.excludingTaxRedAmount;
            this.excludingTaxRemainAmount = builder.excludingTaxRemainAmount;
            this.invoiceCode = builder.invoiceCode;
            this.invoiceDate = builder.invoiceDate;
            this.invoiceId = builder.invoiceId;
            this.invoiceNo = builder.invoiceNo;
            this.invoiceStatus = builder.invoiceStatus;
            this.invoiceType = builder.invoiceType;
            this.isRed = builder.isRed;
            this.isReissue = builder.isReissue;
            this.language = builder.language;
            this.linkInvoiceCode = builder.linkInvoiceCode;
            this.linkInvoiceNo = builder.linkInvoiceNo;
            this.logisticsInfo = builder.logisticsInfo;
            this.materialType = builder.materialType;
            this.memo = builder.memo;
            this.ouCode = builder.ouCode;
            this.purchaserBankInfo = builder.purchaserBankInfo;
            this.purchaserContactInfo = builder.purchaserContactInfo;
            this.purchaserName = builder.purchaserName;
            this.purchaserTaxNo = builder.purchaserTaxNo;
            this.redAmount = builder.redAmount;
            this.relatedId = builder.relatedId;
            this.remainAmount = builder.remainAmount;
            this.sign = builder.sign;
            this.siteId = builder.siteId;
            this.taxAmount = builder.taxAmount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        /**
         * @return customer
         */
        public Customer getCustomer() {
            return this.customer;
        }

        /**
         * @return detailList
         */
        public java.util.List < DetailList> getDetailList() {
            return this.detailList;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return excludingTaxAmount
         */
        public Double getExcludingTaxAmount() {
            return this.excludingTaxAmount;
        }

        /**
         * @return excludingTaxRedAmount
         */
        public Double getExcludingTaxRedAmount() {
            return this.excludingTaxRedAmount;
        }

        /**
         * @return excludingTaxRemainAmount
         */
        public Double getExcludingTaxRemainAmount() {
            return this.excludingTaxRemainAmount;
        }

        /**
         * @return invoiceCode
         */
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        /**
         * @return invoiceDate
         */
        public String getInvoiceDate() {
            return this.invoiceDate;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceNo
         */
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        /**
         * @return invoiceStatus
         */
        public String getInvoiceStatus() {
            return this.invoiceStatus;
        }

        /**
         * @return invoiceType
         */
        public String getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return isRed
         */
        public Boolean getIsRed() {
            return this.isRed;
        }

        /**
         * @return isReissue
         */
        public Boolean getIsReissue() {
            return this.isReissue;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return linkInvoiceCode
         */
        public String getLinkInvoiceCode() {
            return this.linkInvoiceCode;
        }

        /**
         * @return linkInvoiceNo
         */
        public String getLinkInvoiceNo() {
            return this.linkInvoiceNo;
        }

        /**
         * @return logisticsInfo
         */
        public LogisticsInfo getLogisticsInfo() {
            return this.logisticsInfo;
        }

        /**
         * @return materialType
         */
        public String getMaterialType() {
            return this.materialType;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return ouCode
         */
        public String getOuCode() {
            return this.ouCode;
        }

        /**
         * @return purchaserBankInfo
         */
        public String getPurchaserBankInfo() {
            return this.purchaserBankInfo;
        }

        /**
         * @return purchaserContactInfo
         */
        public String getPurchaserContactInfo() {
            return this.purchaserContactInfo;
        }

        /**
         * @return purchaserName
         */
        public String getPurchaserName() {
            return this.purchaserName;
        }

        /**
         * @return purchaserTaxNo
         */
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        /**
         * @return redAmount
         */
        public Double getRedAmount() {
            return this.redAmount;
        }

        /**
         * @return relatedId
         */
        public String getRelatedId() {
            return this.relatedId;
        }

        /**
         * @return remainAmount
         */
        public Double getRemainAmount() {
            return this.remainAmount;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return siteId
         */
        public String getSiteId() {
            return this.siteId;
        }

        /**
         * @return taxAmount
         */
        public Double getTaxAmount() {
            return this.taxAmount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Double amount; 
            private String appCode; 
            private String currencyCode; 
            private Customer customer; 
            private java.util.List < DetailList> detailList; 
            private java.util.Map < String, String > encryptProps; 
            private Double excludingTaxAmount; 
            private Double excludingTaxRedAmount; 
            private Double excludingTaxRemainAmount; 
            private String invoiceCode; 
            private String invoiceDate; 
            private Long invoiceId; 
            private String invoiceNo; 
            private String invoiceStatus; 
            private String invoiceType; 
            private Boolean isRed; 
            private Boolean isReissue; 
            private String language; 
            private String linkInvoiceCode; 
            private String linkInvoiceNo; 
            private LogisticsInfo logisticsInfo; 
            private String materialType; 
            private String memo; 
            private String ouCode; 
            private String purchaserBankInfo; 
            private String purchaserContactInfo; 
            private String purchaserName; 
            private String purchaserTaxNo; 
            private Double redAmount; 
            private String relatedId; 
            private Double remainAmount; 
            private String sign; 
            private String siteId; 
            private Double taxAmount; 
            private String uuid; 

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            /**
             * Customer.
             */
            public Builder customer(Customer customer) {
                this.customer = customer;
                return this;
            }

            /**
             * DetailList.
             */
            public Builder detailList(java.util.List < DetailList> detailList) {
                this.detailList = detailList;
                return this;
            }

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * ExcludingTaxAmount.
             */
            public Builder excludingTaxAmount(Double excludingTaxAmount) {
                this.excludingTaxAmount = excludingTaxAmount;
                return this;
            }

            /**
             * ExcludingTaxRedAmount.
             */
            public Builder excludingTaxRedAmount(Double excludingTaxRedAmount) {
                this.excludingTaxRedAmount = excludingTaxRedAmount;
                return this;
            }

            /**
             * ExcludingTaxRemainAmount.
             */
            public Builder excludingTaxRemainAmount(Double excludingTaxRemainAmount) {
                this.excludingTaxRemainAmount = excludingTaxRemainAmount;
                return this;
            }

            /**
             * InvoiceCode.
             */
            public Builder invoiceCode(String invoiceCode) {
                this.invoiceCode = invoiceCode;
                return this;
            }

            /**
             * InvoiceDate.
             */
            public Builder invoiceDate(String invoiceDate) {
                this.invoiceDate = invoiceDate;
                return this;
            }

            /**
             * InvoiceId.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * InvoiceNo.
             */
            public Builder invoiceNo(String invoiceNo) {
                this.invoiceNo = invoiceNo;
                return this;
            }

            /**
             * InvoiceStatus.
             */
            public Builder invoiceStatus(String invoiceStatus) {
                this.invoiceStatus = invoiceStatus;
                return this;
            }

            /**
             * InvoiceType.
             */
            public Builder invoiceType(String invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * IsRed.
             */
            public Builder isRed(Boolean isRed) {
                this.isRed = isRed;
                return this;
            }

            /**
             * IsReissue.
             */
            public Builder isReissue(Boolean isReissue) {
                this.isReissue = isReissue;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LinkInvoiceCode.
             */
            public Builder linkInvoiceCode(String linkInvoiceCode) {
                this.linkInvoiceCode = linkInvoiceCode;
                return this;
            }

            /**
             * LinkInvoiceNo.
             */
            public Builder linkInvoiceNo(String linkInvoiceNo) {
                this.linkInvoiceNo = linkInvoiceNo;
                return this;
            }

            /**
             * LogisticsInfo.
             */
            public Builder logisticsInfo(LogisticsInfo logisticsInfo) {
                this.logisticsInfo = logisticsInfo;
                return this;
            }

            /**
             * MaterialType.
             */
            public Builder materialType(String materialType) {
                this.materialType = materialType;
                return this;
            }

            /**
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * OuCode.
             */
            public Builder ouCode(String ouCode) {
                this.ouCode = ouCode;
                return this;
            }

            /**
             * PurchaserBankInfo.
             */
            public Builder purchaserBankInfo(String purchaserBankInfo) {
                this.purchaserBankInfo = purchaserBankInfo;
                return this;
            }

            /**
             * PurchaserContactInfo.
             */
            public Builder purchaserContactInfo(String purchaserContactInfo) {
                this.purchaserContactInfo = purchaserContactInfo;
                return this;
            }

            /**
             * PurchaserName.
             */
            public Builder purchaserName(String purchaserName) {
                this.purchaserName = purchaserName;
                return this;
            }

            /**
             * PurchaserTaxNo.
             */
            public Builder purchaserTaxNo(String purchaserTaxNo) {
                this.purchaserTaxNo = purchaserTaxNo;
                return this;
            }

            /**
             * RedAmount.
             */
            public Builder redAmount(Double redAmount) {
                this.redAmount = redAmount;
                return this;
            }

            /**
             * RelatedId.
             */
            public Builder relatedId(String relatedId) {
                this.relatedId = relatedId;
                return this;
            }

            /**
             * RemainAmount.
             */
            public Builder remainAmount(Double remainAmount) {
                this.remainAmount = remainAmount;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * SiteId.
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * TaxAmount.
             */
            public Builder taxAmount(Double taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class ReturnValue extends TeaModel {
        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Sign")
        private String sign;

        private ReturnValue(Builder builder) {
            this.encryptProps = builder.encryptProps;
            this.list = builder.list;
            this.sign = builder.sign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnValue create() {
            return builder().build();
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        public static final class Builder {
            private java.util.Map < String, String > encryptProps; 
            private java.util.List < List> list; 
            private String sign; 

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            public ReturnValue build() {
                return new ReturnValue(this);
            } 

        } 

    }
}
