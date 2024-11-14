// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSensitiveApiStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveApiStatisticResponseBody</p>
 */
public class DescribeSensitiveApiStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSensitiveApiStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveApiStatisticResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The statistics.</p>
         */
        public Builder data(java.util.List < Data> data) {
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

        public DescribeSensitiveApiStatisticResponseBody build() {
            return new DescribeSensitiveApiStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveApiStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveApiStatisticResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("InfoCount")
        private Long infoCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private java.util.List < String > sensitiveCode;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Long sensitiveCount;

        private List(Builder builder) {
            this.apiFormat = builder.apiFormat;
            this.apiId = builder.apiId;
            this.infoCount = builder.infoCount;
            this.sensitiveCode = builder.sensitiveCode;
            this.sensitiveCount = builder.sensitiveCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return apiFormat
         */
        public String getApiFormat() {
            return this.apiFormat;
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return infoCount
         */
        public Long getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return sensitiveCode
         */
        public java.util.List < String > getSensitiveCode() {
            return this.sensitiveCode;
        }

        /**
         * @return sensitiveCount
         */
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

        public static final class Builder {
            private String apiFormat; 
            private String apiId; 
            private Long infoCount; 
            private java.util.List < String > sensitiveCode; 
            private Long sensitiveCount; 

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
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>d288137009c119a873d4c395****</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The number of personal information records involved in cross-border data transfer by API.</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder infoCount(Long infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * <p>The types of sensitive data.</p>
             */
            public Builder sensitiveCode(java.util.List < String > sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            /**
             * <p>The number of sensitive personal information records involved in cross-border data transfer by API.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder sensitiveCount(Long sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSensitiveApiStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveApiStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoOutboundCount")
        private Long infoOutboundCount;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("SensitiveOutboundCount")
        private Long sensitiveOutboundCount;

        private Data(Builder builder) {
            this.infoOutboundCount = builder.infoOutboundCount;
            this.list = builder.list;
            this.matchedHost = builder.matchedHost;
            this.sensitiveOutboundCount = builder.sensitiveOutboundCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return infoOutboundCount
         */
        public Long getInfoOutboundCount() {
            return this.infoOutboundCount;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return matchedHost
         */
        public String getMatchedHost() {
            return this.matchedHost;
        }

        /**
         * @return sensitiveOutboundCount
         */
        public Long getSensitiveOutboundCount() {
            return this.sensitiveOutboundCount;
        }

        public static final class Builder {
            private Long infoOutboundCount; 
            private java.util.List < List> list; 
            private String matchedHost; 
            private Long sensitiveOutboundCount; 

            /**
             * <p>The number of personal information records involved in cross-border data transfer by domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>213</p>
             */
            public Builder infoOutboundCount(Long infoOutboundCount) {
                this.infoOutboundCount = infoOutboundCount;
                return this;
            }

            /**
             * <p>The domain name-related APIs.</p>
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The domain name or IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>www.***.top</p>
             */
            public Builder matchedHost(String matchedHost) {
                this.matchedHost = matchedHost;
                return this;
            }

            /**
             * <p>The number of sensitive personal information records involved in cross-border data transfer by domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>127</p>
             */
            public Builder sensitiveOutboundCount(Long sensitiveOutboundCount) {
                this.sensitiveOutboundCount = sensitiveOutboundCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
