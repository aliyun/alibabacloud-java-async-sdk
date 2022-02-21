// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainViewTopCostTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewTopCostTimeResponseBody</p>
 */
public class DescribeDomainViewTopCostTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UrlList")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UrlList.
         */
        public Builder urlList(java.util.List < UrlList> urlList) {
            this.urlList = urlList;
            return this;
        }

        public DescribeDomainViewTopCostTimeResponseBody build() {
            return new DescribeDomainViewTopCostTimeResponseBody(this);
        } 

    } 

    public static class UrlList extends TeaModel {
        @NameInMap("CostTime")
        private Float costTime;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Url")
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
             * CostTime.
             */
            public Builder costTime(Float costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Url.
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
