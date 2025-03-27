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
 * {@link DescribeApisecEventDomainStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecEventDomainStatisticResponseBody</p>
 */
public class DescribeApisecEventDomainStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecEventDomainStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecEventDomainStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApisecEventDomainStatisticResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-*******-80A6-3014697B11AE</p>
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

        public DescribeApisecEventDomainStatisticResponseBody build() {
            return new DescribeApisecEventDomainStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecEventDomainStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecEventDomainStatisticResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiCount = model.apiCount;
                this.domain = model.domain;
                this.high = model.high;
                this.low = model.low;
                this.medium = model.medium;
            } 

            /**
             * <p>The number of APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder apiCount(Long apiCount) {
                this.apiCount = apiCount;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>a.aliyun.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of high-risk security events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder high(Long high) {
                this.high = high;
                return this;
            }

            /**
             * <p>The number of low-risk security events.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder low(Long low) {
                this.low = low;
                return this;
            }

            /**
             * <p>The number of medium-risk security events.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
