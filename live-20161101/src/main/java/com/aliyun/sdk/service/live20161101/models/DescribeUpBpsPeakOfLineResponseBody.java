// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpBpsPeakOfLineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpBpsPeakOfLineResponseBody</p>
 */
public class DescribeUpBpsPeakOfLineResponseBody extends TeaModel {
    @NameInMap("DescribeUpBpsPeakOfLines")
    private DescribeUpBpsPeakOfLines describeUpBpsPeakOfLines;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUpBpsPeakOfLineResponseBody(Builder builder) {
        this.describeUpBpsPeakOfLines = builder.describeUpBpsPeakOfLines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpBpsPeakOfLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return describeUpBpsPeakOfLines
     */
    public DescribeUpBpsPeakOfLines getDescribeUpBpsPeakOfLines() {
        return this.describeUpBpsPeakOfLines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DescribeUpBpsPeakOfLines describeUpBpsPeakOfLines; 
        private String requestId; 

        /**
         * DescribeUpBpsPeakOfLines.
         */
        public Builder describeUpBpsPeakOfLines(DescribeUpBpsPeakOfLines describeUpBpsPeakOfLines) {
            this.describeUpBpsPeakOfLines = describeUpBpsPeakOfLines;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpBpsPeakOfLineResponseBody build() {
            return new DescribeUpBpsPeakOfLineResponseBody(this);
        } 

    } 

    public static class DescribeUpBpsPeakOfLine extends TeaModel {
        @NameInMap("BandWidth")
        private Float bandWidth;

        @NameInMap("PeakTime")
        private String peakTime;

        @NameInMap("QueryTime")
        private String queryTime;

        @NameInMap("StatName")
        private String statName;

        private DescribeUpBpsPeakOfLine(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.peakTime = builder.peakTime;
            this.queryTime = builder.queryTime;
            this.statName = builder.statName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpBpsPeakOfLine create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Float getBandWidth() {
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
            private Float bandWidth; 
            private String peakTime; 
            private String queryTime; 
            private String statName; 

            /**
             * BandWidth.
             */
            public Builder bandWidth(Float bandWidth) {
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

            public DescribeUpBpsPeakOfLine build() {
                return new DescribeUpBpsPeakOfLine(this);
            } 

        } 

    }
    public static class DescribeUpBpsPeakOfLines extends TeaModel {
        @NameInMap("DescribeUpBpsPeakOfLine")
        private java.util.List < DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine;

        private DescribeUpBpsPeakOfLines(Builder builder) {
            this.describeUpBpsPeakOfLine = builder.describeUpBpsPeakOfLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpBpsPeakOfLines create() {
            return builder().build();
        }

        /**
         * @return describeUpBpsPeakOfLine
         */
        public java.util.List < DescribeUpBpsPeakOfLine> getDescribeUpBpsPeakOfLine() {
            return this.describeUpBpsPeakOfLine;
        }

        public static final class Builder {
            private java.util.List < DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine; 

            /**
             * DescribeUpBpsPeakOfLine.
             */
            public Builder describeUpBpsPeakOfLine(java.util.List < DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine) {
                this.describeUpBpsPeakOfLine = describeUpBpsPeakOfLine;
                return this;
            }

            public DescribeUpBpsPeakOfLines build() {
                return new DescribeUpBpsPeakOfLines(this);
            } 

        } 

    }
}
