// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyArInvoiceWithSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyArInvoiceWithSourceResponseBody</p>
 */
public class ApplyArInvoiceWithSourceResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ReturnValue")
    private ReturnValue returnValue;

    private ApplyArInvoiceWithSourceResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.isSuccess = builder.isSuccess;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyArInvoiceWithSourceResponseBody create() {
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

        public ApplyArInvoiceWithSourceResponseBody build() {
            return new ApplyArInvoiceWithSourceResponseBody(this);
        } 

    } 

    public static class ReturnValue extends TeaModel {
        @NameInMap("EncryptProps")
        private java.util.Map < String, String > encryptProps;

        @NameInMap("OuterSystemEncryptStr")
        private String outerSystemEncryptStr;

        @NameInMap("OuterSystemSignStr")
        private String outerSystemSignStr;

        @NameInMap("Sign")
        private String sign;

        private ReturnValue(Builder builder) {
            this.encryptProps = builder.encryptProps;
            this.outerSystemEncryptStr = builder.outerSystemEncryptStr;
            this.outerSystemSignStr = builder.outerSystemSignStr;
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
         * @return outerSystemEncryptStr
         */
        public String getOuterSystemEncryptStr() {
            return this.outerSystemEncryptStr;
        }

        /**
         * @return outerSystemSignStr
         */
        public String getOuterSystemSignStr() {
            return this.outerSystemSignStr;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        public static final class Builder {
            private java.util.Map < String, String > encryptProps; 
            private String outerSystemEncryptStr; 
            private String outerSystemSignStr; 
            private String sign; 

            /**
             * EncryptProps.
             */
            public Builder encryptProps(java.util.Map < String, String > encryptProps) {
                this.encryptProps = encryptProps;
                return this;
            }

            /**
             * OuterSystemEncryptStr.
             */
            public Builder outerSystemEncryptStr(String outerSystemEncryptStr) {
                this.outerSystemEncryptStr = outerSystemEncryptStr;
                return this;
            }

            /**
             * OuterSystemSignStr.
             */
            public Builder outerSystemSignStr(String outerSystemSignStr) {
                this.outerSystemSignStr = outerSystemSignStr;
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
