// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEinvoicePdfDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetEinvoicePdfDataResponseBody</p>
 */
public class GetEinvoicePdfDataResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ReturnValue")
    private ReturnValue returnValue;

    private GetEinvoicePdfDataResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.isSuccess = builder.isSuccess;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEinvoicePdfDataResponseBody create() {
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

        public GetEinvoicePdfDataResponseBody build() {
            return new GetEinvoicePdfDataResponseBody(this);
        } 

    } 

    public static class ReturnValue extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("EInvoiceData")
        private java.util.List < Integer > eInvoiceData;

        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("InvoiceCode")
        private String invoiceCode;

        @NameInMap("InvoiceNo")
        private String invoiceNo;

        @NameInMap("Language")
        private String language;

        @NameInMap("Sign")
        private String sign;

        @NameInMap("Uuid")
        private String uuid;

        private ReturnValue(Builder builder) {
            this.appCode = builder.appCode;
            this.eInvoiceData = builder.eInvoiceData;
            this.encryptProps = builder.encryptProps;
            this.invoiceCode = builder.invoiceCode;
            this.invoiceNo = builder.invoiceNo;
            this.language = builder.language;
            this.sign = builder.sign;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnValue create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return eInvoiceData
         */
        public java.util.List < Integer > getEInvoiceData() {
            return this.eInvoiceData;
        }

        /**
         * @return encryptProps
         */
        public java.util.Map < String, String > getEncryptProps() {
            return this.encryptProps;
        }

        /**
         * @return invoiceCode
         */
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        /**
         * @return invoiceNo
         */
        public String getInvoiceNo() {
            return this.invoiceNo;
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
            private java.util.List < Integer > eInvoiceData; 
            private java.util.Map < String, String > encryptProps; 
            private String invoiceCode; 
            private String invoiceNo; 
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
             * EInvoiceData.
             */
            public Builder eInvoiceData(java.util.List < Integer > eInvoiceData) {
                this.eInvoiceData = eInvoiceData;
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
             * InvoiceCode.
             */
            public Builder invoiceCode(String invoiceCode) {
                this.invoiceCode = invoiceCode;
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

            public ReturnValue build() {
                return new ReturnValue(this);
            } 

        } 

    }
}
