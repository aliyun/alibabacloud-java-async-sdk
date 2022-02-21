// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainHttpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainHttpsDataResponseBody</p>
 */
public class DescribeLiveDomainHttpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainNames")
    private String domainNames;

    @NameInMap("HttpsStatisticsInfos")
    private HttpsStatisticsInfos httpsStatisticsInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainHttpsDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainNames = builder.domainNames;
        this.httpsStatisticsInfos = builder.httpsStatisticsInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainHttpsDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return httpsStatisticsInfos
     */
    public HttpsStatisticsInfos getHttpsStatisticsInfos() {
        return this.httpsStatisticsInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainNames; 
        private HttpsStatisticsInfos httpsStatisticsInfos; 
        private String requestId; 

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DomainNames.
         */
        public Builder domainNames(String domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        /**
         * HttpsStatisticsInfos.
         */
        public Builder httpsStatisticsInfos(HttpsStatisticsInfos httpsStatisticsInfos) {
            this.httpsStatisticsInfos = httpsStatisticsInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainHttpsDataResponseBody build() {
            return new DescribeLiveDomainHttpsDataResponseBody(this);
        } 

    } 

    public static class HttpsStatisticsInfo extends TeaModel {
        @NameInMap("HttpsByteHitRate")
        private Float httpsByteHitRate;

        @NameInMap("HttpsReqHitRate")
        private Float httpsReqHitRate;

        @NameInMap("HttpsSrcBps")
        private Long httpsSrcBps;

        @NameInMap("HttpsSrcTraf")
        private Long httpsSrcTraf;

        @NameInMap("L1HttpsBps")
        private Float l1HttpsBps;

        @NameInMap("L1HttpsInnerBps")
        private Float l1HttpsInnerBps;

        @NameInMap("L1HttpsInnerQps")
        private Long l1HttpsInnerQps;

        @NameInMap("L1HttpsInnerTraf")
        private Long l1HttpsInnerTraf;

        @NameInMap("L1HttpsInner_acc")
        private Float l1HttpsInnerAcc;

        @NameInMap("L1HttpsOutBps")
        private Float l1HttpsOutBps;

        @NameInMap("L1HttpsOutQps")
        private Long l1HttpsOutQps;

        @NameInMap("L1HttpsOutTraf")
        private Long l1HttpsOutTraf;

        @NameInMap("L1HttpsOut_acc")
        private Float l1HttpsOutAcc;

        @NameInMap("L1HttpsQps")
        private Long l1HttpsQps;

        @NameInMap("L1HttpsTacc")
        private Float l1HttpsTacc;

        @NameInMap("L1HttpsTtraf")
        private Long l1HttpsTtraf;

        @NameInMap("Time")
        private String time;

        private HttpsStatisticsInfo(Builder builder) {
            this.httpsByteHitRate = builder.httpsByteHitRate;
            this.httpsReqHitRate = builder.httpsReqHitRate;
            this.httpsSrcBps = builder.httpsSrcBps;
            this.httpsSrcTraf = builder.httpsSrcTraf;
            this.l1HttpsBps = builder.l1HttpsBps;
            this.l1HttpsInnerBps = builder.l1HttpsInnerBps;
            this.l1HttpsInnerQps = builder.l1HttpsInnerQps;
            this.l1HttpsInnerTraf = builder.l1HttpsInnerTraf;
            this.l1HttpsInnerAcc = builder.l1HttpsInnerAcc;
            this.l1HttpsOutBps = builder.l1HttpsOutBps;
            this.l1HttpsOutQps = builder.l1HttpsOutQps;
            this.l1HttpsOutTraf = builder.l1HttpsOutTraf;
            this.l1HttpsOutAcc = builder.l1HttpsOutAcc;
            this.l1HttpsQps = builder.l1HttpsQps;
            this.l1HttpsTacc = builder.l1HttpsTacc;
            this.l1HttpsTtraf = builder.l1HttpsTtraf;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpsStatisticsInfo create() {
            return builder().build();
        }

        /**
         * @return httpsByteHitRate
         */
        public Float getHttpsByteHitRate() {
            return this.httpsByteHitRate;
        }

        /**
         * @return httpsReqHitRate
         */
        public Float getHttpsReqHitRate() {
            return this.httpsReqHitRate;
        }

        /**
         * @return httpsSrcBps
         */
        public Long getHttpsSrcBps() {
            return this.httpsSrcBps;
        }

        /**
         * @return httpsSrcTraf
         */
        public Long getHttpsSrcTraf() {
            return this.httpsSrcTraf;
        }

        /**
         * @return l1HttpsBps
         */
        public Float getL1HttpsBps() {
            return this.l1HttpsBps;
        }

        /**
         * @return l1HttpsInnerBps
         */
        public Float getL1HttpsInnerBps() {
            return this.l1HttpsInnerBps;
        }

        /**
         * @return l1HttpsInnerQps
         */
        public Long getL1HttpsInnerQps() {
            return this.l1HttpsInnerQps;
        }

        /**
         * @return l1HttpsInnerTraf
         */
        public Long getL1HttpsInnerTraf() {
            return this.l1HttpsInnerTraf;
        }

        /**
         * @return l1HttpsInnerAcc
         */
        public Float getL1HttpsInnerAcc() {
            return this.l1HttpsInnerAcc;
        }

        /**
         * @return l1HttpsOutBps
         */
        public Float getL1HttpsOutBps() {
            return this.l1HttpsOutBps;
        }

        /**
         * @return l1HttpsOutQps
         */
        public Long getL1HttpsOutQps() {
            return this.l1HttpsOutQps;
        }

        /**
         * @return l1HttpsOutTraf
         */
        public Long getL1HttpsOutTraf() {
            return this.l1HttpsOutTraf;
        }

        /**
         * @return l1HttpsOutAcc
         */
        public Float getL1HttpsOutAcc() {
            return this.l1HttpsOutAcc;
        }

        /**
         * @return l1HttpsQps
         */
        public Long getL1HttpsQps() {
            return this.l1HttpsQps;
        }

        /**
         * @return l1HttpsTacc
         */
        public Float getL1HttpsTacc() {
            return this.l1HttpsTacc;
        }

        /**
         * @return l1HttpsTtraf
         */
        public Long getL1HttpsTtraf() {
            return this.l1HttpsTtraf;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Float httpsByteHitRate; 
            private Float httpsReqHitRate; 
            private Long httpsSrcBps; 
            private Long httpsSrcTraf; 
            private Float l1HttpsBps; 
            private Float l1HttpsInnerBps; 
            private Long l1HttpsInnerQps; 
            private Long l1HttpsInnerTraf; 
            private Float l1HttpsInnerAcc; 
            private Float l1HttpsOutBps; 
            private Long l1HttpsOutQps; 
            private Long l1HttpsOutTraf; 
            private Float l1HttpsOutAcc; 
            private Long l1HttpsQps; 
            private Float l1HttpsTacc; 
            private Long l1HttpsTtraf; 
            private String time; 

            /**
             * HttpsByteHitRate.
             */
            public Builder httpsByteHitRate(Float httpsByteHitRate) {
                this.httpsByteHitRate = httpsByteHitRate;
                return this;
            }

            /**
             * HttpsReqHitRate.
             */
            public Builder httpsReqHitRate(Float httpsReqHitRate) {
                this.httpsReqHitRate = httpsReqHitRate;
                return this;
            }

            /**
             * HttpsSrcBps.
             */
            public Builder httpsSrcBps(Long httpsSrcBps) {
                this.httpsSrcBps = httpsSrcBps;
                return this;
            }

            /**
             * HttpsSrcTraf.
             */
            public Builder httpsSrcTraf(Long httpsSrcTraf) {
                this.httpsSrcTraf = httpsSrcTraf;
                return this;
            }

            /**
             * L1HttpsBps.
             */
            public Builder l1HttpsBps(Float l1HttpsBps) {
                this.l1HttpsBps = l1HttpsBps;
                return this;
            }

            /**
             * L1HttpsInnerBps.
             */
            public Builder l1HttpsInnerBps(Float l1HttpsInnerBps) {
                this.l1HttpsInnerBps = l1HttpsInnerBps;
                return this;
            }

            /**
             * L1HttpsInnerQps.
             */
            public Builder l1HttpsInnerQps(Long l1HttpsInnerQps) {
                this.l1HttpsInnerQps = l1HttpsInnerQps;
                return this;
            }

            /**
             * L1HttpsInnerTraf.
             */
            public Builder l1HttpsInnerTraf(Long l1HttpsInnerTraf) {
                this.l1HttpsInnerTraf = l1HttpsInnerTraf;
                return this;
            }

            /**
             * L1HttpsInner_acc.
             */
            public Builder l1HttpsInnerAcc(Float l1HttpsInnerAcc) {
                this.l1HttpsInnerAcc = l1HttpsInnerAcc;
                return this;
            }

            /**
             * L1HttpsOutBps.
             */
            public Builder l1HttpsOutBps(Float l1HttpsOutBps) {
                this.l1HttpsOutBps = l1HttpsOutBps;
                return this;
            }

            /**
             * L1HttpsOutQps.
             */
            public Builder l1HttpsOutQps(Long l1HttpsOutQps) {
                this.l1HttpsOutQps = l1HttpsOutQps;
                return this;
            }

            /**
             * L1HttpsOutTraf.
             */
            public Builder l1HttpsOutTraf(Long l1HttpsOutTraf) {
                this.l1HttpsOutTraf = l1HttpsOutTraf;
                return this;
            }

            /**
             * L1HttpsOut_acc.
             */
            public Builder l1HttpsOutAcc(Float l1HttpsOutAcc) {
                this.l1HttpsOutAcc = l1HttpsOutAcc;
                return this;
            }

            /**
             * L1HttpsQps.
             */
            public Builder l1HttpsQps(Long l1HttpsQps) {
                this.l1HttpsQps = l1HttpsQps;
                return this;
            }

            /**
             * L1HttpsTacc.
             */
            public Builder l1HttpsTacc(Float l1HttpsTacc) {
                this.l1HttpsTacc = l1HttpsTacc;
                return this;
            }

            /**
             * L1HttpsTtraf.
             */
            public Builder l1HttpsTtraf(Long l1HttpsTtraf) {
                this.l1HttpsTtraf = l1HttpsTtraf;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public HttpsStatisticsInfo build() {
                return new HttpsStatisticsInfo(this);
            } 

        } 

    }
    public static class HttpsStatisticsInfos extends TeaModel {
        @NameInMap("HttpsStatisticsInfo")
        private java.util.List < HttpsStatisticsInfo> httpsStatisticsInfo;

        private HttpsStatisticsInfos(Builder builder) {
            this.httpsStatisticsInfo = builder.httpsStatisticsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpsStatisticsInfos create() {
            return builder().build();
        }

        /**
         * @return httpsStatisticsInfo
         */
        public java.util.List < HttpsStatisticsInfo> getHttpsStatisticsInfo() {
            return this.httpsStatisticsInfo;
        }

        public static final class Builder {
            private java.util.List < HttpsStatisticsInfo> httpsStatisticsInfo; 

            /**
             * HttpsStatisticsInfo.
             */
            public Builder httpsStatisticsInfo(java.util.List < HttpsStatisticsInfo> httpsStatisticsInfo) {
                this.httpsStatisticsInfo = httpsStatisticsInfo;
                return this;
            }

            public HttpsStatisticsInfos build() {
                return new HttpsStatisticsInfos(this);
            } 

        } 

    }
}
