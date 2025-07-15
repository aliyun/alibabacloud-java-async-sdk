// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUpBpsPeakDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpBpsPeakDataResponseBody</p>
 */
public class DescribeUpBpsPeakDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DescribeUpPeakTraffics")
    private DescribeUpPeakTraffics describeUpPeakTraffics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeUpBpsPeakDataResponseBody model) {
            this.describeUpPeakTraffics = model.describeUpPeakTraffics;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about peak inbound bandwidth on each day.</p>
         */
        public Builder describeUpPeakTraffics(DescribeUpPeakTraffics describeUpPeakTraffics) {
            this.describeUpPeakTraffics = describeUpPeakTraffics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpBpsPeakDataResponseBody build() {
            return new DescribeUpBpsPeakDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpBpsPeakDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpBpsPeakDataResponseBody</p>
     */
    public static class DescribeUpPeakTraffic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private String bandWidth;

        @com.aliyun.core.annotation.NameInMap("PeakTime")
        private String peakTime;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("StatName")
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

            private Builder() {
            } 

            private Builder(DescribeUpPeakTraffic model) {
                this.bandWidth = model.bandWidth;
                this.peakTime = model.peakTime;
                this.queryTime = model.queryTime;
                this.statName = model.statName;
            } 

            /**
             * <p>The daily peak inbound bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>777.2727083333333</p>
             */
            public Builder bandWidth(String bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The time when the daily peak bandwidth is reached.</p>
             * 
             * <strong>example:</strong>
             * <p>1522180000000</p>
             */
            public Builder peakTime(String peakTime) {
                this.peakTime = peakTime;
                return this;
            }

            /**
             * <p>The time queried on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>1522080000000</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The category of the statistical data. If the DomainSwitch parameter is set to on, the value of this parameter is the domain name. If the DomainSwitch parameter is set to off or not specified, the value of this parameter is the user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>push-live.aliyuncs.com</p>
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
    /**
     * 
     * {@link DescribeUpBpsPeakDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpBpsPeakDataResponseBody</p>
     */
    public static class DescribeUpPeakTraffics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DescribeUpPeakTraffic")
        private java.util.List<DescribeUpPeakTraffic> describeUpPeakTraffic;

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
        public java.util.List<DescribeUpPeakTraffic> getDescribeUpPeakTraffic() {
            return this.describeUpPeakTraffic;
        }

        public static final class Builder {
            private java.util.List<DescribeUpPeakTraffic> describeUpPeakTraffic; 

            private Builder() {
            } 

            private Builder(DescribeUpPeakTraffics model) {
                this.describeUpPeakTraffic = model.describeUpPeakTraffic;
            } 

            /**
             * DescribeUpPeakTraffic.
             */
            public Builder describeUpPeakTraffic(java.util.List<DescribeUpPeakTraffic> describeUpPeakTraffic) {
                this.describeUpPeakTraffic = describeUpPeakTraffic;
                return this;
            }

            public DescribeUpPeakTraffics build() {
                return new DescribeUpPeakTraffics(this);
            } 

        } 

    }
}
