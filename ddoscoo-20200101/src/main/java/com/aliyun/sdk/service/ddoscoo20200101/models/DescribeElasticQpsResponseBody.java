// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticQpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticQpsResponseBody</p>
 */
public class DescribeElasticQpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticQps")
    private java.util.List < ElasticQps> elasticQps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeElasticQpsResponseBody(Builder builder) {
        this.elasticQps = builder.elasticQps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticQpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticQps
     */
    public java.util.List < ElasticQps> getElasticQps() {
        return this.elasticQps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ElasticQps> elasticQps; 
        private String requestId; 

        /**
         * The information about the burstable QPS.
         */
        public Builder elasticQps(java.util.List < ElasticQps> elasticQps) {
            this.elasticQps = elasticQps;
            return this;
        }

        /**
         * The request ID, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticQpsResponseBody build() {
            return new DescribeElasticQpsResponseBody(this);
        } 

    } 

    public static class ElasticQps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("MaxNormalQps")
        private Long maxNormalQps;

        @com.aliyun.core.annotation.NameInMap("MaxQps")
        private Long maxQps;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        @com.aliyun.core.annotation.NameInMap("Status2")
        private Long status2;

        @com.aliyun.core.annotation.NameInMap("Status3")
        private Long status3;

        @com.aliyun.core.annotation.NameInMap("Status4")
        private Long status4;

        @com.aliyun.core.annotation.NameInMap("Status5")
        private Long status5;

        @com.aliyun.core.annotation.NameInMap("Ups")
        private Long ups;

        private ElasticQps(Builder builder) {
            this.index = builder.index;
            this.maxNormalQps = builder.maxNormalQps;
            this.maxQps = builder.maxQps;
            this.pv = builder.pv;
            this.status2 = builder.status2;
            this.status3 = builder.status3;
            this.status4 = builder.status4;
            this.status5 = builder.status5;
            this.ups = builder.ups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticQps create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return maxNormalQps
         */
        public Long getMaxNormalQps() {
            return this.maxNormalQps;
        }

        /**
         * @return maxQps
         */
        public Long getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        /**
         * @return status2
         */
        public Long getStatus2() {
            return this.status2;
        }

        /**
         * @return status3
         */
        public Long getStatus3() {
            return this.status3;
        }

        /**
         * @return status4
         */
        public Long getStatus4() {
            return this.status4;
        }

        /**
         * @return status5
         */
        public Long getStatus5() {
            return this.status5;
        }

        /**
         * @return ups
         */
        public Long getUps() {
            return this.ups;
        }

        public static final class Builder {
            private Long index; 
            private Long maxNormalQps; 
            private Long maxQps; 
            private Long pv; 
            private Long status2; 
            private Long status3; 
            private Long status4; 
            private Long status5; 
            private Long ups; 

            /**
             * The index number of the returned data.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * The peak QPS of the normal service.
             */
            public Builder maxNormalQps(Long maxNormalQps) {
                this.maxNormalQps = maxNormalQps;
                return this;
            }

            /**
             * The peak inbound QPS.
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * The total number of requests during the step size period.
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * The total number of HTTP 2xx status codes during the step size period.
             */
            public Builder status2(Long status2) {
                this.status2 = status2;
                return this;
            }

            /**
             * The total number of HTTP 3xx status codes during the step size period.
             */
            public Builder status3(Long status3) {
                this.status3 = status3;
                return this;
            }

            /**
             * The total number of HTTP 4xx status codes during the step size period.
             */
            public Builder status4(Long status4) {
                this.status4 = status4;
                return this;
            }

            /**
             * The total number of HTTP 5xx status codes during the step size period.
             */
            public Builder status5(Long status5) {
                this.status5 = status5;
                return this;
            }

            /**
             * The total number of origin requests during the step size period.
             */
            public Builder ups(Long ups) {
                this.ups = ups;
                return this;
            }

            public ElasticQps build() {
                return new ElasticQps(this);
            } 

        } 

    }
}
