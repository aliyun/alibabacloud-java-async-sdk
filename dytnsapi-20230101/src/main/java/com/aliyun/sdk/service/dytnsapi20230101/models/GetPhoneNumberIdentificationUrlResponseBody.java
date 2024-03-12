// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhoneNumberIdentificationUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhoneNumberIdentificationUrlResponseBody</p>
 */
public class GetPhoneNumberIdentificationUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetPhoneNumberIdentificationUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneNumberIdentificationUrlResponseBody create() {
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
         * *   **OK**: The request is successful.
         * *   **IdentificationNotAvailable**: The verification system does not support the phone number that corresponds to the IP address.
         * *   **MobileNumberIllegal**: The format of the phone number is invalid.
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

        public GetPhoneNumberIdentificationUrlResponseBody build() {
            return new GetPhoneNumberIdentificationUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("IdentificationUrl")
        private String identificationUrl;

        @NameInMap("SessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.identificationUrl = builder.identificationUrl;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return identificationUrl
         */
        public String getIdentificationUrl() {
            return this.identificationUrl;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String identificationUrl; 
            private String sessionId; 

            /**
             * The verification URL.
             */
            public Builder identificationUrl(String identificationUrl) {
                this.identificationUrl = identificationUrl;
                return this;
            }

            /**
             * The session ID.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
