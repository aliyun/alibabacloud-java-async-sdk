// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link PhoneNumberConvertServiceResponseBody} extends {@link TeaModel}
 *
 * <p>PhoneNumberConvertServiceResponseBody</p>
 */
public class PhoneNumberConvertServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PhoneNumberConvertServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhoneNumberConvertServiceResponseBody create() {
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
    public java.util.List<Data> getData() {
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

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
        public Builder data(java.util.List<Data> data) {
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

        public PhoneNumberConvertServiceResponseBody build() {
            return new PhoneNumberConvertServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PhoneNumberConvertServiceResponseBody} extends {@link TeaModel}
     *
     * <p>PhoneNumberConvertServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConverResult")
        private Boolean converResult;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberMd5")
        private String numberMd5;

        @com.aliyun.core.annotation.NameInMap("NumberSha256")
        private String numberSha256;

        private Data(Builder builder) {
            this.converResult = builder.converResult;
            this.number = builder.number;
            this.numberMd5 = builder.numberMd5;
            this.numberSha256 = builder.numberSha256;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return converResult
         */
        public Boolean getConverResult() {
            return this.converResult;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return numberMd5
         */
        public String getNumberMd5() {
            return this.numberMd5;
        }

        /**
         * @return numberSha256
         */
        public String getNumberSha256() {
            return this.numberSha256;
        }

        public static final class Builder {
            private Boolean converResult; 
            private String number; 
            private String numberMd5; 
            private String numberSha256; 

            /**
             * ConverResult.
             */
            public Builder converResult(Boolean converResult) {
                this.converResult = converResult;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * NumberMd5.
             */
            public Builder numberMd5(String numberMd5) {
                this.numberMd5 = numberMd5;
                return this;
            }

            /**
             * NumberSha256.
             */
            public Builder numberSha256(String numberSha256) {
                this.numberSha256 = numberSha256;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
