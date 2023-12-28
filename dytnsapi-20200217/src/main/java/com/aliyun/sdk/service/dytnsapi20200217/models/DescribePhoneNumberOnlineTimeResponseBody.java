// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneNumberOnlineTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberOnlineTimeResponseBody</p>
 */
public class DescribePhoneNumberOnlineTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberOnlineTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOnlineTimeResponseBody create() {
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
         * *   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.
         * 
         * >  You are charged if the value of Code is OK and the value of VerifyResult is not -1. For more information, see [Pricing](~~154751~~).
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

        public DescribePhoneNumberOnlineTimeResponseBody build() {
            return new DescribePhoneNumberOnlineTimeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CarrierCode")
        private String carrierCode;

        @NameInMap("VerifyResult")
        private String verifyResult;

        private Data(Builder builder) {
            this.carrierCode = builder.carrierCode;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carrierCode
         */
        public String getCarrierCode() {
            return this.carrierCode;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String carrierCode; 
            private String verifyResult; 

            /**
             * The carrier code. Valid values:
             * <p>
             * 
             * *   **CMCC**: China Mobile
             * *   **CUCC**: China Unicom
             * *   **CTCC**: China Telecom
             * *   **CBN**: China Broadnet
             */
            public Builder carrierCode(String carrierCode) {
                this.carrierCode = carrierCode;
                return this;
            }

            /**
             * The enumerated value of the usage period of a phone number. Valid values:
             * <p>
             * 
             * *   **-1**: No usage period information is available for the phone number.
             * *   **0**: The phone number status is abnormal. For example, the phone number is a nonexistent number.
             * *   **1** :\[0-3) months.
             * *   **2** :\[3-6] months.
             * *   **3** :(6-12] months.
             * *   **4** :(12-24] months.
             * *   **5** :(24,+) months.
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
