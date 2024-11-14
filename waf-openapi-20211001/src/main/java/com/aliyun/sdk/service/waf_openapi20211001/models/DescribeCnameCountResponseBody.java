// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the number of domain names that are added to WAF in CNAME record mode and hybrid cloud reverse proxy mode.</p>
         */
        public Builder cnameCount(CnameCount cnameCount) {
            this.cnameCount = cnameCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCnameCountResponseBody build() {
            return new DescribeCnameCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCnameCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCnameCountResponseBody</p>
     */
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
             * <p>The number of domain names that are added to WAF in CNAME record mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cname(Long cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The number of domain names that are added to WAF in hybrid cloud reverse proxy mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hybridCloudCname(Long hybridCloudCname) {
                this.hybridCloudCname = hybridCloudCname;
                return this;
            }

            /**
             * <p>The total number of domain names that are added to WAF in CNAME record mode and hybrid cloud reverse proxy mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
