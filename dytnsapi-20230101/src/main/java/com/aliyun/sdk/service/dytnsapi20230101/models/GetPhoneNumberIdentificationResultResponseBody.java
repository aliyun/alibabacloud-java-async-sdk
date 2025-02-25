// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhoneNumberIdentificationResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhoneNumberIdentificationResultResponseBody</p>
 */
public class GetPhoneNumberIdentificationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetPhoneNumberIdentificationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneNumberIdentificationResultResponseBody create() {
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
         * The return code. Valid values:
         * <p>
         * 
         * *   OK: The request is successful.
         * *   NoIdentificationResult: No verification result is available or the verification failed.
         * *   SessionNotValid: The session is invalid or expired.
         * *   MobileNumberIllegal: The format of the phone number is invalid.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The description of the return code.
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

        public GetPhoneNumberIdentificationResultResponseBody build() {
            return new GetPhoneNumberIdentificationResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("IsIdentified")
        private String isIdentified;

        private Data(Builder builder) {
            this.isIdentified = builder.isIdentified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isIdentified
         */
        public String getIsIdentified() {
            return this.isIdentified;
        }

        public static final class Builder {
            private String isIdentified; 

            /**
             * Indicates whether the phone number passed the verification.
             */
            public Builder isIdentified(String isIdentified) {
                this.isIdentified = isIdentified;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
