// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisecAbnormalDomainStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecAbnormalDomainStatisticResponseBody</p>
 */
public class DescribeApisecAbnormalDomainStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecAbnormalDomainStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecAbnormalDomainStatisticResponseBody create() {
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecAbnormalDomainStatisticResponseBody build() {
            return new DescribeApisecAbnormalDomainStatisticResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiCount")
        private Long apiCount;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("High")
        private Long high;

        @com.aliyun.core.annotation.NameInMap("Low")
        private Long low;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private Long medium;

        private Data(Builder builder) {
            this.apiCount = builder.apiCount;
            this.domain = builder.domain;
            this.high = builder.high;
            this.low = builder.low;
            this.medium = builder.medium;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiCount
         */
        public Long getApiCount() {
            return this.apiCount;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return high
         */
        public Long getHigh() {
            return this.high;
        }

        /**
         * @return low
         */
        public Long getLow() {
            return this.low;
        }

        /**
         * @return medium
         */
        public Long getMedium() {
            return this.medium;
        }

        public static final class Builder {
            private Long apiCount; 
            private String domain; 
            private Long high; 
            private Long low; 
            private Long medium; 

            /**
             * ApiCount.
             */
            public Builder apiCount(Long apiCount) {
                this.apiCount = apiCount;
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
             * High.
             */
            public Builder high(Long high) {
                this.high = high;
                return this;
            }

            /**
             * Low.
             */
            public Builder low(Long low) {
                this.low = low;
                return this;
            }

            /**
             * Medium.
             */
            public Builder medium(Long medium) {
                this.medium = medium;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
