// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link FindCustomerSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>FindCustomerSnapshotResponseBody</p>
 */
public class FindCustomerSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CustomerSnapshot")
    private CustomerSnapshot customerSnapshot;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindCustomerSnapshotResponseBody(Builder builder) {
        this.code = builder.code;
        this.customerSnapshot = builder.customerSnapshot;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindCustomerSnapshotResponseBody create() {
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
     * @return customerSnapshot
     */
    public CustomerSnapshot getCustomerSnapshot() {
        return this.customerSnapshot;
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
        private CustomerSnapshot customerSnapshot; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindCustomerSnapshotResponseBody model) {
            this.code = model.code;
            this.customerSnapshot = model.customerSnapshot;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CustomerSnapshot.
         */
        public Builder customerSnapshot(CustomerSnapshot customerSnapshot) {
            this.customerSnapshot = customerSnapshot;
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

        public FindCustomerSnapshotResponseBody build() {
            return new FindCustomerSnapshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindCustomerSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>FindCustomerSnapshotResponseBody</p>
     */
    public static class AccountInfoSnapshotModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Address2")
        private String address2;

        @com.aliyun.core.annotation.NameInMap("Address3")
        private String address3;

        @com.aliyun.core.annotation.NameInMap("Address4")
        private String address4;

        @com.aliyun.core.annotation.NameInMap("Address5")
        private String address5;

        @com.aliyun.core.annotation.NameInMap("Address6")
        private String address6;

        @com.aliyun.core.annotation.NameInMap("CityId")
        private String cityId;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("PostCode")
        private String postCode;

        @com.aliyun.core.annotation.NameInMap("ProvinceId")
        private String provinceId;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("TrueName")
        private String trueName;

        private AccountInfoSnapshotModel(Builder builder) {
            this.address = builder.address;
            this.address2 = builder.address2;
            this.address3 = builder.address3;
            this.address4 = builder.address4;
            this.address5 = builder.address5;
            this.address6 = builder.address6;
            this.cityId = builder.cityId;
            this.cityName = builder.cityName;
            this.postCode = builder.postCode;
            this.provinceId = builder.provinceId;
            this.provinceName = builder.provinceName;
            this.trueName = builder.trueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfoSnapshotModel create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return address2
         */
        public String getAddress2() {
            return this.address2;
        }

        /**
         * @return address3
         */
        public String getAddress3() {
            return this.address3;
        }

        /**
         * @return address4
         */
        public String getAddress4() {
            return this.address4;
        }

        /**
         * @return address5
         */
        public String getAddress5() {
            return this.address5;
        }

        /**
         * @return address6
         */
        public String getAddress6() {
            return this.address6;
        }

        /**
         * @return cityId
         */
        public String getCityId() {
            return this.cityId;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return postCode
         */
        public String getPostCode() {
            return this.postCode;
        }

        /**
         * @return provinceId
         */
        public String getProvinceId() {
            return this.provinceId;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        /**
         * @return trueName
         */
        public String getTrueName() {
            return this.trueName;
        }

        public static final class Builder {
            private String address; 
            private String address2; 
            private String address3; 
            private String address4; 
            private String address5; 
            private String address6; 
            private String cityId; 
            private String cityName; 
            private String postCode; 
            private String provinceId; 
            private String provinceName; 
            private String trueName; 

            private Builder() {
            } 

            private Builder(AccountInfoSnapshotModel model) {
                this.address = model.address;
                this.address2 = model.address2;
                this.address3 = model.address3;
                this.address4 = model.address4;
                this.address5 = model.address5;
                this.address6 = model.address6;
                this.cityId = model.cityId;
                this.cityName = model.cityName;
                this.postCode = model.postCode;
                this.provinceId = model.provinceId;
                this.provinceName = model.provinceName;
                this.trueName = model.trueName;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Address2.
             */
            public Builder address2(String address2) {
                this.address2 = address2;
                return this;
            }

            /**
             * Address3.
             */
            public Builder address3(String address3) {
                this.address3 = address3;
                return this;
            }

            /**
             * Address4.
             */
            public Builder address4(String address4) {
                this.address4 = address4;
                return this;
            }

            /**
             * Address5.
             */
            public Builder address5(String address5) {
                this.address5 = address5;
                return this;
            }

            /**
             * Address6.
             */
            public Builder address6(String address6) {
                this.address6 = address6;
                return this;
            }

            /**
             * CityId.
             */
            public Builder cityId(String cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * PostCode.
             */
            public Builder postCode(String postCode) {
                this.postCode = postCode;
                return this;
            }

            /**
             * ProvinceId.
             */
            public Builder provinceId(String provinceId) {
                this.provinceId = provinceId;
                return this;
            }

            /**
             * ProvinceName.
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * TrueName.
             */
            public Builder trueName(String trueName) {
                this.trueName = trueName;
                return this;
            }

            public AccountInfoSnapshotModel build() {
                return new AccountInfoSnapshotModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindCustomerSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>FindCustomerSnapshotResponseBody</p>
     */
    public static class AccountTaxSnapshotModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinanceTaxCertificateImgName")
        private String financeTaxCertificateImgName;

        @com.aliyun.core.annotation.NameInMap("FinanceTaxCertificateImgUrl")
        private String financeTaxCertificateImgUrl;

        @com.aliyun.core.annotation.NameInMap("SecondFinanceTax")
        private String secondFinanceTax;

        @com.aliyun.core.annotation.NameInMap("SecondFinanceTaxCertificateImgName")
        private String secondFinanceTaxCertificateImgName;

        @com.aliyun.core.annotation.NameInMap("SecondFinanceTaxCertificateImgUrl")
        private String secondFinanceTaxCertificateImgUrl;

        @com.aliyun.core.annotation.NameInMap("Tax")
        private String tax;

        private AccountTaxSnapshotModel(Builder builder) {
            this.financeTaxCertificateImgName = builder.financeTaxCertificateImgName;
            this.financeTaxCertificateImgUrl = builder.financeTaxCertificateImgUrl;
            this.secondFinanceTax = builder.secondFinanceTax;
            this.secondFinanceTaxCertificateImgName = builder.secondFinanceTaxCertificateImgName;
            this.secondFinanceTaxCertificateImgUrl = builder.secondFinanceTaxCertificateImgUrl;
            this.tax = builder.tax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountTaxSnapshotModel create() {
            return builder().build();
        }

        /**
         * @return financeTaxCertificateImgName
         */
        public String getFinanceTaxCertificateImgName() {
            return this.financeTaxCertificateImgName;
        }

        /**
         * @return financeTaxCertificateImgUrl
         */
        public String getFinanceTaxCertificateImgUrl() {
            return this.financeTaxCertificateImgUrl;
        }

        /**
         * @return secondFinanceTax
         */
        public String getSecondFinanceTax() {
            return this.secondFinanceTax;
        }

        /**
         * @return secondFinanceTaxCertificateImgName
         */
        public String getSecondFinanceTaxCertificateImgName() {
            return this.secondFinanceTaxCertificateImgName;
        }

        /**
         * @return secondFinanceTaxCertificateImgUrl
         */
        public String getSecondFinanceTaxCertificateImgUrl() {
            return this.secondFinanceTaxCertificateImgUrl;
        }

        /**
         * @return tax
         */
        public String getTax() {
            return this.tax;
        }

        public static final class Builder {
            private String financeTaxCertificateImgName; 
            private String financeTaxCertificateImgUrl; 
            private String secondFinanceTax; 
            private String secondFinanceTaxCertificateImgName; 
            private String secondFinanceTaxCertificateImgUrl; 
            private String tax; 

            private Builder() {
            } 

            private Builder(AccountTaxSnapshotModel model) {
                this.financeTaxCertificateImgName = model.financeTaxCertificateImgName;
                this.financeTaxCertificateImgUrl = model.financeTaxCertificateImgUrl;
                this.secondFinanceTax = model.secondFinanceTax;
                this.secondFinanceTaxCertificateImgName = model.secondFinanceTaxCertificateImgName;
                this.secondFinanceTaxCertificateImgUrl = model.secondFinanceTaxCertificateImgUrl;
                this.tax = model.tax;
            } 

            /**
             * FinanceTaxCertificateImgName.
             */
            public Builder financeTaxCertificateImgName(String financeTaxCertificateImgName) {
                this.financeTaxCertificateImgName = financeTaxCertificateImgName;
                return this;
            }

            /**
             * FinanceTaxCertificateImgUrl.
             */
            public Builder financeTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
                this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
                return this;
            }

            /**
             * SecondFinanceTax.
             */
            public Builder secondFinanceTax(String secondFinanceTax) {
                this.secondFinanceTax = secondFinanceTax;
                return this;
            }

            /**
             * SecondFinanceTaxCertificateImgName.
             */
            public Builder secondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
                this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
                return this;
            }

            /**
             * SecondFinanceTaxCertificateImgUrl.
             */
            public Builder secondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
                this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
                return this;
            }

            /**
             * Tax.
             */
            public Builder tax(String tax) {
                this.tax = tax;
                return this;
            }

            public AccountTaxSnapshotModel build() {
                return new AccountTaxSnapshotModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindCustomerSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>FindCustomerSnapshotResponseBody</p>
     */
    public static class CustomerSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountInfoSnapshotModel")
        private AccountInfoSnapshotModel accountInfoSnapshotModel;

        @com.aliyun.core.annotation.NameInMap("AccountTaxSnapshotModel")
        private AccountTaxSnapshotModel accountTaxSnapshotModel;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InfoType")
        private String infoType;

        @com.aliyun.core.annotation.NameInMap("KpId")
        private Long kpId;

        private CustomerSnapshot(Builder builder) {
            this.accountInfoSnapshotModel = builder.accountInfoSnapshotModel;
            this.accountTaxSnapshotModel = builder.accountTaxSnapshotModel;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.infoType = builder.infoType;
            this.kpId = builder.kpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerSnapshot create() {
            return builder().build();
        }

        /**
         * @return accountInfoSnapshotModel
         */
        public AccountInfoSnapshotModel getAccountInfoSnapshotModel() {
            return this.accountInfoSnapshotModel;
        }

        /**
         * @return accountTaxSnapshotModel
         */
        public AccountTaxSnapshotModel getAccountTaxSnapshotModel() {
            return this.accountTaxSnapshotModel;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return infoType
         */
        public String getInfoType() {
            return this.infoType;
        }

        /**
         * @return kpId
         */
        public Long getKpId() {
            return this.kpId;
        }

        public static final class Builder {
            private AccountInfoSnapshotModel accountInfoSnapshotModel; 
            private AccountTaxSnapshotModel accountTaxSnapshotModel; 
            private String gmtCreate; 
            private Long id; 
            private String infoType; 
            private Long kpId; 

            private Builder() {
            } 

            private Builder(CustomerSnapshot model) {
                this.accountInfoSnapshotModel = model.accountInfoSnapshotModel;
                this.accountTaxSnapshotModel = model.accountTaxSnapshotModel;
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.infoType = model.infoType;
                this.kpId = model.kpId;
            } 

            /**
             * AccountInfoSnapshotModel.
             */
            public Builder accountInfoSnapshotModel(AccountInfoSnapshotModel accountInfoSnapshotModel) {
                this.accountInfoSnapshotModel = accountInfoSnapshotModel;
                return this;
            }

            /**
             * AccountTaxSnapshotModel.
             */
            public Builder accountTaxSnapshotModel(AccountTaxSnapshotModel accountTaxSnapshotModel) {
                this.accountTaxSnapshotModel = accountTaxSnapshotModel;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InfoType.
             */
            public Builder infoType(String infoType) {
                this.infoType = infoType;
                return this;
            }

            /**
             * KpId.
             */
            public Builder kpId(Long kpId) {
                this.kpId = kpId;
                return this;
            }

            public CustomerSnapshot build() {
                return new CustomerSnapshot(this);
            } 

        } 

    }
}
