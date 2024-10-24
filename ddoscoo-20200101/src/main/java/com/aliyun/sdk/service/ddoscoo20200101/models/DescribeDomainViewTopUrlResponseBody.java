// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainViewTopUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewTopUrlResponseBody</p>
 */
public class DescribeDomainViewTopUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UrlList")
    private java.util.List < UrlList> urlList;

    private DescribeDomainViewTopUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.urlList = builder.urlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainViewTopUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return urlList
     */
    public java.util.List < UrlList> getUrlList() {
        return this.urlList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UrlList> urlList; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of the URLs that receive the most requests.</p>
         */
        public Builder urlList(java.util.List < UrlList> urlList) {
            this.urlList = urlList;
            return this;
        }

        public DescribeDomainViewTopUrlResponseBody build() {
            return new DescribeDomainViewTopUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainViewTopUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainViewTopUrlResponseBody</p>
     */
    public static class UrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private UrlList(Builder builder) {
            this.count = builder.count;
            this.domain = builder.domain;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long count; 
            private String domain; 
            private String url; 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3390671</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The URL that is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>Lw==</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public UrlList build() {
                return new UrlList(this);
            } 

        } 

    }
}
