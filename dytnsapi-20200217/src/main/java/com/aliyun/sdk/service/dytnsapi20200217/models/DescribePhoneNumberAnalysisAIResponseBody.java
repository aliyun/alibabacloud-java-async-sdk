// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneNumberAnalysisAIResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberAnalysisAIResponseBody</p>
 */
public class DescribePhoneNumberAnalysisAIResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberAnalysisAIResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberAnalysisAIResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   OK: The request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberAnalysisAIResponseBody build() {
            return new DescribePhoneNumberAnalysisAIResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Number")
        private String number;

        private Data(Builder builder) {
            this.code = builder.code;
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        public static final class Builder {
            private String code; 
            private String number; 

            /**
             * The returned code.
             * <p>
             * 
             * *   YES: The specified phone number is valid.
             * *   NO: The specified phone number is invalid.
             * *   UNKNOWN: The specified phone number is unknown
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The specified phone number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
