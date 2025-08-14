// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link ListInvoiceTitleResponseBody} extends {@link TeaModel}
 *
 * <p>ListInvoiceTitleResponseBody</p>
 */
public class ListInvoiceTitleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInvoiceTitleResponseBody(Builder builder) {
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInvoiceTitleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Object metadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInvoiceTitleResponseBody model) {
            this.data = model.data;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInvoiceTitleResponseBody build() {
            return new ListInvoiceTitleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInvoiceTitleResponseBody} extends {@link TeaModel}
     *
     * <p>ListInvoiceTitleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountBankName")
        private String accountBankName;

        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("BankAccountNumber")
        private String bankAccountNumber;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InvoiceTitle")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("RegisteredAddress")
        private String registeredAddress;

        @com.aliyun.core.annotation.NameInMap("RegisteredLandline")
        private String registeredLandline;

        @com.aliyun.core.annotation.NameInMap("UnifiedSocialCreditCode")
        private String unifiedSocialCreditCode;

        private Data(Builder builder) {
            this.accountBankName = builder.accountBankName;
            this.accountId = builder.accountId;
            this.bankAccountNumber = builder.bankAccountNumber;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.invoiceTitle = builder.invoiceTitle;
            this.registeredAddress = builder.registeredAddress;
            this.registeredLandline = builder.registeredLandline;
            this.unifiedSocialCreditCode = builder.unifiedSocialCreditCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountBankName
         */
        public String getAccountBankName() {
            return this.accountBankName;
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return bankAccountNumber
         */
        public String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return registeredAddress
         */
        public String getRegisteredAddress() {
            return this.registeredAddress;
        }

        /**
         * @return registeredLandline
         */
        public String getRegisteredLandline() {
            return this.registeredLandline;
        }

        /**
         * @return unifiedSocialCreditCode
         */
        public String getUnifiedSocialCreditCode() {
            return this.unifiedSocialCreditCode;
        }

        public static final class Builder {
            private String accountBankName; 
            private Long accountId; 
            private String bankAccountNumber; 
            private String createTime; 
            private String id; 
            private String invoiceTitle; 
            private String registeredAddress; 
            private String registeredLandline; 
            private String unifiedSocialCreditCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountBankName = model.accountBankName;
                this.accountId = model.accountId;
                this.bankAccountNumber = model.bankAccountNumber;
                this.createTime = model.createTime;
                this.id = model.id;
                this.invoiceTitle = model.invoiceTitle;
                this.registeredAddress = model.registeredAddress;
                this.registeredLandline = model.registeredLandline;
                this.unifiedSocialCreditCode = model.unifiedSocialCreditCode;
            } 

            /**
             * AccountBankName.
             */
            public Builder accountBankName(String accountBankName) {
                this.accountBankName = accountBankName;
                return this;
            }

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * BankAccountNumber.
             */
            public Builder bankAccountNumber(String bankAccountNumber) {
                this.bankAccountNumber = bankAccountNumber;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
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
             * RegisteredAddress.
             */
            public Builder registeredAddress(String registeredAddress) {
                this.registeredAddress = registeredAddress;
                return this;
            }

            /**
             * RegisteredLandline.
             */
            public Builder registeredLandline(String registeredLandline) {
                this.registeredLandline = registeredLandline;
                return this;
            }

            /**
             * UnifiedSocialCreditCode.
             */
            public Builder unifiedSocialCreditCode(String unifiedSocialCreditCode) {
                this.unifiedSocialCreditCode = unifiedSocialCreditCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
