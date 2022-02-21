// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShortUrlResponseBody} extends {@link TeaModel}
 *
 * <p>AddShortUrlResponseBody</p>
 */
public class AddShortUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private AddShortUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShortUrlResponseBody create() {
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

        public AddShortUrlResponseBody build() {
            return new AddShortUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("ShortUrl")
        private String shortUrl;

        @NameInMap("SourceUrl")
        private String sourceUrl;

        private Data(Builder builder) {
            this.expireDate = builder.expireDate;
            this.shortUrl = builder.shortUrl;
            this.sourceUrl = builder.sourceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return shortUrl
         */
        public String getShortUrl() {
            return this.shortUrl;
        }

        /**
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public static final class Builder {
            private String expireDate; 
            private String shortUrl; 
            private String sourceUrl; 

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * ShortUrl.
             */
            public Builder shortUrl(String shortUrl) {
                this.shortUrl = shortUrl;
                return this;
            }

            /**
             * SourceUrl.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
