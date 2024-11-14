// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApisecMatchedHostsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecMatchedHostsResponseBody</p>
 */
public class DescribeApisecMatchedHostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeApisecMatchedHostsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecMatchedHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private String totalCount; 

        /**
         * <p>The domain names.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D4CA088-F72B-5658-BD5B-ECE8B8F0C7BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecMatchedHostsResponseBody build() {
            return new DescribeApisecMatchedHostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecMatchedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecMatchedHostsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        private Data(Builder builder) {
            this.count = builder.count;
            this.matchedHost = builder.matchedHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return matchedHost
         */
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public static final class Builder {
            private Long count; 
            private String matchedHost; 

            /**
             * <p>The number of APIs related to the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The domain name or IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>bc.aliyun.com</p>
             */
            public Builder matchedHost(String matchedHost) {
                this.matchedHost = matchedHost;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
