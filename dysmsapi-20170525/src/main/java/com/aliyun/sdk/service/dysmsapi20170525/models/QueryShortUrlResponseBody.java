// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryShortUrlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryShortUrlResponseBody</p>
 */
public class QueryShortUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

        public QueryShortUrlResponseBody build() {
            return new QueryShortUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("PageViewCount")
        private String pageViewCount;

        @NameInMap("ShortUrl")
        private String shortUrl;

        @NameInMap("ShortUrlName")
        private String shortUrlName;

        @NameInMap("ShortUrlStatus")
        private String shortUrlStatus;

        @NameInMap("SourceUrl")
        private String sourceUrl;

        @NameInMap("UniqueVisitorCount")
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
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * PageViewCount.
             */
            public Builder pageViewCount(String pageViewCount) {
                this.pageViewCount = pageViewCount;
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
             * ShortUrlName.
             */
            public Builder shortUrlName(String shortUrlName) {
                this.shortUrlName = shortUrlName;
                return this;
            }

            /**
             * ShortUrlStatus.
             */
            public Builder shortUrlStatus(String shortUrlStatus) {
                this.shortUrlStatus = shortUrlStatus;
                return this;
            }

            /**
             * SourceUrl.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * UniqueVisitorCount.
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
