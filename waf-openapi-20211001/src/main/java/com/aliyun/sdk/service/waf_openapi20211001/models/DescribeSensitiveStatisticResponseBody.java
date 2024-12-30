// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSensitiveStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveStatisticResponseBody</p>
 */
public class DescribeSensitiveStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSensitiveStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The statistics of the sensitive data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSensitiveStatisticResponseBody build() {
            return new DescribeSensitiveStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private String sensitiveCode;

        private Data(Builder builder) {
            this.apiFormat = builder.apiFormat;
            this.clientIP = builder.clientIP;
            this.count = builder.count;
            this.matchedHost = builder.matchedHost;
            this.sensitiveCode = builder.sensitiveCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiFormat
         */
        public String getApiFormat() {
            return this.apiFormat;
        }

        /**
         * @return clientIP
         */
        public String getClientIP() {
            return this.clientIP;
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

        /**
         * @return sensitiveCode
         */
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

        public static final class Builder {
            private String apiFormat; 
            private String clientIP; 
            private Long count; 
            private String matchedHost; 
            private String sensitiveCode; 

            /**
             * <p>The API.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/login</p>
             */
            public Builder apiFormat(String apiFormat) {
                this.apiFormat = apiFormat;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.50.11.**</p>
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * <p>The number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>169</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>a.****.com</p>
             */
            public Builder matchedHost(String matchedHost) {
                this.matchedHost = matchedHost;
                return this;
            }

            /**
             * <p>The type of the sensitive data.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of sensitive data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1003</p>
             */
            public Builder sensitiveCode(String sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
