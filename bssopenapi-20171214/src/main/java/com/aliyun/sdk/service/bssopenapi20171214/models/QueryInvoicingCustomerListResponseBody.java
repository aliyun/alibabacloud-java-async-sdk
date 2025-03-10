// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryInvoicingCustomerListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInvoicingCustomerListResponseBody</p>
 */
public class QueryInvoicingCustomerListResponseBody extends TeaModel {
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BBEF51A3-E933-4F40-A534-C673CBDB9C80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryInvoicingCustomerListResponseBody build() {
            return new QueryInvoicingCustomerListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInvoicingCustomerListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInvoicingCustomerListResponseBody</p>
     */
    public static class CustomerInvoice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjustType")
        private Long adjustType;

        @com.aliyun.core.annotation.NameInMap("Bank")
        private String bank;

        @com.aliyun.core.annotation.NameInMap("BankNo")
        private String bankNo;

        @com.aliyun.core.annotation.NameInMap("CustomerType")
        private Long customerType;

        @com.aliyun.core.annotation.NameInMap("DefaultRemark")
        private String defaultRemark;

        @com.aliyun.core.annotation.NameInMap("EndCycle")
        private Long endCycle;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InvoiceTitle")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("IssueType")
        private Long issueType;

        @com.aliyun.core.annotation.NameInMap("OperatingLicenseAddress")
        private String operatingLicenseAddress;

        @com.aliyun.core.annotation.NameInMap("OperatingLicensePhone")
        private String operatingLicensePhone;

        @com.aliyun.core.annotation.NameInMap("RegisterNo")
        private String registerNo;

        @com.aliyun.core.annotation.NameInMap("StartCycle")
        private Long startCycle;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaxationLicense")
        private String taxationLicense;

        @com.aliyun.core.annotation.NameInMap("TaxpayerType")
        private Long taxpayerType;

        @com.aliyun.core.annotation.NameInMap("TitleChangeInstructions")
        private String titleChangeInstructions;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserNick")
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
             * <p>The type of invoice that was changed to.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder adjustType(Long adjustType) {
                this.adjustType = adjustType;
                return this;
            }

            /**
             * <p>The bank that issues the invoice.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Bank</p>
             */
            public Builder bank(String bank) {
                this.bank = bank;
                return this;
            }

            /**
             * <p>The bank account number.</p>
             * 
             * <strong>example:</strong>
             * <p>389576348573296349853476</p>
             */
            public Builder bankNo(String bankNo) {
                this.bankNo = bankNo;
                return this;
            }

            /**
             * <p>The authentication type of Alipay. Valid values:</p>
             * <ul>
             * <li>1: individual</li>
             * <li>2: company</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customerType(Long customerType) {
                this.customerType = customerType;
                return this;
            }

            /**
             * <p>The default note that is attached when the title is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>PO Code: 12984554</p>
             */
            public Builder defaultRemark(String defaultRemark) {
                this.defaultRemark = defaultRemark;
                return this;
            }

            /**
             * <p>The time when the payment ended.</p>
             * 
             * <strong>example:</strong>
             * <p>202003</p>
             */
            public Builder endCycle(Long endCycle) {
                this.endCycle = endCycle;
                return this;
            }

            /**
             * <p>The time when the invoice was created. The time was in the yyyy-mm-dd hh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-07 15:26:20</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the invoice.</p>
             * 
             * <strong>example:</strong>
             * <p>239875502738</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The company name in the invoice title.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Company</p>
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * <p>The type of issue.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder issueType(Long issueType) {
                this.issueType = issueType;
                return this;
            }

            /**
             * <p>The address of the business license.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX, XXX district, XXX city, XXX province</p>
             */
            public Builder operatingLicenseAddress(String operatingLicenseAddress) {
                this.operatingLicenseAddress = operatingLicenseAddress;
                return this;
            }

            /**
             * <p>The phone number of the business license.</p>
             * 
             * <strong>example:</strong>
             * <p>138xxxxxxxx</p>
             */
            public Builder operatingLicensePhone(String operatingLicensePhone) {
                this.operatingLicensePhone = operatingLicensePhone;
                return this;
            }

            /**
             * <p>The tax registration number.</p>
             * 
             * <strong>example:</strong>
             * <p>21343245342534</p>
             */
            public Builder registerNo(String registerNo) {
                this.registerNo = registerNo;
                return this;
            }

            /**
             * <p>The time when the payment started.</p>
             * 
             * <strong>example:</strong>
             * <p>202002</p>
             */
            public Builder startCycle(Long startCycle) {
                this.startCycle = startCycle;
                return this;
            }

            /**
             * <p>The status of the invoice title.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The path and file name of the scanned copy of the tax registration certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>taxationLicense.jpg</p>
             */
            public Builder taxationLicense(String taxationLicense) {
                this.taxationLicense = taxationLicense;
                return this;
            }

            /**
             * <p>The type of the taxpayer. Valid values:</p>
             * <ul>
             * <li>1: general taxpayer</li>
             * <li>2: special taxpayer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taxpayerType(Long taxpayerType) {
                this.taxpayerType = taxpayerType;
                return this;
            }

            /**
             * <p>The instruction document of the invoice title change.</p>
             * 
             * <strong>example:</strong>
             * <p>instruction.doc</p>
             */
            public Builder titleChangeInstructions(String titleChangeInstructions) {
                this.titleChangeInstructions = titleChangeInstructions;
                return this;
            }

            /**
             * <p>The type of the invoice. Valid values:</p>
             * <ul>
             * <li>0: plain value-added tax (VAT) invoice</li>
             * <li>1: special VAT invoice</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>34565465675</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>testNick</p>
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
    /**
     * 
     * {@link QueryInvoicingCustomerListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInvoicingCustomerListResponseBody</p>
     */
    public static class CustomerInvoiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerInvoice")
        private java.util.List<CustomerInvoice> customerInvoice;

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
        public java.util.List<CustomerInvoice> getCustomerInvoice() {
            return this.customerInvoice;
        }

        public static final class Builder {
            private java.util.List<CustomerInvoice> customerInvoice; 

            /**
             * CustomerInvoice.
             */
            public Builder customerInvoice(java.util.List<CustomerInvoice> customerInvoice) {
                this.customerInvoice = customerInvoice;
                return this;
            }

            public CustomerInvoiceList build() {
                return new CustomerInvoiceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInvoicingCustomerListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInvoicingCustomerListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerInvoiceList")
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
             * <p>The information about the invoice.</p>
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
