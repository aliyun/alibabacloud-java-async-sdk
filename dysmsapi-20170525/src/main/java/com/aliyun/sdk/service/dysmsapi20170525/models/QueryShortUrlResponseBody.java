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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
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

        public QueryShortUrlResponseBody build() {
            return new QueryShortUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryShortUrlResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShortUrlResponseBody</p>
     */
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
             * <p>The time when the short URL was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-08 16:44:13</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The time when the short URL expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-22 11:21:11</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The PV.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder pageViewCount(String pageViewCount) {
                this.pageViewCount = pageViewCount;
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
             * <p>The service name of the short URL.</p>
             * 
             * <strong>example:</strong>
             * <p>The Alibaba Cloud Short Link service.</p>
             */
            public Builder shortUrlName(String shortUrlName) {
                this.shortUrlName = shortUrlName;
                return this;
            }

            /**
             * <p>The status of the short URL. Valid values:</p>
             * <ul>
             * <li><strong>expired</strong></li>
             * <li><strong>effective</strong></li>
             * <li><strong>audit</strong></li>
             * <li><strong>reject</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>expired</p>
             */
            public Builder shortUrlStatus(String shortUrlStatus) {
                this.shortUrlStatus = shortUrlStatus;
                return this;
            }

            /**
             * <p>The source address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.****.com/product/sms">https://www.****.com/product/sms</a></p>
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * <p>The UV.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
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
