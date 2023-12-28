// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneTwiceTelVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneTwiceTelVerifyResponseBody</p>
 */
public class DescribePhoneTwiceTelVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePhoneTwiceTelVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneTwiceTelVerifyResponseBody create() {
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
         * *   **OK**: The request is successful.
         * *   **PortabilityNumberNotSupported**: The phone number that is involved in mobile number portability is not supported.
         * *   **RequestNumberNotSupported**: You are not allowed to query phone numbers assigned by China Broadnet (that is, phone numbers start with 192) and phone numbers assigned by virtual network operators (VNOs).
         * *   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.
         * 
         * >  You are charged for phone number verifications if the value of Code is OK and the value of VerifyResult is not 0. For more information, see [Pricing](~~154751~~).
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
         * The unique request ID. It is a common parameter and can be used to troubleshoot and locate issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneTwiceTelVerifyResponseBody build() {
            return new DescribePhoneTwiceTelVerifyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Carrier")
        private String carrier;

        @NameInMap("VerifyResult")
        private String verifyResult;

        private Data(Builder builder) {
            this.carrier = builder.carrier;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String carrier; 
            private String verifyResult; 

            /**
             * The carrier. Valid values:
             * <p>
             * 
             * *   **CMCC**: China Mobile
             * *   **CUCC**: China Unicom
             * *   **CTCC**: China Telecom
             * 
             * >  The returned result indicates the carrier who assigns the phone number. If the phone number involves mobile number portability, the carrier after mobile number portability is returned.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * The result of the request. Valid values:
             * <p>
             * 
             * *   **0**: It is unable to judge whether the phone number is a reassigned number.
             * *   **1**: The phone number is a reassigned number.
             * *   **2**: The phone number is not a reassigned number.
             * *   **3**: The phone number has been canceled.
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
