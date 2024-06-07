// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTotalPublicUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetTotalPublicUrlResponseBody</p>
 */
public class GetTotalPublicUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTotalPublicUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTotalPublicUrlResponseBody create() {
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
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other status codes indicate that the request failed. For more information, see [Error codes](~~109196~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The download URLs of the recording files.
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

        public GetTotalPublicUrlResponseBody build() {
            return new GetTotalPublicUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhonePublicUrl")
        private String phonePublicUrl;

        @com.aliyun.core.annotation.NameInMap("RingPublicUrl")
        private String ringPublicUrl;

        private Data(Builder builder) {
            this.phonePublicUrl = builder.phonePublicUrl;
            this.ringPublicUrl = builder.ringPublicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return phonePublicUrl
         */
        public String getPhonePublicUrl() {
            return this.phonePublicUrl;
        }

        /**
         * @return ringPublicUrl
         */
        public String getRingPublicUrl() {
            return this.ringPublicUrl;
        }

        public static final class Builder {
            private String phonePublicUrl; 
            private String ringPublicUrl; 

            /**
             * The download URL of the recorded call.
             * <p>
             * 
             * >  The download URL of the recorded call is valid for 30 days.
             */
            public Builder phonePublicUrl(String phonePublicUrl) {
                this.phonePublicUrl = phonePublicUrl;
                return this;
            }

            /**
             * The download URL of the recorded ringing tone.
             * <p>
             * 
             * >  The download URL of the recorded ringing tone is valid for 30 days.
             */
            public Builder ringPublicUrl(String ringPublicUrl) {
                this.ringPublicUrl = ringPublicUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
