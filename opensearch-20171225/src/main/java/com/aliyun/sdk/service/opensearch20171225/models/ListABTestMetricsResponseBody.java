// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListABTestMetricsResponseBody</p>
 */
public class ListABTestMetricsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListABTestMetricsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListABTestMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListABTestMetricsResponseBody build() {
            return new ListABTestMetricsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ctr")
        private Float ctr;

        @NameInMap("date")
        private String date;

        @NameInMap("experimentName")
        private String experimentName;

        @NameInMap("ipv")
        private Integer ipv;

        @NameInMap("ipvUv")
        private Integer ipvUv;

        @NameInMap("pv")
        private Integer pv;

        @NameInMap("uv")
        private Integer uv;

        @NameInMap("zeroHitRate")
        private Float zeroHitRate;

        private Result(Builder builder) {
            this.ctr = builder.ctr;
            this.date = builder.date;
            this.experimentName = builder.experimentName;
            this.ipv = builder.ipv;
            this.ipvUv = builder.ipvUv;
            this.pv = builder.pv;
            this.uv = builder.uv;
            this.zeroHitRate = builder.zeroHitRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ctr
         */
        public Float getCtr() {
            return this.ctr;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        /**
         * @return ipv
         */
        public Integer getIpv() {
            return this.ipv;
        }

        /**
         * @return ipvUv
         */
        public Integer getIpvUv() {
            return this.ipvUv;
        }

        /**
         * @return pv
         */
        public Integer getPv() {
            return this.pv;
        }

        /**
         * @return uv
         */
        public Integer getUv() {
            return this.uv;
        }

        /**
         * @return zeroHitRate
         */
        public Float getZeroHitRate() {
            return this.zeroHitRate;
        }

        public static final class Builder {
            private Float ctr; 
            private String date; 
            private String experimentName; 
            private Integer ipv; 
            private Integer ipvUv; 
            private Integer pv; 
            private Integer uv; 
            private Float zeroHitRate; 

            /**
             * ctr.
             */
            public Builder ctr(Float ctr) {
                this.ctr = ctr;
                return this;
            }

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * experimentName.
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * ipv.
             */
            public Builder ipv(Integer ipv) {
                this.ipv = ipv;
                return this;
            }

            /**
             * ipvUv.
             */
            public Builder ipvUv(Integer ipvUv) {
                this.ipvUv = ipvUv;
                return this;
            }

            /**
             * pv.
             */
            public Builder pv(Integer pv) {
                this.pv = pv;
                return this;
            }

            /**
             * uv.
             */
            public Builder uv(Integer uv) {
                this.uv = uv;
                return this;
            }

            /**
             * zeroHitRate.
             */
            public Builder zeroHitRate(Float zeroHitRate) {
                this.zeroHitRate = zeroHitRate;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
