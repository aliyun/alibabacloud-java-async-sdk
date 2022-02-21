// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTotalPublicUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetTotalPublicUrlResponseBody</p>
 */
public class GetTotalPublicUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GetTotalPublicUrlResponseBody build() {
            return new GetTotalPublicUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("PhonePublicUrl")
        private String phonePublicUrl;

        @NameInMap("RingPublicUrl")
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
             * PhonePublicUrl.
             */
            public Builder phonePublicUrl(String phonePublicUrl) {
                this.phonePublicUrl = phonePublicUrl;
                return this;
            }

            /**
             * RingPublicUrl.
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
