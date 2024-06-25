// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryShortUrlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryShortUrlResponseBody</p>
 */
public class QueryShortUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryShortUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShortUrlResponseBody create() {
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
         * *   If OK is returned, the request is successful.
         * *   Other values indicate that the request fails. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the short URL.
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

        public QueryShortUrlResponseBody build() {
            return new QueryShortUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("PageViewCount")
        private String pageViewCount;

        @com.aliyun.core.annotation.NameInMap("ShortUrl")
        private String shortUrl;

        @com.aliyun.core.annotation.NameInMap("ShortUrlName")
        private String shortUrlName;

        @com.aliyun.core.annotation.NameInMap("ShortUrlStatus")
        private String shortUrlStatus;

        @com.aliyun.core.annotation.NameInMap("SourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("UniqueVisitorCount")
        private String uniqueVisitorCount;

        private Data(Builder builder) {
            this.createDate = builder.createDate;
            this.expireDate = builder.expireDate;
            this.pageViewCount = builder.pageViewCount;
            this.shortUrl = builder.shortUrl;
            this.shortUrlName = builder.shortUrlName;
            this.shortUrlStatus = builder.shortUrlStatus;
            this.sourceUrl = builder.sourceUrl;
            this.uniqueVisitorCount = builder.uniqueVisitorCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return pageViewCount
         */
        public String getPageViewCount() {
            return this.pageViewCount;
        }

        /**
         * @return shortUrl
         */
        public String getShortUrl() {
            return this.shortUrl;
        }

        /**
         * @return shortUrlName
         */
        public String getShortUrlName() {
            return this.shortUrlName;
        }

        /**
         * @return shortUrlStatus
         */
        public String getShortUrlStatus() {
            return this.shortUrlStatus;
        }

        /**
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        /**
         * @return uniqueVisitorCount
         */
        public String getUniqueVisitorCount() {
            return this.uniqueVisitorCount;
        }

        public static final class Builder {
            private String createDate; 
            private String expireDate; 
            private String pageViewCount; 
            private String shortUrl; 
            private String shortUrlName; 
            private String shortUrlStatus; 
            private String sourceUrl; 
            private String uniqueVisitorCount; 

            /**
             * The time when the short URL was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The time when the short URL expires.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The PV.
             */
            public Builder pageViewCount(String pageViewCount) {
                this.pageViewCount = pageViewCount;
                return this;
            }

            /**
             * The short URL.
             */
            public Builder shortUrl(String shortUrl) {
                this.shortUrl = shortUrl;
                return this;
            }

            /**
             * The service name of the short URL.
             */
            public Builder shortUrlName(String shortUrlName) {
                this.shortUrlName = shortUrlName;
                return this;
            }

            /**
             * The status of the short URL. Valid values:
             * <p>
             * 
             * *   **expired**
             * *   **effective**
             * *   **audit**
             * *   **reject**
             */
            public Builder shortUrlStatus(String shortUrlStatus) {
                this.shortUrlStatus = shortUrlStatus;
                return this;
            }

            /**
             * The source address.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * The UV.
             */
            public Builder uniqueVisitorCount(String uniqueVisitorCount) {
                this.uniqueVisitorCount = uniqueVisitorCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
