// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCnameCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCnameCountResponseBody</p>
 */
public class DescribeCnameCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnameCount")
    private CnameCount cnameCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCnameCountResponseBody(Builder builder) {
        this.cnameCount = builder.cnameCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCnameCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return cnameCount
     */
    public CnameCount getCnameCount() {
        return this.cnameCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CnameCount cnameCount; 
        private String requestId; 

        /**
         * CnameCount.
         */
        public Builder cnameCount(CnameCount cnameCount) {
            this.cnameCount = cnameCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCnameCountResponseBody build() {
            return new DescribeCnameCountResponseBody(this);
        } 

    } 

    public static class CnameCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private Long cname;

        @com.aliyun.core.annotation.NameInMap("HybridCloudCname")
        private Long hybridCloudCname;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private CnameCount(Builder builder) {
            this.cname = builder.cname;
            this.hybridCloudCname = builder.hybridCloudCname;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CnameCount create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public Long getCname() {
            return this.cname;
        }

        /**
         * @return hybridCloudCname
         */
        public Long getHybridCloudCname() {
            return this.hybridCloudCname;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long cname; 
            private Long hybridCloudCname; 
            private Long total; 

            /**
             * Cname.
             */
            public Builder cname(Long cname) {
                this.cname = cname;
                return this;
            }

            /**
             * HybridCloudCname.
             */
            public Builder hybridCloudCname(Long hybridCloudCname) {
                this.hybridCloudCname = hybridCloudCname;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public CnameCount build() {
                return new CnameCount(this);
            } 

        } 

    }
}
