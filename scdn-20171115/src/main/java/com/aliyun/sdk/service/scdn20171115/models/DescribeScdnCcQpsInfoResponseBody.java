// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnCcQpsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnCcQpsInfoResponseBody</p>
 */
public class DescribeScdnCcQpsInfoResponseBody extends TeaModel {
    @NameInMap("Attacks")
    private Attacks attacks;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeScopes")
    private TimeScopes timeScopes;

    @NameInMap("Totals")
    private Totals totals;

    private DescribeScdnCcQpsInfoResponseBody(Builder builder) {
        this.attacks = builder.attacks;
        this.requestId = builder.requestId;
        this.timeScopes = builder.timeScopes;
        this.totals = builder.totals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnCcQpsInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return attacks
     */
    public Attacks getAttacks() {
        return this.attacks;
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

    /**
     * @return totals
     */
    public Totals getTotals() {
        return this.totals;
    }

    public static final class Builder {
        private Attacks attacks; 
        private String requestId; 
        private TimeScopes timeScopes; 
        private Totals totals; 

        /**
         * Attacks.
         */
        public Builder attacks(Attacks attacks) {
            this.attacks = attacks;
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

        /**
         * Totals.
         */
        public Builder totals(Totals totals) {
            this.totals = totals;
            return this;
        }

        public DescribeScdnCcQpsInfoResponseBody build() {
            return new DescribeScdnCcQpsInfoResponseBody(this);
        } 

    } 

    public static class Attacks extends TeaModel {
        @NameInMap("Attack")
        private java.util.List < String > attack;

        private Attacks(Builder builder) {
            this.attack = builder.attack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attacks create() {
            return builder().build();
        }

        /**
         * @return attack
         */
        public java.util.List < String > getAttack() {
            return this.attack;
        }

        public static final class Builder {
            private java.util.List < String > attack; 

            /**
             * Attack.
             */
            public Builder attack(java.util.List < String > attack) {
                this.attack = attack;
                return this;
            }

            public Attacks build() {
                return new Attacks(this);
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
    public static class Totals extends TeaModel {
        @NameInMap("Total")
        private java.util.List < String > total;

        private Totals(Builder builder) {
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Totals create() {
            return builder().build();
        }

        /**
         * @return total
         */
        public java.util.List < String > getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < String > total; 

            /**
             * Total.
             */
            public Builder total(java.util.List < String > total) {
                this.total = total;
                return this;
            }

            public Totals build() {
                return new Totals(this);
            } 

        } 

    }
}
