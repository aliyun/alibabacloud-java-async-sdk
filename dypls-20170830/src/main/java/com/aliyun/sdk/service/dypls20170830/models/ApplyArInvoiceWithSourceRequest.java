// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyArInvoiceWithSourceRequest} extends {@link RequestModel}
 *
 * <p>ApplyArInvoiceWithSourceRequest</p>
 */
public class ApplyArInvoiceWithSourceRequest extends Request {
    @Body
    @NameInMap("Address")
    private Address address;

    @Body
    @NameInMap("Amount")
    private Double amount;

    @Body
    @NameInMap("AppCode")
    private String appCode;

    @Body
    @NameInMap("Applier")
    private String applier;

    @Body
    @NameInMap("ApplyDate")
    private String applyDate;

    @Body
    @NameInMap("CurrencyCode")
    private String currencyCode;

    @Body
    @NameInMap("Customer")
    private Customer customer;

    @Body
    @NameInMap("EncryptProps")
    private java.util.Map < String, String > encryptProps;

    @Body
    @NameInMap("ExcludingTaxAmount")
    private Double excludingTaxAmount;

    @Body
    @NameInMap("InputType")
    private String inputType;

    @Body
    @NameInMap("InvoiceType")
    private String invoiceType;

    @Body
    @NameInMap("IsMerged")
    private Boolean isMerged;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("MaterialType")
    private String materialType;

    @Body
    @NameInMap("Memo")
    private String memo;

    @Body
    @NameInMap("OuCode")
    private String ouCode;

    @Body
    @NameInMap("PurchaserBankInfo")
    private String purchaserBankInfo;

    @Body
    @NameInMap("PurchaserContactInfo")
    private String purchaserContactInfo;

    @Body
    @NameInMap("PurchaserName")
    private String purchaserName;

    @Body
    @NameInMap("PurchaserTaxNo")
    private String purchaserTaxNo;

    @Body
    @NameInMap("RequestNo")
    private String requestNo;

    @Body
    @NameInMap("Sign")
    private String sign;

    @Body
    @NameInMap("SiteId")
    private String siteId;

    @Body
    @NameInMap("SourceList")
    private java.util.List < SourceList> sourceList;

    @Body
    @NameInMap("TaxAmount")
    private Double taxAmount;

    @Body
    @NameInMap("Uuid")
    private String uuid;

    private ApplyArInvoiceWithSourceRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.amount = builder.amount;
        this.appCode = builder.appCode;
        this.applier = builder.applier;
        this.applyDate = builder.applyDate;
        this.currencyCode = builder.currencyCode;
        this.customer = builder.customer;
        this.encryptProps = builder.encryptProps;
        this.excludingTaxAmount = builder.excludingTaxAmount;
        this.inputType = builder.inputType;
        this.invoiceType = builder.invoiceType;
        this.isMerged = builder.isMerged;
        this.language = builder.language;
        this.materialType = builder.materialType;
        this.memo = builder.memo;
        this.ouCode = builder.ouCode;
        this.purchaserBankInfo = builder.purchaserBankInfo;
        this.purchaserContactInfo = builder.purchaserContactInfo;
        this.purchaserName = builder.purchaserName;
        this.purchaserTaxNo = builder.purchaserTaxNo;
        this.requestNo = builder.requestNo;
        this.sign = builder.sign;
        this.siteId = builder.siteId;
        this.sourceList = builder.sourceList;
        this.taxAmount = builder.taxAmount;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyArInvoiceWithSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public Address getAddress() {
        return this.address;
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
     * @return applier
     */
    public String getApplier() {
        return this.applier;
    }

    /**
     * @return applyDate
     */
    public String getApplyDate() {
        return this.applyDate;
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
     * @return inputType
     */
    public String getInputType() {
        return this.inputType;
    }

    /**
     * @return invoiceType
     */
    public String getInvoiceType() {
        return this.invoiceType;
    }

    /**
     * @return isMerged
     */
    public Boolean getIsMerged() {
        return this.isMerged;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return requestNo
     */
    public String getRequestNo() {
        return this.requestNo;
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
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ApplyArInvoiceWithSourceRequest, Builder> {
        private Address address; 
        private Double amount; 
        private String appCode; 
        private String applier; 
        private String applyDate; 
        private String currencyCode; 
        private Customer customer; 
        private java.util.Map < String, String > encryptProps; 
        private Double excludingTaxAmount; 
        private String inputType; 
        private String invoiceType; 
        private Boolean isMerged; 
        private String language; 
        private String materialType; 
        private String memo; 
        private String ouCode; 
        private String purchaserBankInfo; 
        private String purchaserContactInfo; 
        private String purchaserName; 
        private String purchaserTaxNo; 
        private String requestNo; 
        private String sign; 
        private String siteId; 
        private java.util.List < SourceList> sourceList; 
        private Double taxAmount; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ApplyArInvoiceWithSourceRequest request) {
            super(request);
            this.address = request.address;
            this.amount = request.amount;
            this.appCode = request.appCode;
            this.applier = request.applier;
            this.applyDate = request.applyDate;
            this.currencyCode = request.currencyCode;
            this.customer = request.customer;
            this.encryptProps = request.encryptProps;
            this.excludingTaxAmount = request.excludingTaxAmount;
            this.inputType = request.inputType;
            this.invoiceType = request.invoiceType;
            this.isMerged = request.isMerged;
            this.language = request.language;
            this.materialType = request.materialType;
            this.memo = request.memo;
            this.ouCode = request.ouCode;
            this.purchaserBankInfo = request.purchaserBankInfo;
            this.purchaserContactInfo = request.purchaserContactInfo;
            this.purchaserName = request.purchaserName;
            this.purchaserTaxNo = request.purchaserTaxNo;
            this.requestNo = request.requestNo;
            this.sign = request.sign;
            this.siteId = request.siteId;
            this.sourceList = request.sourceList;
            this.taxAmount = request.taxAmount;
            this.uuid = request.uuid;
        } 

        /**
         * Address.
         */
        public Builder address(Address address) {
            this.putBodyParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Amount.
         */
        public Builder amount(Double amount) {
            this.putBodyParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * Applier.
         */
        public Builder applier(String applier) {
            this.putBodyParameter("Applier", applier);
            this.applier = applier;
            return this;
        }

        /**
         * ApplyDate.
         */
        public Builder applyDate(String applyDate) {
            this.putBodyParameter("ApplyDate", applyDate);
            this.applyDate = applyDate;
            return this;
        }

        /**
         * CurrencyCode.
         */
        public Builder currencyCode(String currencyCode) {
            this.putBodyParameter("CurrencyCode", currencyCode);
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * Customer.
         */
        public Builder customer(Customer customer) {
            this.putBodyParameter("Customer", customer);
            this.customer = customer;
            return this;
        }

        /**
         * EncryptProps.
         */
        public Builder encryptProps(java.util.Map < String, String > encryptProps) {
            this.putBodyParameter("EncryptProps", encryptProps);
            this.encryptProps = encryptProps;
            return this;
        }

        /**
         * ExcludingTaxAmount.
         */
        public Builder excludingTaxAmount(Double excludingTaxAmount) {
            this.putBodyParameter("ExcludingTaxAmount", excludingTaxAmount);
            this.excludingTaxAmount = excludingTaxAmount;
            return this;
        }

        /**
         * InputType.
         */
        public Builder inputType(String inputType) {
            this.putBodyParameter("InputType", inputType);
            this.inputType = inputType;
            return this;
        }

        /**
         * InvoiceType.
         */
        public Builder invoiceType(String invoiceType) {
            this.putBodyParameter("InvoiceType", invoiceType);
            this.invoiceType = invoiceType;
            return this;
        }

        /**
         * IsMerged.
         */
        public Builder isMerged(Boolean isMerged) {
            this.putBodyParameter("IsMerged", isMerged);
            this.isMerged = isMerged;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MaterialType.
         */
        public Builder materialType(String materialType) {
            this.putBodyParameter("MaterialType", materialType);
            this.materialType = materialType;
            return this;
        }

        /**
         * Memo.
         */
        public Builder memo(String memo) {
            this.putBodyParameter("Memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * OuCode.
         */
        public Builder ouCode(String ouCode) {
            this.putBodyParameter("OuCode", ouCode);
            this.ouCode = ouCode;
            return this;
        }

        /**
         * PurchaserBankInfo.
         */
        public Builder purchaserBankInfo(String purchaserBankInfo) {
            this.putBodyParameter("PurchaserBankInfo", purchaserBankInfo);
            this.purchaserBankInfo = purchaserBankInfo;
            return this;
        }

        /**
         * PurchaserContactInfo.
         */
        public Builder purchaserContactInfo(String purchaserContactInfo) {
            this.putBodyParameter("PurchaserContactInfo", purchaserContactInfo);
            this.purchaserContactInfo = purchaserContactInfo;
            return this;
        }

        /**
         * PurchaserName.
         */
        public Builder purchaserName(String purchaserName) {
            this.putBodyParameter("PurchaserName", purchaserName);
            this.purchaserName = purchaserName;
            return this;
        }

        /**
         * PurchaserTaxNo.
         */
        public Builder purchaserTaxNo(String purchaserTaxNo) {
            this.putBodyParameter("PurchaserTaxNo", purchaserTaxNo);
            this.purchaserTaxNo = purchaserTaxNo;
            return this;
        }

        /**
         * RequestNo.
         */
        public Builder requestNo(String requestNo) {
            this.putBodyParameter("RequestNo", requestNo);
            this.requestNo = requestNo;
            return this;
        }

        /**
         * Sign.
         */
        public Builder sign(String sign) {
            this.putBodyParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(String siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SourceList.
         */
        public Builder sourceList(java.util.List < SourceList> sourceList) {
            this.putBodyParameter("SourceList", sourceList);
            this.sourceList = sourceList;
            return this;
        }

        /**
         * TaxAmount.
         */
        public Builder taxAmount(Double taxAmount) {
            this.putBodyParameter("TaxAmount", taxAmount);
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ApplyArInvoiceWithSourceRequest build() {
            return new ApplyArInvoiceWithSourceRequest(this);
        } 

    } 

    public static class AddressCustomer extends TeaModel {
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

        private AddressCustomer(Builder builder) {
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

        public static AddressCustomer create() {
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

            public AddressCustomer build() {
                return new AddressCustomer(this);
            } 

        } 

    }
    public static class Address extends TeaModel {
        @NameInMap("AddressId")
        private String addressId;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Customer")
        private AddressCustomer customer;

        @NameInMap("DetailedAddress")
        private String detailedAddress;

        @NameInMap("District")
        private String district;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("FixedNumber")
        private String fixedNumber;

        @NameInMap("FullAddress")
        private String fullAddress;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("IsEffective")
        private Boolean isEffective;

        @NameInMap("Language")
        private String language;

        @NameInMap("MobileNumber")
        private String mobileNumber;

        @NameInMap("Province")
        private String province;

        @NameInMap("RecipientName")
        private String recipientName;

        @NameInMap("RelatedId")
        private String relatedId;

        @NameInMap("RelatedSystem")
        private String relatedSystem;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Street")
        private String street;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("ZipCode")
        private String zipCode;

        private Address(Builder builder) {
            this.addressId = builder.addressId;
            this.appCode = builder.appCode;
            this.city = builder.city;
            this.country = builder.country;
            this.creator = builder.creator;
            this.customer = builder.customer;
            this.detailedAddress = builder.detailedAddress;
            this.district = builder.district;
            this.encryptProps = builder.encryptProps;
            this.fixedNumber = builder.fixedNumber;
            this.fullAddress = builder.fullAddress;
            this.isDefault = builder.isDefault;
            this.isEffective = builder.isEffective;
            this.language = builder.language;
            this.mobileNumber = builder.mobileNumber;
            this.province = builder.province;
            this.recipientName = builder.recipientName;
            this.relatedId = builder.relatedId;
            this.relatedSystem = builder.relatedSystem;
            this.sign = builder.sign;
            this.street = builder.street;
            this.uuid = builder.uuid;
            this.zipCode = builder.zipCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Address create() {
            return builder().build();
        }

        /**
         * @return addressId
         */
        public String getAddressId() {
            return this.addressId;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return customer
         */
        public AddressCustomer getCustomer() {
            return this.customer;
        }

        /**
         * @return detailedAddress
         */
        public String getDetailedAddress() {
            return this.detailedAddress;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return fixedNumber
         */
        public String getFixedNumber() {
            return this.fixedNumber;
        }

        /**
         * @return fullAddress
         */
        public String getFullAddress() {
            return this.fullAddress;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return isEffective
         */
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return mobileNumber
         */
        public String getMobileNumber() {
            return this.mobileNumber;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return recipientName
         */
        public String getRecipientName() {
            return this.recipientName;
        }

        /**
         * @return relatedId
         */
        public String getRelatedId() {
            return this.relatedId;
        }

        /**
         * @return relatedSystem
         */
        public String getRelatedSystem() {
            return this.relatedSystem;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return street
         */
        public String getStreet() {
            return this.street;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return zipCode
         */
        public String getZipCode() {
            return this.zipCode;
        }

        public static final class Builder {
            private String addressId; 
            private String appCode; 
            private String city; 
            private String country; 
            private String creator; 
            private AddressCustomer customer; 
            private String detailedAddress; 
            private String district; 
            private java.util.Map < String, String > encryptProps; 
            private String fixedNumber; 
            private String fullAddress; 
            private Boolean isDefault; 
            private Boolean isEffective; 
            private String language; 
            private String mobileNumber; 
            private String province; 
            private String recipientName; 
            private String relatedId; 
            private String relatedSystem; 
            private String sign; 
            private String street; 
            private String uuid; 
            private String zipCode; 

            /**
             * AddressId.
             */
            public Builder addressId(String addressId) {
                this.addressId = addressId;
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
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Customer.
             */
            public Builder customer(AddressCustomer customer) {
                this.customer = customer;
                return this;
            }

            /**
             * DetailedAddress.
             */
            public Builder detailedAddress(String detailedAddress) {
                this.detailedAddress = detailedAddress;
                return this;
            }

            /**
             * District.
             */
            public Builder district(String district) {
                this.district = district;
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
             * FixedNumber.
             */
            public Builder fixedNumber(String fixedNumber) {
                this.fixedNumber = fixedNumber;
                return this;
            }

            /**
             * FullAddress.
             */
            public Builder fullAddress(String fullAddress) {
                this.fullAddress = fullAddress;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * IsEffective.
             */
            public Builder isEffective(Boolean isEffective) {
                this.isEffective = isEffective;
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
             * MobileNumber.
             */
            public Builder mobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * RecipientName.
             */
            public Builder recipientName(String recipientName) {
                this.recipientName = recipientName;
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
             * RelatedSystem.
             */
            public Builder relatedSystem(String relatedSystem) {
                this.relatedSystem = relatedSystem;
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
             * Street.
             */
            public Builder street(String street) {
                this.street = street;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * ZipCode.
             */
            public Builder zipCode(String zipCode) {
                this.zipCode = zipCode;
                return this;
            }

            public Address build() {
                return new Address(this);
            } 

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
}
