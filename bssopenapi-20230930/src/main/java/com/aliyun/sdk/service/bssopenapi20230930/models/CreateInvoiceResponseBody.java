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
 * {@link CreateInvoiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInvoiceResponseBody</p>
 */
public class CreateInvoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInvoiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInvoiceResponseBody create() {
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

        private Builder(CreateInvoiceResponseBody model) {
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

        public CreateInvoiceResponseBody build() {
            return new CreateInvoiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateInvoiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateInvoiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("InvoiceIssuer")
        private String invoiceIssuer;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.amount = builder.amount;
            this.errorCode = builder.errorCode;
            this.invoiceIssuer = builder.invoiceIssuer;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return invoiceIssuer
         */
        public String getInvoiceIssuer() {
            return this.invoiceIssuer;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Long accountId; 
            private String amount; 
            private String errorCode; 
            private String invoiceIssuer; 
            private String message; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.amount = model.amount;
                this.errorCode = model.errorCode;
                this.invoiceIssuer = model.invoiceIssuer;
                this.message = model.message;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * InvoiceIssuer.
             */
            public Builder invoiceIssuer(String invoiceIssuer) {
                this.invoiceIssuer = invoiceIssuer;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
