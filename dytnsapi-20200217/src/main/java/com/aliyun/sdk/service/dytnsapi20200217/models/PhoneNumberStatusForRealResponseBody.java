// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PhoneNumberStatusForRealResponseBody} extends {@link TeaModel}
 *
 * <p>PhoneNumberStatusForRealResponseBody</p>
 */
public class PhoneNumberStatusForRealResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private PhoneNumberStatusForRealResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhoneNumberStatusForRealResponseBody create() {
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
         * *   **OperatorLimit**: The carrier prohibits the query of the phone number.
         * *   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.
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
         * The unique request ID. It is a common parameter and can be used to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PhoneNumberStatusForRealResponseBody build() {
            return new PhoneNumberStatusForRealResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Carrier")
        private String carrier;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.carrier = builder.carrier;
            this.status = builder.status;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String carrier; 
            private String status; 

            /**
             * The basic carrier who assigns the phone number. If the queried phone number involves mobile number portability, the carrier after mobile number portability is returned. Valid values:
             * <p>
             * 
             * *   **CMCC**: China Mobile
             * *   **CUCC**: China Unicom
             * *   **CTCC**: China Telecom
             * 
             * >  You are not allowed to query the phone numbers assigned by China Broadnet.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * The returned status for the queried phone number. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The queried phone number can be reached.
             * *   **SHUTDOWN**: The queried phone number is suspended.
             * *   **POWER_OFF**: The phone is powered off.
             * *   **NOT_EXIST**: The queried phone number is a nonexistent number.
             * *   **BUSY**: The queried phone number is busy.
             * *   **SUSPECTED_POWER_OFF**: The phone is suspected to be powered off.
             * *   **DEFECT**: The queried phone number is invalid.
             * *   **UNKNOWN**: The queried phone number is unknown.
             * 
             * >  Due to system adjustment of the carrier, the BUSY and POWER_OFF states cannot be returned for the numbers assigned by China Telecom. [For more information, see the official announcements](https://help.aliyun.com/document_detail/2489709.html).
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
