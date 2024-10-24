// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainViewTopCostTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewTopCostTimeResponseBody</p>
 */
public class DescribeDomainViewTopCostTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UrlList")
    private java.util.List < UrlList> urlList;

    private DescribeDomainViewTopCostTimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.urlList = builder.urlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainViewTopCostTimeResponseBody create() {
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
         * <p>The URLs which require the longest time to respond to requests.</p>
         */
        public Builder urlList(java.util.List < UrlList> urlList) {
            this.urlList = urlList;
            return this;
        }

        public DescribeDomainViewTopCostTimeResponseBody build() {
            return new DescribeDomainViewTopCostTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainViewTopCostTimeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainViewTopCostTimeResponseBody</p>
     */
    public static class UrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Float costTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private UrlList(Builder builder) {
            this.costTime = builder.costTime;
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
         * @return costTime
         */
        public Float getCostTime() {
            return this.costTime;
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
            private Float costTime; 
            private String domain; 
            private String url; 

            /**
             * <p>The response duration. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder costTime(Float costTime) {
                this.costTime = costTime;
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
