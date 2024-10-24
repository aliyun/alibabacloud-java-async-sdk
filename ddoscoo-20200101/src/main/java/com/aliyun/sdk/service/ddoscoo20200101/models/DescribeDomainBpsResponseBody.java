// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainBpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainBpsResponseBody</p>
 */
public class DescribeDomainBpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainBps")
    private java.util.List < DomainBps> domainBps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainBpsResponseBody(Builder builder) {
        this.domainBps = builder.domainBps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainBps
     */
    public java.util.List < DomainBps> getDomainBps() {
        return this.domainBps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainBps> domainBps; 
        private String requestId; 

        /**
         * DomainBps.
         */
        public Builder domainBps(java.util.List < DomainBps> domainBps) {
            this.domainBps = domainBps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainBpsResponseBody build() {
            return new DescribeDomainBpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainBpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainBpsResponseBody</p>
     */
    public static class DomainBps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InBps")
        private Long inBps;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("OutBps")
        private Long outBps;

        private DomainBps(Builder builder) {
            this.inBps = builder.inBps;
            this.index = builder.index;
            this.outBps = builder.outBps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainBps create() {
            return builder().build();
        }

        /**
         * @return inBps
         */
        public Long getInBps() {
            return this.inBps;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return outBps
         */
        public Long getOutBps() {
            return this.outBps;
        }

        public static final class Builder {
            private Long inBps; 
            private Long index; 
            private Long outBps; 

            /**
             * InBps.
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * OutBps.
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            public DomainBps build() {
                return new DomainBps(this);
            } 

        } 

    }
}
