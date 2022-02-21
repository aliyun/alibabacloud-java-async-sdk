// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsAccountSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsAccountSummaryResponseBody</p>
 */
public class DescribePdnsAccountSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePdnsAccountSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsAccountSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePdnsAccountSummaryResponseBody build() {
            return new DescribePdnsAccountSummaryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DomainCount")
        private Long domainCount;

        @NameInMap("HttpCount")
        private Long httpCount;

        @NameInMap("HttpsCount")
        private Long httpsCount;

        @NameInMap("SubDomainCount")
        private Long subDomainCount;

        @NameInMap("ThreatCount")
        private Long threatCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.domainCount = builder.domainCount;
            this.httpCount = builder.httpCount;
            this.httpsCount = builder.httpsCount;
            this.subDomainCount = builder.subDomainCount;
            this.threatCount = builder.threatCount;
            this.totalCount = builder.totalCount;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domainCount
         */
        public Long getDomainCount() {
            return this.domainCount;
        }

        /**
         * @return httpCount
         */
        public Long getHttpCount() {
            return this.httpCount;
        }

        /**
         * @return httpsCount
         */
        public Long getHttpsCount() {
            return this.httpsCount;
        }

        /**
         * @return subDomainCount
         */
        public Long getSubDomainCount() {
            return this.subDomainCount;
        }

        /**
         * @return threatCount
         */
        public Long getThreatCount() {
            return this.threatCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long domainCount; 
            private Long httpCount; 
            private Long httpsCount; 
            private Long subDomainCount; 
            private Long threatCount; 
            private Long totalCount; 
            private Long userId; 

            /**
             * DomainCount.
             */
            public Builder domainCount(Long domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * HttpCount.
             */
            public Builder httpCount(Long httpCount) {
                this.httpCount = httpCount;
                return this;
            }

            /**
             * HttpsCount.
             */
            public Builder httpsCount(Long httpsCount) {
                this.httpsCount = httpsCount;
                return this;
            }

            /**
             * SubDomainCount.
             */
            public Builder subDomainCount(Long subDomainCount) {
                this.subDomainCount = subDomainCount;
                return this;
            }

            /**
             * ThreatCount.
             */
            public Builder threatCount(Long threatCount) {
                this.threatCount = threatCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
