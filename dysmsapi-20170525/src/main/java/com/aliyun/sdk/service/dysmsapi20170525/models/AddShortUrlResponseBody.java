// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link AddShortUrlResponseBody} extends {@link TeaModel}
 *
 * <p>AddShortUrlResponseBody</p>
 */
public class AddShortUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddShortUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the short URL.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddShortUrlResponseBody build() {
            return new AddShortUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddShortUrlResponseBody} extends {@link TeaModel}
     *
     * <p>AddShortUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("ShortUrl")
        private String shortUrl;

        @com.aliyun.core.annotation.NameInMap("SourceUrl")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.expireDate = model.expireDate;
                this.shortUrl = model.shortUrl;
                this.sourceUrl = model.sourceUrl;
            } 

            /**
             * <p>The time when the short URL expires.</p>
             * <blockquote>
             * <p>The value of <strong>ExpireDate</strong> is on the hour.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-09-19 00:00:00</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The short URL.</p>
             * 
             * <strong>example:</strong>
             * <p>http://****.cn/6y8uy7</p>
             */
            public Builder shortUrl(String shortUrl) {
                this.shortUrl = shortUrl;
                return this;
            }

            /**
             * <p>The source URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.****.com/product/sms">https://www.****.com/product/sms</a></p>
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
