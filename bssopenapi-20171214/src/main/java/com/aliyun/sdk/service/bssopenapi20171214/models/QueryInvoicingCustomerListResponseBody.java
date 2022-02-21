// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvoicingCustomerListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInvoicingCustomerListResponseBody</p>
 */
public class QueryInvoicingCustomerListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryInvoicingCustomerListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInvoicingCustomerListResponseBody create() {
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

        public QueryInvoicingCustomerListResponseBody build() {
            return new QueryInvoicingCustomerListResponseBody(this);
        } 

    } 

    public static class CustomerInvoice extends TeaModel {
        @NameInMap("AdjustType")
        private Long adjustType;

        @NameInMap("Bank")
        private String bank;

        @NameInMap("BankNo")
        private String bankNo;

        @NameInMap("CustomerType")
        private Long customerType;

        @NameInMap("DefaultRemark")
        private String defaultRemark;

        @NameInMap("EndCycle")
        private Long endCycle;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InvoiceTitle")
        private String invoiceTitle;

        @NameInMap("IssueType")
        private Long issueType;

        @NameInMap("OperatingLicenseAddress")
        private String operatingLicenseAddress;

        @NameInMap("OperatingLicensePhone")
        private String operatingLicensePhone;

        @NameInMap("RegisterNo")
        private String registerNo;

        @NameInMap("StartCycle")
        private Long startCycle;

        @NameInMap("Status")
        private Long status;

        @NameInMap("TaxationLicense")
        private String taxationLicense;

        @NameInMap("TaxpayerType")
        private Long taxpayerType;

        @NameInMap("TitleChangeInstructions")
        private String titleChangeInstructions;

        @NameInMap("Type")
        private Long type;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserNick")
        private String userNick;

        private CustomerInvoice(Builder builder) {
            this.adjustType = builder.adjustType;
            this.bank = builder.bank;
            this.bankNo = builder.bankNo;
            this.customerType = builder.customerType;
            this.defaultRemark = builder.defaultRemark;
            this.endCycle = builder.endCycle;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.invoiceTitle = builder.invoiceTitle;
            this.issueType = builder.issueType;
            this.operatingLicenseAddress = builder.operatingLicenseAddress;
            this.operatingLicensePhone = builder.operatingLicensePhone;
            this.registerNo = builder.registerNo;
            this.startCycle = builder.startCycle;
            this.status = builder.status;
            this.taxationLicense = builder.taxationLicense;
            this.taxpayerType = builder.taxpayerType;
            this.titleChangeInstructions = builder.titleChangeInstructions;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerInvoice create() {
            return builder().build();
        }

        /**
         * @return adjustType
         */
        public Long getAdjustType() {
            return this.adjustType;
        }

        /**
         * @return bank
         */
        public String getBank() {
            return this.bank;
        }

        /**
         * @return bankNo
         */
        public String getBankNo() {
            return this.bankNo;
        }

        /**
         * @return customerType
         */
        public Long getCustomerType() {
            return this.customerType;
        }

        /**
         * @return defaultRemark
         */
        public String getDefaultRemark() {
            return this.defaultRemark;
        }

        /**
         * @return endCycle
         */
        public Long getEndCycle() {
            return this.endCycle;
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
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return issueType
         */
        public Long getIssueType() {
            return this.issueType;
        }

        /**
         * @return operatingLicenseAddress
         */
        public String getOperatingLicenseAddress() {
            return this.operatingLicenseAddress;
        }

        /**
         * @return operatingLicensePhone
         */
        public String getOperatingLicensePhone() {
            return this.operatingLicensePhone;
        }

        /**
         * @return registerNo
         */
        public String getRegisterNo() {
            return this.registerNo;
        }

        /**
         * @return startCycle
         */
        public Long getStartCycle() {
            return this.startCycle;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taxationLicense
         */
        public String getTaxationLicense() {
            return this.taxationLicense;
        }

        /**
         * @return taxpayerType
         */
        public Long getTaxpayerType() {
            return this.taxpayerType;
        }

        /**
         * @return titleChangeInstructions
         */
        public String getTitleChangeInstructions() {
            return this.titleChangeInstructions;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private Long adjustType; 
            private String bank; 
            private String bankNo; 
            private Long customerType; 
            private String defaultRemark; 
            private Long endCycle; 
            private String gmtCreate; 
            private Long id; 
            private String invoiceTitle; 
            private Long issueType; 
            private String operatingLicenseAddress; 
            private String operatingLicensePhone; 
            private String registerNo; 
            private Long startCycle; 
            private Long status; 
            private String taxationLicense; 
            private Long taxpayerType; 
            private String titleChangeInstructions; 
            private Long type; 
            private Long userId; 
            private String userNick; 

            /**
             * AdjustType.
             */
            public Builder adjustType(Long adjustType) {
                this.adjustType = adjustType;
                return this;
            }

            /**
             * Bank.
             */
            public Builder bank(String bank) {
                this.bank = bank;
                return this;
            }

            /**
             * BankNo.
             */
            public Builder bankNo(String bankNo) {
                this.bankNo = bankNo;
                return this;
            }

            /**
             * CustomerType.
             */
            public Builder customerType(Long customerType) {
                this.customerType = customerType;
                return this;
            }

            /**
             * DefaultRemark.
             */
            public Builder defaultRemark(String defaultRemark) {
                this.defaultRemark = defaultRemark;
                return this;
            }

            /**
             * EndCycle.
             */
            public Builder endCycle(Long endCycle) {
                this.endCycle = endCycle;
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
             * InvoiceTitle.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * IssueType.
             */
            public Builder issueType(Long issueType) {
                this.issueType = issueType;
                return this;
            }

            /**
             * OperatingLicenseAddress.
             */
            public Builder operatingLicenseAddress(String operatingLicenseAddress) {
                this.operatingLicenseAddress = operatingLicenseAddress;
                return this;
            }

            /**
             * OperatingLicensePhone.
             */
            public Builder operatingLicensePhone(String operatingLicensePhone) {
                this.operatingLicensePhone = operatingLicensePhone;
                return this;
            }

            /**
             * RegisterNo.
             */
            public Builder registerNo(String registerNo) {
                this.registerNo = registerNo;
                return this;
            }

            /**
             * StartCycle.
             */
            public Builder startCycle(Long startCycle) {
                this.startCycle = startCycle;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TaxationLicense.
             */
            public Builder taxationLicense(String taxationLicense) {
                this.taxationLicense = taxationLicense;
                return this;
            }

            /**
             * TaxpayerType.
             */
            public Builder taxpayerType(Long taxpayerType) {
                this.taxpayerType = taxpayerType;
                return this;
            }

            /**
             * TitleChangeInstructions.
             */
            public Builder titleChangeInstructions(String titleChangeInstructions) {
                this.titleChangeInstructions = titleChangeInstructions;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public CustomerInvoice build() {
                return new CustomerInvoice(this);
            } 

        } 

    }
    public static class CustomerInvoiceList extends TeaModel {
        @NameInMap("CustomerInvoice")
        private java.util.List < CustomerInvoice> customerInvoice;

        private CustomerInvoiceList(Builder builder) {
            this.customerInvoice = builder.customerInvoice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerInvoiceList create() {
            return builder().build();
        }

        /**
         * @return customerInvoice
         */
        public java.util.List < CustomerInvoice> getCustomerInvoice() {
            return this.customerInvoice;
        }

        public static final class Builder {
            private java.util.List < CustomerInvoice> customerInvoice; 

            /**
             * CustomerInvoice.
             */
            public Builder customerInvoice(java.util.List < CustomerInvoice> customerInvoice) {
                this.customerInvoice = customerInvoice;
                return this;
            }

            public CustomerInvoiceList build() {
                return new CustomerInvoiceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CustomerInvoiceList")
        private CustomerInvoiceList customerInvoiceList;

        private Data(Builder builder) {
            this.customerInvoiceList = builder.customerInvoiceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customerInvoiceList
         */
        public CustomerInvoiceList getCustomerInvoiceList() {
            return this.customerInvoiceList;
        }

        public static final class Builder {
            private CustomerInvoiceList customerInvoiceList; 

            /**
             * CustomerInvoiceList.
             */
            public Builder customerInvoiceList(CustomerInvoiceList customerInvoiceList) {
                this.customerInvoiceList = customerInvoiceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
