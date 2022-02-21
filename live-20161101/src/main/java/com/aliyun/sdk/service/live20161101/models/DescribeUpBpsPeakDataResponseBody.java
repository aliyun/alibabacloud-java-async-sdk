// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpBpsPeakDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpBpsPeakDataResponseBody</p>
 */
public class DescribeUpBpsPeakDataResponseBody extends TeaModel {
    @NameInMap("DescribeUpPeakTraffics")
    private DescribeUpPeakTraffics describeUpPeakTraffics;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUpBpsPeakDataResponseBody(Builder builder) {
        this.describeUpPeakTraffics = builder.describeUpPeakTraffics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpBpsPeakDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return describeUpPeakTraffics
     */
    public DescribeUpPeakTraffics getDescribeUpPeakTraffics() {
        return this.describeUpPeakTraffics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DescribeUpPeakTraffics describeUpPeakTraffics; 
        private String requestId; 

        /**
         * DescribeUpPeakTraffics.
         */
        public Builder describeUpPeakTraffics(DescribeUpPeakTraffics describeUpPeakTraffics) {
            this.describeUpPeakTraffics = describeUpPeakTraffics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpBpsPeakDataResponseBody build() {
            return new DescribeUpBpsPeakDataResponseBody(this);
        } 

    } 

    public static class DescribeUpPeakTraffic extends TeaModel {
        @NameInMap("BandWidth")
        private String bandWidth;

        @NameInMap("PeakTime")
        private String peakTime;

        @NameInMap("QueryTime")
        private String queryTime;

        @NameInMap("StatName")
        private String statName;

        private DescribeUpPeakTraffic(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.peakTime = builder.peakTime;
            this.queryTime = builder.queryTime;
            this.statName = builder.statName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpPeakTraffic create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public String getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return peakTime
         */
        public String getPeakTime() {
            return this.peakTime;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return statName
         */
        public String getStatName() {
            return this.statName;
        }

        public static final class Builder {
            private String bandWidth; 
            private String peakTime; 
            private String queryTime; 
            private String statName; 

            /**
             * BandWidth.
             */
            public Builder bandWidth(String bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * PeakTime.
             */
            public Builder peakTime(String peakTime) {
                this.peakTime = peakTime;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * StatName.
             */
            public Builder statName(String statName) {
                this.statName = statName;
                return this;
            }

            public DescribeUpPeakTraffic build() {
                return new DescribeUpPeakTraffic(this);
            } 

        } 

    }
    public static class DescribeUpPeakTraffics extends TeaModel {
        @NameInMap("DescribeUpPeakTraffic")
        private java.util.List < DescribeUpPeakTraffic> describeUpPeakTraffic;

        private DescribeUpPeakTraffics(Builder builder) {
            this.describeUpPeakTraffic = builder.describeUpPeakTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpPeakTraffics create() {
            return builder().build();
        }

        /**
         * @return describeUpPeakTraffic
         */
        public java.util.List < DescribeUpPeakTraffic> getDescribeUpPeakTraffic() {
            return this.describeUpPeakTraffic;
        }

        public static final class Builder {
            private java.util.List < DescribeUpPeakTraffic> describeUpPeakTraffic; 

            /**
             * DescribeUpPeakTraffic.
             */
            public Builder describeUpPeakTraffic(java.util.List < DescribeUpPeakTraffic> describeUpPeakTraffic) {
                this.describeUpPeakTraffic = describeUpPeakTraffic;
                return this;
            }

            public DescribeUpPeakTraffics build() {
                return new DescribeUpPeakTraffics(this);
            } 

        } 

    }
}
