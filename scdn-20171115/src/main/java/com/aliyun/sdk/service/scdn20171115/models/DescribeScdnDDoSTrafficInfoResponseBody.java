// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDDoSTrafficInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnDDoSTrafficInfoResponseBody</p>
 */
public class DescribeScdnDDoSTrafficInfoResponseBody extends TeaModel {
    @NameInMap("BpsDrops")
    private BpsDrops bpsDrops;

    @NameInMap("BpsTotals")
    private BpsTotals bpsTotals;

    @NameInMap("PpsDrops")
    private PpsDrops ppsDrops;

    @NameInMap("PpsTotals")
    private PpsTotals ppsTotals;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeScopes")
    private TimeScopes timeScopes;

    private DescribeScdnDDoSTrafficInfoResponseBody(Builder builder) {
        this.bpsDrops = builder.bpsDrops;
        this.bpsTotals = builder.bpsTotals;
        this.ppsDrops = builder.ppsDrops;
        this.ppsTotals = builder.ppsTotals;
        this.requestId = builder.requestId;
        this.timeScopes = builder.timeScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnDDoSTrafficInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bpsDrops
     */
    public BpsDrops getBpsDrops() {
        return this.bpsDrops;
    }

    /**
     * @return bpsTotals
     */
    public BpsTotals getBpsTotals() {
        return this.bpsTotals;
    }

    /**
     * @return ppsDrops
     */
    public PpsDrops getPpsDrops() {
        return this.ppsDrops;
    }

    /**
     * @return ppsTotals
     */
    public PpsTotals getPpsTotals() {
        return this.ppsTotals;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeScopes
     */
    public TimeScopes getTimeScopes() {
        return this.timeScopes;
    }

    public static final class Builder {
        private BpsDrops bpsDrops; 
        private BpsTotals bpsTotals; 
        private PpsDrops ppsDrops; 
        private PpsTotals ppsTotals; 
        private String requestId; 
        private TimeScopes timeScopes; 

        /**
         * BpsDrops.
         */
        public Builder bpsDrops(BpsDrops bpsDrops) {
            this.bpsDrops = bpsDrops;
            return this;
        }

        /**
         * BpsTotals.
         */
        public Builder bpsTotals(BpsTotals bpsTotals) {
            this.bpsTotals = bpsTotals;
            return this;
        }

        /**
         * PpsDrops.
         */
        public Builder ppsDrops(PpsDrops ppsDrops) {
            this.ppsDrops = ppsDrops;
            return this;
        }

        /**
         * PpsTotals.
         */
        public Builder ppsTotals(PpsTotals ppsTotals) {
            this.ppsTotals = ppsTotals;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeScopes.
         */
        public Builder timeScopes(TimeScopes timeScopes) {
            this.timeScopes = timeScopes;
            return this;
        }

        public DescribeScdnDDoSTrafficInfoResponseBody build() {
            return new DescribeScdnDDoSTrafficInfoResponseBody(this);
        } 

    } 

    public static class BpsDrops extends TeaModel {
        @NameInMap("BpsDrop")
        private java.util.List < String > bpsDrop;

        private BpsDrops(Builder builder) {
            this.bpsDrop = builder.bpsDrop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDrops create() {
            return builder().build();
        }

        /**
         * @return bpsDrop
         */
        public java.util.List < String > getBpsDrop() {
            return this.bpsDrop;
        }

        public static final class Builder {
            private java.util.List < String > bpsDrop; 

            /**
             * BpsDrop.
             */
            public Builder bpsDrop(java.util.List < String > bpsDrop) {
                this.bpsDrop = bpsDrop;
                return this;
            }

            public BpsDrops build() {
                return new BpsDrops(this);
            } 

        } 

    }
    public static class BpsTotals extends TeaModel {
        @NameInMap("BpsTotal")
        private java.util.List < String > bpsTotal;

        private BpsTotals(Builder builder) {
            this.bpsTotal = builder.bpsTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsTotals create() {
            return builder().build();
        }

        /**
         * @return bpsTotal
         */
        public java.util.List < String > getBpsTotal() {
            return this.bpsTotal;
        }

        public static final class Builder {
            private java.util.List < String > bpsTotal; 

            /**
             * BpsTotal.
             */
            public Builder bpsTotal(java.util.List < String > bpsTotal) {
                this.bpsTotal = bpsTotal;
                return this;
            }

            public BpsTotals build() {
                return new BpsTotals(this);
            } 

        } 

    }
    public static class PpsDrops extends TeaModel {
        @NameInMap("PpsDrop")
        private java.util.List < String > ppsDrop;

        private PpsDrops(Builder builder) {
            this.ppsDrop = builder.ppsDrop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PpsDrops create() {
            return builder().build();
        }

        /**
         * @return ppsDrop
         */
        public java.util.List < String > getPpsDrop() {
            return this.ppsDrop;
        }

        public static final class Builder {
            private java.util.List < String > ppsDrop; 

            /**
             * PpsDrop.
             */
            public Builder ppsDrop(java.util.List < String > ppsDrop) {
                this.ppsDrop = ppsDrop;
                return this;
            }

            public PpsDrops build() {
                return new PpsDrops(this);
            } 

        } 

    }
    public static class PpsTotals extends TeaModel {
        @NameInMap("PpsTotal")
        private java.util.List < String > ppsTotal;

        private PpsTotals(Builder builder) {
            this.ppsTotal = builder.ppsTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PpsTotals create() {
            return builder().build();
        }

        /**
         * @return ppsTotal
         */
        public java.util.List < String > getPpsTotal() {
            return this.ppsTotal;
        }

        public static final class Builder {
            private java.util.List < String > ppsTotal; 

            /**
             * PpsTotal.
             */
            public Builder ppsTotal(java.util.List < String > ppsTotal) {
                this.ppsTotal = ppsTotal;
                return this;
            }

            public PpsTotals build() {
                return new PpsTotals(this);
            } 

        } 

    }
    public static class TimeScope extends TeaModel {
        @NameInMap("Interval")
        private String interval;

        @NameInMap("Start")
        private String start;

        private TimeScope(Builder builder) {
            this.interval = builder.interval;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeScope create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String interval; 
            private String start; 

            /**
             * Interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public TimeScope build() {
                return new TimeScope(this);
            } 

        } 

    }
    public static class TimeScopes extends TeaModel {
        @NameInMap("TimeScope")
        private java.util.List < TimeScope> timeScope;

        private TimeScopes(Builder builder) {
            this.timeScope = builder.timeScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeScopes create() {
            return builder().build();
        }

        /**
         * @return timeScope
         */
        public java.util.List < TimeScope> getTimeScope() {
            return this.timeScope;
        }

        public static final class Builder {
            private java.util.List < TimeScope> timeScope; 

            /**
             * TimeScope.
             */
            public Builder timeScope(java.util.List < TimeScope> timeScope) {
                this.timeScope = timeScope;
                return this;
            }

            public TimeScopes build() {
                return new TimeScopes(this);
            } 

        } 

    }
}
